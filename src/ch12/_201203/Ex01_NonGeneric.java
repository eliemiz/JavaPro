package ch12._201203;

class Pool01 {
	private Object obj;

	public void set(Object obj) {
		this.obj = obj;
	}

	public Object get() {
		return obj;
	}
}

class MyClass01 {
}

public class Ex01_NonGeneric {
	public static void main(String[] args) {

		Pool01 gen = new Pool01();
		gen.set("Apple"); // up-casting
		String name = (String) gen.get(); // down-casting
		System.out.println(name);

		gen.set(new MyClass01());
		MyClass01 g = (MyClass01) gen.get();
		System.out.println(g);

		// gen의 obj에는 MyClass01타입이 들어있으므로
		// 이것을 상속관계가 아닌 String으로 캐스팅할 경우 에러
//		String g1 = (String) gen.get(); // ClassCastException

	}
}
