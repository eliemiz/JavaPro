package ch07;

public class Ex14 {
	public static void main(String[] args) {
//		Singleton s = new Singleton();	// Singleton() has private access in Singleton
		Singleton s = Singleton.getInstance();
	}

}

final class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}
}

// 
class Temp1 {
	// static method�� ������ �ִ� �޼��忡�� ����� �� �ֱ� ����
//	static abstract void method() {
//		
//	}
}

// final : Ŭ���� Ȯ�� �Ұ�, abstract : ����� ���� �ϼ��ȴٴ� �ǹ��̹Ƿ� 
//final abstract class Temp2 {
//
//}

class Temp3 {
	// abstract�� �ڼ� Ŭ�������� �������־�� �ϴµ�,
	// modifier�� private�̸� ������ �� ���� ����
//	private abstract void method() {
//		
//	}
}

class Temp4 {
	// private �޼���� overriding �� �� ���� ������
	// private, final �� �� �ϳ��� ���־ ���
	private final void method() {

	}
}