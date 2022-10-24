// 조명을 켤때 필요한 커맨드 클래스
public class LightOnCommand implements Command {
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.off();
	}

}
