package ch07;

public class Ex14 {
	public static void main(String[] args) {
//		Singleton s = new Singleton();	// Singleton() has private access in Singleton
		Singleton s = Singleton.getInstance();
	}

}

final class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}
}

// 
class Temp1 {
	// static method는 몸통이 있는 메서드에만 사용할 수 있기 때문
//	static abstract void method() {
//		
//	}
}

// final : 클래스 확장 불가, abstract : 상속을 통해 완성된다는 의미이므로 
//final abstract class Temp2 {
//
//}

class Temp3 {
	// abstract는 자손 클래스에서 구현해주어야 하는데,
	// modifier가 private이면 접근할 수 없기 때문
//	private abstract void method() {
//		
//	}
}

class Temp4 {
	// private 메서드는 overriding 될 수 없기 때문에
	// private, final 둘 중 하나만 써주어도 충분
	private final void method() {

	}
}