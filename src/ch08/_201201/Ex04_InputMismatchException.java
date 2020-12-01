package ch08._201201;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04_InputMismatchException {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("1부터 10까지 중 숫자를 입력하세요(종료:99) : ");
			try {
				int num = scan.nextInt();

				if (num == 99) {
					break;
				}

				if (num < 1 || num > 10) {
					throw new Exception("1부터 10까지의 숫자만 입력하세요.");
				}

				System.out.print(num + " : ");
				for (int i = 0; i < num; i++) {
					System.out.print("*");
				}
				System.out.println();

			} catch (InputMismatchException e) {
				// scan.nextInt()에서 처리 못한 값을 자동으로 받아온다.
				String str = scan.next();
				System.out.println(str + "는 숫자가 아닙니다. 숫자만 입력하세요.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("프로그램 종료.");

	}
}
