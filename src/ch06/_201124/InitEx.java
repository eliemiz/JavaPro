package ch06._201124;

// 2020-11-24 10:40 Ex2

public class InitEx {
	static int cv;
	int iv;

	// constructor
	InitEx() {
		System.out.println("5. ������ ȣ���");
	}

	// static initialization block
	static {
		cv = (int) (Math.random() * 100);
		System.out.println("1. Ŭ���� �ʱ�ȭ ��. cv = " + cv);
	}

	// instance initialization block
	{
		iv = (int) (Math.random() * 100);
		System.out.println("4. �ν��Ͻ� �ʱ�ȭ ��. �����ں��� ���� ȣ�� ��. iv = " + iv);
	}

	public static void name() {
	}

	public static void main(String[] args) {
		System.out.println("2. main method ����");
		System.out.println("3. main init1 ��ü ����");
		InitEx init1 = new InitEx();
		name();
		System.out.println("3. main init2 ��ü ����");
		InitEx init2 = new InitEx();

	}
}
