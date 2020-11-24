package ch06;

public class Ex03_RecursionTest {

	public static void main(String[] args) {

		System.out.println("4! = " + factorial(4));

	}

	public static int factorial(int i) {

		System.out.println("i = " + i);

		return (i == 1) ? 1 : i * factorial(i - 1);
	}

}
