package ch08._201201;

// AutoCloseable을 구현한 클래스 : try블록이 끝나면 close()가 자동으로 실행된다.
// 대부분 IO가 AutoCloseable을 가지고 있다.
class AutoCloseableUse implements AutoCloseable {
	@Override
	public void close(){
		System.out.println("close() method.");
	}
}

public class Ex02_ResourceTry {
	public static void main(String[] args) {
		try (AutoCloseableUse cr = new AutoCloseableUse()) {
			System.out.println("process");
			System.out.println();
		}
	}
}
