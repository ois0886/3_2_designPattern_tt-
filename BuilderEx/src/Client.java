
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 일정을 만들때, 일정에 대한 고유 id, summary, description에 대한 정보만 알고 있는 경우
		//Task t1 = new Task(1000, "Test", "Test", false, null);

		//Task t2 = new Task(1001, "", "", false, null);
		// 입력의 순서가 바뀔 수 있을 때
		//Task t3 = new Task(false, null, 1002, "", "");
		
		TaskBuilder taskBuilder1 = new TaskBuilder(999);
		taskBuilder1.setSummary("test");
		taskBuilder1.setDescription("this is a example");
		taskBuilder1.setDone(false);
		
		Task task1 = taskBuilder1.build();
		
		System.out.println(task1);
		
	}

}
