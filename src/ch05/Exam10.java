package ch05;

// 5명 학생의 국영수 점수를 학생별로 총점, 평균을 출력하고,
// 과목별 총점과 평균 출력하기

public class Exam10 {

	public static void main(String[] args) {
		int score[][] = { { 100, 80, 90 }, { 80, 95, 100 }, { 60, 65, 70 }, { 85, 70, 75 }, { 90, 90, 80 } };

		System.out.printf("\t\t국어\t영어\t수학\t총점\t평균\n");

		// 각 학생 별
		for (int i = 0; i < score.length; i++) {

			// 합 구하기
			int sum = 0;
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}

			// 출력하기
			System.out.printf("%d번 학생 : \t", i + 1);
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%d\t", score[i][j]);
			}
			System.out.printf("%d\t%f\n", sum, (double) sum / score[i].length);

		}
		System.out.println();

		// 과목 총점
		int korean = 0;
		int english = 0;
		int math = 0;
		for (int i = 0; i < score.length; i++) {
			korean += score[i][0];
			english += score[i][1];
			math += score[i][2];
		}

		System.out.printf("과목 총점) 국어 : %d, 영어 : %d, 수학 : %d\n", korean, english, math);
		System.out.printf("과목 평균) 국어 : %f, 영어 : %f, 수학 : %f\n", (double) korean / score.length,
				(double) english / score.length, (double) math / score.length);
	}
}
