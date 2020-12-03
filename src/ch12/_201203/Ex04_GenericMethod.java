package ch12._201203;

// Generic Method : 클래스를 이용하지 않고 메소드만을 제네릭으로 구현한다.
// 실행 사용 시 제네릭 생략 가능함.

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
	// <T> : 제네릭메소드라는 표시
	// 리턴타입 : Pool04<T>
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

	// <T> 사용하지 않는 함수도 가능
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

		// 함수 호출 시의 <Integer>는 생략 가능
		Pool04<String> box2 = util.instanceMethod("Apple");
		System.out.println(box2.get());

		System.out.println(util.instanceMethod2("Orange"));
		System.out.println(util.instanceMethod2(new MyCar()));

		System.out.println(util.instanceMethod3(100));
	}
}
