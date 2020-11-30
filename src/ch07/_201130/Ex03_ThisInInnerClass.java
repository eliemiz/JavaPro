package ch07._201130;

class Outer3 {
	int iv = 10;

	class InstanceInner {
		int iv = 100;

		void method() {
			int iv = 300;

			System.out.println("iv = " + iv); // 300 ��������
			System.out.println("this.iv = " + this.iv); // 100 ����Ŭ������ �ν��Ͻ�����
			this.iv = 50; // ���� ����
			System.out.println("this.iv(���� ��) = " + this.iv); // 50
			System.out.println("InstanceInner.this.iv = " + InstanceInner.this.iv); // �̷��Ե� ǥ�� ����
			System.out.println("Outer3.this.iv = " + Outer3.this.iv); // 10 �ܺ�Ŭ������ �ν��Ͻ�����
		}
	}
}

public class Ex03_ThisInInnerClass {
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Outer3.InstanceInner ii = out.new InstanceInner();
		ii.method();
	}
}
