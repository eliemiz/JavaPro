package others;

public class FF {

	public static void main(String[] args) {
		char[][] arr = new char[30][30];

		// y�ప�� ��, x�ప�� ��
		for (int y = 29; y > 0; y--) {
			for (int x = 0; x < 30; x++) {
				if (y == ((2 * x) + 1)) {
					arr[y][x] = '*';
				}
			}
		}

		for (int y = 29; y > 0; y--) {
			System.out.printf("%3d", y); // y�� 1~29 ���� ���
			for (int x = 0; x < 30; x++) // �׷��� ���
			{
				System.out.print(arr[y][x] + " ");
			}
			System.out.println();
		}

		// x�� 0~29 ���� ���
		for (int x = 0; x < arr.length; x++) {
			System.out.printf("%3d", x);
		}

	}

}
