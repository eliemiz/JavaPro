package ch07._201130;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention // 어노테이션이 유지되는 범위
(RetentionPolicy.RUNTIME) // 실행 시에 사용 가능하도록 지정
@interface TestInfo {
	int count() default 1;

	String testedBy();

	String[] testTools() default "JUnit";

	TestType testType() default TestType.FIRST;

	DateTime testDate();

}

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime {
	String yymmdd();

	String hhmmss();
}

enum TestType {
	FIRST, FINAL
}

@DateTime(yymmdd = "121212", hhmmss = "151515")	// 복수의 어노테이션 가능
@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd = "160101", hhmmss = "235959"))
public class Ex07_Annotation3 {
	public static void main(String[] args) {
		// Ex07_Annotation3 클래스의 객체를 얻는다
		Class<Ex07_Annotation3> cls = Ex07_Annotation3.class;
		TestInfo anno = (TestInfo) cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy() = " + anno.testedBy());
		System.out.println("anno.testDate().yymmdd() = " + anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss() = " + anno.testDate().hhmmss());
		for (String str : anno.testTools()) {
			System.out.println("testTools = " + str);
			System.out.println();
		}

		Annotation[] annoArr = cls.getAnnotations();
		for (Annotation a : annoArr) {
			System.out.println(a);
		}

	}
}
