package ch07;

public class Ex18 {

	public static void main(String[] args) {

		TempParent p = new TempChild();	// �ڽ� Ŭ������ ����
		TempChild c = new TempChild();
		
		System.out.println(p.x);	// ��������� ���������� Ÿ�Կ� ���� �޶���
		p.method();	// �޼���� ���� �ν��Ͻ� Ÿ���� Child Ŭ������ ���ǵ� �޼��� ȣ��
		
		System.out.println(c.x);
		c.method();
	}

}

class TempParent {
	int x = 100;

	void method() {
		System.out.println("This is Parent");
	}
}

class TempChild extends TempParent {
	int x = 200;

	void method() {
		System.out.println("This is Child");
	}
}
