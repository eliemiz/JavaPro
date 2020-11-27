package ch07._201127;

public class Ex04_CastingOfInterface {
	public static void main(String[] args) {
		Complexer com = new Complexer();

		Complexerable ca = com;
		ca.print();
		ca.scan();
		ca.send("010-1234");
		ca.recv("010-1234");
//		System.out.println(ca.ink);	// Complexerable�� ink�� ������ ���� �����Ƿ�

		Printerable p = com;
		p.print();
//		p.scan();	// Printerable�� print()�� ������ �����Ƿ�
//		p.send("010-1234");
//		p.recv("010-1234");

		Scannerable s = com;
//		s.print();	// Scannerable�� scan()�� ������ �����Ƿ�
		s.scan();
//		s.send("010-1234");
//		s.recv("010-1234");

		Faxable f = com;
//		f.print();	// Faxable�� send()�� recv()�� ������ �����Ƿ�
//		f.scan();
		f.send("010-1234");
		f.recv("010-1234");

	}
}
