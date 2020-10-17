package ch05_array;

//다차원 배열(2차원 배열)
//5명 학생의 3과목 시험점수를 저장한 후 출력
public class Ex04 {

	public static void main(String[] args) {
		//int[][] score=new int[5][3];
		int[][] score= {
							{100,90,80},
							{90,80,70},
							{33,66,99},
							{50,60,70},
							{80,90,100}
						};
		
		for(int i=0;i<score.length;i++) {		
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+" ");
			}
			System.out.println();
		}
				
	}

}
