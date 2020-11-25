package ch07._201125;

class Parent2 {
	int x = 10;

	Parent2(int x) {
		this.x = x;
	}

	Parent2() {
		x = 400;
	}

}

class Child2 extends Parent2 {
	int x = 20;

	Child2() {
	}

	void method() {
		int x = 30;
		System.out.println(x); // local variable
		System.out.println(this.x); // Child2 class의 x
		System.out.println(super.x); // Parent2 class의 x. default constructor에 의해 x = 400
	}
}

public class Ex3_SuperEx {
	public static void main(String[] args) {
		Child2 child = new Child2();
		child.method();
	}
}
