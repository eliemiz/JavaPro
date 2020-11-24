package ch04;

import java.util.Scanner;

// if, switch
// for, while, do-while
// foreach�� for(int i : arr) ���� ������

public class ConditionAndLoop {

	public static void main(String[] args) {

//		IfEx1();
//		SwitchEx1();
//		foreachEx();
//		SwitchEx2();
//		LoopEx1();
//		LoopEx2();
//		LoopEx3();
//		LoopEx4();
//		LoopEx5();
		LoopEx6();
		
		
	}

	public static void IfEx1() {

		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int score = scan.nextInt();

		if (score >= 60) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("������ ������.");
		}

		if (score >= 90) {
			System.out.println("A�����Դϴ�.");
		} else if (score >= 80) {
			System.out.println("B�����Դϴ�.");
		} else if (score >= 70) {
			System.out.println("C�����Դϴ�.");
		} else if (score >= 60) {
			System.out.println("D�����Դϴ�.");
		} else {
			System.out.println("F�����Դϴ�.");
		}

	}

	public static void SwitchEx1() {

		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int score = scan.nextInt();

		String grade;
		switch (score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}

		System.out.println(grade + "����");
	}

	public static void foreachEx() {
		String[] arr = new String[] { "First", "Second", "Third", "Fourth", "Fifth" };

		for (String value : arr) {
			System.out.println(value);
		}
	}

	public static void SwitchEx2() {

		int i = 1;
		switch (i) {
		case 1:
			System.out.println(i);
			break;
		case 2:
			System.out.println(i);
			break;
		default:
			System.out.println(i);
			break;
		}

		byte b = 1;
		switch (b) {
		case 1:
			System.out.println(b);
			break;
		case 2:
			System.out.println(b);
			break;
		// case 128: // ���� ���̶� int�� -> �Ұ���
		default:
			System.out.println(b);
			break;
		}

		short sh = 1;
		switch (sh) {
		case 1:
			System.out.println(sh);
			break;
		case 2:
			System.out.println(sh);
			break;
		case 'a': // literal�̶� ����
		default:
			System.out.println(sh);
			break;
		}

		char c = 'A';
		switch (c) {
		// case (char)i: // ���� �Ұ���
		case 'a':
			System.out.println(c);
			break;
		case 'b':
			System.out.println(c);
			break;
		case 65: // literal�̶� ����
		default:
			System.out.println(c);
			break;
		}

		String s = "a";
		switch (s) {
		case "a":
			System.out.println(s);
			break;
		case "b":
			System.out.println(s);
			break;
		default:
			System.out.println(s);
			break;
		}

//		long l = 10;				// long, float, double, boolean�� switch �Ұ���
//		switch (l) {
//		}

	}

	public static void LoopEx1() {

		// default
		System.out.println("[Default]");
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.print(5);
		System.out.println();

		// for
		System.out.println("[for������ ����ϱ�]");
		for (int i = 1; i <= 5; i++) {
			System.out.print(i);
		}
		System.out.println();

		// while
		System.out.println("[while������ ����ϱ�]");
		int i = 1;
		while (i <= 5) {
			System.out.print(i);
			i++;
		}
		System.out.println();

		// do-while
		System.out.println("[do-while������ ����ϱ�]");
		i = 1;
		do {
			System.out.print(i);
			i++;
		} while (i <= 5);
		System.out.println();

	}

	public static void LoopEx2() {

		int sum = 0;

		System.out.println("[for]");
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1���� 10������ �� : " + sum);

		System.out.println("[while]");
		sum = 0;
		int i = 1;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("1���� 10������ �� : " + sum);

		System.out.println("[do-while]");
		sum = 0;
		i = 1;
		do {
			sum += i;
			i++;
		} while (i <= 10);
		System.out.println("1���� 10������ �� : " + sum);

	}

	public static void LoopEx3() {

		for (int i = 2; i <= 9; i++) {
			System.out.printf("%d��\t", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d\t", i, j, i * j);
			}
			System.out.println();
		}

	}

	public static void LoopEx4() {

		int answer = (int) (Math.random() * 100) + 1;

		Scanner scan = new Scanner(System.in);
		int input;
		int count = 0;

		do {
			System.out.println("1 ~ 100 ������ ������ �Է��Ͻÿ� : ");
			input = scan.nextInt();

			if (input > answer) {
				System.out.println("���� ���Դϴ�.");
			} else if (input < answer) {
				System.out.println("ū ���Դϴ�.");
			} else {
				System.out.println("�����Դϴ�.");
			}

			count++;

		} while (answer != input);

		System.out.println("Ƚ�� : " + count);

	}

	public static void LoopEx5() {

		System.out.println("[continue]");
		for (int i = 2; i <= 9; i++) {
			System.out.printf("%d��\t", i);
			for (int j = 1; j <= 9; j++) {
				if (j == 5) {
					continue;
				}

				System.out.printf("%d * %d = %2d\t", i, j, i * j);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("[break]");
		for (int i = 2; i <= 9; i++) {
			System.out.printf("%d��\t", i);
			for (int j = 1; j <= 9; j++) {
				if (j == 5) {
					break;
				}

				System.out.printf("%d * %d = %2d\t", i, j, i * j);
			}
			System.out.println();
		}

	}

	public static void LoopEx6() {
		int sum = 0;
		int count = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("���ڸ� �Է��Ͻÿ�(����:99999) : ");

		while (true) {

			int num = scan.nextInt();

			if (num == 99999) {
				break;
			}

			sum += num;
			count++;
		}

		System.out.println("���� : " + sum);
		System.out.println("��� : " + (double) sum / count);
	}

}
