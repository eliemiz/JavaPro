package ch09._201203;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// �⺻ API? 534������

public class Ex09_Calander {
	public static void main(String[] args) {
		int year = 2020;
		int month = 12;
		int START_DATE_OF_WEEK = 0; // ������
		int END_DAY = 0; // ����

		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();

		// ���� 0���� 11�����̹Ƿ� month - 1
		sDay.set(year, month - 1, 1);
		// ���� �� 1�Ͽ��� �Ϸ� ���� ���� �� ������ ��
		eDay.set(year, month, 1);
		eDay.add(Calendar.DATE, -1);

		START_DATE_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK); // 1���� ���� ��������?
		END_DAY = eDay.get(Calendar.DATE); // ���������� ��������

		System.out.println("\t  " + year + "�� " + month + "��");
		System.out.println(" SUN MON TUE WED THU FRI SAT");

		// ���� 1���� �������̶�� ������ �� �� ��´�.
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
