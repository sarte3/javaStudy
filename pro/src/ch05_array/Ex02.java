package ch05_array;

//배열 선언과 생성=>데이터 타입에 따른 자동 초기화
public class Ex02 {

	public static void main(String[] args) {
		//String 타입 데이터 3개를 저장하기 위한 names 배열 선언 후 출력
		//데이터타입[] 배열변수명 = new 데이터타입[배열의 크기];
		String[] names=new String[3];
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println("----------------------");
		
		for(String name:names) {
			System.out.println(name); //String과 같은 class의 초기값은 null
		}
		
		System.out.println("----------------------");
		double[] height = new double[5];
		for(int i=0;i<height.length;i++) {
			System.out.println(height[i]); 
			//자동초기화 -> 여기에서는 double타입은 0.0으로
		}
		
		System.out.println("--------------------------");
		
		//점수 5개를 저장하기 위한 배열 변수 jumsu를 선언과 생성
		//데이터타입 변수명[];
		//변수명 = new 데이터타입[크기];
		int jumsu[] = new int[5];
		
		for(int i=0;i<jumsu.length;i++) {
			System.out.println(jumsu[i]); 
			//자동초기화 -> 여기에서는 int타입은 0으로
		}
		
		for(int i:jumsu) {
			System.out.println(i);
		}
		
		
	}

}
