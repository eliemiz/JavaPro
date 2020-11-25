package ch06._201124;

// Rectangle2 클래스 정의하기
// width, height, serialNo
// sno 번호 생성하기 위한 변수
// 멤버 메서드 : int area(), int length(), toString()
// 해당 크래스를 3개 가진 배열 생성
// 각각 사각형의 면적, 둘레 출력, 전체 면적의 합과 둘레의 합 출력

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
		return serialNo + "번 사각형 : (" + width + ", " + height + ") => 면적 : " + area() + ", 둘레 : " + length();
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

		System.out.println("전체 사각형 면적의 합 : " + sumArea);
		System.out.println("전체 사각형 둘레의 합 : " + sumLength);

	}
}
