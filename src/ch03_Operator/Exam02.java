package ch03_Operator;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		
		final double PI = 3.141592;
		
		System.out.println("�������� �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		
		System.out.println("�ѷ��� " + 2 * PI * r + "�Դϴ�.");
		System.out.println("������ " + PI * r * r + "�Դϴ�.");
	
//		System.out.println("�ѷ� : " + 2 * Math.PI * r);
//		System.out.println("���� : " + Math.PI * Math.pow(r, 2));
		
		
		
	}
	
	
}
