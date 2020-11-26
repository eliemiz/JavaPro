package ch07._201126;

// Animal 추상클래스
// type, leg
// 생성자 : 종류랑 다리 수 입력
// 멤버메서드 : void eat(), void sound() 추상메서드
// Dog : 생성자 매개변수 없음
// 멤버 메서드 : "주인이 주는 대로 먹는다", "멍멍"출력
// Lion : 생성자 매개변수 없음
// 메멉 메섣 : "초식동물을 잡아먹는다", "어흥"
// 

abstract class Animal {
	String type;
	int leg;

	Animal(String type, int leg) {
		this.type = type;
		this.leg = leg;
	}

	abstract void eat();

	abstract void sound();
}

class Dog extends Animal {
	Dog() {
		super("Dog", 4);
	}

	@Override
	void eat() {
		System.out.println("주인이 주는대로 먹는다.");
	}

	@Override
	void sound() {
		System.out.println("멍멍");
	}
}

class Lion extends Animal {
	Lion() {
		super("Lion", 4);
	}

	@Override
	void eat() {
		System.out.println("초식동물을 잡아먹는다.");
	}

	@Override
	void sound() {
		System.out.println("어흥");
	}
}

public class Exam04_Animal {
	public static void main(String[] args) {
		Animal[] animals = new Animal[2];
		animals[0] = new Dog();
		animals[1] = new Lion();
		for (Animal animal : animals) {
			System.out.print(animal.type + " => ");
			animal.sound();
			animal.eat();
		}
	}
}
