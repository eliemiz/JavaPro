package ch09._201201;

public class Ex02_Equals {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 = "abc";
		String s4 = "abc";

		// �ٸ� �ּҸ� �����ϹǷ� �ٸ� ��ü
		if (s1 == s2) {
			System.out.println("s1�� s2�� ���� ��ü��.");
		} else {
			System.out.println("s1�� s2�� �ٸ� ��ü��.");
		}

		// String���� ���ڿ��� ������ equals�� true�� �����ϵ��� �������̵�
		if (s1.equals(s2)) {
			System.out.println("s1�� s2�� ���� ������ ��ü��.");
		} else {
			System.out.println("s1�� s2�� �ٸ� ������ ��ü��.");
		}

		// ���� ���ͷ� ���ڿ��� �����ϹǷ� ���� ��ü
		if (s3 == s4) {
			System.out.println("s1�� s2�� ���� ��ü��.");
		} else {
			System.out.println("s1�� s2�� �ٸ� ��ü��.");
		}

	}
}
