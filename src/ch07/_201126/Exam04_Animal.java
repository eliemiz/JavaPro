package ch07._201126;

// Animal �߻�Ŭ����
// type, leg
// ������ : ������ �ٸ� �� �Է�
// ����޼��� : void eat(), void sound() �߻�޼���
// Dog : ������ �Ű����� ����
// ��� �޼��� : "������ �ִ� ��� �Դ´�", "�۸�"���
// Lion : ������ �Ű����� ����
// �޸� �޼� : "�ʽĵ����� ��ƸԴ´�", "����"
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
		System.out.println("������ �ִ´�� �Դ´�.");
	}

	@Override
	void sound() {
		System.out.println("�۸�");
	}
}

class Lion extends Animal {
	Lion() {
		super("Lion", 4);
	}

	@Override
	void eat() {
		System.out.println("�ʽĵ����� ��ƸԴ´�.");
	}

	@Override
	void sound() {
		System.out.println("����");
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
