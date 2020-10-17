package ch06;

//매개변수의 개수를 모를 때의 메소드 선언과 사용법

public class Computer01 {

	//field
	
	
	//constructor
	
	
	//method
	//[접근제어자] [속성] 리턴유형 메소드명([매개변수리스트]){}
	int sum(int[] values) {
		
		//결과를 저장하는 변수선언
		int result=0;
		
		//매개변수에 입력된 데이터를 이용 더하기 계산
		for(int i=0;i<values.length;i++) {
			result+=values[i];
		}
		
		//결과 출력 output
		return result;
	}
	
	int sum1(int ... values){

		//결과를 저장하는 변수선언
		int result=0;
		
		//매개변수에 입력된 데이터를 이용 더하기 계산
		for(int i=0;i<values.length;i++) {
			result+=values[i];
		}
		
		//결과 출력 output
		return result;
	}
}
