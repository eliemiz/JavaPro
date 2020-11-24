package ch04;

// 1. 1부터 100까지 2의 배수이거나 3의 배수 합 구하기
// 2. 1부터 100까지 2의 배수도 아니고 3의 배수도 아닌 수의 합 구하기
public class Exam07 {

	public static void main(String[] args) {

		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				sum1 += i;
			}
		}
		System.out.println("1. " + sum1);

		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum2 += i;
			}
		}
		System.out.println("2. " + sum2);

	}

}
