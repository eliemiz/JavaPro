package ch03_Operator;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		
		final double PI = 3.141592;
		
		System.out.println("반지름을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		
		System.out.println("둘레는 " + 2 * PI * r + "입니다.");
		System.out.println("면적은 " + PI * r * r + "입니다.");
	
//		System.out.println("둘레 : " + 2 * Math.PI * r);
//		System.out.println("면적 : " + Math.PI * Math.pow(r, 2));
		
		
		
	}
	
	
}
