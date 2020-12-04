package ch11._201204;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// <Integer> : ���׸� ǥ��
// List<Integer> : Integer ��ü�� ����Ʈ�� ������
// ArrayList  : �����迭. ���尳�� ���� ��ü ����. ÷�� ��� ����

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
		System.out.println(list); // ArrayList�� toString()�� �������̵� ��.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}

		// List<E> subList(int fromIndex, int toIndex);
		List<Integer> list2 = new ArrayList<Integer>(list.subList(1, 4));
		System.out.println(list2);

		// public static <T extends Comparable<? super T>> void sort(List<T> list) {...}
		Collections.sort(list2); // Integer�� Comparable�� ��ӹ޾� ordered�Ǳ� ������ ����
		System.out.println(list2);
	}
}
