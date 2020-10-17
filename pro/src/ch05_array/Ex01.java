package ch05_array;

//배열(Array)
/* - 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
 * - 많은 양의 값(데이터)을 다룰 때 유용
 * - 배열의 각 요소는 연속적
 */
public class Ex01 {

	public static void main(String[] args) {
		//배열 변수 선언 
		//데이터타입[] 변수명;
		//데이터타입 변수명[];
		//배열변수 초기화 변수명 = new 데이터타입[배열의 크기]; 
		// 배열변수타입에 따라 자동으로 초기화
		
		int[] score; //배열변수 선언
		score = new int[3]; //heap영역에 int타입의 데이터가 들어갈 공간을 확보해줘
							//데이터타입에 따라 자동으로 초기화가 됨
							//heap영역에 생긴 주소지를 score변수에 할당
		
		System.out.println("score = "+score); //score = [I@15db9742 : 주소지 출력
		//값출력 배열변수명[인덱스번호], index번호는 0부터 1씩 증가
		System.out.println("score[0] = "+score[0]);
		System.out.println("score[1] = "+score[1]);
		System.out.println("score[2] = "+score[2]);
		System.out.println();
		
		System.out.println("배열의 크기 = "+score.length); 
		//배열명.length 배열의 길이
		System.out.println();
		
		System.out.println("for문을 이용하여 값을 출력---");
		for(int i=0;i<3;i++) {
			System.out.println("score["+i+"] = "+score[i]);
		}
		
		System.out.println();
		
		System.out.println("for문+배열의 길이를 이용하여 값을 출력---");
		for(int i=0;i<score.length;i++) {
			System.out.println("score["+i+"] = "+score[i]);
		}
		
		System.out.println();
		
		/*향상된 for문 - 교재 p.166		
		for(int index=0;index<배열의 길이;index++){
			
		}
		의미를 가지고 있으므로 배열의 첫번째 요소(인덱스 0)부터 배열의 마지막 요소까지 접근
		무조건 1씩 증가하여 끝까지 감
		for (데이터타입 변수명 : 배열명 또는 컬렉션명){ 
			//반복실행코드
		}
		 */
		
		for(int num:score) {//score배열의 길이만큼 반복하면서 
							//score[0]의 값을 가져와서 num 변수에 할당
							//score[1]의 값을 가져와서 num 변수에 할당
							//score[2]의 값을 가져와서 num 변수에 할당
			System.out.println(num);
		}
	}

}
