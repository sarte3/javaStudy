package ch05_array;

//배열의 복사 교재 p.192 참고
public class Ex07 {

	public static void main(String[] args) {
		
		int[] oldArr1 = {1,2,3};
		int[] newArr1 = new int[10];
		
		System.out.println("배열 복사 전의 oldArr1");
		for(int i=0;i<oldArr1.length;i++) {
			System.out.print(oldArr1[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("배열 복사 전의 newArr1");
		for(int i=0;i<newArr1.length;i++) {
			newArr1[i]=i*10;
			System.out.print(newArr1[i]+" ");
		}
		
		System.out.println();
		
		//for문을 이용한 배열의 복사
		for(int i=0;i<oldArr1.length;i++) {
			newArr1[i]=oldArr1[i];
		}
		
		System.out.println("배열 복사 후의 newArr1");
		for(int temp:newArr1) {
			System.out.print(temp+" ");
		}
		
		
	}

}
