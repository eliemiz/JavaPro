package ch08._201201;

public class Ex01_RuntimeException {
	public static void main(String[] args) {
		badMethod();
	}

	private static void badMethod() {
		// RuntimeException은 컴파일 과정에선 에러처리 되지 않으나,
		// 실행 과정에서 별도의 처리를 하지 않으면 에러처리된다.
		throw new RuntimeException("예외 강제 발생");
	}
}
