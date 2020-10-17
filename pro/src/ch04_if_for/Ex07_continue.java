package ch04_if_for;

//자신이 포함된 반복문의 끝으로 이동한다.(다음 반복으로 넘어간다)
//continue문 이후의 문장들은 수행되지 않는다.
public class Ex07_continue {

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++) {	
			if(i==5) {
				//System.out.println("i==5일 때 -continue");
				continue; //지금 진행하던 것은 멈추고 다음 반복을 계속해라
				//->for문에서는 증감식으로 이동, while에서는 조건으로
			}
			System.out.println("i = "+i);

		}
		
		System.out.println("for 문 밖");
		
		System.out.println("----------------------------");
		//0 1 2 3 4 5 for문 밖
		for(int i=0;i<=10;i++) {
			if(i==5) {
				System.out.println("i==5일 때 -break");
				break;
			}
			System.out.println("i = "+i);
		}
		System.out.println("for 문 밖");
	}

}
