package ch12._201203;

class Generic<T> {
	T[] v;

	T[] get() {
		return v;
	}

	void set(T[] n) {
		v = n;
	}

	void print() {
		for (T o : v) {
			System.out.print(o + ", ");
		}
		System.out.println();
	}
}

public class Ex07_GenericArray {
	public static void main(String[] args) {
		Generic<String> gen = new Generic<String>();
		String[] ss = { "   윌매   ", "   춘향   ", "   향단   " };
		gen.set(ss);
		gen.print();

		String[] objs = gen.get();
		for (String o : objs) {
			System.out.println(o.trim());
		}

		System.out.println("===================");

		Integer[] ii = { 1, 2, 3 };
		// String타입을 받도록 되어있으므로 Integer배열 대입 시 에러
//		gen.set(ii);

		Generic<Integer> gen2 = new Generic<Integer>();
		gen2.set(ii);
		gen2.print();

		Integer[] objs2 = gen2.get();
		for (Integer s : objs2) {
			System.out.println(s);
		}

	}
}
