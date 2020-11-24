package ch06._201124;

// 2020-11-24 11:14 Ex3

class Rectangle {
	int width;
	int height;

	Rectangle(int x, int y) {
		width = x;
		height = y;
	}

	void area() {
		System.out.println(width * height);
	}

	void length() {
		System.out.println(2 * (width + height));
	}
}

public class RectangleEx {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(100, 200);

		r.area();
		r.length();
	}
}
