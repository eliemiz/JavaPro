package ch08._201130;

public class Ex01_Exception1 {
	public static void main(String[] args) {
//		System.out.println(1/0);	// ArithmeticException �߻�

		try {
			System.out.println(1 / 0);
		} catch (ArithmeticException e) {
			System.out.println(e);	// ���� �߻� �� �ش� ���� ���� ���
		}

	}
}
