package JavaCafe;

import java.util.Scanner;

public class _20201116_java {

	public static void main(String[] args) {
//		Ex01();
		Ex02();
	}

	// 좌우대칭 여부 판단
	static void Ex01() {

		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String str = Integer.toString(num);
		
		boolean isSymmetric = true;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				isSymmetric = false;
				break;
			}
		}

		System.out.println((isSymmetric) ? "좌우대칭수" : "좌우대칭수 아님");

	}

	// 피보나치 수열
	static void Ex02() {

		
	}

}
