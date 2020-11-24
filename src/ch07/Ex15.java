package ch07;

public class Ex15 {

	public static void main(String[] args) {

		Car car = null;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;

		fe1.water();
		car = fe1; // car = (Car)fe1;�� ���� ��. ������ ����ȯ. Up-casting
//		car.water();	// CarŸ���̹Ƿ� ���� f1e�� water()�� �־�� ���� ���Ѵ�.

		fe2 = (FireEngine) car; // ����� ����ȯ. Down-casting
		fe2.water();

	}

}

class Car {
	
}

class FireEngine extends Car {
	void water() {
		System.out.println("water");
	}
}