package ch07._201130;

class Outer3 {
	int iv = 10;

	class InstanceInner {
		int iv = 100;

		void method() {
			int iv = 300;

			System.out.println("iv = " + iv); // 300 지역변수
			System.out.println("this.iv = " + this.iv); // 100 내부클래스의 인스턴스변수
			this.iv = 50; // 변경 가능
			System.out.println("this.iv(변경 후) = " + this.iv); // 50
			System.out.println("InstanceInner.this.iv = " + InstanceInner.this.iv); // 이렇게도 표현 가능
			System.out.println("Outer3.this.iv = " + Outer3.this.iv); // 10 외부클래스의 인스턴스변수
		}
	}
}

public class Ex03_ThisInInnerClass {
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Outer3.InstanceInner ii = out.new InstanceInner();
		ii.method();
	}
}
