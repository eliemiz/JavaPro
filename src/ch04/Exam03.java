package ch04;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		// 윤년 구하기
		// 4의 배수가 아닌 경우 : 평년
		// 4의 배수인데 100의 배수인 경우 평년
		// 4의 배수인데 400의 배수인 경우 윤년

		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하시오 : ");
		int year = scan.nextInt();

		if (year % 4 == 0) {
			if (year % 100 == 0 && year % 400 != 0) {
				System.out.println("평년입니다.");
			} else {
				System.out.println("윤년입니다.");
			}
		} else {
			System.out.println("평년입니다.");
		}

	}

}
