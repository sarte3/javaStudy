package ch05_array;

//가변배열 p.219
public class Ex05 {

	public static void main(String[] args) {
		//5개반 학생들의 몸무게를 저장하세요
		double[][] weights= {{20.5, 21.8, 26.9},
							{16.8,19.5},
							{26.7},
							{20.9, 22.2, 30.4, 16.7},
							{36.0,32.1}};
		
		//각 배열의 크기가 다른 것을 확인할 수 있다

		for(int i=0;i<weights.length;i++) {
			
			//배열의 크기가 다르므로 조건을 weights[i].length로 이용
			for(int j=0;j<weights[i].length;j++) {
				System.out.print(weights[i][j]+" ");
			}
			System.out.println();
		}
	}

}
