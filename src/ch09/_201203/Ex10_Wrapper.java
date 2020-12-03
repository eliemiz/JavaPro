package ch09._201203;

// Wrapper Ŭ����
// Boxing, Unboxing
// �ٸ� Ÿ���� ��ڽ��� ����
// �ٸ� Ÿ���� �ڽ��� �Ұ�

public class Ex10_Wrapper {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = 100;

		int i3 = i1; // ��ڽ�

		double d1 = i1; // �ٸ� Ÿ���� ��ڽ��� ����
		Double d2 = (double) i3; // �ٸ� Ÿ���� �ڽ��� �Ұ�(���� Ÿ��(�⺻��)���� ĳ�����ؾ� ��)
//		Double d3 = (Double) i1;	// ��Ӱ��谡 �ƴϹǷ� Ŭ���� Ÿ���� ĳ������ �Ұ�

		Integer i4 = (int) d1; // ĳ�����ؾ� ��
//		Integer i5 = d2; // ĳ���� ���� �ȵ�

		System.out.println("i1 == i2 : " + (i1 == i2));
		System.out.println("i1.equals(i2) : " + i1.equals(i2));
		System.out.println("i1.compareTo(i2) = " + i1.compareTo(i2));
		System.out.println("i1.toString() = " + i1.toString());
		System.out.println("MAX_VALUE = " + i1.MAX_VALUE);
		System.out.println("MIN_VALUE = " + i1.MIN_VALUE);
		System.out.println("SIZE = " + i1.SIZE);
		System.out.println("BYTES = " + i1.BYTES);
		System.out.println("TYPE = " + i1.TYPE);
	}
}
