package ch09._201203;

// Wrapper 클래스
// Boxing, Unboxing
// 다른 타입의 언박싱은 가능
// 다른 타입의 박싱은 불가

public class Ex10_Wrapper {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = 100;

		int i3 = i1; // 언박싱

		double d1 = i1; // 다른 타입의 언박싱은 가능
		Double d2 = (double) i3; // 다른 타입의 박싱은 불가(같은 타입(기본형)으로 캐스팅해야 함)
//		Double d3 = (Double) i1;	// 상속관계가 아니므로 클래스 타입의 캐스팅은 불가

		Integer i4 = (int) d1; // 캐스팅해야 함
//		Integer i5 = d2; // 캐스팅 조차 안됨

		System.out.println("i1 == i2 : " + (i1 == i2));
		System.out.println("i1.equals(i2) : " + i1.equals(i2));
		System.out.println("i1.compareTo(i2) = " + i1.compareTo(i2));
		System.out.println("i1.toString() = " + i1.toString());
		System.out.println("MAX_VALUE = " + i1.MAX_VALUE);
		System.out.println("MIN_VALUE = " + i1.MIN_VALUE);
		System.out.println("SIZE = " + i1.SIZE);
		System.out.println("BYTES = " + i1.BYTES);
		System.out.println("TYPE = " + i1.TYPE);
	}
}
