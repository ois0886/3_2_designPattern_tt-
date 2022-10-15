
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// s1,s2,s3,s4 라는 4개의 노래를 생성하는 코드
		Song s1 = new Song();
		s1.setMode("nonDiscounted"); // s1은 세일이 안되는 코드
		Song s2 = new Song();
		s2.setMode("nonDiscounted"); // s2은 세일이 안되는 코드
		Song s3 = new Song();
		s3.setMode("onSale"); // s3은 세일이 되는 코드
		Song s4 = new Song();
		s4.setMode("TodayEvent"); // s4은 30% 할인 중인 노래

		// s1, s2, s3, s4를 장바구니에 넣는 코드
		CartForSongs c = new CartForSongs();
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		
		// 장바구니 c에 들어있는 노래의 총 가격을 계산하는 코드
		System.out.println(c.calculateTotalPrice());
	}

}
