package ch07._201127;

// ������
// �Ű������� �������̽� Ÿ������ ����ϴ� ��� => �޼ҵ��� ��� ������ �ǹ̷� ���� ���� 

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
			System.out.println(r.toString() + " ���� �Ϸ�.");
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
//		scv.repair(marine);	// marine�� Repairable�� �������� �ʾ����Ƿ� ����
		scv.repair(scv);
	}
}
