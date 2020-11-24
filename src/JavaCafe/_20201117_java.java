package JavaCafe;

public class _20201117_java {
	public static void main(String[] args) {
//		ex7();
		ex8();

	}

	// 1. 4
	// 2. 3
	// 3. 2
	// 4. 2
	// 5. 3
	// 6. 3, 5

	static void ex7() {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		System.out.println("max : " + max);
	}

	static void ex8() {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		int count = 0;
		for (int[] innerArr : array) {
			for (int score : innerArr) {
				sum += score;
				count++;
			}
		}
		
		double average = (double) sum / count;
		System.out.println("sum : " + sum);
		System.out.println("average : " + average);

	}

}
