package ch05;

// 2차원 배열의 행의 합과 열의 합 구하기
//[결과]
//0행의 합 : 30
//1행의 합 : 120
//...
//0열의 합 : 100
//...
//3열의 합 : 90

public class Exam11 {

	public static void main(String[] args) {

		int arr[][] = { { 1 }, { 10, 20, }, { 30, 40, 50 }, { 60, 70, 80, 90 }, { 60, 70, 80, 90, 100 } };

		int columnCount = 0;
		for (int i = 0; i < arr.length; i++) {

			// max 열 구하기
			if (columnCount < arr[i].length) {
				columnCount = arr[i].length;
			}

			// 행의 합 구하기 및 출력
			int rowSum = 0;
			for (int j = 0; j < arr[i].length; j++) {

				rowSum += arr[i][j];
			}

			System.out.printf("%d행의 합 : %d\n", i, rowSum);

		}

		// 열의 합 구하기
		int[] columnSum = new int[columnCount];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				columnSum[j] += arr[i][j];
			}
		}

		// 열의 합 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d열의 합 : %d\n", i, columnSum[i]);
		}

	}

}
