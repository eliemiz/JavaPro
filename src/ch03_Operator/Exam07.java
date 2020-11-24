package ch03_Operator;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {

		System.out.println("������ �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();

		// ���� ������
		System.out.println(
				(score >= 90) ? "A����" : (score >= 80) ? "B����" : (score >= 70) ? "C����" : (score >= 60) ? "D����" : "F����");

		// if
		String result;
		if (score >= 90) {
			result = "A����";
		} else if (score >= 80) {
			result = "B����";
		} else if (score >= 70) {
			result = "C����";
		} else if (score >= 60) {
			result = "D����";
		} else {
			result = "F����";
		}
		System.out.println(result);

		// switch
		switch (score / 10) {
		case 10:
		case 9:
			result = "A����";
			break;
		case 8:
			result = "B����";
			break;
		case 7:
			result = "C����";
			break;
		case 6:
			result = "D����";
			break;
		default:
			result = "F����";
			break;
		}
		System.out.println(result);

	}
}
