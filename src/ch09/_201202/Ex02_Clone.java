package ch09._201202;

// clone()은 protected이기 때문에 clone() 메소드를 마들어서 class 내부에서 사용해야 한다.
// clone()은 반드시 예외처리 해줘야 한다.

// implements Cloneable 하지 않으면 CloneNotSupportedException 에러
class Point implements Cloneable {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	@Override
	protected Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return obj;
	}
}

public class Ex02_Clone {
	public static void main(String[] args) {
		Point original = new Point(3, 5);
		Point copy = (Point) original.clone();
		System.out.println(original);
		System.out.println(copy);

	}
}
