package ch09._201202;

import java.text.MessageFormat;

// MessageFormat
// data를 받아 pattern의 빈 영역에 해당하는 값을 파싱 

public class Ex08_MessageFormat {
	public static void main(String[] args) throws Exception {
		String[] data = { "INSERT INTO CUST_INFO VALUES ('이자바', '010-1234-5678', '27', '07-09')",
				"INSERT INTO CUST_INFO VALUES ('김프로', '010-6547-8978', '35', '01-03')" };

		String pattern = "INSERT INTO CUST_INFO VALUES ({0}, {1}, {2}, {3})";
		MessageFormat mf = new MessageFormat(pattern);

		for (int i = 0; i < data.length; i++) {
			Object[] objs = mf.parse(data[i]);
			for (int j = 0; j < objs.length; j++) {
				System.out.print(objs[j] + ", ");
			}

			System.out.println();
		}
	}

}
