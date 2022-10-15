
public class Song {
	private DiscountedMode mode; // 현재 세일 중인지 아니면 세일을 하고 있지 않은 중인지를 표시하는 변수
	
	//현재 mode를 새롭게 세팅하는 코드
	public void setMode(DiscountedMode mode) {
		this.mode = mode;
	}
	// 현재 선택된 노래의 가격을 return하는 코드
	public double getPrice() {
		return 10.0 - (10.0*this.mode.getDiscountRate());
	}
}
