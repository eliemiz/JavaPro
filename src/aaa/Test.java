package aaa;

// ��Ű�� ���(aaa)���� javac Test.java
// �Ǵ� src ��ο��� javac aaa/Test.java
// src ��ο��� java aaa.Test
// java -cp C:\Users\SIST78\ELIE\workspace\JavaPro\src aaa.Test
// ���� ���� class path�� ���� �������� �� �ִ�.
// .classpath ���Ͽ� class path�� �����Ǿ�����.

public class Test {
	public static void main(String[] args) {

		System.out.println("Test�Դϴ�.");

		for (String test : args) {
			System.out.println(test);
		}

	}

}
