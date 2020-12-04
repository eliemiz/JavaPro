package ch11._201204;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

// map.put()
// map.containsKey()
// map.get()

public class Ex10_HashTable {
	public static void main(String[] args) {

		Map<String, String> map = new Hashtable<String, String>();

		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���");
			System.out.println("���̵� : ");
			String id = scan.nextLine();
			System.out.println("��й�ȣ : ");
			String pw = scan.nextLine();
			System.out.println();
			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			} else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
		}

	}

}
