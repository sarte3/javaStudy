package ch04_if_for;

//switch문
//switch문의 매개변수 타입은 숫자(byte,short,int,long) , char타입, 
//String 타입은 자바 7부터 사용 가능
public class Ex04 {
	
	public static void main(String[] args) {
		char grade = 'A';
		
		switch(grade) {
		case 'A': 
		case 'B': 
			System.out.println("우수회원");
			break; //break - switch문을 벗어나라
		case 'C': 
		case 'D': 
			System.out.println("일반회원");
			break;
		default: System.out.println("손님");
			
		}
		
		String animal="참새";
		
		switch(animal) {
			case "오리":
				System.out.println("꽥꽥");
				break;
			case "병아리":
				System.out.println("삐약삐약");
				break;
			case "참새":
				System.out.println("짹짹");
				break;
			default:
		}
		
		int com=(int)(Math.random()*3+1);
		int user=(int)(Math.random()*3+1);
		String com1="";
		String user1="";
		
		switch(com) {
			case 1:com1="가위";break;
			case 2:com1="바위";break;
			case 3:com1="보";break;
			default:
		}
		
		System.out.println("컴퓨터는 "+com1+"를 냈습니다.");
		
		switch(user) {
			case 1:user1="가위";break;
			case 2:user1="바위";break;
			case 3:user1="보";break;
			default:
		}
		
		System.out.println("당신은 "+user1+"를 냈습니다.");
		
		if(com-user==1||com-user==-2){
			System.out.println("컴퓨터가 이겼어요");
		}else if(user-com==1||user-com==-2) {
			System.out.println("당신이 이겼어요");
		}else {
			System.out.println("비겼어요");
		}
		
		int[] lotto=new int[6];

		for(int i=0;i<lotto.length;i++) {
			int number=(int)(Math.random()*45+1);
			lotto[i]=number;
					
			for(int j=0;j<i;j++){
				if(lotto[i]==lotto[j]){
					i--;
					break;
				}
			}
			
		}
		
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
	}
}
