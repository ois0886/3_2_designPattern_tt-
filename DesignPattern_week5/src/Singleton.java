// 멀티스레딩 환경에서 uniqueInstance 객체가 여러 개 생성될 수 있는 위험성을 가지고 있음
public class Singleton {
    //private static Singleton uniqueInstance; // Singleton 클래스의 하나뿐인 인스턴스를 저장하는 정적변수
    //private static Singleton uniqueInstance = new Singleton(); // 정적 초기화 부분에서 Singleton 인스턴스를 생성한다.
    private volatile static Singleton uniqueInstance;
    // Singleton 인스턴스로 초기화되는 과정이 올바르게 진행됨

    // DCL : Double-checked Locking <- getInstance() 에서 동기화되는 부분을 줄일 수가 있습니다.
    //* 자바 1.4이전 버전에서는 쓸수가 없다.

    // 인스턴스가 생성되어 있는지 확인한 다음, 생성되어 있지 않았을 때만 동기화할 수 있음.
    // 처음에만 동기화하고, 나중에는 동기화하지 않아도 됨.
    // 기타 인스턴스 변수

    private Singleton() {
    } // 생성자를 private으로 선언했기 때문에 Singleton 클래스 내부에서만 클래스의 인스턴스를 만들수 있음

    // getInstance() 메소드는 클래스의 인스턴스를 만들어서 리턴함
    // getInstance() 에 synchronized 키워드만 추가하면 한 스레드가 메소드 사용을 끝내기 전까지 다른 스레드는 기다려야 한다.
    // 즉 , 2개의 스레드가 이 메소드를 동시에 실행하는 일은 일어나지 않는다.
    public static Singleton getInstance() {
        /*
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton(); // 게으른 인스턴스 생성 (Lazyinstatiation) : 인스턴스가 필요한 상황이 닥치기 전까지 아예 인스턴스를 생성하지 않음
        }*/
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    // 기타 메소드
    // Singleton 역시 보통 클래스이다. Singleton 클래스 내부에도 다른 인스턴스 변수나 메소드를 가질 수 있다.

}


// 1. 만약에 모든 메소드와 변수가 static으로 선언한 클래스를 만들어도 되지않나요?
// -> 부분적으로는 맞을 수 있다. 필요한 내용이 클래스에 모두 들어있고, 복잡한 초기화가 필요없는 경우

// 2. '느슨한 결합' 싱글턴은 느슨한 결합 원칙에 위배되지 않나요?
// -> 싱글턴 패턴의 문제점으로 종종 제기되는 내용이다. 싱글턴을 바꾸면 연결된 모든 객체도 바꿔야 될 가능성이 높다.

// 멀티스레딩 환경에서 전통적인 형태의 싱글턴 구현은 문제가 생길 수가 있다.
// 1. 정적변수를 활용했고, 정적변수 선언시에 값을 할당해서 활용함
// 2. 복수개의 스레딩이 접근하는 부분을 synchronized 을 활용해서 해결함
// 3. DCL(Double-checked Locking) 방식을 통해 동기화되는 부분을 줄임