package ch08._201201;

class MyException2 extends Exception {
}

class MyException3 extends MyException2 {
}

public class Ex03_InheritanceOfException {
	public static void main(String[] args) {
		try {
			throw new MyException2();
		}
		// �θ� Exception�� ���� ���� unreachable���� ��. �Ʒ��� ������ ������ �� ó���ϱ� ������
//		catch (MyException2 e) {
//
//		} 
		catch (MyException3 e) {

		} catch (MyException2 e) {

		} catch (Exception e) {

		}
	}
}
