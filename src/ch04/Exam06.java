package ch04;

import java.util.Scanner;

// ���ڷ� �̷���� ���ڿ��� �Է¹޾� �� �ڸ��� ���� ���ϱ�

public class Exam06 {
	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		int sum = 0;
		for (int i = 0;i <str.length();i++) {
			sum += str.charAt(i) - 48;
		}
		
		System.out.println(sum);
		
	}
}
