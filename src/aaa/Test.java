package aaa;

// 패키지 경로(aaa)에서 javac Test.java
// 또는 src 경로에서 javac aaa/Test.java
// src 경로에서 java aaa.Test
// java -cp C:\Users\SIST78\ELIE\workspace\JavaPro\src aaa.Test
// 위와 같이 class path를 직접 지정해줄 수 있다.
// .classpath 파일에 class path가 지정되어있음.

public class Test {
	public static void main(String[] args) {

		System.out.println("Test입니다.");

		for (String test : args) {
			System.out.println(test);
		}

	}

}
