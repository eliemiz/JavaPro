package ch03_Operator;

import java.util.Scanner;

public class Exam08 {
	// 10���� 99 ������ �� �ڸ� �ڿ����� �Է¹޾� �Է¼� �̻��� ���� ���� 10�� ����� ���� ��
	// �� ������ �Է� ���� �� �� ����ϱ�

	public static void main(String[] args) {

		System.out.println("10���� 99������ �� �ڸ� ���� �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int mul = (num % 10 != 0) ? ((num / 10 + 1) * 10) : num;
		System.out.printf("%d - %d = %d", mul, num, mul - num);
		
	}
}
