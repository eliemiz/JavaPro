package ch11._201204;

import java.util.Comparator;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " = " + age;
	}
}

// name이 같으면 동등 객체가 되도록 equals()와 hashCode() 메서드를 오버라이딩
class EqualPerson {
	String name;
	int age;

	EqualPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof EqualPerson) {

			EqualPerson p = (EqualPerson) obj;
			return name.equals(p.name) && age == p.age;

		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	@Override
	public String toString() {
		return name + " = " + age;
	}
}

class ComparablePerson implements Comparable<ComparablePerson> {
	String name;
	int age;

	ComparablePerson(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " = " + age;
	}

	@Override
	public int compareTo(ComparablePerson o) {
		return age - o.age;
	}
}

//Comparable을 구현하지 않아서 소트 불가능한 클래스를 소트 가능하게 만들어줌
class OtherClass implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		return o1.age - o2.age;
	}
}

public class Classes {

}
