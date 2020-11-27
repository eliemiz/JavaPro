package ch07._201127;

abstract class Animal {
	String name;

	Animal(String name) {
		this.name = name;
	}

	abstract void eat();
}

interface Flyable {
	void fly();
}

class Dove extends Animal implements Flyable {
	Dove() {
		super("비둘기");
	}

	@Override
	public void fly() {
		System.out.println(name + "는 날아다니는 새입니다.");
	}

	@Override
	void eat() {
		System.out.println(name + "는 작은 벌레를 잡아먹는다.");
	}
}

// Monkey는 Flyable 인터페이스를 구현하지 않음.
class Monkey extends Animal {
	Monkey() {
		super("원숭이");
	}

	@Override
	void eat() {
		System.out.println(name + "는 나무에서 열매를 따먹는다.");
	}
}

public class Exam01_Animal {
	public static void main(String[] args) {

		Animal animal = new Dove();	// up-casting
		animal.eat();
		if (animal instanceof Flyable) {	// animal이 참조하는 객체는 Dove 타입, 즉 Flyable을 구현한 클래스이므로 true
			Flyable f = (Flyable) animal;
			f.fly();
		}

		animal = new Monkey();
		animal.eat();
		if (animal instanceof Flyable) {	// animal이 참조하는 객체는 Monkey 타입, 즉 Flyable을 구현하지 않은 클래스이므로 false
			((Flyable) animal).fly();
		}
	}
}
