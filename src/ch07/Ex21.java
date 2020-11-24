package ch07;

public class Ex21 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Television());
		b.buy(new Computer());
		
		System.out.println("�ܵ� : " + b.money);
		System.out.println("����Ʈ : " + b.bonusPoint);
	}
}

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		this.bonusPoint = (int) (price / 10.0);
	}
}

class Television extends Product {

	Television() {
		super(100);
	}

	public String toString() {
		return "Television";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	// �ڽ� Ŭ������ �ν��Ͻ��� ����
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ� ����");
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "�� �����ϼ̽��ϴ�.");
	}
}