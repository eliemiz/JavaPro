package ch07._201130;

class Outer2 {
	// 외부 클래스의 private 멤버
	private static int outerCv = 20;
	private int outerIv = 10;

	// static, non-static 변수 테스트
	static class StaticInner {
		static int scv = outerCv; // static 간에 사용 가능
		int siv = new Outer2().outerIv; // non-static 변수 사용을 위해 외부클래스의 객체 생성 후 참조
	}

	class InstanceInner {
		int iiv2 = outerCv; // static은 이미 있으므로 사용 가능
		int iiv = outerIv; // instance 간에 사용 가능
	}

	// static, non-static 객체 생성 테스트
	static StaticInner cv = new StaticInner(); // 바로 객체 생성 가능
	static InstanceInner cv2 = new Outer2().new InstanceInner(); // 외부클래스의 객체 생성 후 해당 레퍼런스로 내부클래스 객체 생성
	InstanceInner iv = new InstanceInner(); // 바로 객체 생성 가능
//	StaticInner iv2 = new StaticInner(); // 치명적 에러!!!!!!!!!!!!! StackOverflow Error!

	void method(int pv) {
		int i = 0;
		// 지역 내부클래스에서 사용되는 메서드의 지역변수는 상수화(final)되어야 한다.
//		pv++;
//		i++;
		outerIv++;

		class LocalInner {
			int liv1 = outerIv;
			int liv2 = outerCv;

			void method() {

				/// 상수이기 때문에 에러
//				i++;
//				pv++;

				// 외부클래스의 private 변수 접근 가능
				System.out.println("i = " + i);
				System.out.println("pv = " + pv);
				System.out.println("지역 내부클래스의 변수 : " + liv1 + ", " + liv2);
				System.out.println("외부 클래스의 private 변수 : " + outerIv + ", " + outerCv);

			}
		}

		LocalInner li = new LocalInner();
		li.method();
	}

}

public class Ex02_ModifierOfInnerClass {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.method(1);

		// Instance 클래스의 생성 방법에 주목
		Outer2.InstanceInner i2 = out.new InstanceInner();
		System.out.println(i2.iiv);
		System.out.println(i2.iiv2);

		Outer2.StaticInner i3 = new Outer2.StaticInner();
		System.out.println(i3.siv); // instance 변수는 객체 생성 후 사용
		System.out.println(Outer2.StaticInner.scv); // static 변수는 바로 사용

	}
}
