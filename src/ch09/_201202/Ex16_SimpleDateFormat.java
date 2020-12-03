package ch09._201202;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex16_SimpleDateFormat {
	public static void main(String[] args) {

		// Date Ŭ���� �⺻ ���
		Date now = new Date();
		System.out.println(now);

		// SimpleDateFormat�� �̿��� Date�� Ư�� �������� ���
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		System.out.println(sf.format(now));

		// ��¥�� SimpleDateFormat�� �°� �Ľ� �� ���
		Date date = null;
		String strDate = "1990-02-11";
		sf = new SimpleDateFormat("yyyy-MM-dd");

		try {
			date = sf.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println(date);
		sf = new SimpleDateFormat("yyyy-MM-dd�� E�����Դϴ�");
		System.out.println(sf.format(date));

	}
}
