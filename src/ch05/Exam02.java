package ch05;

import java.util.Arrays;

// 1~10까지의 랜덤 수를 배열에 10개 저장
// 저장된 수만큼 * 출력

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

		// countArr를 출력
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
