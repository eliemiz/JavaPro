package ch04;

import java.util.Scanner;

public class Exam05 {
	// �ڿ����� �Է¹޾� ������ �ڸ��� �� ���ϱ�
	public static void main(String[] args) {
		System.out.println("�ڿ����� �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}

		System.out.println("�ڸ��� �� : " + sum);
	}
}
