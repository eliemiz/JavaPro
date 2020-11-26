package ch07._201126;

class FinalValue {
	final int NUM;
	final int NUM2 = 100;

	FinalValue(int num) {
		NUM = num; // 생성자에서 딱 한 번 변경 가능
//		NUM2 = 100;	// 명시적 초기화 해 준 상수는 변경 불가
	}

	FinalValue() {
		this(100);
	}

	public int getNum() {
		return NUM;
	}
}

public class Ex01_FinalValue {
	public static void main(String[] args) {
		FinalValue f1 = new FinalValue();
//		f1.NUM = 200;	// NUM은 상수이기 때문에 변경 불가
		System.out.println(f1.getNum());

		FinalValue f2 = new FinalValue(200);
		System.out.println(f2.getNum());
	}
}
