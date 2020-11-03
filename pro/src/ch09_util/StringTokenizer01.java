package ch09_util;

import java.util.StringTokenizer;

//java.util.StringTokenizer 클래스 - 교재 p. 514
/*문자열이 특정 구분자로 연결되어 있을 경우,
 * 구분자를 기준으로 문자열을 분리할 때 사용된다
 * 비교) java.lang.String클래스의 split()도 동일 기능이지만 리턴 유형은 String[]
 */
public class StringTokenizer01 {

	public static void main(String[] args) {
		
		String text0 = "김좌진,이순신 서희";
		//구분자를 제시하지 않으면 공백을 구분자로 사용
		StringTokenizer st = new StringTokenizer(text0);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println();
		
		String text = "김좌진/이순신,서희";
		
		//방법 1 : 전체토큰 수를 얻어 for문으로 반복작업
		st = new StringTokenizer(text,"/");
		int count = st.countTokens(); //전체 토큰 수
		System.out.println("st.countTokens() = "+count);
		
		for(int i=0;i<count;i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
				
		//방법 2 :hasMoreTokens()와 nextToken()을 while문에 적용
		st = new StringTokenizer(text,"/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		//방법 3: hasMoreElements()와 nextElement()를 while문에 적용
		//여러 개의 구분자를 사용할 수 있다
		st = new StringTokenizer(text,"/,");
		while(st.hasMoreElements()) {
			//nextElement()의 리턴유형이 Object이므로 String으로 강제 클래스 형변환
			String token = (String)st.nextElement();
			System.out.println(token);
		}
		System.out.println();
		
		//java.lang.String클래스의 split()도 동일 기능이지만 리턴 유형은 String[]
		String str = "김좌진,이순신 서희-김구~세종대왕&장영실";
		//split(String 타입의 정규식)
		String[] names = str.split(" |,|-|~|&");
		
		for(String name:names) {
			System.out.println(name);
		}
	}

}
