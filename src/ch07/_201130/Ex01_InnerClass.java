package ch07._201130;

// Instance 

class Outer {

	class InstanceInner {
		int iv = 100;
//		static int cv = 200;	// 클래스 멤버를 가질 수 없다.
		final static int MAX = 300;
	}

	static class StaticInner {
		int iv = 400;
		static int cv = 500;
		final static int MAX = 600;
	}

	void method() {
		class LocalInner {
			int iv = 700;
//			static int cv = 800;	// 클래스 멤버를 가질 수 없다.
			final static int MAX = 900;
		}

		LocalInner lc = new LocalInner();
		System.out.println(lc.iv);
		System.out.println(lc.MAX);
		System.out.println(LocalInner.MAX);
	}

	void method2() {
//		LocalInner lc = new LocalInner();	// method() 내에서만 사용 가능
	}
}

public class Ex01_InnerClass {
	public static void main(String[] args) {
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println(si.iv);
		System.out.println(Outer.StaticInner.cv);
		System.out.println(Outer.StaticInner.MAX);
		System.out.println();
		
		Outer outer = new Outer();
		Outer.InstanceInner ii = outer.new InstanceInner();
		System.out.println(ii.iv);
		System.out.println(Outer.InstanceInner.MAX);
		System.out.println();
		
		outer.method();
	}
}
