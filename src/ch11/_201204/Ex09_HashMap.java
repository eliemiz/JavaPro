package ch11._201204;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex09_HashMap {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] names = { "È«±æµ¿", "±è»ñ°«", "ÀÌ¸ù·æ", "ÀÓ²©Á¤", "±è»ñ°«" };
		int[] nums = { 1234, 4567, 2350, 9870, 3456 };

		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}

		System.out.println(map);
		System.out.println("È«±æµ¿ÀÇ ¹øÈ£ :" + map.get("È«±æµ¿"));
		System.out.println("ÀÌ¸ù·æÀÇ ¹øÈ£ :" + map.get("ÀÌ¸ù·æ"));
		System.out.println("±è»ñ°«ÀÇ ¹øÈ£ :" + map.get("±è»ñ°«"));
		System.out.println();

		System.out.println("keyµé¸¸ Á¶È¸ÇÏ±â");
		Collection<String> keys = map.keySet();
		for (String k : keys) {
			System.out.println(k + "ÀÇ ¹øÈ£ : " + map.get(k));
		}
		System.out.println();

		System.out.println("Valueµé¸¸ Á¶È¸ÇÏ±â");
		Collection<Integer> values = map.values();
		for (Integer v : values) {
			System.out.println(v);
		}
		System.out.println();

		System.out.println("key, value °´Ã¼·Î Á¶È¸");
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for (Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + "ÀÇ ¹øÈ£ : " + m.getValue());
			System.out.println(m);
		}

	}
}
