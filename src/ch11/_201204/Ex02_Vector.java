package ch11._201204;

import java.util.List;
import java.util.Vector;

// Vector : Collection Framework ������ ���Ǵ� Ŭ����.
// List�� ���� Ŭ����

public class Ex02_Vector {
	public static void main(String[] args) {

		double num1 = 0.3;
		double num2 = 5.0;

		List<Double> list = new Vector<Double>();
//		((Vector<Double>) list).addElement(10.0);	// addElement() : ���Ϳ��� �ִ� �޼���
		list.add(num1);
		list.add(Math.PI);
		list.add(num2);

		for (Object o : list) {
			System.out.println(o);
		}
		System.out.println("1 : " + list);
		System.out.println();

		int index = list.indexOf(num1);
		if (index >= 0) {
			System.out.println(num1 + "�� ��ġ : " + index);
		} else {
			System.out.println(num1 + "�� list�� �����ϴ�.");
		}

		System.out.println("index of " + num1 + " : " + list.indexOf(num1));
		System.out.println("index of " + num2 + " : " + list.indexOf(num2));
		if (list.contains(num1)) {
			list.remove(num1);
			System.out.println(num1 + " ������.");
		}

		System.out.println("2 : " + list);
		System.out.println();

		System.out.println("index of " + num1 + " : " + list.indexOf(num1));
		System.out.println("index of " + num2 + " : " + list.indexOf(num2));
		System.out.println(list);
	}
}
