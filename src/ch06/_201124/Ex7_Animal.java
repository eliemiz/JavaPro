package ch06._201124;

// main �޼��忡�� Animal Ŭ������ ��ü ������ �ǵ��� �����ڸ� �����ϱ�
// ������� : name, age
// ��� : ������:26
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
		Animal a = new Animal("������", 26);
		System.out.println(a);
	}
}
