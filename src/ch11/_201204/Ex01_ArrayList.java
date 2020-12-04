package ch11._201204;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// <Integer> : 제네릭 표현
// List<Integer> : Integer 객체를 리스트에 저장함
// ArrayList  : 가변배열. 저장개수 몰라도 객체 저장. 첨자 사용 가능

public class Ex01_ArrayList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(0);
		list.add(0);
		System.out.println(list); // ArrayList의 toString()이 오버라이딩 됨.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}

		// List<E> subList(int fromIndex, int toIndex);
		List<Integer> list2 = new ArrayList<Integer>(list.subList(1, 4));
		System.out.println(list2);

		// public static <T extends Comparable<? super T>> void sort(List<T> list) {...}
		Collections.sort(list2); // Integer가 Comparable을 상속받아 ordered되기 때문에 가능
		System.out.println(list2);
	}
}
