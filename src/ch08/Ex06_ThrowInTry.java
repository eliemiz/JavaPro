package ch08;

public class Ex06_ThrowInTry {
	public static void main(String[] args) {
		try {
			badMethod();
		} catch (Exception e) {
			System.out.println("main에서 예외처리");
			e.printStackTrace();
		}
	}

	private static void badMethod() throws Exception {
		try {
			throw new Exception("Custom Exception");
		} catch (Exception e) {
			System.out.println("badMethod에서 예외처리");
			e.printStackTrace();
			throw e;	// 예외 재발생
		}
	}
}
