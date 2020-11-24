package ch07;

public class Ex15 {

	public static void main(String[] args) {

		Car car = null;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;

		fe1.water();
		car = fe1; // car = (Car)fe1;과 같은 뜻. 묵시적 형변환. Up-casting
//		car.water();	// Car타입이므로 기존 f1e에 water()가 있었어도 쓰지 못한다.

		fe2 = (FireEngine) car; // 명시적 형변환. Down-casting
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