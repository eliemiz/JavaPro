package ch03_Operator;

import java.util.Scanner;

public class Exam05 {

	// 화면에서 금액을 입력받아 500, 100, 50, 10, 1원 동전으로 바꾸기
	public static void main(String[] args) {

		int coin;
		System.out.println("금액을 입력하세요");

		Scanner scan = new Scanner(System.in);
		coin = scan.nextInt();

		System.out.printf("500원 : %d개\n", coin / 500);
		System.out.printf("100원 : %d개\n", (coin % 500) / 100);
		System.out.printf("50원 : %d개\n", (coin % 100) / 50);
		System.out.printf("10원 : %d개\n", (coin % 50) / 10);
		System.out.printf("1원 : %d개\n", coin % 10);
		
	}
}

