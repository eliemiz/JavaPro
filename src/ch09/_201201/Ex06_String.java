package ch09._201201;

public class Ex06_String {
	public static void main(String[] args) {
		String str = new String("ABCDEFGH");

		System.out.println(str.charAt(4)); // index��° ���� ���

		System.out.println(str.compareTo("abc")); // ���ڿ� ��
		System.out.println(str.compareToIgnoreCase("abcdefgh")); // ��ҹ��� �����ϰ� ���ڿ� ��

		System.out.println(str.concat("abc")); // ���ڿ� ���̱�
		System.out.println(str + "abc"); // ���ڿ� ���̱�

		System.out.println(str.startsWith("AB")); // �ش� ���ڿ��� �����ϴ���?
		System.out.println(str.endsWith("GH")); // �ش� ���ڿ��� ��������?

		System.out.println(str.equals("abcdefgh")); // �ش� ���ڿ��� ������?
		System.out.println(str.equalsIgnoreCase("abcdefgh")); // ��ҹ��� �����ϰ� �ش� ���ڿ��� ������?

		str = new String("This is a String");
		
		System.out.println(str.indexOf('i')); // ������ ��ġ ����
		System.out.println(str.indexOf('i', 5)); // index��° ����(����) ������ ��ġ ����
		System.out.println(str.indexOf('i', 15)); // �������� ������ -1 ����

		System.out.println(str.indexOf("is")); // ���ڿ��� ��ġ ����
		System.out.println(str.indexOf("is", 3)); // index��° ����(����) ���ڿ��� ��ġ ����
		System.out.println(str.lastIndexOf("is")); // ���ʺ��� �˻��Ͽ� ���ڿ��� ��ġ ����
		
		System.out.println(str.length());

		System.out.println(str.replace("is", "QR")); // ���ڿ� ġȯ

		System.out.println(str.substring(5)); // beginIndex ����(����)�� ���ڿ�
		System.out.println(str.substring(5, 13)); // beginIndex ����(����) endIndex ����(���� ����)�� ���ڿ�
		
		System.out.println(str.toLowerCase());	// �ҹ��ڷ�
		System.out.println(str.toUpperCase());	// �빮�ڷ�
		System.out.println(new String("test         ").trim() + "string");	// trim : �İ��� ���� ���ڿ�
	}
}
