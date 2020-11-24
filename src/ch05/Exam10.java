package ch05;

// 5�� �л��� ������ ������ �л����� ����, ����� ����ϰ�,
// ���� ������ ��� ����ϱ�

public class Exam10 {

	public static void main(String[] args) {
		int score[][] = { { 100, 80, 90 }, { 80, 95, 100 }, { 60, 65, 70 }, { 85, 70, 75 }, { 90, 90, 80 } };

		System.out.printf("\t\t����\t����\t����\t����\t���\n");

		// �� �л� ��
		for (int i = 0; i < score.length; i++) {

			// �� ���ϱ�
			int sum = 0;
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}

			// ����ϱ�
			System.out.printf("%d�� �л� : \t", i + 1);
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%d\t", score[i][j]);
			}
			System.out.printf("%d\t%f\n", sum, (double) sum / score[i].length);

		}
		System.out.println();

		// ���� ����
		int korean = 0;
		int english = 0;
		int math = 0;
		for (int i = 0; i < score.length; i++) {
			korean += score[i][0];
			english += score[i][1];
			math += score[i][2];
		}

		System.out.printf("���� ����) ���� : %d, ���� : %d, ���� : %d\n", korean, english, math);
		System.out.printf("���� ���) ���� : %f, ���� : %f, ���� : %f\n", (double) korean / score.length,
				(double) english / score.length, (double) math / score.length);
	}
}
