package ch09_util;

import java.util.Arrays;
import java.util.Random;

//java.util.Random클래스 - 교재 p.500
//난수를 얻어내기 위한 다양한 메서드를 제공
// 종자값(long타입 seed)를 설정하여 난수값을 제공받을 수도 있다 => new Random(long seed)
// 다양한 타입의 난수를 얻을 수 있다 => nextBoolean(), nextDouble(), nextInt(), nextFloat() 등
//참고 - Math.random()은 0.0이상 1.0미만의 double 난수만 리턴

//로또번호 생성하기
public class Random01 {

	public static void main(String[] args) {

		//번호 선택
		
		//1~45 범위의 숫자 6개
		//6개가 저장될 변수 선언
		int[] selectNumber = new int[6];
		Random random = new Random(20);
		System.out.print("번호선택 > ");
		for(int i=0;i<6;i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();
		
		//당첨번호
		int[] winningNumber = new int[6];
		random = new Random(20);
		
		System.out.print("당첨번호 > ");
		for(int i=0;i<6;i++) {
			//System.out.println("nextInt() = "+(random.nextInt(45)+1)); 
			//1~45 사이의 int 리턴
			winningNumber[i] = random.nextInt(45)+1;
			System.out.print(winningNumber[i]+" ");
		}
		System.out.println();
		
		Arrays.sort(selectNumber);//선택한 번호를 정렬
		Arrays.sort(winningNumber);//당첨 번호를 정렬
		
		System.out.println(Arrays.toString(selectNumber));
		System.out.println(Arrays.toString(winningNumber));

		//당첨여부
		
		//Arrays.equlas()는 배열 항목 값 비교
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.println("당첨여부====>");
		
		if(result) {
			System.out.println("1등에 당첨되었으니 잠적하자");
		}else {
			System.out.println("다음번 기회를...");
		}
		
	}

}
