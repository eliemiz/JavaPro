package ch03_Operator;

import java.util.Scanner;

public class Exam05 {

	// ȭ�鿡�� �ݾ��� �Է¹޾� 500, 100, 50, 10, 1�� �������� �ٲٱ�
	public static void main(String[] args) {

		int coin;
		System.out.println("�ݾ��� �Է��ϼ���");

		Scanner scan = new Scanner(System.in);
		coin = scan.nextInt();

		System.out.printf("500�� : %d��\n", coin / 500);
		System.out.printf("100�� : %d��\n", (coin % 500) / 100);
		System.out.printf("50�� : %d��\n", (coin % 100) / 50);
		System.out.printf("10�� : %d��\n", (coin % 50) / 10);
		System.out.printf("1�� : %d��\n", coin % 10);
		
	}
}

