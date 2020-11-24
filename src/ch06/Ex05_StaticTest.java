package ch06;

class Sonata {

	String color;
	int number;
	static int width = 250;
	static int height = 150;

	public String toString() {
		return color + " : " + number + " (" + width + ", " + height + ")";
	}

}

public class Ex05_StaticTest {

	public static void main(String[] args) {
		System.out.println("�ڵ��� ũ�� : " + Sonata.width + ", " + Sonata.height);

		Sonata car1 = new Sonata();
		car1.color = "white";
		car1.number = 1234;
		System.out.println("car1 : " + car1); // println�� �ּҸ� ����ϸ� �ش� Ŭ������ toString�� �����

		Sonata car2 = new Sonata();
		car2.color = "black";
		car2.number = 2345;
		System.out.println("car2 : " + car2);

		// Ŭ���� ���� �� ����
		car2.width = 300;
		car1.height = 200;

		System.out.println("car1 : " + car1);
		System.out.println("car2 : " + car2);

	}

}
