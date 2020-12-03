package ch12._201203;

class Pool02<T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}

public class Ex02_Generic {
	public static void main(String[] args) {
		Pool02<String> box1 = new Pool02<String>();
		box1.set("Apple");
//		box1.set(30);	// String타입으로 지정해줬으므로 int값 대입 불가	
		String str = box1.get();
		System.out.println(str);

		// Generic 클래스지만 별도로 타입을 지정해주지 않을 수도 있음.
		Pool02 box2 = new Pool02();
		box2.set(30);
//		box2.set("Apple");	// 문자열을 Integer로 캐스팅할 경우 ClassCastException
		int value = (Integer) box2.get();
		System.out.println(value);
	}
}
