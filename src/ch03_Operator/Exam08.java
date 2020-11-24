package ch03_Operator;

import java.util.Scanner;

public class Exam08 {
	// 10부터 99 사이의 두 자리 자연수를 입력받아 입력수 이상의 가장 작음 10의 배수를 구한 뒤
	// 그 수에서 입력 수를 뺀 값 출력하기

	public static void main(String[] args) {

		System.out.println("10부터 99까지의 두 자리 수를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int mul = (num % 10 != 0) ? ((num / 10 + 1) * 10) : num;
		System.out.printf("%d - %d = %d", mul, num, mul - num);
		
	}
}
