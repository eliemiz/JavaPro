package ch05;

import java.util.Arrays;

// 커맨드라인에서 숫자를 입력받아 숫자의 약수를 출력하기
// 10의 약수 : 1,2,5,10

public class Exam07 {

	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);

//		int[] arr = new int[num];
//		int index = 0;
//
//		// 배열에 약수값 넣기
//		for (int i = 1; i <= num; i++) {
//			if (num % i == 0) {
//				arr[index] = i;
//				index++;
//			}
//		}
//
//		// 출력하기
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == 0) {
//				break;
//			}
//
//			System.out.print(arr[i] + ", ");
//		}

		// 바로 출력하기
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + ", ");
			}
		}

	}

}
