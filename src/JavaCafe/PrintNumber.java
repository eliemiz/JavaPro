package JavaCafe;

import java.util.Scanner;

// 숫자 프린트
//1233
//
//* * ....
//*
//*
//*
//*1234567890

public class PrintNumber {

	public static void main(String[] args) {

		// 결과 출력을 위한 숫자 배열
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

		// 숫자 확인
//		for (String[] strArr : numberArray) {
//			for (String str:strArr ) {
//				System.out.println(str);
//			}
//			
//			System.out.println();
//		}

		System.out.println("숫자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		String num = scan.next();

		// String[5][num] 배열 생성
//		String[][] strArr = new String[5][num.length()];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < num.length(); j++) {
				System.out.print(numberArray[num.charAt(j) - 48][i]);
			}
			System.out.println();
		}

	}

}
