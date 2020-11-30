package ch08;

import java.io.IOException;

// �������̵� �� �޼����� ����ó����
// �θ� �޼����� ����ó���� ���ų� ���� ������ �����ϴ�.
// �ڽ� Ŭ������ Exception ������ ũ��
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
