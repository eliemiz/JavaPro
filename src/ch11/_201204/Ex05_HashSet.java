package ch11._201204;

import java.util.HashSet;
import java.util.Set;

// Set : �ߺ� ��ü�� �������� �ʴ´�.
// TreeSet : ordered �Ǿ��־�� ��.

public class Ex05_HashSet {
	public static void main(String[] args) {
		Object[] arr = { "ȫ�浿", 1, "1", "���", "�̸���", "ȫ�浿", "������", "�����", "ȫ�浿", "���" };
		Set<Object> set1 = new HashSet<Object>();
		Set<Object> set2 = new HashSet<Object>();
		Set<Object> set3 = new HashSet<Object>();

		for (int i = 0; i < arr.length; i++) {
			// ������ �� �Ǹ� true, �ߺ� ���� ������ �� �Ǹ� false
			if (!set1.add(arr[i])) {
				if (!set2.add(arr[i])) {
					set3.add(arr[i]);
				}
			}
		}

		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
	}
}
