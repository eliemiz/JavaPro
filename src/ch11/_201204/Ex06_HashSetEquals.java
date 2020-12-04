package ch11._201204;

import java.util.HashSet;
import java.util.Set;

// ��ü �ߺ��� �������� �Ǵ��ϴ� ����(���� ��ü)
// equals(Object)   ����� true
// hashCode() ����� ����
// �� ���� �޼��尡 Object�� ��� �޼����̹Ƿ�
// equals(), hashCode(), toString() �޼��� �������̵�

public class Ex06_HashSetEquals {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();

		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("ȫ�浿", 10)); // 100
		set.add(new Person("ȫ�浿", 10)); // 200 (�ٸ� �ּ� ����)
		System.out.println(set);
		Person p1 = new Person("���", 20);
		Person p2 = p1; // ���� �ּ� ����
		set.add(p1);
		set.add(p2); // ���� ��ü�̹Ƿ� add���� ����
		System.out.println(set);

		System.out.println("====================================");

		Set<Object> set2 = new HashSet<Object>();

		set2.add(new String("abc"));
		set2.add(new String("abc"));
		set2.add(new EqualPerson("ȫ�浿", 10));
		set2.add(new EqualPerson("ȫ�浿", 10)); // �������̵��� ���� ���ü ó�������Ƿ� add �ȵ�.
		System.out.println(set2);
		EqualPerson p3 = new EqualPerson("���", 20);
		EqualPerson p4 = p3; // ���� �ּ� ����
		set2.add(p3);
		set2.add(p4); // ���� ��ü�̹Ƿ� add���� ����
		System.out.println(set2);

	}
}
