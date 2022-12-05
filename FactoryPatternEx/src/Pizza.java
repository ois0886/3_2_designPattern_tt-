
public abstract class Pizza {
	String pizza_name;
	
	public void prepare() {
		System.out.println("도우, 소스, 토핑을 하는중..");
	}
	public void bake() {
		System.out.println("화덕에서 피자를 굽습니다..");
	}
	public void cut() {
		System.out.println("피자를 자릅니다..");
	}

	public void box() {
		System.out.println("상자에 피자를 담습니다..");
	}
	
	public String getName() {
		return pizza_name;
	}
}
