package ch06._201124;

// ex5

// Rectangle 객체를 3개 저장할 배열을 생성하고 각각의 넓이와 둘레 출력하기

public class Ex4_Rectangle2 {
	public static void main(String[] args) {

		Rectangle[] arr = new Rectangle[3];
		arr[0] = new Rectangle(10, 20);
		arr[1] = new Rectangle(11, 21);
		arr[2] = new Rectangle(12, 22);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 사각형의 넓이 : ");
			arr[i].area();
			System.out.print(i + "번째 사각형의 둘레 : ");
			arr[i].length();
		}

	}
}
