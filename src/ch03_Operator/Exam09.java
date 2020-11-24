package ch03_Operator;

import java.util.Scanner;

public class Exam09 {

	// 3자리 정수 입력받아 100자리 미만 버리고 출력
	// 321 ->300
	public static void main(String[] args) {

		int num;
		System.out.println("세 자리 정수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();

		System.out.println(num / 100 * 100);
		
	}
}
