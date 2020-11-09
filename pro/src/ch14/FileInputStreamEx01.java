package ch14;

import java.io.FileInputStream;

//FileInputStream - 교재 p.882
//텍스트 파일을 읽고 그 내용을 콘솔에 출력
public class FileInputStreamEx01 {

	public static void main(String[] args) throws Exception{

		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\git\\javaStudy\\pro\\src\\jdbc\\SelectTest02.java");
		
		int data;
				
		while((data = fis.read())!=-1) {
			
			System.out.print((char)data);
		}
		
		fis.close();
		
	}

}
