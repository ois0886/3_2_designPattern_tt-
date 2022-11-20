package assigment_오인성_1891065;

public abstract class Toast{
	String name = "";
	int kcal = 0;

	public void serve() {
		getName();
		getKcal();
		System.out.println();
	}

	public void getName() {
		System.out.println("주문한 토스트 : " + this.name);
	}

	public void getKcal() {
		System.out.println("칼로리 : " + this.kcal + "kcal");
	}

	public void addTopping(ToppingDecorator top) {
		addName(top.Name());
		addKcal(top.Kcal());
	}

	public void addName(String topname) {
		this.name = topname + this.name;
	}

	public void addKcal(int topkcal) {
		this.kcal = topkcal + this.kcal;
	}

}
