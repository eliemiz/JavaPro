package ch07;

public class Ex08 {

	public static void main(String[] args) {
		Point3D p3 = new Point3D();
		System.out.println("x = " + p3.x);
		System.out.println("y = " + p3.y);
		System.out.println("z = " + p3.z);
	}
}

class Point2 {
	int x = 10;
	int y = 20;

	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point2 {
	int z = 30;

	Point3D() {
		this(100, 200, 300); // Point3D(int x, int y, int z)를 호출한다.
	}

	Point3D(int x, int y, int z) {
		super(x, y); // Point(int x, int y)를 호출한다.
		this.z = z;
	}
}