package ch08._201201;

public class Ex01_RuntimeException {
	public static void main(String[] args) {
		badMethod();
	}

	private static void badMethod() {
		// RuntimeException�� ������ �������� ����ó�� ���� ������,
		// ���� �������� ������ ó���� ���� ������ ����ó���ȴ�.
		throw new RuntimeException("���� ���� �߻�");
	}
}
