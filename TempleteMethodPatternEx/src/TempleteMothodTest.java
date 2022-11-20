
public class TempleteMothodTest {
	public static void main(String[] args) {
		Tea myTea = new Tea();
		myTea.prepareRecipe(); // 템플릿 메소드를 호출
		
		System.out.println("=========================");
		
		Coffee myCoffee = new Coffee();
		myCoffee.prepareRecipe();
		
	}
}
