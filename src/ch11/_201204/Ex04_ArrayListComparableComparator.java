package ch11._201204;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex04_ArrayListComparableComparator {
	public static void main(String[] args) {

		List<ComparablePerson> list = new ArrayList<ComparablePerson>();
		list.add(new ComparablePerson("È«±æµ¿", 10));
		list.add(new ComparablePerson("È«±æµ¿", 10));
		list.add(new ComparablePerson("È«±æµ¿", 30));
		list.add(new ComparablePerson("±èÁ¤¹Î", 10));
		list.add(new ComparablePerson("ÀÌÀ±¹Î", 16));
		list.add(new ComparablePerson("±è»ñ°«", 20));
		System.out.println(list);

		// public static <T extends Comparable<? super T>> void sort(List<T> list) {...}
		Collections.sort(list); // ComparablePersonÀÌ Comparable<Person>À» ±¸ÇöÇßÀ¸¹Ç·Î sort °¡´É
		System.out.println(list);

		// ComparableÀ» ±¸ÇöÇÏÁö ¾Ê¾Æ ordered µÇÁö ¾Ê´Â Å¬·¡½º Person
		List<Person> list2 = new ArrayList<Person>();
		list2.add(new Person("È«±æµ¿", 10));
		list2.add(new Person("È«±æµ¿", 10));
		list2.add(new Person("È«±æµ¿", 30));
		list2.add(new Person("±èÁ¤¹Î", 10));
		list2.add(new Person("ÀÌÀ±¹Î", 16));
		list2.add(new Person("±è»ñ°«", 20));
		System.out.println(list2);

		// public static <T> void sort(List<T> list, Comparator<? super T> c) {...}
		// ¾î¶² ¸®½ºÆ®¸¦ ComparatorÀÇ ±¸ÇöÅ¬·¡½ºÀÇ °´Ã¼¸¦ ±âÁØÀ¸·Î? Á¤·Ä °¡´ÉÇÏ°Ô ÇÔ.
		Collections.sort(list2, new OtherClass());
		System.out.println(list2);

	}
}
