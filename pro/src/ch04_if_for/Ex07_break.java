package ch04_if_for;

//break
//자신이 포함된 하나의 반복문 또는 switch문을 빠져 나온다
//주로 if문과 함께 사용해서 특정 조건을 만족하면 반복문을 빠져나오게 한다

public class Ex07_break {

	public static void main(String[] args) {
		
		int count=0; //횟수를 저장하기 위한 변수 선언
		
		while(true) {
			int num=(int)(Math.random()*5+1);
			System.out.println("num = "+num);
			count++; //1번 반복할 때마다 횟수가 1씩 증가
			if(num==5) {
				break;
			}
		}
		System.out.println(count+"번쨰 "+"while밖"); //여기에서는 프로그램 종료
		
	}//end of main method

}
