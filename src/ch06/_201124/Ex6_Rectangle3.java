package ch06._201124;

// Rectangle2 Ŭ���� �����ϱ�
// width, height, serialNo
// sno ��ȣ �����ϱ� ���� ����
// ��� �޼��� : int area(), int length(), toString()
// �ش� ũ������ 3�� ���� �迭 ����
// ���� �簢���� ����, �ѷ� ���, ��ü ������ �հ� �ѷ��� �� ���

class Rectangle2 {
	int width;
	int height;
	int serialNo;
	static int sno;

	int area() {
		return width * height;
	}

	int length() {
		return 2 * (width + height);
	}

	public String toString() {
		return serialNo + "�� �簢�� : (" + width + ", " + height + ") => ���� : " + area() + ", �ѷ� : " + length();
	}
}

public class Ex6_Rectangle3 {
	public static void main(String[] args) {
		Rectangle2[] arr = new Rectangle2[3];

		int sumArea = 0;
		int sumLength = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Rectangle2();
			arr[i].width = 10 + i * 5;
			arr[i].height = 20 + i * 5;
			arr[i].serialNo = ++Rectangle2.sno;

			System.out.println(arr[i]);

			sumArea += arr[i].area();
			sumLength += arr[i].length();
		}

		System.out.println("��ü �簢�� ������ �� : " + sumArea);
		System.out.println("��ü �簢�� �ѷ��� �� : " + sumLength);

	}
}
