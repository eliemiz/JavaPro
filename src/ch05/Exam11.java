package ch05;

// 2���� �迭�� ���� �հ� ���� �� ���ϱ�
//[���]
//0���� �� : 30
//1���� �� : 120
//...
//0���� �� : 100
//...
//3���� �� : 90

public class Exam11 {

	public static void main(String[] args) {

		int arr[][] = { { 1 }, { 10, 20, }, { 30, 40, 50 }, { 60, 70, 80, 90 }, { 60, 70, 80, 90, 100 } };

		int columnCount = 0;
		for (int i = 0; i < arr.length; i++) {

			// max �� ���ϱ�
			if (columnCount < arr[i].length) {
				columnCount = arr[i].length;
			}

			// ���� �� ���ϱ� �� ���
			int rowSum = 0;
			for (int j = 0; j < arr[i].length; j++) {

				rowSum += arr[i][j];
			}

			System.out.printf("%d���� �� : %d\n", i, rowSum);

		}

		// ���� �� ���ϱ�
		int[] columnSum = new int[columnCount];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				columnSum[j] += arr[i][j];
			}
		}

		// ���� �� ���
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d���� �� : %d\n", i, columnSum[i]);
		}

	}

}
