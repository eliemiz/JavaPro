package ch07._201127;

import java.util.Calendar;

public class Exam05_EnumMethod {
	public static void main(String[] args) {
		Week today = Week.SUNDAY;

		// name() : enum 상수의 이름을 리턴
		String name = today.name();
		System.out.println(name);

		// ordinal() : enum 상수의 값을 리턴
		int ordinal = today.ordinal();
		System.out.println(ordinal);

		System.out.println("======================");

		// compareTo() 메서드 : target과의 상대값을 정수로 표현
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);

		System.out.println("======================");

		// valueOf() 메서드 : String 값에 해당하는 enum상수를 가져온다.
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day.name());
		}

		Week weekDay = Week.valueOf(days[(int) (Math.random() * days.length)].name());
		if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println(weekDay + " 주말이군요.");
		} else {
			System.out.println(weekDay + " 평일이군요.");
		}
	}
}
