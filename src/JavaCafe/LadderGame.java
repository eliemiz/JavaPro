package JavaCafe;

import java.util.Scanner;

public class LadderGame {

	public static void main(String[] args) {
		System.out.println("�������? : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int arr[][] = new int[15][num];

		int[] resultArr = new int[num];

		// ������ ���
		for (int i = 0; i < num; i++) {
			System.out.printf("%d\t", i + 1);
			resultArr[i] = i + 1;
		}
		System.out.println();

		// ���� : 1, ���� : 2�� trigger ����
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

		// ��º�
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1) {
					System.out.print("����������������");
				} else if (arr[i][j] == 2) {
					System.out.print("��\t");
				} else {
					System.out.print("��\t");
				}

//				System.out.print(arr[i][j] + "\t");
			}

			System.out.println();
		}

		// trigger���� ���� �¿찪 ����
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

// ������ �� num�� �Է¹޴´�
// arr[15][num] �迭�� �����Ѵ�

// column�� 0���� num-1���� �����鼭 trigger�� Ȯ���� true��
// ��� row�� ����

// 