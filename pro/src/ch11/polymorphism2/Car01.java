package ch11.polymorphism2;

//이 클래스는 Tire01 클래스를 부품으로 가지는 클래스이다
//자동차는 Tire를 가진다. Car01 has a Tirep01
//클래스간의 관계? 포함관계(composite)
//한 클래스의 멤버변수로 다른 클래스를 선언하는 것
//has a 관계

//여러 종류의 객체를 하나의 배열로 다루기
//- 조상타입의 배열에 자손들의 객체를 담을 수 있다.
public class Car01 {

	//field
	String company;
	int price;
	String color;
	
	//부품 관계의 field => 자동차는 4개의 타이어를 가진다
	//동일한 타입은 배열로 처리할 수 있다
	//타입[] 배열변수 = new 타입[크기];
	Tire01[] tires = {
					new Tire01("앞왼쪽", 6),
					new Tire01("앞오른쪽", 2),
					new Tire01("뒤왼쪽", 3),
					new Tire01("뒤오른쪽", 4)
					};
	
	//constructor
	public Car01() {
		
	}
	
	//method
	//자동차가 가진 부품, 4개의 타이어가 모두 1회씩 회전시켜야 한다
	//각 Tire01 객체의 roll()메서드를 호출한다
	//호출한 roll()메서드가 false를 리턴하는 경우에는
	//자동차를 멈추기 위해 stop()메서드를 호출하고
	//문제가 발생한 해당 타이어의 번호를 리턴
	int run() {
		System.out.println("자동차가 달리는 중");
		
		int p=0;
		
		for(int i=0;i<tires.length;i++) {
			if(tires[i].roll()==false) {
				p = i+1;
				stop();
				continue;
			}
			
		}
		return p; //정상회전시
		
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다"); //타이어가 펑크날 때
	}
	
}
