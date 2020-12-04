package ch11._201204;

import java.util.SortedSet;
import java.util.TreeSet;

// Set > SortedSet > TreeSet
// Set : 중복불가
// SortedSet : 정렬됨
// 제네릭 클래스는 Comparable 인터페이스를 구현한 클래스만 TreeSet의 요소로 저장 가능
// 정렬 관련 인터페이스
// Comparable : 기본 정렬방식 지정 할때 사용
// Comparator : 기본 정렬방식을 추가로 변경할 때 사용

public class Ex07_TreeSet {
	public static void main(String[] args) {

		SortedSet<String> set = new TreeSet<>();
//		set = new TreeSet<>(new Descending());	// 내림차순(8.0 이전 버전)
//		set = new TreeSet<>(Comparator.reverseOrder());	// 내림차순(8.0 이후 버전)

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
