package ch05;

// command line���� ���ڷ� �̷���� ���ڸ� 2�� �޾Ƽ� �� ���� ������� ���Ͻÿ�

public class Exam08 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		int min = (num1 < num2) ? num1 : num2;

		System.out.printf("�� �� %d �� %d �� ����� : ", num1, num2);
		for (int i = 1; i <= min; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.print(i + ", ");
			}
		}

	}

}
