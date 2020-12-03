package ch09._201202;

import java.io.File;
import java.text.MessageFormat;
import java.util.Scanner;

public class Ex09_ParseFromFile {
	public static void main(String[] args) throws Exception {

		String tableName = "CUST_INFO";
		String fileName = "src/ch09/_201202ex/ParseData.txt";
		String message = "INSERT INTO " + tableName + " VALUES ({0},{1},{2},{3})";

		Scanner scan = new Scanner(new File(fileName));

		String pattern = "{0},{1},{2},{3}";
		MessageFormat mf = new MessageFormat(pattern);
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			Object[] objs = mf.parse(line);
			System.out.println(MessageFormat.format(message, objs));
		}

	}
}
