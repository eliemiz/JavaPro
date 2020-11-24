package ch04;

import java.util.Scanner;

// 숫자로 이루어진 문자열을 입력받아 각 자리수 합을 구하기

public class Exam06 {
	public static void main(String[] args) {
		System.out.println("문자열을 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		int sum = 0;
		for (int i = 0;i <str.length();i++) {
			sum += str.charAt(i) - 48;
		}
		
		System.out.println(sum);
		
	}
}
