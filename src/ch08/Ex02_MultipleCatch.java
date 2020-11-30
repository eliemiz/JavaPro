package ch08;

// ���� catch ���� ����
// ��� ������ Exception�� ������ �Ʒ��� �־�� ��.(�� ����ȭ�� ���ܸ� ó���ϱ� ����)
// �׷��� ���� ���
// Unreachable catch block for RuntimeException. 
// It is already handled by the catch block for Exception 

public class Ex02_MultipleCatch {
	public static void main(String[] args) {
		try {

//			System.out.println(args[0]);

//			System.out.println(1 / 0);

//			String str = null;
//			System.out.println(str.charAt(0));
			
			String str2 = "test";
			int num = Integer.parseInt(str2);
					
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("1 : " + e);
		} catch (ArithmeticException e) {
			System.out.println("2 : " + e);
		} catch (NullPointerException e) {
			System.out.println("3 : " + e);
		} catch (NumberFormatException e) {
			System.out.println("4 : " + e);
		} catch (RuntimeException e) {
			System.out.println("5 : " + e);
		} catch (Exception e) {
			System.out.println("6 : " + e);
		}

	}
}
