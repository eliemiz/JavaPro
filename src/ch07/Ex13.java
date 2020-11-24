package ch07;

import java.sql.Date;

public class Ex13 {

	public static void main(String[] args) {
		Time t = new Time(12, 35, 30);
		System.out.println(t);
//		t.hour = 13;	// private 멤버변수이므로 접근 불가
	}

}

class Time {
	private int hour, minute, second;

	Time(int hour, int minute, int sec) {

	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			return;
		}

		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			return;
		}

		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			return;
		}

		this.second = second;
	}

}