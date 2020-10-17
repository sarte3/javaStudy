package ch04_if_for;

//[i,j]

public class Ex06_forInFor2 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<3;j++) {
				//printf() : 가변인자를 가진 메소드
				//Object class : 최상위 클래스
				//가변인자 - 교재 p.287
				//System.out.printf(String타입의 format, Object타입의 args(가변인자));
				System.out.printf("[%d,%d]  %s", i,j,"님");
				//System.out.print("  ["+i+","+j+"]");
			}
			System.out.println();
		}
	}

}
