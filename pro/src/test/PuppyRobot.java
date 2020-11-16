package test;

public class PuppyRobot {

	private String _name;
	private static final int PUPPY_EAT=0;
	private static final int PUPPY_STOP=1;
	private static final int PUPPY_JUMP=2;
	
	PuppyRobot(){}
	
	public PuppyRobot(String _name){
		this._name = _name;
	}
	
	public void eat() {
		System.out.println(_name+"이(가) 먹이를 먹어요");
	}
	
	public void stop() {
		System.out.println(_name+"이(가) 동작을 멈춥니다");
	}
	
	public void jump() {
		System.out.println(_name+"이(가) 점프를 합니다");
	}
	
	public void order(int num) {
		
		switch(num) {
		
			case PUPPY_EAT:
				eat();
				break;
			case PUPPY_STOP:
				stop();
				break;
			case PUPPY_JUMP:
				jump();
				break;
			default:
				System.out.println("잘못된 입력입니다");
				break;
		
		}
		
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}
	
	
	
}
