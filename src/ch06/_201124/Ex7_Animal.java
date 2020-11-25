package ch06._201124;

// main 메서드에서 Animal 클래스의 객체 생성이 되도록 생성자를 구현하기
// 멤버변수 : name, age
// 결과 : 원숭이:26
class Animal {

	String name;
	int age;

	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + " : " + age;
	}
}

public class Ex7_Animal {
	public static void main(String[] args) {
		Animal a = new Animal("원숭이", 26);
		System.out.println(a);
	}
}
