package ch05;

import java.util.Scanner;

// 10������ �Է¹޾� 8������ ����ϱ�

public class Exam05 {

	public static void main(String[] args) {

		System.out.println("10������ �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int temp = num;
		int arr[] = new int[32];

		int count = 0;
		for (int i = 0; temp != 0; i++) {
			arr[i] = temp % 8;
			temp /= 8;
			count++;
		}

//		System.out.println(Arrays.toString(arr));

		for (int i = count - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}

	}

}
