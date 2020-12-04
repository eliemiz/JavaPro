package ch11._201204;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex09_HashMap {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] names = { "ȫ�浿", "���", "�̸���", "�Ӳ���", "���" };
		int[] nums = { 1234, 4567, 2350, 9870, 3456 };

		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}

		System.out.println(map);
		System.out.println("ȫ�浿�� ��ȣ :" + map.get("ȫ�浿"));
		System.out.println("�̸����� ��ȣ :" + map.get("�̸���"));
		System.out.println("����� ��ȣ :" + map.get("���"));
		System.out.println();

		System.out.println("key�鸸 ��ȸ�ϱ�");
		Collection<String> keys = map.keySet();
		for (String k : keys) {
			System.out.println(k + "�� ��ȣ : " + map.get(k));
		}
		System.out.println();

		System.out.println("Value�鸸 ��ȸ�ϱ�");
		Collection<Integer> values = map.values();
		for (Integer v : values) {
			System.out.println(v);
		}
		System.out.println();

		System.out.println("key, value ��ü�� ��ȸ");
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for (Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + "�� ��ȣ : " + m.getValue());
			System.out.println(m);
		}

	}
}
