
public class BallMachine {

	final static int SOLD_OUT = 0;
	final static int NO_COIN = 1;
	final static int HAS_COIN = 2;
	final static int SOLD = 3;

	int state = SOLD_OUT;
	int count = 0; // 볼의 갯수

	// 초기 볼의 갯수를 인자로 받아들이는 생성자

	public BallMachine(int count) {
		this.count = count;
		// 알맹이 갯수가 0이 아니면 동전을 누군가 넣어 주길 기다리고 있는 NO_COIN상태로 전환됨
		// 알맹이 갯수가 0이 이면 SOLD_OUT 상태에 머무르게 됨.
		if (count > 0) {
			state = NO_COIN;
		}
	}

	// 동전이 투입되는 경우
	public void insertCoin() {
		if (state == HAS_COIN) {
			System.out.println("동전은 한개만 넣어주세요."); // 동전이 투입된 경우
		} else if (state == NO_COIN) { // 동전이 투입된 경우
			state = HAS_COIN;
			System.out.println("동전을 넣으셨습니다.");
		} else if (state == SOLD_OUT) { // 매진 상태인 경우
			System.out.println("매진되었습니다.");
		} else if (state == SOLD) {
			System.out.println("볼이 나오고 있습니다.");
		}
	}

	public void ejectCoin() {
		if (state == HAS_COIN) {
			System.out.println("동전을 반환합니다.");
			state = NO_COIN;
		} else if (state == NO_COIN) {
			System.out.println("동전을 넣어 주세요.");
		} else if (state == SOLD_OUT) {
			System.out.println("동전을 넣지 않으셨습니다.");
		} else if (state == SOLD) {
			System.out.println("이미 볼을 뽑으셨습니다.");
		}
	}

	// 손잡이를 돌리는 경우
	public void turnCrank() {
		if (state == HAS_COIN) {
			System.out.println("손잡이를 돌리셨습니다.");
			state = SOLD;
			// 볼 내보내기 수행
			dispense();

		} else if (state == NO_COIN) {
			System.out.println("동전을 넣어 주세요.");

		} else if (state == SOLD_OUT) {
			System.out.println("매진되었습니다.");

		} else if (state == SOLD) {
			System.out.println("손잡이는 한 번만 돌려주세요.");
		}
	}

	// 볼을 내보내는 경우
	public void dispense() {
		// 나오면 안되는 오류 상황
		if (state == HAS_COIN) {
			System.out.println("볼을 내보낼 수 없습니다.");

		} // 나오면 안되는 오류 상황
		else if (state == NO_COIN) {
			System.out.println("동전을 넣어 주세.");

		} // 나오면 안되는 오류 상황
		else if (state == SOLD_OUT) {
			System.out.println("매진입니.");

		} else if (state == SOLD) {
			System.out.println("볼이 나오고 있습니다.");
			count = count - 1;
			if (count == 0) {
				System.out.println("더 이상 볼이 없습니다.");
				state = SOLD_OUT;
			}
		}
	}

	@Override
	public String toString() {
		return "BallMachine [state=" + state + ", count=" + count + "]";
	}
	
}
