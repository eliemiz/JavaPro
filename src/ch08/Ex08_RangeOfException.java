package ch08;

import java.io.IOException;

// 오버라이딩 된 메서드의 예외처리는
// 부모 메서드의 예외처리와 같거나 좁은 범위만 가능하다.
// 자식 클래스의 Exception 범위가 크면
// Exception Exception is not compatible with throws clause in
// Parent.method(int)

class Parent {

	// void method(int i) throws IOException {
	void method(int i) throws Exception {
		System.out.println(i);
	}
}

class Child extends Parent {
	@Override
	void method(int i) throws Exception {
		System.out.println(i);

		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public class Ex08_RangeOfException {

}
