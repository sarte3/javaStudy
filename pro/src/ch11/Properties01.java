package ch11;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

//외부의 프로퍼티 파일을 읽어오기
//프로퍼티 파일을 읽어오기 위해서는 Properties 객체를 생성하고
//load() 메소드를 호출
public class Properties01 {

	public static void main(String[] args) throws Exception {

		Properties properties= new Properties();
		
		//외부의 프로퍼티 파일
		//프로퍼티 파일은 일반적으로 클래스 파일과 함께 저장된다
		//클래스 파일 기준으로 상대경로를 이용해서
		//프로퍼티 파일의 경로를 얻는다 : 
		//클래스명.class.getResource("databasse.properties")
		//Properties01.class.getResource("database.properties");
		
		//getResource()는 주어진 파일의 상대경로를 URL객체로 리턴
		//URL객체로 리턴받은 것에.getPath(); : 파일의 절대경로를 리턴
		String path=Properties01.class.getResource("database.properties").getPath();
		
		//주어진 파일의 경로에 한글이 있는 경우 한글복원
		path = URLDecoder.decode(path,"utf-8");
		
		System.out.println("path = "+path);
		//외부의 프로퍼티 파일 경로 = c://a/b/database.properties
		//properties.load(new FileReader(외부 프로퍼티 파일 경로))
		properties.load(new FileReader(path));
		
		String driver=properties.getProperty("driver");
		String url=properties.getProperty("url");
		String user=properties.getProperty("user");
		String password=properties.getProperty("password");
		
		System.out.println("driver = "+driver);
		System.out.println("url = "+url);
		System.out.println("user = "+user);
		System.out.println("password = "+password);
	}

}
