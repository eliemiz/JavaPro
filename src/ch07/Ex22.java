package ch07;

public class Ex22 {
	public static void main(String[] args) {
		
		// 부모 타입의 참조변수 배열을 사용해서
		// 공통의 부모를 가진 다른 클래스의 객체를 배열로 묶어서 다룰 수 있다.
		Game[] arr = new Game[3];
		arr[0] = new Rpg();
		arr[1] = new Fps();
		arr[2] = new Rts();

	}
}

class Game {
	int price;
	int bonusPoint;

	Game(int price) {
		this.price = price;
		this.bonusPoint = (int) (price / 10.0);
	}
}

class Rpg extends Game {
	Rpg() {
		super(100);
	}

	public String toString() {
		return "RPG";
	}
}

class Fps extends Game {
	Fps() {
		super(200);
	}

	public String toString() {
		return "FPS";
	}
}

class Rts extends Game {
	Rts() {
		super(50);
	}

	public String toString() {
		return "RTS";
	}
}
