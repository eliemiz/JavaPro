package ch06;

public class Ex04_LocalVal {

	static String grade2; // ��� ���� �� Ŭ���� ����

	public static void main(String[] args) {

		int num = 0; // ���� ������ �ݵ�� �ʱ�ȭ�Ǿ�� ��
		boolean b = true; // ���� ����

		if (b) {
			num = 100;
		}

		System.out.println(num);

		String grade; // �ʱ�ȭ ������ ������ �� �Ʒ����� ����� �� ����
		int score = 80;

		switch (score / 10) {
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "A";
			break;
		case 7:
			grade = "A";
			break;
		case 6:
			grade = "A";
			break;
		default:
			grade = "F";
		}

		System.out.println("���� : " + grade);
		System.out.println("���� : " + grade2); // ��� ������ �⺻������ ���� �ʱ�ȭ ��.

	}

}
