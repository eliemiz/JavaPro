package ch08._201130;

// finally : ���� ����, ���� �����.
// try, catch���� return���� ������ finally�� �����.

public class Ex03_Finally {
	public static void main(String[] args) {
		try {
			System.out.println(1 / 0);
		} catch (Exception e) {
			System.out.println(e);
			return;
		} finally {
			System.out.println("������!");
		}
		
		System.out.println("return���� �������Ƿ� ���� ��� �ȵ�.");
	}
}
