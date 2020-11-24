package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLesson {

	public static void main(String[] args) {

//		ArrayEx01();
//		ArrayEx02();
//		ArrayEx03();
//		ArrayEx04();
//		ArrayEx06(args);
//		ArrayEx07();
//		ArrayEx08();
//		ArrayEx09();
//		ArrayEx11();
//		ArrayEx12();
//		ArrayEx13();
		ArrayEx14();


	}

	static void ArrayEx01() {
		int[] arr1;
		int[] arr2;

		arr1 = new int[5];
		arr2 = new int[5];

		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr2 = arr1; // arr1이 가진 주소값을 arr2에 대입
		arr2[4] = 50;

		System.out.println("arr1 배열 : ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("arr1[%d] = %d\n", i, arr1[i]);
		}

		System.out.println("arr2 배열 : ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.printf("arr2[%d] = %d\n", i, arr2[i]);
		}

		System.out.println("향상된 for문을 이용한 출력 : ");
		for (int a : arr1) {
			System.out.println(a);
		}

	}

	static void ArrayEx02() {
		int arr[] = { 10, 20, 30, 40, 50 };
		for (int a : arr) {
			System.out.print(a + ", ");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
		System.out.println();

		arr = new int[] { 100, 200, 300 };
		for (int a : arr) {
			System.out.print(a + ", ");
		}
	}

	static void ArrayEx03() {

		int[] balls = new int[45];
		int[] lotto = new int[6];

		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}

		// 임의의 두 공의 위치를 바꾸는걸 1000번 실행
		for (int i = 0; i < 1000; i++) {
			int f = (int) (Math.random() * 45);
			int t = (int) (Math.random() * 45);

			int temp = balls[f];
			balls[f] = balls[t];
			balls[t] = temp;
		}

		// 앞의 6개를 lotto[i] 배열로 복사
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = balls[i];
		}

		for (int b : lotto) {
			System.out.print(b + ", ");
		}
		System.out.println();

		for (int i = 0; i < lotto.length; i++) {

			boolean changed = false;

			for (int j = 0; j < lotto.length - 1 - i; j++) {
				if (lotto[j] > lotto[j + 1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;
					changed = true;
				}
			}

			if (!changed) {
				break;
			}
		}

		Arrays.sort(lotto);

		for (int b : lotto) {
			System.out.print(b + ", ");
		}

	}

	static void ArrayEx04() {

		int[] binary = new int[32];

		System.out.println("2진수로 변환할 10진수를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int divNum = num;
		int index = 0;

		while (divNum != 0) {
			binary[index] = divNum % 2;
			index++;
			divNum /= 2;
		}

		System.out.println(Arrays.toString(binary));

		System.out.println("index : " + index);
		System.out.print(num + "의 2진수 : ");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}

		System.out.println();
	}

	static void ArrayEx06(String[] args) {

		System.out.println(args.length);

		if (args.length == 0) {
			System.out.println("커맨드라인에 파라미터를 입력하시오.");
			return;
		}

		for (int i = 0; i < args.length; i++) {
			System.out.printf("args[%d] = %s\n", i, args[i]);
		}

	}

	static void ArrayEx07() {

		int[][] arr = new int[3][2];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 50;
		arr[2][1] = 60;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d] = %d\t", i, j, arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		arr[1][0] = 122;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d] = %d\t", i, j, arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("객체 변경");
		int[] arr1 = { 1, 2, 3, 4, 5 };
		arr1[3] = 5000;
		for (int a : arr1) {
			System.out.println(a + ", ");
		}
	}

	static void ArrayEx08() {

		int[][] arr = { { 10, 20 }, { 30, 40 }, { 50, 60, 70 } };

		System.out.println("row count = " + arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("=== column count = " + arr[i].length + " ===");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d] = %d\t", i, j, arr[i][j]);
			}
			System.out.println();
		}

	}

	static void ArrayEx09() {
		int[][] arr = { { 10, 20 }, { 30, 40, 50 }, { 60 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d] = %d\t", i, j, arr[i][j]);
			}
			System.out.println();
		}
	}

	static void ArrayEx11() {
		int[][] arr = new int[5][];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
		}

		int data = 0;

		for (int j = arr.length - 1; j >= 0; j--) {
			for (int i = j; i < arr.length; i++) {
				data++;
				arr[i][j] = data;
				System.out.printf("arr[%d][%d] = %2d\t", i, j, arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d] = %2d\t", i, j, arr[i][j]);
			}
			System.out.println();
		}
	}

	static void ArrayEx12() {

		int score1[] = { 90, 80, 70 };
		int score2[] = new int[5];
		for (int i = 0; i < score1.length; i++) {
			score2[i] = score1[i];
		}

		for (int s : score2) {
			System.out.println(s);
		}
	}

	static void ArrayEx13() {

		int score[] = { 90, 80, 70 };
		int score2[] = new int[5];

		// score의 0번 index부터 score.length개를 score2의 2번 index에 복사
		System.arraycopy(score, 0, score2, 2, score.length);

		for (int s : score2) {
			System.out.println(s);
		}
	}

	static void ArrayEx14() {
		int score[] = { 90, 80, 70 };
		int score2[] = null;

		// original : 복사될 배열, newLength : 반환될 배열의 길이
		score2 = Arrays.copyOf(score, 5);

		for (int s : score2) {
			System.out.println(s);
		}

		System.out.println("Arrays.toString(score2)");
		System.out.println(Arrays.toString(score2));
	}

}
