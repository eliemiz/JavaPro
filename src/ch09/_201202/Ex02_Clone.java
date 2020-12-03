package ch09._201202;

// clone()�� protected�̱� ������ clone() �޼ҵ带 ���� class ���ο��� ����ؾ� �Ѵ�.
// clone()�� �ݵ�� ����ó�� ����� �Ѵ�.

// implements Cloneable ���� ������ CloneNotSupportedException ����
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
