package ch04;

import java.util.Scanner;

// 피라미드 출력

public class Exam13 {

	public static void main(String[] args) {

		System.out.println("삼각형의 높이를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 1; j < num * 2; j++) {
				System.out.print((j >= num - i && j <= num + i) ? "*" : " ");
			}

			System.out.println();
		}

	}

}
