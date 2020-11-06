package ch14;

import java.io.FileOutputStream;
import java.io.OutputStream;

//OutputStream
//write(int b) : 매개변수로 제시한 int값에서 끝에 있는 1 byte만 출력스트림으로 보낸다
public class WriteEx01 {

	public static void main(String[] args) throws Exception{

		OutputStream os= new FileOutputStream("C:\\Temp\\result.txt");
		
		byte[] data = "Hello Java!".getBytes();
		
		/*for(int i=0;i<data.length;i++) {
			os.write(data[i]); //write(int b) 이용
		}*/
		
		//write(byte[] b) 이용
		os.write(data);
		
		os.flush(); //버퍼 비우기
		os.close(); //자원 해제
	}

}
