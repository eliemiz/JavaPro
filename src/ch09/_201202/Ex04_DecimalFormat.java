package ch09._201202;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex04_DecimalFormat {
	public static void main(String[] args) {
		DecimalFormat df1 = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("000,000");

		try {
			Number num = df1.parse("1,234.56");
			
			// ÀÌ°Ç NumberFormatException
//			double d0 = Double.parseDouble("1,234.56");
			double d = num.doubleValue();
			System.out.println(d + " -> " + df2.format(num));

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
