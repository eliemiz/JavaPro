package ch07._201130;

interface I {
	void test();
}

abstract class Abs {
	abstract void test();
}

public class Ex04_AnonymousClass {
	public static void main(String[] args) {
		// �͸�Ŭ������ �������̽��� �߻� �޼��带 �����ؾ� ��.
		I i = new I() {
			int iv = 100;

			@Override
			public void test() {
				System.out.println("iv = " + iv);
				System.out.println("this.iv = " + this.iv);
				System.out.println("I ����Ŭ������ test() �޼���");
			};

		};

		i.test();

//		System.out.println(i.iv);	// iv����� I �������̽��� ����� �ƴϹǷ� ���� �Ұ�

		int iv = 100;
//		iv++;

		Abs abs = new Abs() {

			@Override
			void test() {
				// �̳�Ŭ�������� ���������� ������ ���ȭ�ؾ� �ϹǷ� ���� iv++ �� �ּ�ó���ؾ� ��
				System.out.println("iv = " + iv);
				System.out.println("Abs ����Ŭ������ test() �޼���");
			}
		};

		abs.test();
	}
}
