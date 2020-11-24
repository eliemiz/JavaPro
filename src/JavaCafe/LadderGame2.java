package JavaCafe;

import java.util.Scanner;

public class LadderGame2 {

	public static void main(String[] args) {

		System.out.println("몇명인지? : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		boolean arr[][] = new boolean[15][num];

		int[] resultArr = new int[num];

		// 제목줄 출력
		for (int i = 0; i < num; i++) {
			System.out.printf("%d\t", i + 1);
			resultArr[i] = i + 1;
		}
		System.out.println();

		// 왼쪽 값을 trigger로 설정
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {

				if (j > 0) {
					if (arr[i][j - 1] == true) {
						continue;
					}
				}

				if ((int) (Math.random() * 100) > 90) {
					arr[i][j] = true;
				}
			}
		}

		// 출력부
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				String result;
				if (arr[i][j] == true) {
					result = "├───────";
				} else {
					result = "│\t";
				}

				if (j > 0) {
					if (arr[i][j - 1] == true) {
						result = "┤\t";
					}
				}

				System.out.print(result);
			}

			System.out.println();
		}

		// trigger값에 따라 좌우값 변경
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				if (arr[i][j] == true) {
					int temp = resultArr[j];
					resultArr[j] = resultArr[j + 1];
					resultArr[j + 1] = temp;

				}
			}
		}

		for (int i = 0; i < num; i++) {
			System.out.printf("%d\t", resultArr[i]);
		}
		System.out.println();

	}

}

// 임의의 수 num를 입력받는다
// arr[15][num] 배열을 생성한다

// column이 0부터 num-1까지 돌리면서 trigger를 확률적 true로
// 모든 row에 대해

// 