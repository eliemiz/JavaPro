package ch09._201203;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// 기본 API? 534페이지

public class Ex09_Calander {
	public static void main(String[] args) {
		int year = 2020;
		int month = 12;
		int START_DATE_OF_WEEK = 0; // 시작일
		int END_DAY = 0; // 끝일

		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();

		// 월은 0부터 11까지이므로 month - 1
		sDay.set(year, month - 1, 1);
		// 다음 월 1일에서 하루 빼면 지금 월 마지막 날
		eDay.set(year, month, 1);
		eDay.add(Calendar.DATE, -1);

		START_DATE_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK); // 1일이 무슨 요일인지?
		END_DAY = eDay.get(Calendar.DATE); // 마지막날이 몇일인지

		System.out.println("\t  " + year + "년 " + month + "월");
		System.out.println(" SUN MON TUE WED THU FRI SAT");

		// 만일 1일이 수요일이라면 공백을 세 번 찍는다.
		String blank = "    ";
		for (int i = 1; i < START_DATE_OF_WEEK; i++) {
			System.out.print(blank);
		}

		for (int i = 1, n = START_DATE_OF_WEEK; i <= END_DAY; i++, n++) {
			System.out.print(String.format("%4d", i));
			if (n % 7 == 0) {
				System.out.println();
			}
		}

	}
}
