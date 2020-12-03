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
//		box1.set(30);	// StringŸ������ �����������Ƿ� int�� ���� �Ұ�	
		String str = box1.get();
		System.out.println(str);

		// Generic Ŭ�������� ������ Ÿ���� ���������� ���� ���� ����.
		Pool02 box2 = new Pool02();
		box2.set(30);
//		box2.set("Apple");	// ���ڿ��� Integer�� ĳ������ ��� ClassCastException
		int value = (Integer) box2.get();
		System.out.println(value);
	}
}
