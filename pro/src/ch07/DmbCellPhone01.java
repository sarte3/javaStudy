package ch07;

//이 클래스는 CellPhone01 클래스를 상속받는 자식클래스
//class 자식클래스명 extends 부모클래스명{}
public class DmbCellPhone01 extends CellPhone01{

	//이 클래스에는 CellPhone01 클래스로부터 상속받은 field,method가 이미 존재
	//field
	int channel; //채널
	
	//constructor
	public DmbCellPhone01() {
		
	}
	
	//생성자는 객체를 생성할 당시 외부에서 받은 데이터를 이용하여 초기화시켜주는 역할
	public DmbCellPhone01(String model,String color,int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//method
	void turnOnDmb() {
		System.out.println("채널 "+channel+"번 dmb 방송 수신을 시작");
	}
	
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널 "+channel+"번으로 바뀝니다");
	}
	
	void turnOffDmb() {
		System.out.println("dmb 방송 수신 종료");
	}
	
}
