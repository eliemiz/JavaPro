package ch09.book;

// hashCode() : ã���� �ϴ� ���� �Է��ϸ�, �� ���� ����� ��ġ�� �˷��ִ� �ؽ��ڵ�(hashCode)�� ��ȯ

public class Ex03_HashCode {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1.equals(str2));

		// String Ŭ������ ���ڿ��� ������ ������ ������ �ؽ��ڵ带 ��ȯ�ϵ���
		// hashCode() �Լ��� �������̵� �Ǿ��� ������ �׻� ������ �ؽ��ڵ尪�� ��´�.
		System.out.println(str1.hashCode()); // 96354
		System.out.println(str2.hashCode()); // 96354

		// identityHashCode()�� ��ü�� �ּҰ����� �ؽ��ڵ带 �����ϱ� ������,
		// ��� ��ü�� ���� �׻� ���� �ٸ� �ؽ��ڵ� ���� ��ȯ�� ���� �����Ѵ�.
		System.out.println(System.identityHashCode(str1)); // 2070529722
		System.out.println(System.identityHashCode(str2)); // 1188753216
	}
}
