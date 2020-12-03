package ch12._201203;

// generic class ���� �ÿ� wildcard�� ����� �� �ִ�.
// Temp<? super Child> temp = new Temp<Parent>(); Child�� �θ�� �� ��
// Temp<? extends Parent> temp = new Temp<Child>(); Parent�� �ڽ��� �� ��

class Pool08<T> {
	T v;

	Pool08(T n) {
		v = n;
	}

	T get() {
		return v;
	}

	void set(T n) {
		v = n;
	}
}

class Food {
}

class Fruit extends Food {
}

class Drink extends Food {
}

class Apple extends Fruit {
}

class Peach extends Fruit {
}

class Coke extends Drink {
}

class Cider extends Drink {
}

public class Ex08_wildcard {
	public static void main(String[] args) {
		Food food = new Food();
		Fruit fruit = new Fruit();
		Drink drink = new Drink();
		Apple apple = new Apple();
		Peach peach = new Peach();
		Coke coke = new Coke();
		Cider cider = new Cider();

		Pool08<? super Apple> g1 = new Pool08<Food>(food);
		Pool08<? super Apple> g2 = new Pool08<Fruit>(fruit);
		Pool08<? super Apple> g3 = new Pool08<Apple>(apple);
//		Pool08<? super Apple> g4 = new Pool08<Drink>(drink);	// Drink�� Apple�� �θ� �ƴϴ�.
//		Pool08<? super Apple> g5 = new Pool08<Cider>(cider);	// Cider�� Apple�� �θ� �ƴϴ�.

		Pool08<? extends Drink> g6 = new Pool08<Drink>(drink);
		Pool08<? extends Drink> g7 = new Pool08<Cider>(cider);
//		Pool08<? extends Drink> g8 = new Pool08<Food>(food));	// Food�� Drink�� �ڽ��� �ƴϴ�.
//		Pool08<? extends Drink> g9 = new Pool08<Apple>(apple));	// Apple�� Drink�� �ڽ��� �ƴϴ�.

		System.out.println(g1.v.getClass().getSimpleName());
		System.out.println(g2.v.getClass().getSimpleName());
		System.out.println(g3.v.getClass().getSimpleName());
		System.out.println(g6.v.getClass().getSimpleName());
		System.out.println(g7.v.getClass().getSimpleName());
	}

}
