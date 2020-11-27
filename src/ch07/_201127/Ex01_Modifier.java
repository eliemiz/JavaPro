package ch07._201127;

import ch07._201127ex.Modifier2;

//접근 제어자		접근 허용 범위
//private		동일 클래스
//(default)		동일 클래스 + 동일 패키지
//protected		동일 클래스 + 동일 패키지 + 상속관계
//public		동일 클래스 + 동일 패키지 + 상속관계 + 모든 클래스

class Modifier {
	private int v1 = 100;
	int v2 = 200;

	public void method() {
		System.out.println("ch07._201127.method() 메서드");
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
	}
}

class Modifier3 extends Modifier2 {
	public void method() {
//		System.out.println("v1 = " + v1);	// private : 동일 클래스가 아니므로 접근 불가
//		System.out.println("v2 = " + v2);	// (default) : 동일 패키지도 아니므로 접근 불가
		System.out.println("v3 = " + v3); // protected : 상속 관계이므로 접근 가능
		System.out.println("v4 = " + v4); // public : 무조건 접근 가능
	}

}

public class Ex01_Modifier {
	public static void main(String[] args) {
		Modifier m1 = new Modifier();
//		System.out.println(m1.v1);	// private : 동일 클래스가 아니므로 접근 불가
		System.out.println(m1.v2); // (default) : 동일 패키지이므로 접근 가능
		m1.method(); // public : 무조건 접근 가능

		Modifier3 m3 = new Modifier3();
//		System.out.println("m3.v1 = " + m3.v1);	// private :  동일 클래스가 아니므로 접근 불가
//		System.out.println("m3.v2 = " + m3.v2); // (default) : 동일 패키지도 아니므로 접근 불가
//		System.out.println("m3.v3 = " + m3.v3); // protected : 상속 관계도 아니므로 접근 불가
		System.out.println("m3.v4 = " + m3.v4); // public : 무조건 접근 가능

//		Math m = new Math();	// 생성자의 modifier가 private : 동일 클래스가 아니므로 접근 불가

	}
}
