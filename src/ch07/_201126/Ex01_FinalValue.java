package ch07._201126;

class FinalValue {
	final int NUM;
	final int NUM2 = 100;

	FinalValue(int num) {
		NUM = num; // �����ڿ��� �� �� �� ���� ����
//		NUM2 = 100;	// ����� �ʱ�ȭ �� �� ����� ���� �Ұ�
	}

	FinalValue() {
		this(100);
	}

	public int getNum() {
		return NUM;
	}
}

public class Ex01_FinalValue {
	public static void main(String[] args) {
		FinalValue f1 = new FinalValue();
//		f1.NUM = 200;	// NUM�� ����̱� ������ ���� �Ұ�
		System.out.println(f1.getNum());

		FinalValue f2 = new FinalValue(200);
		System.out.println(f2.getNum());
	}
}
