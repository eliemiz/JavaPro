package ch04;

import java.util.Scanner;

public class Exam01 {
	// ���ڸ� �Է¹޾� ��� ���� 0 ���
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int num = scan.nextInt();

		if (num > 0) {
			System.out.println("���");
		} else if (num < 0) {
			System.out.println("����");
		} else {
			System.out.println("0");
		}
		
		int result = num / ((num > 0)?num:-num);

	}

}
