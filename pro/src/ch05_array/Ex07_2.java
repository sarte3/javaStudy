package ch05_array;

import java.util.Arrays;

//System.arraycopy()를 이용한 배열의 복사
public class Ex07_2 {

	public static void main(String[] args) {
		
		int[] oldArr1 = {11,12,13,14,15};
		int[] newArr1 = new int[10];
		
		System.out.println("배열 복사 전의 oldArr1");
		for(int i=0;i<oldArr1.length;i++) {
			System.out.print(oldArr1[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("배열 복사 전의 newArr1");
		for(int i=0;i<newArr1.length;i++) {
			System.out.print(newArr1[i]+" ");
		}
		
		System.out.println();
		
		//System.arraycopy()를 이용한 배열의 복사
		//arraycopy(Object 원본배열명src, 원본배열시작인덱스int srcPos, 새배열명Object dest, 
		//새배열명의 시작인덱스int destPos, 크기int length)
		/*
		 * System.arraycopy(oldArr1, 0, newArr1, 0, oldArr1.length);
		 * 
		 * System.out.println("배열 복사 후의 newArr1"); for(int tmp:newArr1) {
		 * System.out.print(tmp+" "); }
		 */
		System.out.println("배열 복사 후의 newArr1");
		
		//System.arraycopy()를 이용하면 원본배열의 일부데이터를 원하는 새 배열 위치부터 넣을 수 있다
		//출력결과 0 0 0 0 0 13 14 15 0 0
		System.arraycopy(oldArr1, 2, newArr1, 5, 3);
		
		//Arrays클래스 : java.util패키지 안에 존재하면서
		//배열과 관련된 여러 기능을 제공하는 클래스
		//Array.toString(배열명); 파라미터로 던진 배열 안의 데이터를 문자열 형태로 가져옴
		//[0, 0, 0, 0, 0, 13, 14, 15, 0, 0]
		//Arrays 클래스 자세한 내용은 교재 p.624 참고
		System.out.println(Arrays.toString(newArr1));
		
		for(int tmp:newArr1) {
			System.out.print(tmp+" ");
		}
		
	}

}
