package ch09._201201;

// ���� ��ü���� ���δ� ==�� ���� ������
// ���� �������� ���δ� equals �޼��带 �������̵� �ؾ� ��.

class Equal {
	int value;

	Equal(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Equal) {
			Equal e = (Equal) obj;
			return value == e.value;
		} else {
			return false;
		}
	}
}

public class Ex01_Equals {
	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);

		// ���� �ٸ� ��ü�� ����
		if (e1 == e2) {
			System.out.println("e1�� e2�� ���� ��ü��.");
		} else {
			System.out.println("e1�� e2�� �ٸ� ��ü��.");
		}

		// ���� �ٸ� ��ü�� �����ϰ� ������, ���� value�� ������ �����Ƿ� equals�� ���� ���� ��ü ó��
		if (e1.equals(e2)) {
			System.out.println("e1�� e2�� ���� ������ ��ü��.");
		} else {
			System.out.println("e1�� e2�� �ٸ� ������ ��ü��.");
		}
	}
}
