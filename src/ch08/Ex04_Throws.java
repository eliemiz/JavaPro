package ch08;

// throws  : 예외처리를 자신을 호출한 메서드에 맡김

public class Ex04_Throws {
	public static void main(String[] args) {
		
		try {
			first();

		} catch (Exception e) {

			System.out.println(e);
//			e.printStackTrace();
		}
	}

	// throws Exception을 생략하면 아래와 같은 에러
	// Unhandled exception type Exception
	// 또는 main method에서처럼 try-catch로 처리해줘야 함.
	private static void first() throws Exception{
		System.out.println("first method start");
		second();
		System.out.println("first method end");
	}

	private static void second() throws Exception {
		System.out.println("second method start");
		System.out.println(1 / 0);
		System.out.println("second method end");
	}

}
