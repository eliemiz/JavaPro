package ch07._201127;

interface MyInterface1 {
	void method1();

	default void defaultMethod() {
		System.out.println("MyInterface1�� ����Ʈ �޼��� : defaultMethod()");
	}

	static void staticMethod() {
		System.out.println("MyInterface1�� ����ƽ �޼��� : staticMethod()");
	}
}

interface MyInterface2 {
	void method1();

	default void defaultMethod() {
		System.out.println("MyInterface2�� ����Ʈ �޼��� : defaultMethod()");
	}

	static void staticMethod() {
		System.out.println("MyInterface2�� ����ƽ �޼��� : staticMethod()");
	}
}

class Parent {
	public void method2() {
		System.out.println("Parent�� ��� �޼��� : method2()");
	}
}

class Child extends Parent implements MyInterface1, MyInterface2 {

	// �� �������̽��� defaultMethod�� �浹�� ����Ű�Ƿ�, ����Ŭ�������� ������ �������̵� �ؾ� �Ѵ�.
	@Override
	public void defaultMethod() {
		System.out.println("MyInterface1, MyInterface2���� �浹�� ����Ʈ �޼��带 �������̵��� �޼��� : defaultMethod().");
	}

	// �������̽��� �޼���� �������̵��� ���� �����ؾ� �Ѵ�.
	@Override
	public void method1() {
		System.out.println("Child���� �������̵��� �޼��� : method1()");
	}
}

public class Ex06_DefaultMethod {
	public static void main(String[] args) {
		Child c = new Child();
		c.method1();
		c.method2();
		c.defaultMethod();
		System.out.println();
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();
	}
}
