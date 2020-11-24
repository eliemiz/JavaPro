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
		System.out.println("자동차 크기 : " + Sonata.width + ", " + Sonata.height);

		Sonata car1 = new Sonata();
		car1.color = "white";
		car1.number = 1234;
		System.out.println("car1 : " + car1); // println은 주소를 출력하면 해당 클래스의 toString을 출력함

		Sonata car2 = new Sonata();
		car2.color = "black";
		car2.number = 2345;
		System.out.println("car2 : " + car2);

		// 클래스 변수 값 대입
		car2.width = 300;
		car1.height = 200;

		System.out.println("car1 : " + car1);
		System.out.println("car2 : " + car2);

	}

}
