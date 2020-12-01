package ch09.book;

class Person {
	long id;

	@Override
	public boolean equals(Object obj) {
		// id만 같으면 같은 사람이라고 반환하도록 함
		if (obj instanceof Person) {
			return id == ((Person) obj).id;
		} else {
			return false;
		}
	}

	Person(long id) {
		this.id = id;
	}
}

public class Ex02_Equals {
	public static void main(String[] args) {
		Person p1 = new Person(1010);
		Person p2 = new Person(1010);

		// 서로 다른 주소 참조
		if (p1 == p2) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		} else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}

		// 서로 다른 주소를 참조하지만, overriding에 의해 같은 id는 같은 사람으로 인정
		if (p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		} else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
	}
}
