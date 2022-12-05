
public class PizzaStore {
	
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	Pizza orderPizza(String pizza_type) {
		Pizza pizza; // 추상클래스와 인터페이스로는 직접 인스턴스를 만들 수 가 없음
		
		pizza = factory.CreatePizza("cheese");
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

}
