package ch12._201203;

// ������ ������ ��ü�� �ڼ� Ŭ�������� ���׸� Ÿ������ �Է��� �� �ֵ��� �����Ѵ�.
// <T extends Number> : Number�� �ڼո��� �Է��� �� �ִ�.
// <T super Number>�� class ���� �� ����� �� ����.

// Ŭ������ extends in type parameter
class Pool05<T extends Number> {
	T n;

	Pool05(T n) {
		this.n = n;
	}

	T get() {
		return n;
	}

	void set(T n) {
		this.n = n;
	}
}

class Util05 {
	// �޼ҵ��� extends in type parameter
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
}

public class Ex05_InheritanceOfGeneric {
	public static void main(String[] args) {
//		String str = Util05.compare("a", "b");
		System.out.println(Util05.compare(10, 20));
		System.out.println(Util05.compare(4.5, 3));

		Pool05<Integer> p1 = new Pool05<Integer>(20);
		Pool05<Double> p2 = new Pool05<Double>(20.0);
//		Pool05<String> p3 = new Pool05<String>("20");	// Number�� �ڼ�Ŭ������ �ƴϹǷ� ����
//		Pool05<Character> p4 = new Pool05<Character>('a');	// Number�� �ڼ�Ŭ������ �ƴϹǷ� ����
		Pool05<Byte> p5 = new Pool05<Byte>((byte) 1);
		System.out.println(p1.get());
		System.out.println(p2.get());
		System.out.println(p5.get());

	}
}
