package ch11;

//이 클래스의 super class는 Vehicle
public class Taxi extends Vehicle {

	@Override
	public void run() {
		System.out.println("Taxi가 달립니다");
	}

	
	
}
