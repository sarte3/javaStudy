package ch07;

//DmbCellPhone01클래스를 사용하는 실행 클래스

public class DmbCellPhone_ex01 {

	public static void main(String[] args) {
		
		DmbCellPhone01 dmbCP=new DmbCellPhone01("자바폰","black",100);
		
		//CellPhone01클래스로부터 상속받은 필드값 출력
		System.out.println("model = " + dmbCP.model);
		System.out.println("color = " + dmbCP.color);
		
		//DmbCellPhone01클래스에서 선언한 필드값 출력
		System.out.println("channel = " + dmbCP.channel);
		
		//CellPhone01클래스로부터 상속받은 메소드 호출
		//전원켜기
		dmbCP.powerOn();
		//벨소리 점검
		dmbCP.bell();
		//여보세요~~ 거기 누구 없소? 물어보기
		dmbCP.sendVoice("여보세요~~ 거기 누구 없소?");
		//네~ 대답듣기
		dmbCP.receiveVoice("네~");
		
		//DmbCellPhone01클래스에서 선언한 메소드 호출
		//dmb 켜기
		dmbCP.turnOnDmb();
		//채널 변경
		dmbCP.changeChannelDmb(7);
		//dmb 끄기
		dmbCP.turnOffDmb();
		
		
	}
	
}
