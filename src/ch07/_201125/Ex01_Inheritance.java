package ch07._201125;

// child class
class Phone {
	boolean power;
	int number;

	void Power() {
		power = !power;
	}

	void send() {
		if (power) {
			System.out.println("전화 걸기");
		}
	}

	void recv() {
		if (power) {
			System.out.println("전화 받기");
		}
	}
}

// parent class
class SmartPhone extends Phone {
	void setApp(String name) {
		if (power) {
			System.out.println(name + " 설치 중...");
		}
	}

	public String toString() {
		return "SmartPhone";
	}
}

public class Ex01_Inheritance {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		System.out.println(sp.toString());
		sp.power = true;
		sp.send();
		sp.recv();
		sp.setApp("naver");
	}
}
