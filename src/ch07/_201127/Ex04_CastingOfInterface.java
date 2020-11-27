package ch07._201127;

public class Ex04_CastingOfInterface {
	public static void main(String[] args) {
		Complexer com = new Complexer();

		Complexerable ca = com;
		ca.print();
		ca.scan();
		ca.send("010-1234");
		ca.recv("010-1234");
//		System.out.println(ca.ink);	// Complexerable이 ink를 가지고 있지 않으므로

		Printerable p = com;
		p.print();
//		p.scan();	// Printerable은 print()만 가지고 있으므로
//		p.send("010-1234");
//		p.recv("010-1234");

		Scannerable s = com;
//		s.print();	// Scannerable은 scan()만 가지고 있으므로
		s.scan();
//		s.send("010-1234");
//		s.recv("010-1234");

		Faxable f = com;
//		f.print();	// Faxable은 send()와 recv()만 가지고 있으므로
//		f.scan();
		f.send("010-1234");
		f.recv("010-1234");

	}
}
