package ch07._201127;

// 다형성
// 매개변수를 인터페이스 타입으로 사용하는 경우 => 메소드의 사용 조건의 의미로 많이 사용됨 

interface Repairable {

}

class Unit {
	int hp;
	final int MAX;

	Unit(int hp) {
		this.hp = hp;
		this.MAX = hp;
	}
}

class AirUnit extends Unit {
	public AirUnit(int hp) {
		super(hp);
	}
}

class GroundUnit extends Unit {
	public GroundUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
	}

	@Override
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(125);
	}

	@Override
	public String toString() {
		return "Dropship";
	}
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
	}

	@Override
	public String toString() {
		return "Marine";
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
	}

	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit) r;
			u.hp = u.MAX;
			System.out.println(r.toString() + " 수리 완료.");
		}
	}

	@Override
	public String toString() {
		return "SCV";
	}
}

public class Exam02_Starcraft {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
//		scv.repair(marine);	// marine은 Repairable을 구현하지 않았으므로 에러
		scv.repair(scv);
	}
}
