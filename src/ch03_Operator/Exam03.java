package ch03_Operator;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		final int CAPACITY = 10;

		System.out.println("사과의 갯수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

//		int result = num / CAPACITY;
//		if (num % CAPACITY != 0) {
//			result++;
//		}

		int result = num / CAPACITY + ((num % CAPACITY != 0) ? 1 : 0);

		System.out.println("필요한 상자의 갯수 : " + result);

//		System.out.println((int)Math.ceil(num / (double)CAPACITY));

	}

}
