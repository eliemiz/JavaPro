package ch05;

import java.util.Arrays;

// 1~10������ ���� ���� �迭�� 10�� ����
// ����� ����ŭ * ���

public class Exam02 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int[] countArr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
			countArr[arr[i] - 1]++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(countArr));

		// countArr�� ���
		for (int i = 0; i < 10; i++) {
			if (countArr[i] != 0) {
				System.out.print(i + 1 + " : ");

				for (int j = 0; j < countArr[i]; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

		}

	}

}
