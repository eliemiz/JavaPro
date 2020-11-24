package ch02_val;

import java.util.Scanner;

public class VarEx1 {

	public static void main(String[] args) {

//		NumTest();
//		PrintNumTest();
//		PrintReverseTriangle();
//		NumTest4();
//		OverFlow();
//		ScannerEx();
		
		System.out.println("firststring\rsecond\nthird\r\nfourth\n\rfifth");
		
		
		
	}

	public static void ScannerEx() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("두 자리 정수 중 하나를 입력하시오 : ");

		String input = scanner.nextLine();

		int num = Integer.parseInt(input);

		System.out.println("입력내용 : " + num);
		System.out.printf("num = %d%n", num);

	}

	public static void OverFlow() {
		short sMin = Short.MIN_VALUE;
		short sMax = Short.MAX_VALUE;
		char cMin = Character.MIN_VALUE;
		char cMax = Character.MAX_VALUE;

		System.out.println("sMin     = " + sMin);
		System.out.println("sMin - 1 = " + (short) (sMin - 1));
		System.out.println("sMax     = " + sMax);
		System.out.println("sMax + 1 = " + (short) (sMax + 1));
		System.out.println("cMin     = " + (int) cMin);
		System.out.println("cMin - 1 = " + (int) --cMin);
		System.out.println("cMax     = " + (int) cMax);
		System.out.println("cMax + 1 = " + (int) ++cMax);
	}

	public static void NumTest4() {

		byte b = 1;

		short s = 2;
		char c = 'a';
		int finger = 10;
		long big = 100_000_000_000l;
		long hex = 0xFFFF_FFFF_FFFF_FFFFl;

		int octNum = 010;
		int hexNum = 0x10;
		int binNum = 0b10;
		System.out.printf("b = %d%n", b);
		System.out.printf("s = %d%n", s);
		System.out.printf("c = %c, %d%n", c, (int) c);
		System.out.printf("finger = [%5d]%n", finger);
		System.out.printf("finger = [%-5d]%n", finger);
		System.out.printf("finger = [%05d]%n", finger);
		System.out.printf("big = %d%n", big);
		System.out.printf("hex = %#x%n", hex);
		System.out.printf("octNum = %o, %d%n", octNum, octNum);
		System.out.printf("hexNum = %x, %d%n", hexNum, hexNum);
		System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(binNum), binNum);

		String url = "12345678901234567890";

		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;

		System.out.printf("%f, %e, %g%n", f1, f1, f1);
		System.out.printf("%f, %e, %g%n", f2, f2, f2);
		System.out.printf("%f, %e, %g%n", f3, f3, f3);

		System.out.printf("%f\n", d);

		System.out.printf("%14.20f\n", d);

		System.out.printf("[%-20.8s]\n", url);
		System.out.printf("[%.8s]\n", url);

	}

	public static void NumTest3() {

		int i = 10;
		byte b = (byte) i;
		System.out.printf("[int -> byte] i = %d -> b = %d%n", i, b);

		i = 300;
		b = (byte) i;
		System.out.printf("[int -> byte] i = %d -> b = %d%n", i, b);

		b = 10;
		i = b;
		System.out.printf("[byte -> int] b = %d -> i = %d%n", b, i);

		b = -2;
		i = b;
		System.out.printf("[byte -> int] b = %d -> i = %d%n", b, i);

		System.out.println("i = " + Integer.toBinaryString(i));

	}

	public static void NumTest2() {

		// String + 기본형 = String
		int i0 = 10;
		String str = "a";
		str = "a" + i0;

		byte b1 = (byte) 128; // default literal이 int이기 때문
		int i1 = b1;
		byte b2 = (byte) i1;

		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b1);
		System.out.println("i = " + b1);

		byte b3 = 100; // 범위 내의 값이므로 자동으로 byte로 변환
		System.out.println("b3 = " + b3);

		long l1 = 10;
		float f = l1;
		long l2 = (long) f;

		char c1 = 'a';
		short s = (short) c1;
		char c2 = (char) s;

		// 큰 자료형 + 작은 자료형 = 큰 자료형
		int i2 = (int) (i1 + l1);

		// 순차적 연산
		System.out.println("번호 : " + 1 + 2 + 3);
		System.out.println(1 + 2 + 3 + "번");

		char c3 = 'a';
		int i3 = c3;
		System.out.println("c3 = " + c3);
		System.out.println("i3 = " + (char) i3);

		// int보다 작은 자료형의 연산 결과는 int
		byte b4 = 1;
		byte b5 = 1;
		b5 = (byte) (b4 + b5);

	}

	public static void NumTest() {

		byte b1 = -22;
		byte b2;
		b2 = -128;

		short s = -220;
		int i = 100;
		long l = 2200000000l;

		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);

		float f = 1.0f;
		double d1 = 1.0;
		double d2 = 1d;

		System.out.println("f = " + f);
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);

	}

	public static void PrintNumTest() {
		// int short 간의 casting
		int i = 15;
		short s = 10;

		i = s;
		s = (short) i;

		// long float 간의 casting
		long l = 2020;
		float f = 1.1f;

		f = l;
		l = (long) f;

		// 2진수의 음수
		short b = 0b010110101100101;
		short bx = 0b100010001011010;

		System.out.println(b);
		System.out.println(bx);

		// 숫자 표현 방법
		int octNum = 070;

		System.out.println(octNum);
		System.out.printf("%#x\n", octNum);
		System.out.printf("%x\n", octNum);
		System.out.printf("%#o\n", octNum);
		System.out.printf("%o\n", octNum);
		System.out.printf("%s\n", Integer.toBinaryString(octNum));

		System.out.println("===================");
		System.out.printf("[%d]\n", octNum);
		System.out.printf("[%5d]\n", octNum);
		System.out.printf("[%-5d]\n", octNum);
		System.out.printf("[%05d]\n", octNum);

		System.out.println("===================");
		System.out.printf("[%o]\n", octNum);
		System.out.printf("[%5o]\n", octNum);
		System.out.printf("[%-5o]\n", octNum);
		System.out.printf("[%05o]\n", octNum);
		System.out.printf("[%#-5o]\n", octNum);
		System.out.printf("[%#5o]\n", octNum);
		System.out.printf("[%#05o]\n", octNum);

	}

	public static void PrintReverseTriangle() {
		int height = 5;
		int weight = height * 2 - 1;
		for (int i = 0; i < height; i++) {

			for (int j = 0; j < weight; j++) {
				if (i <= j && j <= weight - 1 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();

		}
	}

}
