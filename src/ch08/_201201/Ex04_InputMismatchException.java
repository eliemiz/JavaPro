package ch08._201201;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04_InputMismatchException {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("1���� 10���� �� ���ڸ� �Է��ϼ���(����:99) : ");
			try {
				int num = scan.nextInt();

				if (num == 99) {
					break;
				}

				if (num < 1 || num > 10) {
					throw new Exception("1���� 10������ ���ڸ� �Է��ϼ���.");
				}

				System.out.print(num + " : ");
				for (int i = 0; i < num; i++) {
					System.out.print("*");
				}
				System.out.println();

			} catch (InputMismatchException e) {
				// scan.nextInt()���� ó�� ���� ���� �ڵ����� �޾ƿ´�.
				String str = scan.next();
				System.out.println(str + "�� ���ڰ� �ƴմϴ�. ���ڸ� �Է��ϼ���.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("���α׷� ����.");

	}
}
