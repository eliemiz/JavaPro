package ch09._201202;

class Circle implements Cloneable {
	Point p;
	double r;

	Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}

	// 얕은 복사
	// 참조형 변수는 주소만 복사
	public Circle shallowCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {

		}

		return (Circle) obj;
	}

	// 깊은 복사
	// 참조형 변수는 객체를 새로 생성한 후 값을 복사
	public Circle deepCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {

		}

		Circle c = (Circle) obj;
		c.p = new Point(this.p.x, this.p.y);

		return c;
	}

	@Override
	public String toString() {
		return "[p = " + p + ", r = " + r + "]";
	}
}

public class Ex10_ShallowCopyDeepCopy {
	public static void main(String[] args) {
		Circle c = new Circle(new Point(5, 5), 10);
		Circle c1 = c.shallowCopy();
		Circle c2 = c.deepCopy();
		
		System.out.println("c.p == c1.p :" + (c.p == c1.p));
		System.out.println("c.p == c2.p :" + (c.p == c2.p));
		
		System.out.println("===============================");
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("===============================");

		c1.p.x = 10;
		c1.p.y = 10;

		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);

	}
}
