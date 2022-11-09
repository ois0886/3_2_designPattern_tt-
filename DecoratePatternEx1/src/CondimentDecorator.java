
public abstract class CondimentDecorator extends Beverage {
	Beverage beverage; // 각 데코레이터가 감쌀 음료를 나타내는

	public abstract String getDescription();// 모든 첨가물 데코레이터에 해당 메소드를 새로 구현
}
