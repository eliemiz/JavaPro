package ch06._201124;

// ex5

// Rectangle ��ü�� 3�� ������ �迭�� �����ϰ� ������ ���̿� �ѷ� ����ϱ�

public class Ex4_Rectangle2 {
	public static void main(String[] args) {

		Rectangle[] arr = new Rectangle[3];
		arr[0] = new Rectangle(10, 20);
		arr[1] = new Rectangle(11, 21);
		arr[2] = new Rectangle(12, 22);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "��° �簢���� ���� : ");
			arr[i].area();
			System.out.print(i + "��° �簢���� �ѷ� : ");
			arr[i].length();
		}

	}
}
