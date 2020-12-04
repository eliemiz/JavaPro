package ch11._201204;

import java.util.HashSet;
import java.util.Set;

// 객체 중복을 논리적으로 판단하는 기준(동등 객체)
// equals(Object)   결과가 true
// hashCode() 결과가 동일
// 두 개의 메서드가 Object의 멤버 메서드이므로
// equals(), hashCode(), toString() 메서드 오버라이딩

public class Ex06_HashSetEquals {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();

		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("홍길동", 10)); // 100
		set.add(new Person("홍길동", 10)); // 200 (다른 주소 참조)
		System.out.println(set);
		Person p1 = new Person("김삿갓", 20);
		Person p2 = p1; // 같은 주소 참조
		set.add(p1);
		set.add(p2); // 동등 객체이므로 add되지 않음
		System.out.println(set);

		System.out.println("====================================");

		Set<Object> set2 = new HashSet<Object>();

		set2.add(new String("abc"));
		set2.add(new String("abc"));
		set2.add(new EqualPerson("홍길동", 10));
		set2.add(new EqualPerson("홍길동", 10)); // 오버라이딩에 의해 동등객체 처리했으므로 add 안됨.
		System.out.println(set2);
		EqualPerson p3 = new EqualPerson("김삿갓", 20);
		EqualPerson p4 = p3; // 같은 주소 참조
		set2.add(p3);
		set2.add(p4); // 동등 객체이므로 add되지 않음
		System.out.println(set2);

	}
}
