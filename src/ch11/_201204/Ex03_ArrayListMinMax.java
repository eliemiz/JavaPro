package ch11._201204;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// ���� ������ �Է� �ް�, �� �� Ȧ���� �ڿ����鸸 ���� ���ϰ�
// Ȧ�� �� �ִ밪, �ּҰ� ����ϱ�
// �ִ밪�� �ε���, �ּҰ��� �ε��� ����ϱ�

public class Ex03_ArrayListMinMax {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ڿ����� ������ �Է��ϼ���(���� : 0) : ");
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		while (true) {
			int num = scan.nextInt();
			if (num % 2 == 1) {
				list.add(num);
				sum += num;
			} else if (num == 0) {
				break;
			}
		}
		System.out.println("�Էµ� Ȧ�� : " + list);
		System.out.println();

		System.out.println("Ȧ���� �� : " + sum);

		int min = Collections.min(list);
		int max = Collections.max(list);
		System.out.println("min : " + min + ", index : " + list.indexOf(min));
		System.out.println("max : " + max + ", index : " + list.indexOf(max));

	}
}
