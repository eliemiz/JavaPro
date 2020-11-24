package JavaCafe;

// 점과 직선 사이의 거리 공식
// 점의 좌표를 (x1,y1), 직선을 ax + by + c = 0 이라 할 때,
// d = (|a*x1 + b*y1 + c|) / 루트(a^2 + b^2)

public class DistanceProblem {

	final static int[][] arr = { { 5, 3, 14, 16, 23, 25, 9 }, { 27, 10, 2, 22, 19, 21, 16 } };
	final static int X_MAX = 30;
	final static int Y_MAX = 30;

	public static void main(String[] args) {

		// 화면에 점 출력하기
		for (int y = X_MAX - 1; y >= 0; y--) {
			for (int x = 0; x < 30; x++) {
				String result = " ";
				if (y == x) {
					result = "*";
				}

				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						if (x == arr[0][j] && y == arr[1][j]) {
							result = Integer.toString(j + 1);
						}
					}
				}

				System.out.print(result);
			}

			System.out.println();
		}

		// 특정 a,b,c값이 있다 쳤을 때

		int q = 0;
		int w = 0;
		int e = 0;
		double min = Double.MAX_VALUE;
		int range = 10;
		for (int a = -range; a < range; a++) {
			for (int b = -range; b < range; b++) {
				for (int c = -range; c < range; c++) {

					double sum = 0;
					for (int i = 0; i < arr[0].length; i++) {
						// d = (|a*x1 + b*y1 + c|) / 루트(a^2 + b^2)
						double d = (double) Math.abs(a * arr[0][i] + b * arr[1][i] + c)
								/ Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//						System.out.println(d);

						sum += d;
					}

					System.out.printf("%2d %2d %2d %f\n", a, b, c, sum);
//					min = (sum < min) ? sum : min;
					if (sum < min) {
						min = sum;
						q = a;
						w = b;
						e = c;
					}

				}
			}
		}

		System.out.println("result is..." + min);
		System.out.printf("%d\t%d\t%d", q, w, e);

	}
}
