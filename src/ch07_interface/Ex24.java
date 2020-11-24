package ch07_interface;

public class Ex24 {
	public static void main(String[] args) {
		new FighterTest().ex24();
	}

}

// ex24
class FighterTest {

	interface Movable {
		void move(int x, int y);
	}

	interface Attackable {
		void attack(Unit unit);
	}

	interface Fightable extends Movable, Attackable {

	}

	class Unit {
		int currentHP;
		int x;
		int y;
	}

	class Fighter extends Unit implements Fightable {
		public void move(int x, int y) {
			// foo...
		}

		public void attack(Unit unit) {
			// foo...
		}
	}

	void ex24() {
		Fighter fighter = new Fighter();

		if (fighter instanceof Unit) {
			System.out.println("fighter is child class of Unit class.");
		}

		if (fighter instanceof Fightable) {
			System.out.println("fighter implements Fightable interface.");
		}

		if (fighter instanceof Movable) {
			System.out.println("fighter implements Movable interface.");
		}

		if (fighter instanceof Attackable) {
			System.out.println("fighter implements Attackable interface.");
		}

		if (fighter instanceof Object) {
			System.out.println("fighter is child class of Object class.");
		}

	}

}