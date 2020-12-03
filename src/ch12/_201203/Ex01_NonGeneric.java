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

		// gen�� obj���� MyClass01Ÿ���� ��������Ƿ�
		// �̰��� ��Ӱ��谡 �ƴ� String���� ĳ������ ��� ����
//		String g1 = (String) gen.get(); // ClassCastException

	}
}
