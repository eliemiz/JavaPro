package ch09._201202;

import java.util.StringTokenizer;

// String을 구분자(delimiter)를 기준으로 잘라 쓰는 것
// StringTokenizer : 문자열을 구분자로 쪼갠 후 처리
// hasMoreToken() : 다음 토큰이 있는지 체크
// nextToken() : 다음 토큰 문자열 반환

public class Ex11_StringTokenizer {
	public static void main(String[] args) {

		String source = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
		StringTokenizer st = new StringTokenizer(source, "|");

		while (st.hasMoreTokens()) {
			String token = st.nextToken();

			StringTokenizer st2 = new StringTokenizer(token, ",");
			while (st2.hasMoreTokens()) {
				System.out.println(st2.nextToken());
			}

			System.out.println("------------");
		}

	}
}
