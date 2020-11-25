package ch07._201125;

public class Ex5_Polymorphism {
	public static void main(String[] args) {
		AutoBike auto1 = new AutoBike(2);

		auto1.power();
		System.out.println(auto1.drive());
		System.out.println(auto1.stop());

		System.out.println("====================");

		Bike bike = auto1;	// 부모클래스가 자식클래스의 인스턴스를 참조(up-casting)

//		bike.power();	// 부모 자신은 자식클래스의 메서드를 안 가지고 있으므로
		System.out.println(bike.drive());
		System.out.println(bike.stop());

		System.out.println("====================");

		AutoBike auto2 = (AutoBike) bike;	// 자식클래스가 부모클래스의 인스턴스를 참조(down-casting) 

		auto2.power();	// 자식클래스는 부모의 메서드를 가지고 있으므로 
		System.out.println(auto2.drive());
		System.out.println(auto2.stop());
	
	}
}
