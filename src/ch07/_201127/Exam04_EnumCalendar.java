package ch07._201127;

import java.util.Calendar;

enum Week {
	TEMP, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Exam04_EnumCalendar {
	public static void main(String[] args) {
		Week today = null;

		Calendar cal = Calendar.getInstance(); // 오늘 날짜를 가져옴
		int week = cal.get(Calendar.DAY_OF_WEEK); // 해당 타입의 fields에 들어있는 값을 가져옴
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

		System.out.println("오늘 요일 : " + today + ", " + today.ordinal());

		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 한다.");
		} else {
			System.out.println("자바 공부를 한다.");
		}
	}
}
