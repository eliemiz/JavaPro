package ch05;

import java.util.Scanner;

// 2���� �迭�� �̿��Ͽ� �𷡽ð� ����ϱ�
// �迭�� ũ�⸦ Ȧ������ �Է��Ͻÿ�.

public class Exam12 {

	public static void main(String[] args) {

		System.out.println("�迭�� ũ�⸦ Ȧ������ �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		char arr[][] = new char[num][num];

		int middle = num / 2;

		// i - middle�� ���밪���� j - middle�� ���밪���� ũ�ٸ�?
		// 1. using Math.abs()
//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j < num; j++) {
//				if (Math.abs(i - middle) >= Math.abs(j - middle)) {
//					arr[i][j] = '*';
//				} else {
//					arr[i][j] = ' ';
//				}
//
//			}
//		}

		// 2. ���������� ����� �� �迭�� �� �����Ҷ��� �ε��� �۾�
		// ¦���϶� ���� �߻�
//		for (int i = middle; i >= -middle; i--) {
//			for (int j = -middle; j <= middle; j++) {
//				int a = (i > 0) ? i : -i;
//				int b = (j > 0) ? j : -j;
//				if (a >= b) {
//					arr[i + middle][j + middle] = '*';
//				} else {
//					arr[i + middle][j + middle] = ' ';
//				}
//			}
//		}
//
//		for (char[] tempArr : arr) {
//			for (char temp : tempArr) {
//				System.out.print(temp);
//			}
//			System.out.println();
//		}
//
//		System.out.println();

		// 2. �ٸ� Ǯ�� : row �߰��� �������� ���ﰢ�� + �ﰢ���� �׸���
		char arr2[][] = new char[num][num];

		int columnStart = 0;
		int columnEnd = num - 1;
		for (int i = 0; i < num / 2; i++) {
			for (int j = 0; j < num; j++) {
				if (columnStart <= j && j <= columnEnd) {
					arr2[i][j] = '*';
				} else {
					arr2[i][j] = ' ';
				}
			}

			columnStart++;
			columnEnd--;
		}

		for (int i = num / 2; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (columnStart <= j && j <= columnEnd) {
					arr2[i][j] = '*';
				} else {
					arr2[i][j] = ' ';
				}
			}

			columnStart--;
			columnEnd++;
		}

		for (char[] tempArr : arr2) {
			for (char temp : tempArr) {
				System.out.print(temp);
			}
			System.out.println();
		}
		System.out.println();

		// 3. start�� end�� ���� �̿� : best
		char arr3[][] = new char[num][num];

		int start = 0;
		int end = num - 1;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (start < end) {
					if (start <= j && j <= end) {
						arr3[i][j] = '*';
					} else {
						arr3[i][j] = ' ';
					}

				} else {
					if (end <= j && j <= start) {
						arr3[i][j] = '*';
					} else {
						arr3[i][j] = ' ';
					}
				}

			}
			start++;
			end--;
		}

		for (char[] tempArr : arr3) {
			for (char temp : tempArr) {
				System.out.print(temp);
			}
			System.out.println();
		}

	}

}
