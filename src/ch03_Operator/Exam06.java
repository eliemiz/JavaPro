package ch03_Operator;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		System.out.println("한 개의 문자를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		char ch = str.charAt(0);

		System.out.println((ch >= 'a'&& ch <= 'z')?((char)(ch -32)):"소문자 아님");
		
//		if (ch >= 'a' && ch <= 'z') {
//			System.out.println((char) (ch - 32));
//		} else {
//			System.out.println("소문자 아님");
//		}

	}

}
