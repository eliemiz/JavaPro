package ch06._201124;

// 2020-11-24 10:40 Ex2

public class Ex2_Init {
	static int cv;
	int iv;

	// constructor
	Ex2_Init() {
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
		Ex2_Init init1 = new Ex2_Init();
		name();
		System.out.println("3. main init2 ��ü ����");
		Ex2_Init init2 = new Ex2_Init();

	}
}
