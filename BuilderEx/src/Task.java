import java.util.Date;

// 일정 관리를 위해 새롭게 생성되는 일정(Task) 클래스
public class Task {
	private final long id; // 일정에 대한 unique indentifier
	private String summary = ""; // 일정에 대한 요약
	private String description = ""; // 일정에 대한 상세설명
	private boolean done = false; // 일정에 대한 완료되었는지 완료되지않았는지를 설명하는 변수
	private Date dueDate; // 해당 Task가 언제인지를 기록하는 변수

	// 생성자
	public Task(long id, String summary, String description, boolean done, Date dueDate) {
		super();
		this.id = id;
		this.summary = summary;
		this.description = description;
		this.done = done;
		this.dueDate = dueDate;
	}

	// Task 클래스 내부 각각의 변수에 대한 getter 및 setter 메소드
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", summary=" + summary + ", description=" + description + ", done=" + done
				+ ", dueDate=" + dueDate + "]";
	}
	
}

// 클래스에서 새로운 객체를 만들때 객체에게 값을 할당하는 방법
// 1. 생성자를 이용
// 2. Setter 메소드를 이용

//빌더(Builder) 패턴이 필요한경우
// 클래스에 대한 속성 값이 optional일때
// 데이터를 입력하는 순서가 달라질 수 있을때
// 생성자, setter를 활요하기보다는 -> Builder패턴을 사용하여 객체를 생성한다.
