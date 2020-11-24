package ch05;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {

//		ArrayEx2();
//		ArrayEx3();
//		ArrayEx4();
//		ArrayEx10();
//		ArrayEx11();
//		ArrayEx16(args);
//		ArrayEx18();

	}
	

	public static void ArrayEx2() {
		int[] iArr1 = new int[10];
		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;
		}

		int[] iArr2 = new int[10];
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int) (Math.random() * 10) + 1;
		}

		int[] iArr3 = new int[] { 100, 95, 80, 70, 60 }; // int[] iArr3 = {100,95,80,70,60}

		char[] chArr = { 'a', 'b', 'c', 'd' };

		for (int i = 0; i < iArr1.length; i++) {
			System.out.printf("%d, ", iArr1[i]);
		}
		System.out.println();

		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);

	}

	public static void ArrayEx3() {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		System.out.println("[변경 전]");
		System.out.println("arr.length : " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}

		int[] newArr = new int[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;

		System.out.println("[변경 후]");
		System.out.println("arr.length : " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}

	}

	public static void ArrayEx4() {
		char[] abcArr = { 'A', 'B', 'C', 'D' };
		char[] numArr = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		System.out.println(abcArr);
		System.out.println(numArr);

		char[] resultArr = new char[abcArr.length + numArr.length];
		System.arraycopy(abcArr, 0, resultArr, 0, abcArr.length);
		System.arraycopy(numArr, 0, resultArr, abcArr.length, numArr.length);
		System.out.println(resultArr);

		System.arraycopy(abcArr, 0, numArr, 0, abcArr.length);
		System.out.println(numArr);

		System.arraycopy(abcArr, 2, numArr, 6, 2);
		System.out.println(numArr);

	}

	public static void ArrayEx10() {

		// length가 10인 배열 생성
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 10);
		}

		System.out.println(Arrays.toString(arr));

		boolean changed = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

					changed = true;
				}
			}

			if (!changed) {
				break;
			}

			System.out.println(Arrays.toString(arr));
			changed = false;

		}

	}

	public static void ArrayEx11() {
		int[] numArr = new int[10];
		int[] countArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * numArr.length);
		}
		System.out.println(Arrays.toString(numArr));

		for (int i = 0; i < numArr.length; i++) {
			countArr[numArr[i]]++;
		}

		for (int i = 0; i < numArr.length; i++) {
			System.out.printf("%d의 갯수 : %d\n", i, countArr[i]);
		}
	}

	public static void ArrayEx16(String[] args) {

		// 커맨드 라인을 통해 입력받기
		// java -cp C:\Users\sist\workspace\JavaPro\bin ch05/Temp

		System.out.println("매개변수의 개수" + args.length);
		System.out.println(Arrays.toString(args));

	}

	public static void ArrayEx18() {

		// 배열 선언 방법
		int[][] arr1;
		int arr2[][];
		int[] arr3[];

		// 배열 초기화 방법
		int[][] arr4 = new int[4][3]; // 크기만 지정. 값은 모두 0
		int[][] arr5 = new int[][] { { 2, 3 }, { 4, 5 }, { 6, 7, 8 } };
		int[][] arr6 = { { 2, 3 }, { 4, 5 }, { 6, 7 } };

		int num = 0;

		int[][] myArr = new int[4][3];

		// 2차원 배열에서 향상된 for문 사용법
		for (int[] iArr : myArr) {
			for (int j = 0; j < iArr.length; j++) {
				iArr[j] = num;
				num++;
			}
		}

		for (int[] iArr : myArr) {
			System.out.println(Arrays.toString(iArr));
		}

	}

	public static void MultiArrEx1() {
		int[][] score = new int[5][];
		score[0] = new int[4];	// [][][][]
		score[1] = new int[3];  // [][][]
		score[2] = new int[2];  // [][]
		score[3] = new int[2];  // [][]
		score[4] = new int[3];  // [][][]
	}
}

//