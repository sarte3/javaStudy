package ch11.polymorphism2;

//이 클래스는 실행클래스로서 필드의 다형성을 살펴보고자 한다
public class CarExample01 {

	public static void main(String[] args) {

		//Car01 클래스의 객체 생성
		Car01 car = new Car01();
		
		//Car01 객체의 run()을 5번 반복실행
		for(int i=1;i<=5;i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
				case 1 : System.out.println("앞 왼쪽 HankookTire로 교체");
					//자동 타입 변환
					//부모클래스 참조변수 = new 자식클래스명();
					//Car01의 필드에는 Tire클래스 타입의 필드 flTire가 선언되어 있다
					//따라서 Car01의 필드인 flTire에 HankookTire() 객체가 들어갈 수 있다
					car.tires[0] = new HankookTire("앞왼쪽",15);
					break;
				case 2 : System.out.println("앞 오른쪽 KumhoTire로 교체");
					car.tires[1] = new KumhoTire("앞오른쪽",13);
					break;
				case 3 : System.out.println("뒤 왼쪽 HankookTire로 교체");
					car.tires[2] = new HankookTire("뒤왼쪽",14);
					break;
				case 4 : System.out.println("뒤 오른쪽 KumhoTire로 교체");
					car.tires[3] = new KumhoTire("뒤오른쪽",17); 
					break;
				
			}
			System.out.println("---------------------");
			//문제없이 잘 굴러간 경우
		}
	}

}
