package ch04;

import java.util.Scanner;

// 삼각형 높이를 입력받고, 높이에 맞는 *로 역삼각형 출력하기

public class Exam10 {

	public static void main(String[] args) {

		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		
		int len = scan.nextInt();

		for (int i = len; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				System.out.print((j < i) ? " " : "*");
			}

			System.out.println();
		}

	}

}
