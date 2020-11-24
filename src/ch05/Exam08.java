package ch05;

// command line에서 숫자로 이루어진 문자를 2개 받아서 두 수의 공약수를 구하시오

public class Exam08 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		int min = (num1 < num2) ? num1 : num2;

		System.out.printf("두 수 %d 와 %d 의 공약수 : ", num1, num2);
		for (int i = 1; i <= min; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.print(i + ", ");
			}
		}

	}

}
