package ch07._201125;

import java.util.Date;

class Pack1 {
	void method() {
		System.out.println("Pack1.method() ȣ���.");
	}
}

public class Ex10_Package {
	public static void main(String[] args) {

		ch07._201125.Pack1 p1 = new ch07._201125.Pack1(); // 0. �ٸ� ��Ű���� Ŭ���� ȣ�� ��

		Pack1 p2 = new Pack1(); // 1. ���� ��Ű���� ���� Ŭ������ ��Ű���� ���� ����

		String str = new String(); // 2. java.lang�� ���� Ŭ������ ��Ű���� ���� ����

		Date date = new Date(); // 3. import �������� ������ Ŭ������ ��Ű���� ���� ����

	}
}
