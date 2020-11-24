package ch04;

import java.util.Scanner;

public class Exam01 {
	// 숫자를 입력받아 양수 음수 0 출력
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num = scan.nextInt();

		if (num > 0) {
			System.out.println("양수");
		} else if (num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
		
		int result = num / ((num > 0)?num:-num);

	}

}
