package ch05;

import java.util.Scanner;

// 5���� ������ �Է¹޾� �հ�, ���, �ִ�����, �ּ����� ���
// �Է¹��� ������ score �迭�� �����ϱ�
public class Exam01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];

		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "��° ������ �Է��ϼ���. : ");
			score[i] = scan.nextInt();
		}

		int sum = 0;
		int max = score[0];
		int min = score[0];

		for (int i : score) {
			sum += i;
			max = (i > max) ? i : max;
			min = (i < min) ? i : min;
		}

		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + (double) sum / score.length);
		System.out.println("�ִ����� : " + max);
		System.out.println("�ּ����� : " + min);

	}
}
