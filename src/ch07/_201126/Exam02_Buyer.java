package ch07._201126;

// Product Ŭ���� 
// ��� int price, int point
// ������ : ������ �Է¹޾� 10�ۼ�Ʈ�� ����Ʈ�� ����
// TV Ŭ���� 
// ������  :������ 100����
// toString �޼��忡�� tv�� ����
// computer 
// ���� 200
// SmartPhone
// ���� 150

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

	// Product�� �ڽ� Ŭ�������� ���ڷ� ���� �� �ִ�.(up-casting)
	void buy(Product p) {
		money -= p.price;
		point += p.point;
		System.out.println(p + " ������.");
		cart[count++] = p;
	}

	void summary() {
		int sum = 0;
		String productList = "";
		for (Product p : cart) {
			if (p == null) {
				break;
			}

			System.out.println(p + " ��ǰ : ���� = " + p.price + ", ���� ����Ʈ = " + p.point);
			productList += p + ", ";
			sum += p.price;
		}

		System.out.println("�� ��ǰ ���ž� : " + sum);
		System.out.println("�� ��ǰ ��� : " + productList);
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

		System.out.println("���� �� �ܾ� : " + buyer.money);
		System.out.println("���� �� ���� ����Ʈ : " + buyer.point);

		System.out.println("======== ���� ��ǰ ���� ========");

		buyer.summary();
	}

}
