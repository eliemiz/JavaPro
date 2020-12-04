package ch11._201204;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex04_ArrayListComparableComparator {
	public static void main(String[] args) {

		List<ComparablePerson> list = new ArrayList<ComparablePerson>();
		list.add(new ComparablePerson("ȫ�浿", 10));
		list.add(new ComparablePerson("ȫ�浿", 10));
		list.add(new ComparablePerson("ȫ�浿", 30));
		list.add(new ComparablePerson("������", 10));
		list.add(new ComparablePerson("������", 16));
		list.add(new ComparablePerson("���", 20));
		System.out.println(list);

		// public static <T extends Comparable<? super T>> void sort(List<T> list) {...}
		Collections.sort(list); // ComparablePerson�� Comparable<Person>�� ���������Ƿ� sort ����
		System.out.println(list);

		// Comparable�� �������� �ʾ� ordered ���� �ʴ� Ŭ���� Person
		List<Person> list2 = new ArrayList<Person>();
		list2.add(new Person("ȫ�浿", 10));
		list2.add(new Person("ȫ�浿", 10));
		list2.add(new Person("ȫ�浿", 30));
		list2.add(new Person("������", 10));
		list2.add(new Person("������", 16));
		list2.add(new Person("���", 20));
		System.out.println(list2);

		// public static <T> void sort(List<T> list, Comparator<? super T> c) {...}
		// � ����Ʈ�� Comparator�� ����Ŭ������ ��ü�� ��������? ���� �����ϰ� ��.
		Collections.sort(list2, new OtherClass());
		System.out.println(list2);

	}
}
