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
		String[] ss = { "   윌매   ", "   춘향   ", "   향단   " };
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

			// objs는 Integer[] ii를 참조하고 있으므로, (String)으로 캐스팅 시 에러
//			String s = (String) o;
//			System.out.println(s.trim());
		}
	}
}
