package ch03_Operator;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ��� : ");

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		String result = (num > 0) ? "���" : (num < 0) ? "����" : "0";
		System.out.println("�Է��� ���� " + result + "�Դϴ�.");

	}

}
