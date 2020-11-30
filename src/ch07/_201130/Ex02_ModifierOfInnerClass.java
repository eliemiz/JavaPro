package ch07._201130;

class Outer2 {
	// �ܺ� Ŭ������ private ���
	private static int outerCv = 20;
	private int outerIv = 10;

	// static, non-static ���� �׽�Ʈ
	static class StaticInner {
		static int scv = outerCv; // static ���� ��� ����
		int siv = new Outer2().outerIv; // non-static ���� ����� ���� �ܺ�Ŭ������ ��ü ���� �� ����
	}

	class InstanceInner {
		int iiv2 = outerCv; // static�� �̹� �����Ƿ� ��� ����
		int iiv = outerIv; // instance ���� ��� ����
	}

	// static, non-static ��ü ���� �׽�Ʈ
	static StaticInner cv = new StaticInner(); // �ٷ� ��ü ���� ����
	static InstanceInner cv2 = new Outer2().new InstanceInner(); // �ܺ�Ŭ������ ��ü ���� �� �ش� ���۷����� ����Ŭ���� ��ü ����
	InstanceInner iv = new InstanceInner(); // �ٷ� ��ü ���� ����
//	StaticInner iv2 = new StaticInner(); // ġ���� ����!!!!!!!!!!!!! StackOverflow Error!

	void method(int pv) {
		int i = 0;
		// ���� ����Ŭ�������� ���Ǵ� �޼����� ���������� ���ȭ(final)�Ǿ�� �Ѵ�.
//		pv++;
//		i++;
		outerIv++;

		class LocalInner {
			int liv1 = outerIv;
			int liv2 = outerCv;

			void method() {

				/// ����̱� ������ ����
//				i++;
//				pv++;

				// �ܺ�Ŭ������ private ���� ���� ����
				System.out.println("i = " + i);
				System.out.println("pv = " + pv);
				System.out.println("���� ����Ŭ������ ���� : " + liv1 + ", " + liv2);
				System.out.println("�ܺ� Ŭ������ private ���� : " + outerIv + ", " + outerCv);

			}
		}

		LocalInner li = new LocalInner();
		li.method();
	}

}

public class Ex02_ModifierOfInnerClass {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.method(1);

		// Instance Ŭ������ ���� ����� �ָ�
		Outer2.InstanceInner i2 = out.new InstanceInner();
		System.out.println(i2.iiv);
		System.out.println(i2.iiv2);

		Outer2.StaticInner i3 = new Outer2.StaticInner();
		System.out.println(i3.siv); // instance ������ ��ü ���� �� ���
		System.out.println(Outer2.StaticInner.scv); // static ������ �ٷ� ���

	}
}
