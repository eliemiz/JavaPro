package ch07._201127;

//[public static final] type constant
//[public abstract] type method();
//[public] default type method() {}
//[public] static type method() {}

interface Printerable {
	int INK = 100; // public static final ����

	void print(); // public abstract ����
}

interface Scannerable {
	void scan();
}

interface Faxable {
	String FAX_NO = "010-12345";

	void send(String tel);

	void recv(String tel);
}

// interface ���� ����� ���� ��� ����. extends�� ���
interface Complexerable extends Printerable, Scannerable, Faxable {

}

// �Ʒ��� ���� �ٷ� ���� �������̽����� ������ ���� �ִ�.
//class Complexer implements Printerable, Scannerable, Faxable{	
class Complexer implements Complexerable {

	int ink;

	Complexer() {
		ink = INK;
	}

	@Override
	public void print() {
		System.out.println("���̿� ����մϴ�. ���� ��ũ�� : " + --ink);
	}

	@Override
	public void scan() {
		System.out.println("�̹����� ��ĵ�մϴ�.");
	}

	@Override
	public void send(String tel) {
		System.out.println(FAX_NO + "���� " + tel + " ��ȣ�� FAX�� �۽�.");
	}

	@Override
	public void recv(String tel) {
		System.out.println(tel + "���� " + FAX_NO + " ��ȣ�� FAX�� ����.");
	}
}

public class Ex02_Interface {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		System.out.println("�⺻ ��ũ�� : " + Printerable.INK);
		System.out.println("FAX ��ȣ : " + Complexerable.FAX_NO);
		com.print();
		com.print();
		com.scan();
		com.recv("02-5678");
		com.send("02-5678");
	}
}
