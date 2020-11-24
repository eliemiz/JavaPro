package ch06;

public class Ex04_LocalVal {

	static String grade2; // 멤버 변수 중 클래스 변수

	public static void main(String[] args) {

		int num = 0; // 지역 변수는 반드시 초기화되어야 함
		boolean b = true; // 지역 변수

		if (b) {
			num = 100;
		}

		System.out.println(num);

		String grade; // 초기화 해주지 않으면 맨 아래에서 사용할 때 에러
		int score = 80;

		switch (score / 10) {
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "A";
			break;
		case 7:
			grade = "A";
			break;
		case 6:
			grade = "A";
			break;
		default:
			grade = "F";
		}

		System.out.println("학점 : " + grade);
		System.out.println("학점 : " + grade2); // 멤버 변수는 기본적으로 값이 초기화 됨.

	}

}
