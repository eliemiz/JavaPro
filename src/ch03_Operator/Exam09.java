package ch03_Operator;

import java.util.Scanner;

public class Exam09 {

	// 3�ڸ� ���� �Է¹޾� 100�ڸ� �̸� ������ ���
	// 321 ->300
	public static void main(String[] args) {

		int num;
		System.out.println("�� �ڸ� ������ �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();

		System.out.println(num / 100 * 100);
		
	}
}
