package ch07._201127;

public class Ex03_Instanceof {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		
		if (com instanceof Complexer) {
			System.out.println("com 按眉绰 Complexer 按眉");
		}
		if (com instanceof Complexerable) {
			System.out.println("com 按眉绰 Complexerable 按眉");
		}
		if (com instanceof Printerable) {
			System.out.println("com 按眉绰 Printerable 按眉");
		}
		if (com instanceof Scannerable) {
			System.out.println("com 按眉绰 Scannerable 按眉");
		}
		if (com instanceof Faxable) {
			System.out.println("com 按眉绰 Faxable 按眉");
		}
		if (com instanceof Object) {
			System.out.println("com 按眉绰 Object 按眉");
		}
	}
}
