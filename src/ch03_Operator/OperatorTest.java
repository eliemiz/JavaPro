package ch03_Operator;

import java.util.Scanner;

public class OperatorTest {
	public static void main(String[] args) {
//		OpEx1();
//		OpEx2();
//		OpEx4();
//		OpEx5();
//		OpEx6();
//		OpEx3();
//		OpEx7();
//		OpEx8();
//		OpEx10();
//		OperationEx5();
//		OperationEx11();
//		OperationEx15();
//		OperationEx18();
//		OperationEx21();
//		OperationEx28();
		
	}

	public static void OpEx1() {
		int x = 5;
		int y = 5;

		x++;
		y--;
//		System.out.println("x = " + x++ + ", y = " + y--);
		System.out.println("x = " + x + ", y = " + y);

		x = 5;
		y = 5;

		++x;
		--y;
//		System.out.println("x = " + ++x + ", y = " + --y);
		System.out.println("x = " + x + ", y = " + y);

	}

	public static void OpEx2() {
		int x = 5;
		int y = 0;

		y = x++;
		System.out.println("x = " + x + ", y = " + y);

		y = ++x;
		System.out.println("x = " + x + ", y = " + y);

		System.out.println("x = " + x++);
		System.out.println("x = " + ++x);

		x = y--;
		System.out.println("x = " + x + ", y = " + y);

		x = --y;
		System.out.println("x = " + x + ", y = " + y);

	}

	public static void OpEx4() {

		System.out.println(true);
		System.out.println("!true = " + !true);
		System.out.println("!false = " + !false);

		int x = 100; // 1100100
		System.out.println("(x < 200) = " + (x < 200));
		System.out.println("!(x < 200) = " + !(x < 200));
		System.out.println("!(5 % 2 == 0) = " + !(5 % 2 == 0));
		System.out.println("(5 % 2 != 0) = " + (5 % 2 != 0));

	}

	public static void OpEx5() {

		int x = -10;
		System.out.println("+x = " + +x);
		System.out.println("-x = " + -x);

		x = 10;
		System.out.println("+x = " + +x);
		System.out.println("-x = " + -x);

	}

	public static void OpEx6() {

		System.out.println(10 / 8);
		System.out.println(10 / -8);
		System.out.println(-10 / 8);
		System.out.println(-10 / -8);

		System.out.println(10 % 8);
		System.out.println(10 % -8);
		System.out.println(-10 % 8);
		System.out.println(-10 % -8);

	}

	public static void OpEx3() {

		int num = 100;
		System.out.println(num);

		num += 10;
		System.out.println(num);

		num /= 10;
		System.out.println(num);

		num *= 2 + 3;
		System.out.println(num);

		byte b = 1;
		System.out.println(b);

		b *= 2;
		System.out.println(b);

		b = (byte) (b * 2);
		System.out.println(b);

		b *= 2;
		System.out.println(b);

		b *= 2;
		System.out.println(b);

	}

	public static void OpEx7() {

		System.out.println("6 & 3 = " + (6 & 3));
		System.out.println("6 | 3 = " + (6 | 3));
		System.out.println("6 ^ 3 = " + (6 ^ 3));
		System.out.println("~10 = " + ~10);

	}

	public static void OpEx8() {

		System.out.println(" 8 << 2 : " + (8 << 2));
		System.out.println("-8 << 2 : " + (-8 << 2));
		System.out.println(" 8 >> 2 : " + (8 >> 2));
		System.out.println("-8 >> 2 : " + (-8 >> 2));
		System.out.println(" 8 >>> 2 : " + (8 >>> 2));
		System.out.println("-8 >>> 2 : " + (-8 >>> 2));

	}

	public static void OpEx10() {
		System.out.println("점수를 입력하세요 : ");

		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();

		String result = (score >= 60) ? "합격" : "불합격";
		System.out.println(score + "점은 " + result + "입니다.");

		System.out.println(score + "점은 " + ((score % 2 == 0) ? "짝수" : "홀수") + "입니다.");

		result = (score % 2 == 1) ? "홀수" : (score > 0) ? "짝수" : "0";
		System.out.println(score + "점은 " + result + "입니다.");

		String r;
		if (score >= 60) {
			r = "합격";
		} else {
			r = "불합격";
		}

		System.out.println(r);

	}

	public static void OperationEx5() {

		int a = 10;
		int b = 4;

		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		System.out.printf("%d + %f = %f\n", a, (float) b, a / (float) b);
		System.out.println((float) b);

	}

	public static void OperationEx11() {
		char a = 'a';
		char d = 'd';

		char zero = '0';
		char two = '2';

		System.out.printf("'%c' - '%c' = %d\n", d, a, d - a);
		System.out.printf("'%c' - '%c' = %d\n", two, zero, two - zero);

		System.out.printf("'%c' = %d\n", a, (int) a);
		System.out.printf("'%c' = %d\n", d, (int) d);
		System.out.printf("'%c' = %d\n", zero, (int) zero);
		System.out.printf("'%c' = %d\n", two, (int) two);
	}

	public static void OperationEx15() {
		char lowerCase = 'c';
		char upperCase = (char) (lowerCase - 32);

		System.out.println(upperCase);

	}

	public static void OperationEx18() {
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi);

	}

	public static void OperationEx21() {

		System.out.printf("10 == 10.0f\t %b\n", 10 == 10.0f);
		System.out.printf("'0' == 0\t %b\n", '0' == 0);
		System.out.printf("'\\0' == 0\t %b\n", '\0' == 0);
		System.out.printf("'A' == 65\t %b\n", 'A' == 65);
		System.out.printf("'A' > 'B'\t %b\n", 'A' > 'B');
		System.out.printf("'A' + 1 != 'B'\t %b\n", 'A' + 1 != 'B');

	}

	public static void OperationEx28() {
		int x = 0xAB;
		int y = 0xF;

		System.out.printf("x = %#X \t\t%s\n", x, toBinaryString(x));
		System.out.printf("y = %#X \t\t%s\n", y, toBinaryString(y));

		System.out.printf("%#X | %#X = %#X\t%s\n", x, y, x | y, toBinaryString(x | y));
		System.out.printf("%#X & %#X = %#X\t%s\n", x, y, x & y, toBinaryString(x & y));
		System.out.printf("%#X ^ %#X = %#X\t%s\n", x, y, x ^ y, toBinaryString(x ^ y));
		System.out.printf("%#X ^ %#X ^ %#X = %#X\t%s\n", x, y, y, x ^ y ^ y, toBinaryString(x ^ y ^ y));

	}

	static String toBinaryString(int x) {

		String zero = "00000000000000000000000000000000";
		String temp = zero + Integer.toBinaryString(x);

		return temp.substring(temp.length() - 32);
	}

}
