package ch11;

//Vehicle을 이용하는 클래스
public class Driver {
	
	//다형성 : 조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있다
	
	//매개변수의 다형성 
	//=> 컬렉션 Collection 인터페이스 add(Object obj)
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
	
}
