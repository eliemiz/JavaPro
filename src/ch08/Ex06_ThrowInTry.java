package ch08;

public class Ex06_ThrowInTry {
	public static void main(String[] args) {
		try {
			badMethod();
		} catch (Exception e) {
			System.out.println("main���� ����ó��");
			e.printStackTrace();
		}
	}

	private static void badMethod() throws Exception {
		try {
			throw new Exception("Custom Exception");
		} catch (Exception e) {
			System.out.println("badMethod���� ����ó��");
			e.printStackTrace();
			throw e;	// ���� ��߻�
		}
	}
}
