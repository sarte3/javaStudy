package ch14;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx03 {

	public static void main(String[] args) throws Exception{

		Reader rd= new FileReader("C:\\Temp\\test.txt");
		
		char[] cbuf=new char[4];
		
		int readCharNum;
		
		readCharNum = rd.read(cbuf, 1, 2);
		
		for(int i=0;i<cbuf.length;i++) {
			System.out.println((char)cbuf[i]);
		}
		
		rd.close();
	}

}
