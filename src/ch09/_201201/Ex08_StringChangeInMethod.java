package ch09._201201;

// String ���� ���� �ּҰ� ������.
// str�� �ּҰ� ���� �Է¿� ���� �ٲ��.

public class Ex08_StringChangeInMethod {
	public static void main(String[] args) {

		String str = "ABC";

		System.out.println("main : " + str);

		str = change(str); // �ּ� �缳��
		System.out.println("change() ���� main : " + str);

		System.out.println("===========================");

		change(str); // �ּ� �缳�� ���� ����
		System.out.println("change() ���� main(�缳�� ����) : " + str);

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
