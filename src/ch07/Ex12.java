package ch07;

// final test
// final class, final method, final 

final class FinalClass {

}

// final class는 상속할 수 없다
//class ChildClass extends FinalClass{
//	
//}

class NotFinalClass {
	final int WIDTH = 10; // 값을 변경할 수 없는 멤버변수(상수)

	final void getWidth() { // overriding할 수 없는 메서드(변경불가)
		final int width = 10;	// 값을 변경할 수 없는 지역변수(상수)
		// width = 20;	// 상수이기 때문에 값 변경 불가
	}

}

class ChildClass extends NotFinalClass {
	// final method는 상속할 수 없다
//	void getWidth() {
//
//	}
	
	// overriding이 아니기 때문에 가능 
	void getWidth(int width) {
		
	}
}

public class Ex12 {

	public static void main(String[] args) {

	}
}
