package ch03_Operator;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		System.out.println("�� ���� ���ڸ� �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		char ch = str.charAt(0);

		System.out.println((ch >= 'a'&& ch <= 'z')?((char)(ch -32)):"�ҹ��� �ƴ�");
		
//		if (ch >= 'a' && ch <= 'z') {
//			System.out.println((char) (ch - 32));
//		} else {
//			System.out.println("�ҹ��� �ƴ�");
//		}

	}

}
