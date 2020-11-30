package ch08;

// 다중 catch 구문 예제
// 상속 관계의 Exception은 조상이 아래에 있어야 함.(더 세분화된 예외를 처리하기 위함)
// 그렇지 않을 경우
// Unreachable catch block for RuntimeException. 
// It is already handled by the catch block for Exception 

public class Ex02_MultipleCatch {
	public static void main(String[] args) {
		try {

//			System.out.println(args[0]);

//			System.out.println(1 / 0);

//			String str = null;
//			System.out.println(str.charAt(0));
			
			String str2 = "test";
			int num = Integer.parseInt(str2);
					
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("1 : " + e);
		} catch (ArithmeticException e) {
			System.out.println("2 : " + e);
		} catch (NullPointerException e) {
			System.out.println("3 : " + e);
		} catch (NumberFormatException e) {
			System.out.println("4 : " + e);
		} catch (RuntimeException e) {
			System.out.println("5 : " + e);
		} catch (Exception e) {
			System.out.println("6 : " + e);
		}

	}
}
