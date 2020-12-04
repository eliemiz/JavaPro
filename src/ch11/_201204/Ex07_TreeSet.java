package ch11._201204;

import java.util.SortedSet;
import java.util.TreeSet;

// Set > SortedSet > TreeSet
// Set : �ߺ��Ұ�
// SortedSet : ���ĵ�
// ���׸� Ŭ������ Comparable �������̽��� ������ Ŭ������ TreeSet�� ��ҷ� ���� ����
// ���� ���� �������̽�
// Comparable : �⺻ ���Ĺ�� ���� �Ҷ� ���
// Comparator : �⺻ ���Ĺ���� �߰��� ������ �� ���

public class Ex07_TreeSet {
	public static void main(String[] args) {

		SortedSet<String> set = new TreeSet<>();
//		set = new TreeSet<>(new Descending());	// ��������(8.0 ���� ����)
//		set = new TreeSet<>(Comparator.reverseOrder());	// ��������(8.0 ���� ����)

		String from = "bat";
		String to = "d";
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("azz");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		System.out.println(set);
		System.out.println("from : " + from + ", to : " + to);
		System.out.println(set.subSet(from, to));
		System.out.println("from : " + from + ", to : " + to + "zzzz");
		System.out.println(set.subSet(from, to + "zzzz"));
	}
}
