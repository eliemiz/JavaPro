package ch07._201130;

interface I {
	void test();
}

abstract class Abs {
	abstract void test();
}

public class Ex04_AnonymousClass {
	public static void main(String[] args) {
		// 익명클래스는 인터페이스나 추상 메서드를 구현해야 함.
		I i = new I() {
			int iv = 100;

			@Override
			public void test() {
				System.out.println("iv = " + iv);
				System.out.println("this.iv = " + this.iv);
				System.out.println("I 내부클래스의 test() 메서드");
			};

		};

		i.test();

//		System.out.println(i.iv);	// iv멤버는 I 인터페이스의 멤버가 아니므로 접근 불가

		int iv = 100;
//		iv++;

		Abs abs = new Abs() {

			@Override
			void test() {
				// 이너클래스에서 지역변수를 쓰려면 상수화해야 하므로 위에 iv++ 를 주석처리해야 함
				System.out.println("iv = " + iv);
				System.out.println("Abs 내부클래스의 test() 메서드");
			}
		};

		abs.test();
	}
}
