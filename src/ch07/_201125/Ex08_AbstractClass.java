package ch07._201125;

abstract class Shape {
	String type;

	Shape(String type) {
		this.type = type;
	}

	abstract double area();

	abstract double length();
}

class Circle extends Shape {
	int radius;

	Circle(int r) {
		super("Circle");
		this.radius = r;
	}

	@Override
	double area() {
		return Math.PI * radius * radius;
	}

	@Override
	double length() {
		return Math.PI * radius * 2;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", type=" + type + "], ≥–¿Ã : " + area() + ", µ—∑π : " + length();
	}
}

class Rectangle extends Shape {
	int width;
	int height;

	Rectangle(int width, int height) {
		super("Rectangle");
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		return width * height;
	}

	@Override
	double length() {
		return 2 * (width + height);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", type=" + type + "], ≥–¿Ã : " + area() + ", µ—∑π : "
				+ length();
	}
}

public class Ex08_AbstractClass {
	public static void main(String[] args) {

		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5, 5);

		for (Shape s : shapes) {
			System.out.println(s);
		}

	}
}
