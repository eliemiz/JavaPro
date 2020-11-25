package ch07._201125;

public class Ex5_Polymorphism {
	public static void main(String[] args) {
		AutoBike auto1 = new AutoBike(2);

		auto1.power();
		System.out.println(auto1.drive());
		System.out.println(auto1.stop());

		System.out.println("====================");

		Bike bike = auto1;	// �θ�Ŭ������ �ڽ�Ŭ������ �ν��Ͻ��� ����(up-casting)

//		bike.power();	// �θ� �ڽ��� �ڽ�Ŭ������ �޼��带 �� ������ �����Ƿ�
		System.out.println(bike.drive());
		System.out.println(bike.stop());

		System.out.println("====================");

		AutoBike auto2 = (AutoBike) bike;	// �ڽ�Ŭ������ �θ�Ŭ������ �ν��Ͻ��� ����(down-casting) 

		auto2.power();	// �ڽ�Ŭ������ �θ��� �޼��带 ������ �����Ƿ� 
		System.out.println(auto2.drive());
		System.out.println(auto2.stop());
	
	}
}
