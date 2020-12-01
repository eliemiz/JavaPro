package ch08._201130;

import java.util.Scanner;

class LoginFailException extends Exception {

	LoginFailException(String msg) {
		super(msg);
	}
}

public class Ex07_CustomException {
	public static void main(String[] args) {
		try {
			String id = "hong";
			String pw = "1234";

			System.out.print("아이디를 입력하시오 : ");
			Scanner scan = new Scanner(System.in);
			String inputId = scan.nextLine();
			System.out.print("비밀번호를 입력하시오 : ");
			String inputPw = scan.nextLine();

			if (id.equals(inputId) && pw.equals(inputPw)) {
				System.out.println("로그인 성공");
			} else if (!id.equals(inputId)) {
				throw new LoginFailException("아이디가 틀립니다. 다시 로그인 하세요.");
			} else {
				throw new LoginFailException("비밀번호가 틀립니다. 다시 로그인 하세요.");
			}

		} catch (LoginFailException e) {
			e.printStackTrace();
			System.out.println("======== : " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
