package ch03_Operator;

import java.util.Scanner;

public class Exam10 {

	// 실수 또는 정수를 입력받아 정수인지 실수인지 출력
	public static void main(String[] args) {

		System.out.println("실수 또는 정수를 입력하시오(ex. 11.5, 20) : ");
		Scanner scan = new Scanner(System.in);
		double d = scan.nextDouble();

		System.out.println(d + "는 " + ((int) d == d ? "정수" : "실수"));
	}
}
