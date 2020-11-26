package ch07._201126;

// Product 클래스 
// 멤버 int price, int point
// 생성자 : 가격을 입력받아 10퍼센트를 포인트로 저장
// TV 클래스 
// 생성자  :가격을 100으로
// toString 메서드에서 tv를 리턴
// computer 
// 가격 200
// SmartPhone
// 가격 150

class Product {
	int price;
	int point;

	Product(int price) {
		this.price = price;
		this.point = price / 10;
	}

}

class Tv extends Product {
	Tv() {
		super(100);
	}

	@Override
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	@Override
	public String toString() {
		return "Computer";
	}
}

class SmartPhone extends Product {
	SmartPhone() {
		super(150);
	}

	@Override
	public String toString() {
		return "SmartPhone";
	}
}

class Buyer {
	int money = 500;
	int point;
	Product[] cart = new Product[3];
	int count;

	// Product의 자식 클래스들을 인자로 받을 수 있다.(up-casting)
	void buy(Product p) {
		money -= p.price;
		point += p.point;
		System.out.println(p + " 구입함.");
		cart[count++] = p;
	}

	void summary() {
		int sum = 0;
		String productList = "";
		for (Product p : cart) {
			if (p == null) {
				break;
			}

			System.out.println(p + " 상품 : 가격 = " + p.price + ", 적립 포인트 = " + p.point);
			productList += p + ", ";
			sum += p.price;
		}

		System.out.println("총 물품 구매액 : " + sum);
		System.out.println("총 물품 목록 : " + productList);
	}
}

public class Exam02_Buyer {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();

		Tv tv = new Tv();
		Computer pc = new Computer();
		SmartPhone p = new SmartPhone();
		buyer.buy(tv);
		buyer.buy(pc);
		buyer.buy(p);

		System.out.println("구매 후 잔액 : " + buyer.money);
		System.out.println("구매 후 적립 포인트 : " + buyer.point);

		System.out.println("======== 구매 제품 정보 ========");

		buyer.summary();
	}

}
