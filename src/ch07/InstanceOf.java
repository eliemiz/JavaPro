package ch07;

public class InstanceOf {

	public static void main(String[] args) {

		TestCar car = null;
		
		TestFireEngine fe = new TestFireEngine();
		car = fe;
		doWork(car);
		
		TestAmbulance am = new TestAmbulance();
		car = am;
		doWork(car);
		
				
		
	}

	static void doWork(TestCar c) {
		// 참조하고 있는 인스턴스의 실제 타입 검사
		if (c instanceof TestFireEngine) {
			TestFireEngine fe = (TestFireEngine) c;
			fe.foo();

		} else if (c instanceof TestAmbulance) {
			TestAmbulance a = (TestAmbulance) c;
			a.foo();
		}
	}

}

class TestCar {

}

class TestFireEngine extends TestCar {
	void foo() {
		System.out.println("This is FireEngine");
	}

}

class TestAmbulance extends TestCar {
	void foo() {
		System.out.println("This is Ambulance");
	}
}