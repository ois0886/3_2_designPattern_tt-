import java.util.ArrayList;
import java.util.Iterator;

public class CartForSongs {

	ArrayList<Song> cart = new ArrayList<Song>();
	
	// 장바구니에 들어있는 노래들의 총 가격을 구하는 코드
	public double calculateTotalPrice() {
		double total = 0.0;
		Iterator<Song> itr = cart.iterator();

		while (itr.hasNext()) {
			Song s = itr.next();
			if (s.getDiscountMode().equals("onSale"))
				total = total + (s.getPrice() - 0.1 * s.getPrice());
			else if (s.getDiscountMode().equals("TodayEvent"))
				total = total + (s.getPrice() - 0.3 * s.getPrice());
			else
				total = total + s.getPrice();
		}
		return total;
	}
	
	// 노래 s를 장바구니에 추가하는 코드
	public void add(Song s) {
		cart.add(s);
	}
}
