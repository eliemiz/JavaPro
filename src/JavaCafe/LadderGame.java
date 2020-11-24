package JavaCafe;

import java.util.Scanner;

public class LadderGame {

	public static void main(String[] args) {
		System.out.println("몇명인지? : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int arr[][] = new int[15][num];

		int[] resultArr = new int[num];

		// 제목줄 출력
		for (int i = 0; i < num; i++) {
			System.out.printf("%d\t", i + 1);
			resultArr[i] = i + 1;
		}
		System.out.println();

		// 우행 : 1, 좌행 : 2로 trigger 생성
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {

				if (arr[i][j] == 2) {
					continue;
				}

				if ((int) (Math.random() * 100) > 90) {
					arr[i][j] = 1;
					arr[i][j + 1] = 2;
				}
			}
		}

		// 출력부
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1) {
					System.out.print("├───────");
				} else if (arr[i][j] == 2) {
					System.out.print("┤\t");
				} else {
					System.out.print("│\t");
				}

//				System.out.print(arr[i][j] + "\t");
			}

			System.out.println();
		}

		// trigger값에 따라 좌우값 변경
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				if (arr[i][j] == 1) {
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