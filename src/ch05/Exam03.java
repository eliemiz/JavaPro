package ch05;

import java.util.Arrays;

// 1���� 9���� ���� �� �ߺ����� �ʴ� 3�ڸ� ���ڸ� ���Ƿ� �����ϴ� ���α׷� �ۼ��ϱ�

public class Exam03 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] nums = new int[3];

		// ���� ����
		for (int i = 0; i < 10000; i++) {
			int f = (int) (Math.random() * 9);
			int t = (int) (Math.random() * 9);

			int temp = arr[f];
			arr[f] = arr[t];
			arr[t] = temp;
		}

		// �迭�� ����(for)
		for (int i = 0; i < nums.length; i++) {
			nums[i] = arr[i];
		}
//		
		// System.arraycopy()
//		System.arraycopy(arr, 0, nums, 0, 3);

		// Arrays.copyOf()
//		nums = Arrays.copyOf(arr, 3);

		// ���
		for (int n : nums) {
			System.out.println(n + ", ");
		}

	}

}
