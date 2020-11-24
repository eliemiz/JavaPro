package ch07;

import java.util.Vector;

public class AbstractTest {

	public static void main(String[] args) {

		Vector<Unit> units = new Vector<Unit>();
		units.add(new Marine());
		units.add(new Tank());
		units.add(new Dropship());

		for (var unit : units) {
			unit.move(10, 10);
		}
		
		for (var unit : units) {
			unit.stop();
		}
	}

}

abstract class Unit {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
		System.out.println(this.getClass().getName() + " Stop");
	}
}

class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marine move");
	}

}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank move");
	}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("Dropship move");
	}
}