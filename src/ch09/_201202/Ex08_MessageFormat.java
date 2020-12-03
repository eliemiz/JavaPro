package ch09._201202;

import java.text.MessageFormat;

// MessageFormat
// data�� �޾� pattern�� �� ������ �ش��ϴ� ���� �Ľ� 

public class Ex08_MessageFormat {
	public static void main(String[] args) throws Exception {
		String[] data = { "INSERT INTO CUST_INFO VALUES ('���ڹ�', '010-1234-5678', '27', '07-09')",
				"INSERT INTO CUST_INFO VALUES ('������', '010-6547-8978', '35', '01-03')" };

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
