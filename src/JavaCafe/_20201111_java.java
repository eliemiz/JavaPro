package JavaCafe;

public class _20201111_java {

//	1. 3
//
//	2. 30
//
//	3. 가
//
//	4. #1) pencils / students
//	#2) pencils % students
//
//	5. value / 100 * 100
//
//	6. (lengthTop + lengthBottom) * height / (double)2;
//
//	7. true
//	false
//
//	8. y == 0

	public static void main(String[] args) {

		Ex2();
		Ex3();
		Ex4();
		Ex5();
		Ex6();
		Ex7();
		Ex8();
	}

	public static void Ex2() {
		System.out.println("Ex2");
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
	}

	public static void Ex3() {
		System.out.println("Ex3");
		int score = 85;
		String result = (!(score > 90)) ? "가" : "나";
		System.out.println(result);
	}

	public static void Ex4() {
		System.out.println("Ex4");
		int pencils = 534;
		int students = 30;

		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);

		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);

	}

	public static void Ex5() {
		System.out.println("Ex5");
		int value = 356;
		System.out.println(value / 100 * 100);
	}

	public static void Ex6() {
		System.out.println("Ex6");
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom) * height / (double) 2;
		System.out.println(area);
	}

	public static void Ex7() {
		System.out.println("Ex7");
		int x = 10;
		int y = 5;
		System.out.println((x > 7) && (y <= 5));
		System.out.println((x % 3 == 2) || (y % 2 != 1));

	}

	public static void Ex8() {
		System.out.println("Ex8");
		double x = 5.0;
		double y = 0.0;
		double z = x % y;
		
		if (y == 0.0) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과 : " + result);

		}

	}

}
