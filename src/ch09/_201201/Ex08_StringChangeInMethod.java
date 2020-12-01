package ch09._201201;

// String 값에 따라 주소가 설정됨.
// str의 주소가 값의 입력에 따라 바뀐다.

public class Ex08_StringChangeInMethod {
	public static void main(String[] args) {

		String str = "ABC";

		System.out.println("main : " + str);

		str = change(str); // 주소 재설정
		System.out.println("change() 이후 main : " + str);

		System.out.println("===========================");

		change(str); // 주소 재설정 하지 않음
		System.out.println("change() 이후 main(재설정 안함) : " + str);

		System.out.println("===========================");

		str = "12345678";
		System.out.println(str.substring(3));
		str = str.substring(3);
		System.out.println(str);
	}

	static String change(String str1) {
		str1 += "456";
		System.out.println("change() str : " + str1);
		return str1;
	}
}
