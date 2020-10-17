package ch04_if_for;

//주의. 자신이 포함된 하나의 반복문 종료 break;
public class Ex07_break2 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while(sum<110) {
			while(true) {
				if(sum>100) 
					break; //주의! break가 속한 해당 반복문을 종료
				
				i++;
				sum += i; //sum=sum+i
				System.out.println("i 값이 "+i+"일 때의 sum = "+sum);
			}
			System.out.println("내부 while 문 밖");
			System.out.println("i = "+i);
			System.out.println("누적 총합 sum = "+sum);
			sum++;
		}
		System.out.println("외부 while 문 밖");
	}

}
