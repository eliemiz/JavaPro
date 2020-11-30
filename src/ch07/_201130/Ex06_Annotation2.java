package ch07._201130;

import java.util.ArrayList;

public class Ex06_Annotation2 {
	// deprecation 관련 경고를 억제
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		NewClass nc = new NewClass();

		nc.oldField = 10;
		System.out.println(nc.getOldField());

		//
		@SuppressWarnings("unchecked")
		ArrayList<NewClass> list = new ArrayList<>();
		list.add(nc);
	}
}
