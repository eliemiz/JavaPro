package ch07._201125;

class Parent4 {
	int x = 10;
}

class Child4 extends Parent4 {
	int x = 20;

	void method() {
		System.out.println("child method");
	}
}

public class Ex07_Instanceof {
	public static void main(String[] args) {
		Parent4 p = new Parent4();

		// Parent4���� Child4�� �����Ƿ� ���⸦ Ÿ�� �ʴ´�.
		if (p instanceof Child4) {
			System.out.println("p �������� ��ü�� Child4 ��ü��");
			Child4 c = (Child4) p;
			System.out.println(c.x);
			c.method();
		}

		if (p instanceof Parent4) {
			System.out.println("p �������� ��ü�� Parent4 ��ü��");
		}

		System.out.println("=====================================");

		p = new Child4();

		if (p instanceof Child4) {
			System.out.println("p �������� ��ü�� Child4 ��ü��");
			Child4 c = (Child4) p;
			System.out.println(c.x);
			c.method();
		}

		// Child4���� Parent4�� �����Ƿ� ���⸦ ź��
		if (p instanceof Parent4) {
			System.out.println("p �������� ��ü�� Parent4 ��ü��");
		}

		System.out.println("=====================================");

		if (p instanceof Object) {
			System.out.println("p �������� ��ü�� Object ��ü��");
			Object o = p;
			System.out.println(p.x);
//			System.out.println(o.x);	// x�� Object Ŭ������ ����� �ƴϴ�.
		}
	}
}

// ����� Ÿ���� child�� �� �ּҿ� parent�� �ִ�