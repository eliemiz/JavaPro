package ch04;

// 1. 1���� 100���� 2�� ����̰ų� 3�� ��� �� ���ϱ�
// 2. 1���� 100���� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���� �� ���ϱ�
public class Exam07 {

	public static void main(String[] args) {

		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				sum1 += i;
			}
		}
		System.out.println("1. " + sum1);

		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum2 += i;
			}
		}
		System.out.println("2. " + sum2);

	}

}
