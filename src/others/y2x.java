
package others;

public class y2x {

	public static void main(String[] args) {

		char[][] arr = new char[30][30];

		for (int y = 29; y >= 0; y--) {
			for (int x = 0; x <= 29; x++) {

				if (y == ((2 * x) + 1)) {
					arr[x][y] = '*';
				}
				System.out.print(arr[x][y]);

			}
			System.out.println();

		}
	}

}
