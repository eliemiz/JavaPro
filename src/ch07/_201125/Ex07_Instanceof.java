package ch07._201125;

class Parent4 {
	int x = 10;
}

class Child4 extends Parent4 {
	int x = 20;

	void method() {
		System.out.println("child method");
	}
}

public class Ex07_Instanceof {
	public static void main(String[] args) {
		Parent4 p = new Parent4();

		// Parent4에는 Child4가 없으므로 여기를 타지 않는다.
		if (p instanceof Child4) {
			System.out.println("p 참조변수 객체는 Child4 객체다");
			Child4 c = (Child4) p;
			System.out.println(c.x);
			c.method();
		}

		if (p instanceof Parent4) {
			System.out.println("p 참조변수 객체는 Parent4 객체다");
		}

		System.out.println("=====================================");

		p = new Child4();

		if (p instanceof Child4) {
			System.out.println("p 참조변수 객체는 Child4 객체다");
			Child4 c = (Child4) p;
			System.out.println(c.x);
			c.method();
		}

		// Child4에는 Parent4가 있으므로 여기를 탄다
		if (p instanceof Parent4) {
			System.out.println("p 참조변수 객체는 Parent4 객체다");
		}

		System.out.println("=====================================");

		if (p instanceof Object) {
			System.out.println("p 참조변수 객체는 Object 객체다");
			Object o = p;
			System.out.println(p.x);
//			System.out.println(o.x);	// x는 Object 클래스의 멤버가 아니다.
		}
	}
}

// 현재ㅐ 타입이 child면 그 주소에 parent가 있다