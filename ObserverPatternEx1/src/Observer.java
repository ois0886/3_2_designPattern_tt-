
public class Observer {
	public String subsriber;
	
	public void receive(String news) {
		System.out.println(this.subsriber + " 가 다음 뉴스를 받음" + news);
	}
	
}
