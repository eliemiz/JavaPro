package ch06;

class Phone {
	String color;
	boolean power;
	String no;

	void power() {
		power = !power;
	}

	void send(String no) {
		System.out.println(no + "�� ��ȭ �۽� ��...");
	}

	void recv(String no) {
		System.out.println(no + "�κ��� ��ȭ ���� ��");
	}

}

public class Ex01_Phone {
	public static void main(String[] args) {

//		phoneEx1();
		phoneEx2();
	}

	static void phoneEx1() {

		// new ����� ���
		// 1. �� ������ �޸� �Ҵ�
		// 2. ��������� �⺻������ �ʱ�ȭ
		// 3. ������ ȣ�� ���
		Phone p1 = new Phone();
		p1.color = "����";
		p1.power = true;
		p1.no = "010-1234-5678";
		System.out.println(p1.color + ", " + p1.power + ", " + p1.no);
		p1.send("010-9876-5432");
		p1.recv("010-9876-5432");

		Phone p2 = new Phone();
		System.out.println(p2.color + ", " + p2.power + ", " + p2.no);

		p2 = p1;
		System.out.println(p2.color + ", " + p2.power + ", " + p2.no);
	}

	static void phoneEx2() {

		Phone[] parr = new Phone[3];

		for (int i = 0; i < parr.length; i++) {
			Phone p = new Phone();
			parr[i] = p;
			parr[i].no = i + "1234";
		}

		for (int i = 0; i < parr.length; i++) {
			System.out.printf("parr[%d].no = %s\n", i, parr[i].no);
			parr[i].send((i == 0) ? parr[parr.length - 1].no : parr[i - 1].no);
		}
	}

}
