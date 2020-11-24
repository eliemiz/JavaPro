package ch07;

public class Ex21 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Television());
		b.buy(new Computer());
		
		System.out.println("잔돈 : " + b.money);
		System.out.println("포인트 : " + b.bonusPoint);
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

	// 자식 클래스의 인스턴스를 참조
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액 부족");
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입하셨습니다.");
	}
}