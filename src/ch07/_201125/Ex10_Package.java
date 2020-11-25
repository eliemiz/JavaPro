package ch07._201125;

import java.util.Date;

class Pack1 {
	void method() {
		System.out.println("Pack1.method() 호출됨.");
	}
}

public class Ex10_Package {
	public static void main(String[] args) {

		ch07._201125.Pack1 p1 = new ch07._201125.Pack1(); // 0. 다른 패키지의 클래스 호출 시

		Pack1 p2 = new Pack1(); // 1. 같은 패키지에 속한 클래스는 패키지명 생략 가능

		String str = new String(); // 2. java.lang에 속한 클래스는 패키지명 생략 가능

		Date date = new Date(); // 3. import 구문으로 설정된 클래스는 패키지명 생략 가능

	}
}
