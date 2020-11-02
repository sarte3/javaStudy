package junitTest.valid;

//소스 코드
//비밀번호는 8자리 이상
//문자와 숫자가 적어도 한 개씩은 있어야 함
public class ValidPW {
	
	private String pwd;
	private boolean isValid;
	
	//유효성 체크
	//qwerasdf -> f
	//123f -> f
	//123 -> f
	//qwerasdf12 -> s 
	//12345678 -> f
	//1q2w3e4r -> s
	public boolean isValid(String pwd) {
		boolean result = false; //유효성 통과결과를 저장하기 위한 변수
		
		int letterCnt = 0; //문자의 글자수를 저장하기 위한 변수
		int digitCnt = 0; //숫자의 글자수를 저장하기 위한 변수
		
		for(int i=0;i<pwd.length();i++) { //글자 수의 길이만큼 반복하면서
			char ch = pwd.charAt(i); //한 글자씩 추출
			
			//문자일 때마다 letterCnt 값을 1씩 증가
			if(Character.isLetter(ch)) letterCnt++; //Character.isLetter(캐릭터) : 제시한 char가 문자인지 리턴
			//숫자일 때마다 digitCnt 값을 1씩 증가
			else if(Character.isDigit(ch)) digitCnt++; //Character.isDigit(캐릭터) : 제시한 char가 숫자인지 리턴
		}
		
		//유효성 검사
		if((pwd.length()>=8) && letterCnt>=1 &&digitCnt>=1 ) {
			result = true;
		}
		
		return result;
	}
	
}
