package ch07._201127;

class LazerZet implements Printerable {
	@Override
	public void print() {
		System.out.println("LazerZet Printer���� �����.");
	}
}

class InkZet implements Printerable {
	public void print() {
		System.out.println("InkZet Printer���� �����.");
	};
}

class PrinterManager {
	public static Printerable getPrinter(String type) {
		if (type.equals("INK")) {
			return new InkZet();
		} else {
			return new LazerZet();
		}
	}
}

public class Ex05_Polymorphism {
	public static void main(String[] args) {
		Printerable able = PrinterManager.getPrinter("INK");
		able.print();
		able = PrinterManager.getPrinter("LAZER");
		able.print();
	}
}
