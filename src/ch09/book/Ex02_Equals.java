package ch09.book;

class Person {
	long id;

	@Override
	public boolean equals(Object obj) {
		// id�� ������ ���� ����̶�� ��ȯ�ϵ��� ��
		if (obj instanceof Person) {
			return id == ((Person) obj).id;
		} else {
			return false;
		}
	}

	Person(long id) {
		this.id = id;
	}
}

public class Ex02_Equals {
	public static void main(String[] args) {
		Person p1 = new Person(1010);
		Person p2 = new Person(1010);

		// ���� �ٸ� �ּ� ����
		if (p1 == p2) {
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		} else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
		}

		// ���� �ٸ� �ּҸ� ����������, overriding�� ���� ���� id�� ���� ������� ����
		if (p1.equals(p2)) {
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		} else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
		}
	}
}
