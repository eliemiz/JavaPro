package ch07._201126;

class SingleObject {

	private static SingleObject obj = new SingleObject();
	private int value = 100;

	// 외부에서 호출할 수 없는 private 생성자
	private SingleObject() {

	}

	public static SingleObject getObject() {
		return obj;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

public class Ex02_Singleton {
	public static void main(String[] args) {
//		SingleObject so = new SingleObject();	// public 생성자가 없으므로 객체 생성 불가
		SingleObject so1 = SingleObject.getObject();
		SingleObject so2 = SingleObject.getObject();
		System.out.println(so1 + ", " + so2); // 같은 주소를 참조하므로 같은 주소가 찍힘

		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println(o1 + ", " + o2); // 일반적으론 다른 주소에 생성됨을 보여줌

		System.out.println(so1.getValue());
		System.out.println(so2.getValue());

		so1.setValue(500); // 동일 객체이므로 값이 양쪽 다 변경됨
		System.out.println(so1.getValue());
		System.out.println(so2.getValue());
		if (so1 == so2) {
			System.out.println("so1 참조변수의 객체와 so2 참조변수의 객체는 같은 객체임.");
		}
	}
}
