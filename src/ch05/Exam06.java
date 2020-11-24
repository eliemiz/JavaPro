package ch05;

import java.util.Arrays;
import java.util.Scanner;

// 10진수를 입력받아 16진수로 출력하기
public class Exam06 {

	public static void main(String[] args) {

		System.out.println("10진수를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int temp = num;
		char[] arr = new char[32];
		int count = 0;
		for (int i = 0; temp != 0; i++) {

			int currentNum = temp % 16;

			switch (currentNum) {
			case 10:
				arr[i] = 'A';
				break;
			case 11:
				arr[i] = 'B';
				break;
			case 12:
				arr[i] = 'C';
				break;
			case 13:
				arr[i] = 'D';
				break;
			case 14:
				arr[i] = 'E';
				break;
			case 15:
				arr[i] = 'F';
				break;
			default:
				arr[i] = (char) (currentNum + '0');
			}

			temp /= 16;
			count++;
		}

		for (int i = count - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();

		// 문자 배열을 만든 후 나머지 값을 인덱스로 하는 배열의 값을 가져오기
		char[] data = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		temp = num;
		count = 0;
		char[] arr2 = new char[32];
		for (int i = 0; temp != 0; i++) {
			arr2[i] = data[temp % 16];
			temp /= 16;
			count++;
		}

		for (int i = count - 1; i >= 0; i--) {
			System.out.print(arr2[i]);
		}

	}

}
