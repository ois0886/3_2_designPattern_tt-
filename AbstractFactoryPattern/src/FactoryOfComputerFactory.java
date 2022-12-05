
public class FactoryOfComputerFactory {
	public void createComputer(String type) {
		ComputerFactory cFactory = null;
		switch(type){
			case "Samsung" :
				cFactory = new SamsungComputerFactory();
		}
		
		cFactory.createKeyboard();
	}
}
