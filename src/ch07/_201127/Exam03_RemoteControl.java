package ch07._201127;

interface RemoteControl1 {

}

interface RemoteControl {
	void turnOn();

	void turnOff();

	void setVolume(int volumn);

	default void setMute(boolean state) {
		if (state) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제 합니다.");
		}
	}

	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}

class Television implements RemoteControl, RemoteControl1 {

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volumn) {
		System.out.println("TV의 볼륨을 " + volumn + "으로 설정합니다.");
	}
}

class Audio implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volumn) {
		System.out.println("Audio의 볼륨을 " + volumn + "으로 설정합니다.");
	}
}

public class Exam03_RemoteControl {
	public static void main(String[] args) {
		Television r1 = new Television();
		r1.turnOff();
		r1.turnOn();
		System.out.println("======================");
		
		RemoteControl rc = new Television();	// rc 변수가 Television 인스턴스를 참조
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		rc.setMute(true);
		System.out.println("======================");
		
		rc = new Audio();	// rc 변수가 Audio 인스턴스를 참조
		rc.turnOn();
		rc.setVolume(20);
		rc.turnOff();
		rc.setMute(false);
		System.out.println("======================");
		
		RemoteControl.changeBattery();
		
	}
}
