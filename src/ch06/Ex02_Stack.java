package ch06;

public class Ex02_Stack {

	public static void main(String[] args) {

		System.out.println("main method start.");

		method1();
		System.out.println("method1 end.");

		method3();
		System.out.println("method3 end.");

		method4();
		System.out.println("method4 end.");

		System.out.println("main method end.");
	}

	public static void method1() {
		System.out.println("method1");
		method2();
	}

	public static void method2() {
		System.out.println("method2");
	}

	public static void method3() {
		System.out.println("method3");
	}

	public static void method4() {
		System.out.println("method4");
	}

}
