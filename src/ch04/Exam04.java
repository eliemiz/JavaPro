package ch04;

public class Exam04 {

	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {
			System.out.printf("%d´Ü\t\t", i);
		}

		System.out.println();

		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {
				System.out.printf("%d * %d = %2d\t", i, j, i * j);
			}
			System.out.println();
		}
	}

}
