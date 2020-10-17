package ch05_array;

//배열의 활용
//5명 학생의 총점수와 평균점수를 출력하세요
public class Ex08 {

	public static void main(String[] args) {
		
		int[] score = {100,91,88,52,67};
		int sum=0; //총점을 저장하기 위한 변수 선언
		double avg=0.0;
		
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		
		avg=sum/(double)score.length; ///평균저장 변수
		
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+avg);
	}

}
