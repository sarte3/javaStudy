package ch14;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//OutputStreamWriter : 바이트 출력스트림 -> 문자 출력 스트림으로 변환
public class OutputStreamWriterEx01 {

	public static void main(String[] args) throws Exception {
		
		//public class FileOutputStream extends OutputStream
		//OutputStreamWriter(OutputStream out)
		
		FileOutputStream fos = new FileOutputStream("c:\\Temp\\file.txt");
		
		//부모 타입의 참조 변수 하나에 부모 타입을 상속받는 하위 클래스의 인스턴스가 들어간다
		Writer writer = new OutputStreamWriter(fos);
		
		writer.write("바이트 출력스트림 -> 문자 출력 스트림으로 변환");
		
		writer.flush();
		writer.close();

		
		System.out.println("done");
	}

}
