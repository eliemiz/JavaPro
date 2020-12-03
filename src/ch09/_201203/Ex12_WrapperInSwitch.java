package ch09._201203;

public class Ex12_WrapperInSwitch {
	public static void main(String[] args) {
		Integer data = 1;
		switch (data) {
		case 1:
			System.out.println("성공");
			break;
		default:
			System.out.println("실패");
			break;
		}
	}
}
