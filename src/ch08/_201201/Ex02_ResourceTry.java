package ch08._201201;

// AutoCloseable�� ������ Ŭ���� : try����� ������ close()�� �ڵ����� ����ȴ�.
// ��κ� IO�� AutoCloseable�� ������ �ִ�.
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
