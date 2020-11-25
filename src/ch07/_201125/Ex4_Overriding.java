package ch07._201125;

// @Override : 오버라이딩 아닌 메서드 위에 붙일 경우 에러 

class Bike {
	int wheel;

	Bike(int wheel) {
		this.wheel = wheel;
	}

	String drive() {
		return "페달을 밟는다";
	}

	String stop() {
		return "브레이크를 잡는다";
	}

}

class AutoBike extends Bike {
	boolean power;

	AutoBike(int wheel) {
		super(wheel);
	}

	void power() {
		power = !power;
	}

	@Override
	String drive() {
		if (!power) {
			power();
		}

		return "출발 버튼을 누른다";
	}

	@Override
	String stop() {
		if (power) {
			return "정지 버튼을 누른다";
		} else {
			return "이미 정지되어 있음";
		}
	}
}

public class Ex4_Overriding {
	public static void main(String[] args) {
		
		AutoBike ab = new AutoBike(2);
		System.out.println(ab.drive());
		System.out.println("바퀴 " + ab.wheel + "개가 굴러간다.");
		System.out.println(ab.stop());
		System.out.println("천천히 멈춘다");
		System.out.println("=======================");

		Bike b = new Bike(2);
		System.out.println(b.drive());
		System.out.println("바퀴 " + b.wheel + "개가 굴러간다.");
		System.out.println(b.stop());
		System.out.println("천천히 멈춘다");

	}
}
