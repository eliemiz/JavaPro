package ch05;

// 1부터 100까지 임의의 수 10개를 배열에 저장(중복 가능)하고,
// 정렬하여 출력하기
// 단, Arrays.sort() 메서드 사용하지 않기

public class Exam04 {

	public static void main(String[] args) {

		int arr[] = new int[10];

		// 임의의 수 배열에 저장
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}

		// 정렬(버블 정렬?)
//		for (int i = arr.length - 1; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		// 출력
		for (int i : arr) {
			System.out.print(i + ", ");
		}

	}

}
