package ch03_Operator;

import java.util.Scanner;

public class Exam10 {

	// �Ǽ� �Ǵ� ������ �Է¹޾� �������� �Ǽ����� ���
	public static void main(String[] args) {

		System.out.println("�Ǽ� �Ǵ� ������ �Է��Ͻÿ�(ex. 11.5, 20) : ");
		Scanner scan = new Scanner(System.in);
		double d = scan.nextDouble();

		System.out.println(d + "�� " + ((int) d == d ? "����" : "�Ǽ�"));
	}
}
