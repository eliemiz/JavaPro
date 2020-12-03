package ch12._201203;

// 범위가 정해진 객체의 자송 클래스만을 제네릭 타입으로 입력할 수 있도록 구현한다.
// <T extends Number> : Number의 자손만을 입력할 수 있다.
// <T super Number>는 class 구현 시 사용할 수 없다.

// 클래스의 extends in type parameter
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
	// 메소드의 extends in type parameter
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
//		Pool05<String> p3 = new Pool05<String>("20");	// Number의 자손클래스가 아니므로 에러
//		Pool05<Character> p4 = new Pool05<Character>('a');	// Number의 자손클래스가 아니므로 에러
		Pool05<Byte> p5 = new Pool05<Byte>((byte) 1);
		System.out.println(p1.get());
		System.out.println(p2.get());
		System.out.println(p5.get());

	}
}
