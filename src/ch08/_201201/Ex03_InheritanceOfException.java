package ch08._201201;

class MyException2 extends Exception {
}

class MyException3 extends MyException2 {
}

public class Ex03_InheritanceOfException {
	public static void main(String[] args) {
		try {
			throw new MyException2();
		}
		// 부모 Exception이 위에 가면 unreachable에러 뜸. 아래로 못가고 위에서 다 처리하기 때문에
//		catch (MyException2 e) {
//
//		} 
		catch (MyException3 e) {

		} catch (MyException2 e) {

		} catch (Exception e) {

		}
	}
}
