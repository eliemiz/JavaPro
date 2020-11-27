package ch07._201127;

import ch07._201127ex.Modifier2;

//���� ������		���� ��� ����
//private		���� Ŭ����
//(default)		���� Ŭ���� + ���� ��Ű��
//protected		���� Ŭ���� + ���� ��Ű�� + ��Ӱ���
//public		���� Ŭ���� + ���� ��Ű�� + ��Ӱ��� + ��� Ŭ����

class Modifier {
	private int v1 = 100;
	int v2 = 200;

	public void method() {
		System.out.println("ch07._201127.method() �޼���");
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
	}
}

class Modifier3 extends Modifier2 {
	public void method() {
//		System.out.println("v1 = " + v1);	// private : ���� Ŭ������ �ƴϹǷ� ���� �Ұ�
//		System.out.println("v2 = " + v2);	// (default) : ���� ��Ű���� �ƴϹǷ� ���� �Ұ�
		System.out.println("v3 = " + v3); // protected : ��� �����̹Ƿ� ���� ����
		System.out.println("v4 = " + v4); // public : ������ ���� ����
	}

}

public class Ex01_Modifier {
	public static void main(String[] args) {
		Modifier m1 = new Modifier();
//		System.out.println(m1.v1);	// private : ���� Ŭ������ �ƴϹǷ� ���� �Ұ�
		System.out.println(m1.v2); // (default) : ���� ��Ű���̹Ƿ� ���� ����
		m1.method(); // public : ������ ���� ����

		Modifier3 m3 = new Modifier3();
//		System.out.println("m3.v1 = " + m3.v1);	// private :  ���� Ŭ������ �ƴϹǷ� ���� �Ұ�
//		System.out.println("m3.v2 = " + m3.v2); // (default) : ���� ��Ű���� �ƴϹǷ� ���� �Ұ�
//		System.out.println("m3.v3 = " + m3.v3); // protected : ��� ���赵 �ƴϹǷ� ���� �Ұ�
		System.out.println("m3.v4 = " + m3.v4); // public : ������ ���� ����

//		Math m = new Math();	// �������� modifier�� private : ���� Ŭ������ �ƴϹǷ� ���� �Ұ�

	}
}
