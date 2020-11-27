package ch07._201127;

import java.util.Calendar;

public class Exam05_EnumMethod {
	public static void main(String[] args) {
		Week today = Week.SUNDAY;

		// name() : enum ����� �̸��� ����
		String name = today.name();
		System.out.println(name);

		// ordinal() : enum ����� ���� ����
		int ordinal = today.ordinal();
		System.out.println(ordinal);

		System.out.println("======================");

		// compareTo() �޼��� : target���� ��밪�� ������ ǥ��
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);

		System.out.println("======================");

		// valueOf() �޼��� : String ���� �ش��ϴ� enum����� �����´�.
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day.name());
		}

		Week weekDay = Week.valueOf(days[(int) (Math.random() * days.length)].name());
		if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println(weekDay + " �ָ��̱���.");
		} else {
			System.out.println(weekDay + " �����̱���.");
		}
	}
}
