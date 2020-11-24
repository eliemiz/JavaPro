package ch07;

public class Ex0506 {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.method();
		
		Child2 c2 = new Child2();
		c2.method();
	}

}

class Parent {
	int x = 10;
}

class Child1 extends Parent {
	void method() {
		System.out.println("Default");
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

class Child2 extends Parent {

	int x = 20;

	void method() {
		System.out.println("Variable that same name to parent'");
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}