package ch08._201130;

public class Ex05_CustomException {
	public static void main(String[] args) {
		try {
			throw new Exception("Custom Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
