package ch08._201130;

// finally : 정상 실행, 예외 실행됨.
// try, catch에서 return문을 만나도 finally는 실행됨.

public class Ex03_Finally {
	public static void main(String[] args) {
		try {
			System.out.println(1 / 0);
		} catch (Exception e) {
			System.out.println(e);
			return;
		} finally {
			System.out.println("마참내!");
		}
		
		System.out.println("return문을 만났으므로 여긴 출력 안됨.");
	}
}
