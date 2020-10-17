package ch05_array;

//배열의 활용
//5명 학생의 총점수와 평균점수를 또 다른 배열에 저장한 후 출력하세요
/*출력결과
 * 총점 : ~
 * 평균 :~
 */

public class Ex09 {

	public static void main(String[] args) {
		int[] score = {100,91,88,52,67};
		int sum=0;
		double avg=0.0;
		
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		
		avg=sum/(double)(score.length);
		
		double[] result=new double[2]; //총점과 평균을 저장하기 위한 배열변수
		result[0]=(double)sum;
		result[1]=avg;
		
		for(double tmp:result) {
			System.out.println(tmp);
		}
				
				
	}

}






