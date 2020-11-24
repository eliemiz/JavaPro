package JavaCafe;

public class _20201113_Java {
	// 1.
	// ���ǹ� : if, switch
	// �ݺ��� : for, while, do-while
	// 2. 2 (switch������ ����� �� �ִ� ������ Ÿ���� byte, short, char, int, String)
	public static void main(String[] args) {

		ex3();
		ex4();
		ex5();
		ex6();
	}

	// 3.
	public static void ex3() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3�� ����� �� : " + sum);
	}

	// 4.
	public static void ex4() {
		int i, j;

		do {
			i = (int) (Math.random() * 6) + 1;
			j = (int) (Math.random() * 6) + 1;
			System.out.printf("(%d, %d)\n", i, j);

		} while (i + j != 5);
	}

	// 5.
	public static void ex5() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (4 * i + 5 * j == 60) {
					System.out.printf("(%d, %d)\n", i, j);
				}
			}
		}
	}

	// 6.
	public static void ex6() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j <= i) {
					System.out.print("*");
				} else {
					break;
				}
			}
			System.out.println();
		}
	}

}
