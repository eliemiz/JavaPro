package ch08;

// throws  : ����ó���� �ڽ��� ȣ���� �޼��忡 �ñ�

public class Ex04_Throws {
	public static void main(String[] args) {
		
		try {
			first();

		} catch (Exception e) {

			System.out.println(e);
//			e.printStackTrace();
		}
	}

	// throws Exception�� �����ϸ� �Ʒ��� ���� ����
	// Unhandled exception type Exception
	// �Ǵ� main method����ó�� try-catch�� ó������� ��.
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
