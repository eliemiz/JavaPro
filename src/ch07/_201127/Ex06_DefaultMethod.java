package ch07._201127;

interface MyInterface1 {
	void method1();

	default void defaultMethod() {
		System.out.println("MyInterface1의 디폴트 메서드 : defaultMethod()");
	}

	static void staticMethod() {
		System.out.println("MyInterface1의 스태틱 메서드 : staticMethod()");
	}
}

interface MyInterface2 {
	void method1();

	default void defaultMethod() {
		System.out.println("MyInterface2의 디폴트 메서드 : defaultMethod()");
	}

	static void staticMethod() {
		System.out.println("MyInterface2의 스태틱 메서드 : staticMethod()");
	}
}

class Parent {
	public void method2() {
		System.out.println("Parent의 멤버 메서드 : method2()");
	}
}

class Child extends Parent implements MyInterface1, MyInterface2 {

	// 두 인터페이스의 defaultMethod가 충돌을 일으키므로, 구현클래스에서 무조건 오버라이딩 해야 한다.
	@Override
	public void defaultMethod() {
		System.out.println("MyInterface1, MyInterface2에서 충돌난 디폴트 메서드를 오버라이딩한 메서드 : defaultMethod().");
	}

	// 인터페이스의 메서드는 오버라이딩을 통해 구현해야 한다.
	@Override
	public void method1() {
		System.out.println("Child에서 오버라이딩한 메서드 : method1()");
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
