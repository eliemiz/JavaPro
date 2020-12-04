package ch11._201204;

import java.util.Comparator;
import java.util.TreeSet;

// Comparable 인터페이스 : 추상메서드 compareTo(Object o)
// 						클래스의 기본 정렬방식을 지정
// Comparator 인터페이스 : 추상메서드 compare(Object o1, Object o2)
// 						기본 정렬 방식대로 정렬하지 않고, 사용자가 임의로 정렬 방식을 지정

class Phone implements Comparable<Phone> {
	String name;
	int number;

	public Phone(String name, int number) {
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return "(" + name + ", " + number + ")";
	}

	@Override
	public int compareTo(Phone o) {
		return name.compareTo(o.name);
	}
}

public class Ex08_TreeSetComparableComparator {
	public static void main(String[] args) {

		TreeSet<Phone> set = new TreeSet<>();
		System.out.println("이름 순으로 출력");
		Print(set);

		System.out.println("전화번호 순으로 출력");
		// Use Anonymous Class
		set = new TreeSet<>(new Comparator<Phone>() {
			@Override
			public int compare(Phone o1, Phone o2) {
				return o1.number - o2.number;
			}
		});
		Print(set);

		System.out.println("이름 역순으로 출력");
		set = new TreeSet<>(Comparator.reverseOrder());
		Print(set);

		System.out.println("전화번호 역순으로 출력");
		set = new TreeSet<>(new Comparator<Phone>() {
			@Override
			public int compare(Phone o1, Phone o2) {
				return o2.number - o1.number;
			}
		});
		Print(set);

	}

	private static void Print(TreeSet<Phone> set) {
		set.add(new Phone("홍길동", 1234));
		set.add(new Phone("김삿갓", 3456));
		set.add(new Phone("이몽룡", 5678));
		System.out.println(set);
		System.out.println("======================================");
	}
}
