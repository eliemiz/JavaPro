package ch05;

import java.util.Arrays;

// 1부터 9까지 숫자 중 중복되지 않는 3자리 숫자를 임의로 생성하는 프로그램 작성하기

public class Exam03 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] nums = new int[3];

		// 숫자 섞기
		for (int i = 0; i < 10000; i++) {
			int f = (int) (Math.random() * 9);
			int t = (int) (Math.random() * 9);

			int temp = arr[f];
			arr[f] = arr[t];
			arr[t] = temp;
		}

		// 배열값 복사(for)
		for (int i = 0; i < nums.length; i++) {
			nums[i] = arr[i];
		}
//		
		// System.arraycopy()
//		System.arraycopy(arr, 0, nums, 0, 3);

		// Arrays.copyOf()
//		nums = Arrays.copyOf(arr, 3);

		// 출력
		for (int n : nums) {
			System.out.println(n + ", ");
		}

	}

}
