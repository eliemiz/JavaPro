package ch09._201201;

public class Ex07_String {
	public static void main(String[] args) {

		// Ư�� regit �������� ���ڿ��� ���ڿ� �迭�� �Ľ�
		String str = "HTML-CSS-JavaScript-Java-JSP-Spring";
		String[] subject = str.split("-");
		for (int i = 0; i < subject.length; i++) {
			System.out.println(i + " : " + subject[i]);
		}

		System.out.println("==================");

		str = "ȫ�浿,���,�̸���,������,�Ӳ���";
		String[] names = str.split(",");
		for (String n : names) {
			System.out.println(n);
		}
		System.out.println("��ü �ο� �� : " + names.length + "��");

		System.out.println("==================");

		int i = Integer.parseInt("100"); // ���ڿ��� ������ �Ľ�
		System.out.println(i + 1);

		double d = Double.parseDouble("100.5"); // ���ڿ��� �Ǽ��� �Ľ�
		System.out.println(d + 0.1);
		System.out.println(++d);

		System.out.println("==================");

		System.out.println(String.format("%.2f", d + 0.125)); // �Ҽ��� ��°�ڸ����� ���
		System.out.println(String.format("[%10d]", i)); // ���� 10��ŭ �Ҵ��ؼ� ���
		System.out.println(String.format("16���� : %X", i)); // 16������ ���
		System.out.println(String.format("8���� : %o", i)); // 8������ ���

	}
}
