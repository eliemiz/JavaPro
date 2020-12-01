package ch09._201201;

public class Ex02_Equals {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 = "abc";
		String s4 = "abc";

		// 다른 주소를 참조하므로 다른 객체
		if (s1 == s2) {
			System.out.println("s1와 s2는 같은 객체임.");
		} else {
			System.out.println("s1와 s2는 다른 객체임.");
		}

		// String에서 문자열이 같으면 equals가 true를 리턴하도록 오버라이딩
		if (s1.equals(s2)) {
			System.out.println("s1와 s2는 같은 내용의 객체임.");
		} else {
			System.out.println("s1와 s2는 다른 내용의 객체임.");
		}

		// 같은 리터럴 문자열을 참조하므로 같은 객체
		if (s3 == s4) {
			System.out.println("s1와 s2는 같은 객체임.");
		} else {
			System.out.println("s1와 s2는 다른 객체임.");
		}

	}
}
