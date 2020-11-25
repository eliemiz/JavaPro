package ch07._201125;

class Bike3 {
	int wheel;
	int price = 10;

	Bike3(int wheel) {
		this.wheel = wheel;
	}

	void drive() {
		System.out.println("����� ��´�");
	}

	void stop() {
		System.out.println("�극��ũ�� ��´�");
	}
}

class AutoBike3 extends Bike3 {
	boolean power;
	int price = 200;

	AutoBike3(int wheel) {
		super(wheel);
	}

	void power() {
		power = !power;
		if (power) {
			System.out.println("������ �������ϴ�");
		} else {
			System.out.println("������ �������ϴ�");
		}

	}

	@Override
	void drive() {
		if (!power) {
			power();
		}

		System.out.println(this.price + "�� : ��� ��ư�� ������");
		System.out.println(super.price + "�� : ��� ��ư�� ������");
	}

	@Override
	void stop() {
		if (power) {
			System.out.println("���� ��ư�� ������");
		} else {
			System.out.println("������ �������ϴ�. ���� �� �����ϴ�");
		}

	}
}

public class Ex6_Polymorphism {
	public static void main(String[] args) {
		// ������ �������̵� ���� ������ �����ϱ� ����
		AutoBike3 auto = new AutoBike3(2);
		System.out.println("������ " + auto.price + "�����Դϴ�.");
		auto.drive();
		auto.stop();

		System.out.println("========================");

		Bike3 bike = auto;
		System.out.println("������ " + bike.price + "�����Դϴ�.");
		bike.drive();
		bike.stop();
	}
}