package ch04;

public class Exam08 {

	public static void main(String[] args) {

		int sum = 0;
		int last = 5;

		for (int i = 1; i <= last; i++) {
			System.out.print("(");
			for (int j = 1; j <= i; j++) {
				sum += j;
				System.out.print(j + ((j != i) ? " + " : ""));
//				System.out.print(j);
//				
//				if (j != i) {
//					System.out.print(" + ");
//				}

			}

			System.out.print(")" + ((i != last) ? " + " : ""));
//			System.out.print(")");
//			if (i != last) {
//				System.out.print(" + ");
//			}
		}

		System.out.printf(" = %d", sum);

	}

}
