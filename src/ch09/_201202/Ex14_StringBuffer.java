package ch09._201202;

public class Ex14_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
//		sb1 + "ddd";	// �̷��� �ȵ�

		System.out.println("sb1 == sb2 : " + (sb1 == sb2));
		System.out.println("sb1.equals(sb2) : " + sb1.equals(sb2));

		String str1 = sb1.toString();
		String str2 = sb2.toString();

		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("======================");
		
		// �̰� true�� ������,
		// ���� sb1.toString()�� sb2.toString()�� �ٸ� id�� �ִ� ���ڿ��� �����ϹǷ� false�� ���.
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("str1 == str2 : " + (str1 == str2));

	}
}
