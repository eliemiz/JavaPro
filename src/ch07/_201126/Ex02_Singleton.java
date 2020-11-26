package ch07._201126;

class SingleObject {

	private static SingleObject obj = new SingleObject();
	private int value = 100;

	// �ܺο��� ȣ���� �� ���� private ������
	private SingleObject() {

	}

	public static SingleObject getObject() {
		return obj;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

public class Ex02_Singleton {
	public static void main(String[] args) {
//		SingleObject so = new SingleObject();	// public �����ڰ� �����Ƿ� ��ü ���� �Ұ�
		SingleObject so1 = SingleObject.getObject();
		SingleObject so2 = SingleObject.getObject();
		System.out.println(so1 + ", " + so2); // ���� �ּҸ� �����ϹǷ� ���� �ּҰ� ����

		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println(o1 + ", " + o2); // �Ϲ������� �ٸ� �ּҿ� �������� ������

		System.out.println(so1.getValue());
		System.out.println(so2.getValue());

		so1.setValue(500); // ���� ��ü�̹Ƿ� ���� ���� �� �����
		System.out.println(so1.getValue());
		System.out.println(so2.getValue());
		if (so1 == so2) {
			System.out.println("so1 ���������� ��ü�� so2 ���������� ��ü�� ���� ��ü��.");
		}
	}
}