package ch07;

public class Ex18 {

	public static void main(String[] args) {

		TempParent p = new TempChild();	// 자식 클래스를 참조
		TempChild c = new TempChild();
		
		System.out.println(p.x);	// 멤버변수는 참조변수의 타입에 따라 달라짐
		p.method();	// 메서드는 실제 인스턴스 타입인 Child 클래스에 정의된 메서드 호출
		
		System.out.println(c.x);
		c.method();
	}

}

class TempParent {
	int x = 100;

	void method() {
		System.out.println("This is Parent");
	}
}

class TempChild extends TempParent {
	int x = 200;

	void method() {
		System.out.println("This is Child");
	}
}
