package ch07._201125;

abstract class Abs1 {
	int a = 10;

	protected abstract int getA();
}

abstract class Abs2 extends Abs1 {

	int b = 20;

	protected abstract int getB();
}

class Normal extends Abs2 {
	@Override
	protected int getA() {
		return a;
	}

	@Override
	protected int getB() {
		return b;
	}
}

public class Ex09_InheritanceOfAbstractClass {
	public static void main(String[] args) {
		Abs1 a1 = new Normal();
		System.out.println(a1.getA());
//		System.out.println(a1.getB());	// Abs1에는 Abs2가 없으므로 에러

		Abs2 a2 = (Abs2) a1;
		System.out.println(a2.getA());
		System.out.println(a2.getB());

		Normal n = (Normal) a2;
		System.out.println(n.getA());
		System.out.println(n.getB());

//		a2 = new Abs2();	// 추상클래스는 객체화 불가
	}
}
