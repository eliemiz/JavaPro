package ch07;

public class InterfaceTest {

}

class Fighter extends TestUnit implements Fightable {
	// implements Fightable 때문에
	// interface의 method를 구현 안하면 에러
	// public 이어야 한다
	public void move(int x, int y) {
		System.out.println("Moved");
	}

	public void attack(TestUnit unit) {
		System.out.println("Attacked");
	}

	public void Defend() {

	}
}

class TestUnit {
	int currentHP;
	int x, y;
}

interface Fightable extends Movable, Attackable {
	void Defend();
}

interface Movable {
	void move(int x, int y);
}

interface Attackable {
	void attack(TestUnit unit);
}