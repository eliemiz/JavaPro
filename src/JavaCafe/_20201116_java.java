package JavaCafe;

import java.util.Scanner;

public class _20201116_java {

	public static void main(String[] args) {
//		Ex01();
		Ex02();
	}

	// �¿��Ī ���� �Ǵ�
	static void Ex01() {

		System.out.println("���ڸ� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String str = Integer.toString(num);
		
		boolean isSymmetric = true;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				isSymmetric = false;
				break;
			}
		}

		System.out.println((isSymmetric) ? "�¿��Ī��" : "�¿��Ī�� �ƴ�");

	}

	// �Ǻ���ġ ����
	static void Ex02() {

		
	}

}
