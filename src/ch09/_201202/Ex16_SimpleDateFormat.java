package ch09._201202;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex16_SimpleDateFormat {
	public static void main(String[] args) {

		// Date 클래스 기본 출력
		Date now = new Date();
		System.out.println(now);

		// SimpleDateFormat을 이용해 Date를 특정 포맷으로 출력
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		System.out.println(sf.format(now));

		// 날짜를 SimpleDateFormat에 맞게 파싱 후 출력
		Date date = null;
		String strDate = "1990-02-11";
		sf = new SimpleDateFormat("yyyy-MM-dd");

		try {
			date = sf.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println(date);
		sf = new SimpleDateFormat("yyyy-MM-dd는 E요일입니다");
		System.out.println(sf.format(date));

	}
}
