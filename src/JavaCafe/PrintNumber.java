package JavaCafe;

import java.util.Scanner;

// ���� ����Ʈ
//1233
//
//* * ....
//*
//*
//*
//*1234567890

public class PrintNumber {

	public static void main(String[] args) {

		// ��� ����� ���� ���� �迭
		String[][] numberArray = new String[][] { 
				{ "***** ", "*   * ", "*   * ", "*   * ", "***** " },
				{ "    * ", "    * ", "    * ", "    * ", "    * " },
				{ "***** ", "    * ", "***** ", "*     ", "***** " },
				{ "***** ", "    * ", "***** ", "    * ", "***** " },
				{ "*   * ", "*   * ", "***** ", "    * ", "    * " },
				{ "***** ", "*     ", "***** ", "    * ", "***** " },
				{ "***** ", "*     ", "***** ", "*   * ", "***** " },
				{ "***** ", "    * ", "    * ", "    * ", "    * " },
				{ "***** ", "*   * ", "***** ", "*   * ", "***** " },
				{ "***** ", "*   * ", "***** ", "    * ", "***** " } };

		// ���� Ȯ��
//		for (String[] strArr : numberArray) {
//			for (String str:strArr ) {
//				System.out.println(str);
//			}
//			
//			System.out.println();
//		}

		System.out.println("���ڸ� �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		String num = scan.next();

		// String[5][num] �迭 ����
//		String[][] strArr = new String[5][num.length()];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < num.length(); j++) {
				System.out.print(numberArray[num.charAt(j) - 48][i]);
			}
			System.out.println();
		}

	}

}
