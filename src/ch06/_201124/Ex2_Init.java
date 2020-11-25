package ch06._201124;

// 2020-11-24 10:40 Ex2

public class Ex2_Init {
	static int cv;
	int iv;

	// constructor
	Ex2_Init() {
		System.out.println("5. 생성자 호출됨");
	}

	// static initialization block
	static {
		cv = (int) (Math.random() * 100);
		System.out.println("1. 클래스 초기화 블럭. cv = " + cv);
	}

	// instance initialization block
	{
		iv = (int) (Math.random() * 100);
		System.out.println("4. 인스턴스 초기화 블럭. 생성자보다 먼저 호출 됨. iv = " + iv);
	}

	public static void name() {
	}

	public static void main(String[] args) {
		System.out.println("2. main method 시작");
		System.out.println("3. main init1 객체 생성");
		Ex2_Init init1 = new Ex2_Init();
		name();
		System.out.println("3. main init2 객체 생성");
		Ex2_Init init2 = new Ex2_Init();

	}
}
