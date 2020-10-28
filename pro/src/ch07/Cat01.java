package ch07;

public class Cat01 extends Animal01{

	public Cat01() {
		this.type = "포유류";
	}
	
	@Override
	public void move() {
		System.out.println("고양이가 4발로 점프해요");
	}

	@Override
	public void sound() {
		System.out.println("냐~옹 하고 소리내요");
	}

}
