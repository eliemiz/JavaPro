package ch04;

import java.util.Scanner;

public class Exam02 {

	// 문자 하나를 입력받아 대문자, 소문자, 숫자, 기타문자인지 출력하기
	public static void main(String[] args) {

		System.out.println("한 개의 문자를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("소문자");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("숫자");
		} else {
			System.out.println("기타 문자");
		}

	}

}
