package ch09._201201;

class Animal {
	String name;
	int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
//		return getClass().getName() + "@" + Integer.toHexString(hashCode());
		return "name : " + name + ", age : " + age;
	}
}

class Temp {
}

public class Ex04_ToString {
	public static void main(String[] args) {
		Animal a1 = new Animal("È£¶ûÀÌ", 20);
		System.out.println(a1);
		
		//getClass().getName() + "@" + Integer.toHexString(hashCode())
		System.out.println(new Temp());
	}
}
