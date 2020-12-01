package ch09._201201;

// 같은 객체인지 여부는 ==로 구분 가능함
// 같은 내용인지 여부는 equals 메서드를 오버라이딩 해야 함.

class Equal {
	int value;

	Equal(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Equal) {
			Equal e = (Equal) obj;
			return value == e.value;
		} else {
			return false;
		}
	}
}

public class Ex01_Equals {
	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);

		// 서로 다른 객체를 참조
		if (e1 == e2) {
			System.out.println("e1과 e2는 같은 객체임.");
		} else {
			System.out.println("e1과 e2는 다른 객체임.");
		}

		// 서로 다른 객체를 참조하고 있지만, 같은 value를 가지고 있으므로 equals에 의해 같은 객체 처리
		if (e1.equals(e2)) {
			System.out.println("e1과 e2는 같은 내용의 객체임.");
		} else {
			System.out.println("e1과 e2는 다른 내용의 객체임.");
		}
	}
}
