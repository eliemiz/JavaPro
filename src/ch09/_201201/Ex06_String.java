package ch09._201201;

public class Ex06_String {
	public static void main(String[] args) {
		String str = new String("ABCDEFGH");

		System.out.println(str.charAt(4)); // index번째 문자 출력

		System.out.println(str.compareTo("abc")); // 문자열 비교
		System.out.println(str.compareToIgnoreCase("abcdefgh")); // 대소문자 무시하고 문자열 비교

		System.out.println(str.concat("abc")); // 문자열 붙이기
		System.out.println(str + "abc"); // 문자열 붙이기

		System.out.println(str.startsWith("AB")); // 해당 문자열로 시작하는지?
		System.out.println(str.endsWith("GH")); // 해당 문자열로 끝나는지?

		System.out.println(str.equals("abcdefgh")); // 해당 문자열과 같은지?
		System.out.println(str.equalsIgnoreCase("abcdefgh")); // 대소문자 무시하고 해당 문자열과 같은지?

		str = new String("This is a String");
		
		System.out.println(str.indexOf('i')); // 문자의 위치 리턴
		System.out.println(str.indexOf('i', 5)); // index번째 이후(포함) 문자의 위치 리턴
		System.out.println(str.indexOf('i', 15)); // 출현하지 않으면 -1 리턴

		System.out.println(str.indexOf("is")); // 문자열의 위치 리턴
		System.out.println(str.indexOf("is", 3)); // index번째 이후(포함) 문자열의 위치 리턴
		System.out.println(str.lastIndexOf("is")); // 뒤쪽부터 검색하여 문자열의 위치 리턴
		
		System.out.println(str.length());

		System.out.println(str.replace("is", "QR")); // 문자열 치환

		System.out.println(str.substring(5)); // beginIndex 이후(포함)의 문자열
		System.out.println(str.substring(5, 13)); // beginIndex 이후(포함) endIndex 이전(포함 안함)의 문자열
		
		System.out.println(str.toLowerCase());	// 소문자로
		System.out.println(str.toUpperCase());	// 대문자로
		System.out.println(new String("test         ").trim() + "string");	// trim : 후공백 없앤 문자열
	}
}
