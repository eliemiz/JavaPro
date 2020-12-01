package ch09.book;

// hashCode() : 찾고자 하는 값을 입력하면, 그 값이 저장된 위치를 알려주는 해시코드(hashCode)를 반환

public class Ex03_HashCode {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1.equals(str2));

		// String 클래스는 문자열의 내용이 같으면 동일한 해시코드를 반환하도록
		// hashCode() 함수가 오버라이딩 되었기 때문에 항상 동일한 해시코드값을 얻는다.
		System.out.println(str1.hashCode()); // 96354
		System.out.println(str2.hashCode()); // 96354

		// identityHashCode()는 객체의 주소값으로 해시코드를 생성하기 때문에,
		// 모든 객체에 대해 항상 서로 다른 해시코드 값을 반환할 것을 보장한다.
		System.out.println(System.identityHashCode(str1)); // 2070529722
		System.out.println(System.identityHashCode(str2)); // 1188753216
	}
}
