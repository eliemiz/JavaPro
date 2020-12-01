package ch09._201201;

public class Ex07_String {
	public static void main(String[] args) {

		// 특정 regit 기준으로 문자열을 문자열 배열로 파싱
		String str = "HTML-CSS-JavaScript-Java-JSP-Spring";
		String[] subject = str.split("-");
		for (int i = 0; i < subject.length; i++) {
			System.out.println(i + " : " + subject[i]);
		}

		System.out.println("==================");

		str = "홍길동,김삿갓,이몽룡,성춘향,임꺽정";
		String[] names = str.split(",");
		for (String n : names) {
			System.out.println(n);
		}
		System.out.println("전체 인원 수 : " + names.length + "명");

		System.out.println("==================");

		int i = Integer.parseInt("100"); // 문자열을 정수로 파싱
		System.out.println(i + 1);

		double d = Double.parseDouble("100.5"); // 문자열을 실수로 파싱
		System.out.println(d + 0.1);
		System.out.println(++d);

		System.out.println("==================");

		System.out.println(String.format("%.2f", d + 0.125)); // 소수점 둘째자리까지 출력
		System.out.println(String.format("[%10d]", i)); // 공간 10만큼 할당해서 출력
		System.out.println(String.format("16진수 : %X", i)); // 16진수로 출력
		System.out.println(String.format("8진수 : %o", i)); // 8진수로 출력

	}
}
