package ch07;

// final test
// final class, final method, final 

final class FinalClass {

}

// final class�� ����� �� ����
//class ChildClass extends FinalClass{
//	
//}

class NotFinalClass {
	final int WIDTH = 10; // ���� ������ �� ���� �������(���)

	final void getWidth() { // overriding�� �� ���� �޼���(����Ұ�)
		final int width = 10;	// ���� ������ �� ���� ��������(���)
		// width = 20;	// ����̱� ������ �� ���� �Ұ�
	}

}

class ChildClass extends NotFinalClass {
	// final method�� ����� �� ����
//	void getWidth() {
//
//	}
	
	// overriding�� �ƴϱ� ������ ���� 
	void getWidth(int width) {
		
	}
}

public class Ex12 {

	public static void main(String[] args) {

	}
}
