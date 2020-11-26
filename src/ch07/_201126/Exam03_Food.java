package ch07._201126;

// 모든 Food는 price와 point를 멤버로 가짐
// 식품 객체 생성시 가격 입력받고, 10%를 포인트로 저장
// 식료품 종류는 Fruit, Drink, Snack. Food를 상속받음
// 과일은 당도(brix), 음료는 용량(ml), 과자는 무게(gram)을 멤버로 가짐
// 과일 종류는 Apple, Peach
// 음료는 Coke, Cider
// 과자는 Biscuit, Cookie
// 각 서브클래스에 toString 메서드 구현하고 각각의 이름을 리턴
// 객체 생성 시 가격과 당용무를 입력받아 객체를 생성

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
			System.out.println(f + " 구매 시 잔액 부족");
			return;
		}

		money -= f.price;
		point += f.point;
		System.out.println(f + " : 가격 = " + f.price + " 구입");
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

		System.out.println("총 구매 금액 : " + total + ", 총 구매 건수 : " + count);
		System.out.println("과일 구매 금액 : " + fruitTotal + ", 과일 구매 건수 : " + fruitCount);
		System.out.println("과일 구매 목록 : " + fruitList);
		System.out.println("음료 구매 금액 : " + drinkTotal + ", 음료 구매 건수 : " + drinkCount);
		System.out.println("음료 구매 목록 : " + drinkList);
		System.out.println("과자 구매 금액 : " + snackTotal + ", 과자 구매 건수 : " + snackCount);
		System.out.println("과자 구매 목록 : " + snackList);
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
		System.out.println("고객 잔액 : " + b.money);
		System.out.println("고객 적립 포인트 : " + b.point);
		
		System.out.println("==========================");
		b.summary();
	}
}
