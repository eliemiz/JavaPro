package ch04;

import java.util.Scanner;

// �Ƕ�̵� ���

public class Exam13 {

	public static void main(String[] args) {

		System.out.println("�ﰢ���� ���̸� �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 1; j < num * 2; j++) {
				System.out.print((j >= num - i && j <= num + i) ? "*" : " ");
			}

			System.out.println();
		}

	}

}
