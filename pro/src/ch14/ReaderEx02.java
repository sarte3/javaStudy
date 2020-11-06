package ch14;

import java.io.FileReader;
import java.io.Reader;

/*read(char[] cbuf) : 매개값으로 제시한 char 배열의 길이만큼의 
 * char를 읽고 배열에 저장한다
 * 읽은 char 수를 리턴한다
 * char를 더 읽을 수 없다면 -1을 리턴
 */
public class ReaderEx02 {

	public static void main(String[] args) throws Exception{

		Reader rd= new FileReader("C:\\Temp\\test.txt");
		
		char[] cbuf=new char[2];
		
		int readCharNum; //읽어들인 char 수를 저장할 변수
		String str = ""; //콘솔에 출력할 때 사용할 변수
		while(true) {
			readCharNum = rd.read(cbuf);
			if(readCharNum==-1)break;
			//String(byte[] bytes, int offset 바이트 배열에서 읽어들일 시작 인덱스 번호, int length 읽을 글자 수)
			str += new String(cbuf,0,readCharNum);
			//System.out.println(str);
		}
		System.out.println(str);
		rd.close(); //자원을 반납	
	}
	
}
