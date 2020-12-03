package ch09._201202;

import java.util.Random;

// Random class 
// nextInt(100) : 0 이상 100 미만의 난수 발생

public class Ex12_Random {
	public static void main(String[] args) {
		
		Random rand = new Random();
		rand.setSeed(1);
		System.out.println("rand => ");
		for (int i = 0;i < 5;i++) {
			System.out.println(i + " : " + rand.nextInt(100));
		}
		
		System.out.println();

		Random rand2 = new Random();
		rand2.setSeed(System.currentTimeMillis());
		System.out.println("rand2 => ");
		for (int i = 0;i < 5;i++) {
			System.out.println(i + " : " + rand2.nextInt(100));
		}
	}
}
