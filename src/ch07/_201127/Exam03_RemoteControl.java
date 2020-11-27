package ch07._201127;

interface RemoteControl1 {

}

interface RemoteControl {
	void turnOn();

	void turnOff();

	void setVolume(int volumn);

	default void setMute(boolean state) {
		if (state) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� ���� �մϴ�.");
		}
	}

	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}

class Television implements RemoteControl, RemoteControl1 {

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volumn) {
		System.out.println("TV�� ������ " + volumn + "���� �����մϴ�.");
	}
}

class Audio implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volumn) {
		System.out.println("Audio�� ������ " + volumn + "���� �����մϴ�.");
	}
}

public class Exam03_RemoteControl {
	public static void main(String[] args) {
		Television r1 = new Television();
		r1.turnOff();
		r1.turnOn();
		System.out.println("======================");
		
		RemoteControl rc = new Television();	// rc ������ Television �ν��Ͻ��� ����
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		rc.setMute(true);
		System.out.println("======================");
		
		rc = new Audio();	// rc ������ Audio �ν��Ͻ��� ����
		rc.turnOn();
		rc.setVolume(20);
		rc.turnOff();
		rc.setMute(false);
		System.out.println("======================");
		
		RemoteControl.changeBattery();
		
	}
}
