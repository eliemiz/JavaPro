package ch04;

import java.util.Scanner;

public class Exam05 {
	// 자연수를 입력받아 각각의 자리수 합 구하기
	public static void main(String[] args) {
		System.out.println("자연수를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}

		System.out.println("자리수 합 : " + sum);
	}
}
