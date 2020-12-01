package ch09.book;

import java.util.Date;

// toString() : 인스턴스에 대한 정보를 문자열(String)로 제공할 목적으로 정의
// Object 클래스에 정의된 toString() : 
// 	return getClass().getName() + "@" + Integer.toHexString(hashCode());
// 클래스 이름@16진수 해시코드
// 클래스의 객체 자체를 출력 시 기본적으로 toString()을 호출하도록 되어있다.

class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	// 별도의 문자열을 리턴하고 싶다면 오버라이딩
	@Override
	public String toString() {
		return "kind : " + kind + ", number : " + number;
	}

}

public class Ex04_ToString {
	public static void main(String[] args) {
		Card card1 = new Card();
		Card card2 = new Card("HEART", 10);

		System.out.println(card1);
		System.out.println(card2.toString());
		
		System.out.println("========================");

		// 일부 클래스는 toString 
		String str = new String("Korea");
		Date today = new Date();

		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(today);
		System.out.println(today.toString());

	}
}
