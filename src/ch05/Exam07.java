package ch05;

import java.util.Arrays;

// Ŀ�ǵ���ο��� ���ڸ� �Է¹޾� ������ ����� ����ϱ�
// 10�� ��� : 1,2,5,10

public class Exam07 {

	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);

//		int[] arr = new int[num];
//		int index = 0;
//
//		// �迭�� ����� �ֱ�
//		for (int i = 1; i <= num; i++) {
//			if (num % i == 0) {
//				arr[index] = i;
//				index++;
//			}
//		}
//
//		// ����ϱ�
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == 0) {
//				break;
//			}
//
//			System.out.print(arr[i] + ", ");
//		}

		// �ٷ� ����ϱ�
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + ", ");
			}
		}

	}

}
