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
			System.out.println("��ȭ �ɱ�");
		}
	}

	void recv() {
		if (power) {
			System.out.println("��ȭ �ޱ�");
		}
	}
}

// parent class
class SmartPhone extends Phone {
	void setApp(String name) {
		if (power) {
			System.out.println(name + " ��ġ ��...");
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
