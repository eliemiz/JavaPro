package ch06._201124;

// Rectangle3 클래스 구현
// 멤버변수 : width, height, serialNo, sno
// 생성자 : 가로, 세로 입력받아 초기화
// 멤버 메서드 : 
// int area(), int length(), boolean isSquare() 정사각형 여부,
// void info()  "1번 사각형 : (10,10) 넓이:100, 둘레: 40, 정사각형(or 직사각형)" 문자열 출력

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
		System.out.printf("%d번 사각형 : (%d, %d) 넓이 : %d, 둘레 : %d, %s\n", serialNo, width, height, area(), length(),
				isSquare() ? "정사각형" : "직사각형");
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
