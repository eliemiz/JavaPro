package ch04;

import java.util.Scanner;

// �ﰢ�� ���̸� �Է¹ް�, ���̿� �´� *�� ���ﰢ�� ����ϱ�

public class Exam10 {

	public static void main(String[] args) {

		System.out.println("�ﰢ���� ���̸� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		
		int len = scan.nextInt();

		for (int i = len; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				System.out.print((j < i) ? " " : "*");
			}

			System.out.println();
		}

	}

}
