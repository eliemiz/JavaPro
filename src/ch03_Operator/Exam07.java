package ch03_Operator;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {

		System.out.println("점수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();

		// 삼항 연산자
		System.out.println(
				(score >= 90) ? "A학점" : (score >= 80) ? "B학점" : (score >= 70) ? "C학점" : (score >= 60) ? "D학점" : "F학점");

		// if
		String result;
		if (score >= 90) {
			result = "A학점";
		} else if (score >= 80) {
			result = "B학점";
		} else if (score >= 70) {
			result = "C학점";
		} else if (score >= 60) {
			result = "D학점";
		} else {
			result = "F학점";
		}
		System.out.println(result);

		// switch
		switch (score / 10) {
		case 10:
		case 9:
			result = "A학점";
			break;
		case 8:
			result = "B학점";
			break;
		case 7:
			result = "C학점";
			break;
		case 6:
			result = "D학점";
			break;
		default:
			result = "F학점";
			break;
		}
		System.out.println(result);

	}
}
