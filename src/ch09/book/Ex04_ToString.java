package ch09.book;

import java.util.Date;

// toString() : �ν��Ͻ��� ���� ������ ���ڿ�(String)�� ������ �������� ����
// Object Ŭ������ ���ǵ� toString() : 
// 	return getClass().getName() + "@" + Integer.toHexString(hashCode());
// Ŭ���� �̸�@16���� �ؽ��ڵ�
// Ŭ������ ��ü ��ü�� ��� �� �⺻������ toString()�� ȣ���ϵ��� �Ǿ��ִ�.

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

	// ������ ���ڿ��� �����ϰ� �ʹٸ� �������̵�
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

		// �Ϻ� Ŭ������ toString 
		String str = new String("Korea");
		Date today = new Date();

		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(today);
		System.out.println(today.toString());

	}
}
