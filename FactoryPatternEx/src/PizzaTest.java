
public class PizzaTest {

	public static void main(String[] args) {
		
		SimplePizzaFactory factory = new SimplePizzaFactory();
		
		PizzaStore store = new PizzaStore(factory);
		
		Pizza pizza1 = store.orderPizza("cheese");
		Pizza pizza2 = store.orderPizza("pepperoni");
		
		System.out.println(pizza1.getName());
		System.out.println(pizza2.getName());

	}

}
