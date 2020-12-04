package ch11._201204;

import java.util.Comparator;
import java.util.TreeSet;

// Comparable �������̽� : �߻�޼��� compareTo(Object o)
// 						Ŭ������ �⺻ ���Ĺ���� ����
// Comparator �������̽� : �߻�޼��� compare(Object o1, Object o2)
// 						�⺻ ���� ��Ĵ�� �������� �ʰ�, ����ڰ� ���Ƿ� ���� ����� ����

class Phone implements Comparable<Phone> {
	String name;
	int number;

	public Phone(String name, int number) {
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return "(" + name + ", " + number + ")";
	}

	@Override
	public int compareTo(Phone o) {
		return name.compareTo(o.name);
	}
}

public class Ex08_TreeSetComparableComparator {
	public static void main(String[] args) {

		TreeSet<Phone> set = new TreeSet<>();
		System.out.println("�̸� ������ ���");
		Print(set);

		System.out.println("��ȭ��ȣ ������ ���");
		// Use Anonymous Class
		set = new TreeSet<>(new Comparator<Phone>() {
			@Override
			public int compare(Phone o1, Phone o2) {
				return o1.number - o2.number;
			}
		});
		Print(set);

		System.out.println("�̸� �������� ���");
		set = new TreeSet<>(Comparator.reverseOrder());
		Print(set);

		System.out.println("��ȭ��ȣ �������� ���");
		set = new TreeSet<>(new Comparator<Phone>() {
			@Override
			public int compare(Phone o1, Phone o2) {
				return o2.number - o1.number;
			}
		});
		Print(set);

	}

	private static void Print(TreeSet<Phone> set) {
		set.add(new Phone("ȫ�浿", 1234));
		set.add(new Phone("���", 3456));
		set.add(new Phone("�̸���", 5678));
		System.out.println(set);
		System.out.println("======================================");
	}
}
