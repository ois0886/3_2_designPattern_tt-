
public class SimplePizzaFactory {
	public Pizza CreatePizza(String pizza_type) {
		Pizza pizza = null;
		
		if(pizza_type.equals("cheese")) {
			pizza = new CheesePizza();
		}  else if(pizza_type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}
		return pizza;
	}
}
