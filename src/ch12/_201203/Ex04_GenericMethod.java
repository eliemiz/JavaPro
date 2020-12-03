package ch12._201203;

// Generic Method : Ŭ������ �̿����� �ʰ� �޼ҵ常�� ���׸����� �����Ѵ�.
// ���� ��� �� ���׸� ���� ������.

class Pool04<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}

class Util04 {
	// <T> : ���׸��޼ҵ��� ǥ��
	// ����Ÿ�� : Pool04<T>
	public static <T> Pool04<T> staticMethod(T t) {
		Pool04<T> box = new Pool04<T>();
		box.set(t);
		return box;
	}

	public <T> Pool04<T> instanceMethod(T t) {
		Pool04<T> box = new Pool04<T>();
		box.set(t);
		return box;
	}

	public <T> String instanceMethod2(T t) {
		return t.toString();
	}

	// <T> ������� �ʴ� �Լ��� ����
	public <T> int instanceMethod3(int num) {
		return num;
	}
}

class MyCar {
	@Override
	public String toString() {
		return "MyCar";
	}
}

public class Ex04_GenericMethod {
	public static void main(String[] args) {

		Pool04<Integer> box1 = Util04.<Integer>staticMethod(100);
		System.out.println(box1.get());

		Util04 util = new Util04();

		// �Լ� ȣ�� ���� <Integer>�� ���� ����
		Pool04<String> box2 = util.instanceMethod("Apple");
		System.out.println(box2.get());

		System.out.println(util.instanceMethod2("Orange"));
		System.out.println(util.instanceMethod2(new MyCar()));

		System.out.println(util.instanceMethod3(100));
	}
}
