package ch07._201126;

// ��� Food�� price�� point�� ����� ����
// ��ǰ ��ü ������ ���� �Է¹ް�, 10%�� ����Ʈ�� ����
// �ķ�ǰ ������ Fruit, Drink, Snack. Food�� ��ӹ���
// ������ �絵(brix), ����� �뷮(ml), ���ڴ� ����(gram)�� ����� ����
// ���� ������ Apple, Peach
// ����� Coke, Cider
// ���ڴ� Biscuit, Cookie
// �� ����Ŭ������ toString �޼��� �����ϰ� ������ �̸��� ����
// ��ü ���� �� ���ݰ� ��빫�� �Է¹޾� ��ü�� ����

class Food {
	int price;
	int point;

	Food(int price) {
		this.price = price;
		this.point = price / 10;
	}
}

class Fruit extends Food {
	double brix;

	Fruit(int price, double brix) {
		super(price);
		this.brix = brix;
	}
}

class Drink extends Food {
	int ml;

	Drink(int price, int ml) {
		super(price);
		this.ml = ml;
	}
}

class Snack extends Food {
	int gram;

	Snack(int price, int gram) {
		super(price);
		this.gram = gram;
	}
}

class Apple extends Fruit {
	Apple(int price, double brix) {
		super(price, brix);
	}

	@Override
	public String toString() {
		return "Apple";
	}
}

class Peach extends Fruit {
	Peach(int price, double brix) {
		super(price, brix);
	}

	@Override
	public String toString() {
		return "Peach";
	}
}

class Coke extends Drink {
	Coke(int price, int ml) {
		super(price, ml);
	}

	@Override
	public String toString() {
		return "Coke";
	}
}

class Cider extends Drink {
	Cider(int price, int ml) {
		super(price, ml);
	}

	@Override
	public String toString() {
		return "Cider";
	}
}

class Biscuit extends Snack {
	Biscuit(int price, int gram) {
		super(price, gram);
	}

	@Override
	public String toString() {
		return "Biscuit";
	}
}

class Cookie extends Snack {
	Cookie(int price, int gram) {
		super(price, gram);
	}

	@Override
	public String toString() {
		return "Cookie";
	}
}

class Buyer2 {
	int money = 10000;
	int point;
	int count;
	Food[] cart = new Food[20];

	void buy(Food f) {
		if (money < f.price) {
			System.out.println(f + " ���� �� �ܾ� ����");
			return;
		}

		money -= f.price;
		point += f.point;
		System.out.println(f + " : ���� = " + f.price + " ����");
		cart[count++] = f;
	}

	void summary() {
		int total = 0;
		int fruitTotal = 0;
		int drinkTotal = 0;
		int snackTotal = 0;
		int fruitCount = 0;
		int drinkCount = 0;
		int snackCount = 0;

		String fruitList = "";
		String drinkList = "";
		String snackList = "";

		for (Food f : cart) {
			if (f == null) {
				break;
			}

			total += f.price;
			if (f instanceof Fruit) {
				fruitCount++;
				fruitTotal += f.price;
				fruitList += f + ", ";
			}
			if (f instanceof Drink) {
				drinkCount++;
				drinkTotal += f.price;
				drinkList += f + ", ";
			}
			if (f instanceof Snack) {
				snackCount++;
				snackTotal += f.price;
				snackList += f + ", ";
			}
		}

		System.out.println("�� ���� �ݾ� : " + total + ", �� ���� �Ǽ� : " + count);
		System.out.println("���� ���� �ݾ� : " + fruitTotal + ", ���� ���� �Ǽ� : " + fruitCount);
		System.out.println("���� ���� ��� : " + fruitList);
		System.out.println("���� ���� �ݾ� : " + drinkTotal + ", ���� ���� �Ǽ� : " + drinkCount);
		System.out.println("���� ���� ��� : " + drinkList);
		System.out.println("���� ���� �ݾ� : " + snackTotal + ", ���� ���� �Ǽ� : " + snackCount);
		System.out.println("���� ���� ��� : " + snackList);
	}
}

public class Exam03_Food {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		b.buy(new Apple(1000, 10.5));
		b.buy(new Peach(1000, 13.5));
		b.buy(new Coke(500, 500));
		b.buy(new Cider(1500, 1000));
		b.buy(new Biscuit(10000, 500));
		b.buy(new Cookie(500, 5000));
		
		System.out.println("==========================");
		System.out.println("�� �ܾ� : " + b.money);
		System.out.println("�� ���� ����Ʈ : " + b.point);
		
		System.out.println("==========================");
		b.summary();
	}
}
