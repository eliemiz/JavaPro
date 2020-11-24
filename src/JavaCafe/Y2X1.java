package JavaCafe;

public class Y2X1 {

	public static void main(String[] args) {

		int[][] arr = new int[30][30];

		for (int y = arr.length - 1; y >= 0; y--) {
			for (int x = 0; x < arr[y].length; x++) {

				String result;
				if (y == 0 && x == 0) {
					result = "¦«";

				} else if (y == 0) {
					result = "¦¡";
				} else if (x == 0) {
					result = "¦¢";
				} else {
					result = " ";
				}

				if (y == 2 * x + 1) {
					result = "*";
				}

				System.out.print(result);

			}
			System.out.println();
		}

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.println(" ");
//			}
//		}

	}

}
