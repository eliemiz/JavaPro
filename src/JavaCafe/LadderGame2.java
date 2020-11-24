package JavaCafe;

import java.util.Scanner;

public class LadderGame2 {

	public static void main(String[] args) {

		System.out.println("�������? : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		boolean arr[][] = new boolean[15][num];

		int[] resultArr = new int[num];

		// ������ ���
		for (int i = 0; i < num; i++) {
			System.out.printf("%d\t", i + 1);
			resultArr[i] = i + 1;
		}
		System.out.println();

		// ���� ���� trigger�� ����
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

		// ��º�
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				String result;
				if (arr[i][j] == true) {
					result = "����������������";
				} else {
					result = "��\t";
				}

				if (j > 0) {
					if (arr[i][j - 1] == true) {
						result = "��\t";
					}
				}

				System.out.print(result);
			}

			System.out.println();
		}

		// trigger���� ���� �¿찪 ����
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

// ������ �� num�� �Է¹޴´�
// arr[15][num] �迭�� �����Ѵ�

// column�� 0���� num-1���� �����鼭 trigger�� Ȯ���� true��
// ��� row�� ����

// 