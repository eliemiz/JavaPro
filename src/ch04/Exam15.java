package ch04;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int point = 0;

		while (true) {
			System.out.println("����Ʈ�� �Է��Ͻÿ�(1 ~ 999) exit(9999)");

			point = scan.nextInt();

			if (point == 9999) {
				System.out.println("break");
				break;
			}

			System.out.println(point + "��");

			switch (point / 200) {
			case 0:
				System.out.println("��ǰ�� �����ϴ�.");
				break;
			case 4:
				System.out.print("����Ʈ, ");
			case 3:
				System.out.print("�ڵ���, ");
			case 2:
				System.out.print("�ڵ���, ");
			case 1:
				System.out.print("�����");
			}

			System.out.println();
		}
	}

}
