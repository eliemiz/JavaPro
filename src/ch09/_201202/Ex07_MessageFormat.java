package ch09._201202;

import java.text.MessageFormat;

// MessageFormat class

public class Ex07_MessageFormat {
	public static void main(String[] args) {
		String message = "Name : {0}\nTel : {1}\nAge : {2}\nBirthday : {3}";
		Object[] arguments = { "이자바", "010-1234-5678", "27", "07-09" };

		String result = MessageFormat.format(message, arguments);
		System.out.println(result);

		String tableName = "CUST_INFO";
		String message2 = "INSERT INTO " + tableName + " VALUES (''{0}'', ''{1}'', ''{2}'', ''{3}'')";

		String[][] arguments2 = { { "이자바", "010-1234-5678", "27", "07-09" },
				{ "김프로", "010-6547-8978", "35", "01-03" } };

		for (int i = 0; i < arguments2.length; i++) {
			result = MessageFormat.format(message2, arguments2[i]);
			System.out.println(result);
		}
	}
}
