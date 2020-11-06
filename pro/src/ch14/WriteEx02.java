package ch14;

import java.io.FileOutputStream;
import java.io.OutputStream;

//OutputStream의 write(byte[] b, int off, int len) 연습
public class WriteEx02 {

	public static void main(String[] args) throws Exception{

		OutputStream os= new FileOutputStream("C:\\Temp\\result.txt");
		
		byte[] data = "Hello Java!".getBytes();
		
		os.write(data, 6, 4);
		
		os.flush(); //버퍼비우기
		os.close(); //자원해제
	}

}
