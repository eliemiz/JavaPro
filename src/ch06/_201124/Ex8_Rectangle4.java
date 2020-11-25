package ch06._201124;

// Rectangle3 Ŭ���� ����
// ������� : width, height, serialNo, sno
// ������ : ����, ���� �Է¹޾� �ʱ�ȭ
// ��� �޼��� : 
// int area(), int length(), boolean isSquare() ���簢�� ����,
// void info()  "1�� �簢�� : (10,10) ����:100, �ѷ�: 40, ���簢��(or ���簢��)" ���ڿ� ���

class Rectangle3 {

	int width;
	int height;
	int serialNo;
	static int sno;

	Rectangle3(int x, int y) {
		width = x;
		height = y;
		serialNo = ++sno;
	}

	int area() {
		return width * height;
	}

	int length() {
		return 2 * (width + height);
	}

	boolean isSquare() {
		return width == height;
	}

	void info() {
		System.out.printf("%d�� �簢�� : (%d, %d) ���� : %d, �ѷ� : %d, %s\n", serialNo, width, height, area(), length(),
				isSquare() ? "���簢��" : "���簢��");
	}

}

public class Ex8_Rectangle4 {
	public static void main(String[] args) {
		Rectangle3[] arr = new Rectangle3[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Rectangle3(10 + i * 10, 10);
			arr[i].info();
		}
	}

}
