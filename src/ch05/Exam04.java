package ch05;

// 1���� 100���� ������ �� 10���� �迭�� ����(�ߺ� ����)�ϰ�,
// �����Ͽ� ����ϱ�
// ��, Arrays.sort() �޼��� ������� �ʱ�

public class Exam04 {

	public static void main(String[] args) {

		int arr[] = new int[10];

		// ������ �� �迭�� ����
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}

		// ����(���� ����?)
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

		// ���
		for (int i : arr) {
			System.out.print(i + ", ");
		}

	}

}
