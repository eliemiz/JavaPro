package ch12._201203;

class NonGeneric {
	Object[] v;

	Object[] get() {
		return v;
	}

	void set(Object[] n) {
		v = n;
	}

	void print() {
		for (Object o : v) {
			System.out.print(o + ", ");
		}
		System.out.println();
	}
}

public class Ex06_NonGenericArray {
	public static void main(String[] args) {
		NonGeneric nonGen = new NonGeneric();
		String[] ss = { "   ����   ", "   ����   ", "   ���   " };
		nonGen.set(ss);
		nonGen.print();

		Object[] objs = nonGen.get();
		for (Object o : objs) {
			String s = (String) o;
			System.out.print(s.trim());
		}

		System.out.println("===================");

		Integer[] ii = { 1, 2, 3 };
		nonGen.set(ii);
		nonGen.print();

		objs = nonGen.get();
		for (Object o : objs) {

			// objs�� Integer[] ii�� �����ϰ� �����Ƿ�, (String)���� ĳ���� �� ����
//			String s = (String) o;
//			System.out.println(s.trim());
		}
	}
}
