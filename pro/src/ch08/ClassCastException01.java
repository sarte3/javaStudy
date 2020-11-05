package ch08;

/*ClassCastException
 * : 타입변환(Casting)은 상위클래스와 하위클래스간에 발생
 * 						구현클래스와 인터페이스 간에도 발생한다
 * 발생원인 : 억지로 타입변환을 시도할 경우 ClassCastException이 발생한다
 */
public class ClassCastException01 {

	public static void main(String[] args) {

		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
		// 런타임 에러
		// java.lang.ClassCastException: ch08.Cat cannot be cast to ch08.Dog
		// 발생 이유 : Cat 객체로 changeDog()의 매개값으로 주었기 때문에 => Dog 타입으로 변환할 수 없다
	}
	
	// 다형성 구현 : 하나의 부모클래스에 다양한 자식클래스 타입을 넣을 수 있는 것
	public static void changeDog(Animal animal) {
		// 해결방법 : 잘못된 매개값이 들어올 수 있기 때문에 타입을 먼저 체크하자
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
		}
	}

}

class Animal { }
class Cat extends Animal { }
class Dog extends Animal { }