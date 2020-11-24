package ch05;

import java.util.Scanner;

// 5개의 점수를 입력받아 합계, 평균, 최대점수, 최소점수 출력
// 입력받은 점수는 score 배열에 저장하기
public class Exam01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];

		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "번째 점수를 입력하세요. : ");
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

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double) sum / score.length);
		System.out.println("최대점수 : " + max);
		System.out.println("최소점수 : " + min);

	}
}
