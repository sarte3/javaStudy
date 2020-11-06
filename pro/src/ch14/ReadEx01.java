package ch14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx01 {

	public static void main(String[] args) {

		InputStream is = null;
		
		try {
			//FileInputStream fis = new FileInputStream("C:\\Temp\\test.txt");
			is = new FileInputStream("C:\\Temp\\test.txt");
			
			int readByte;
			
			//1 byte씩 읽어들인다
			while(true) {
				readByte = is.read();
				if(readByte==-1) break; 
				//더 이상 읽어들일 것이 없으면 -1을 리턴
				System.out.println((char)readByte);
				//내부적으로 아스키코드값으로 저장되므로
				//콘솔에서 편하게 읽고 싶으면 char로 변환
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
