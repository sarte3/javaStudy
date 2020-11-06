package ch14;

import java.io.FileInputStream;
import java.io.InputStream;

/*read(byte[] b) : 입력스트림으로부터 매개값으로 제시한 byte 배열의 길이만큼의 
 * 바이트를 읽고 배열에 저장한다
 * 읽은 바이트 수를 리턴한다
 * 바이트를 더 읽을 수 없다면 -1을 리턴
 */


public class ReadEx02 {

	public static void main(String[] args) throws Exception{

		InputStream is= new FileInputStream("C:\\Temp\\test.txt");
		
		byte[] readBytes=new byte[3];
		
		int readByteNum; //읽어들인 바이트 수를 저장할 변수
		String str = ""; //콘솔에 출력할 때 사용할 변수
		while(true) {
			readByteNum = is.read(readBytes);
			if(readByteNum==-1)break;
			//String(byte[] bytes, int offset 바이트 배열에서 읽어들일 시작 인덱스 번호, int length 읽을 글자 수)
			str += new String(readBytes,0,readByteNum);
		}
		
		System.out.println(str);
		is.close(); //자원을 반납	
	}
	
}
