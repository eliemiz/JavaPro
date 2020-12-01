package ch08._201130;

public class Ex01_Exception1 {
	public static void main(String[] args) {
//		System.out.println(1/0);	// ArithmeticException 발생

		try {
			System.out.println(1 / 0);
		} catch (ArithmeticException e) {
			System.out.println(e);	// 예외 발생 시 해당 예외 정보 출력
		}

	}
}
