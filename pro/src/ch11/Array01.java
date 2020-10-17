package ch11;

//배열(Array) - 하나의 변수에 여러 개의 데이터를 연속적으로 모아놓음
public class Array01 {

	public static void main(String[] args) {
			
		//문자열 5개를 저장하는 배열 생성
		//타입[] 배열변수명 = new 타입[크기];
		String[] str=new String[5];
		
		//문자열데이터 추가
		str[0]="홍길동";
		str[1]="henry";
		str[2]="김구";
		str[3]="유재석";
		str[4]="강호동";
		
		//데이터의 개수 조회
		int length=str.length;
		System.out.println("데이터의 개수 : "+length);
		
		//데이터를 꺼내기(조회)
		for(int i=0;i<str.length;i++) {
			System.out.println("str["+i+"] = "+str[i]);
		}
		
		//향상된 for문
		//for(타입 변수 : 배열명 또는 컬렉션명){}
		for(String tmp : str) {
			System.out.println(tmp);
		}
	}

}
