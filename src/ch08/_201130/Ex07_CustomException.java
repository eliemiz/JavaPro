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

			System.out.print("���̵� �Է��Ͻÿ� : ");
			Scanner scan = new Scanner(System.in);
			String inputId = scan.nextLine();
			System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
			String inputPw = scan.nextLine();

			if (id.equals(inputId) && pw.equals(inputPw)) {
				System.out.println("�α��� ����");
			} else if (!id.equals(inputId)) {
				throw new LoginFailException("���̵� Ʋ���ϴ�. �ٽ� �α��� �ϼ���.");
			} else {
				throw new LoginFailException("��й�ȣ�� Ʋ���ϴ�. �ٽ� �α��� �ϼ���.");
			}

		} catch (LoginFailException e) {
			e.printStackTrace();
			System.out.println("======== : " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
