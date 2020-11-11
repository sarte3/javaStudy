package ch15_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

//InetAddress
// - IP주소를 다루기 위한 클래스
public class InetAddressEx {

	public static void main(String[] args) {

		try {
			
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("myCom IPV4 주소"+local.getHostAddress());
			System.out.println();
			
			String host = "www.naver.com";
			InetAddress[] inetArr = InetAddress.getAllByName(host);
			
			for(InetAddress remote:inetArr) {
				System.out.println(host+"의 IP : "+remote.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
