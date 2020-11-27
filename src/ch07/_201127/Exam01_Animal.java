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
		super("��ѱ�");
	}

	@Override
	public void fly() {
		System.out.println(name + "�� ���ƴٴϴ� ���Դϴ�.");
	}

	@Override
	void eat() {
		System.out.println(name + "�� ���� ������ ��ƸԴ´�.");
	}
}

// Monkey�� Flyable �������̽��� �������� ����.
class Monkey extends Animal {
	Monkey() {
		super("������");
	}

	@Override
	void eat() {
		System.out.println(name + "�� �������� ���Ÿ� ���Դ´�.");
	}
}

public class Exam01_Animal {
	public static void main(String[] args) {

		Animal animal = new Dove();	// up-casting
		animal.eat();
		if (animal instanceof Flyable) {	// animal�� �����ϴ� ��ü�� Dove Ÿ��, �� Flyable�� ������ Ŭ�����̹Ƿ� true
			Flyable f = (Flyable) animal;
			f.fly();
		}

		animal = new Monkey();
		animal.eat();
		if (animal instanceof Flyable) {	// animal�� �����ϴ� ��ü�� Monkey Ÿ��, �� Flyable�� �������� ���� Ŭ�����̹Ƿ� false
			((Flyable) animal).fly();
		}
	}
}
