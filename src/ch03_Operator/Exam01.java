package ch03_Operator;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요 : ");

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		String result = (num > 0) ? "양수" : (num < 0) ? "음수" : "0";
		System.out.println("입력한 수는 " + result + "입니다.");

	}

}
