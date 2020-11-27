package ch07._201127;

import java.util.Calendar;

enum Week {
	TEMP, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Exam04_EnumCalendar {
	public static void main(String[] args) {
		Week today = null;

		Calendar cal = Calendar.getInstance(); // ���� ��¥�� ������
		int week = cal.get(Calendar.DAY_OF_WEEK); // �ش� Ÿ���� fields�� ����ִ� ���� ������
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		default:
			today = Week.TEMP;
			break;
		}

		System.out.println("���� ���� : " + today + ", " + today.ordinal());

		if (today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �Ѵ�.");
		} else {
			System.out.println("�ڹ� ���θ� �Ѵ�.");
		}
	}
}
