package ch04;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		// ���� ���ϱ�
		// 4�� ����� �ƴ� ��� : ���
		// 4�� ����ε� 100�� ����� ��� ���
		// 4�� ����ε� 400�� ����� ��� ����

		Scanner scan = new Scanner(System.in);
		System.out.println("�⵵�� �Է��Ͻÿ� : ");
		int year = scan.nextInt();

		if (year % 4 == 0) {
			if (year % 100 == 0 && year % 400 != 0) {
				System.out.println("����Դϴ�.");
			} else {
				System.out.println("�����Դϴ�.");
			}
		} else {
			System.out.println("����Դϴ�.");
		}

	}

}
