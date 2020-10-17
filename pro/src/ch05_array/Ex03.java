package ch05_array;

//배열변수 생성과 값할당
//방법1. 생성 후 나중에 값을 할당
//방법2. 생성하면서 값을 할당
public class Ex03 {

	public static void main(String[] args) {
		//방법1. 생성 후 나중에 값을 할당
		int[] nums=new int[3];
		
		//값을 할당
		nums[0] = 10; //배열 nums의 인덱스 번호 0에 값 10을 할당
		nums[1] = 20;
		nums[2] = 30;
		
		for(int num:nums) {
			System.out.println(num);
		}
		
		//방법2. 생성하면서 값을 할당
		//문법 데이터타입[] 배열병수명 = {초기값, ... ,초기값};
		//또는 char[] c = {'a','b','c'};
		
		//문법 데이터타입[] 배열병수명 = new 데이터타입[]{초기값, ... ,초기값};
		//char[] c = new char[] {'a','b','c'}; 
		//char[] c = new char[3] {'a','b','c'}; -컴파일에러 발생
		//초기값을 제공하면서 배열 크기를 명시하면 안됨
		char[] c = {'a','b','c'};
		for(char temp:c) {
			System.out.println(temp);
		}
		
		
		
	}

}
