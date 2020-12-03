package ch09._201202;

// StringBuffer는 리터럴 대입 불가
// 메소드 append()로 추가해야 함
// append()시 참조형 변수가 바뀌지 않음

public class Ex15_StringBuffer {
	public static void main(String[] args) {

//		StringBuffer sb = "123";	// 리터럴 대입 불가
		StringBuffer sb = new StringBuffer("012");
		StringBuffer sb2 = sb.append(34); // sb와 sb2가 동일주소
		sb.append(56).append(78);
		sb2.append(9.0);

		System.out.println("sb = " + sb);
		System.out.println("sb2 = " + sb2);

		System.out.println("sb.deleteCharAt = " + sb.deleteCharAt(10));
		System.out.println("sb.delete = " + sb.delete(3, 6)); // start(포함)부터 end(미포함)까지 삭제
		System.out.println("sb.insert = " + sb.insert(3, "abc")); // index번째에 문자열 삽입
		System.out.println("sb.replace = " + sb.replace(6, sb.length(), "END")); // start(포함)부터 end(미포함)까지를 문장열 교체
		System.out.println("capacity = " + sb.capacity()); // 현재 용량. 기본적으론 초기 문자열 길이 + 16byte. 문자열이 길어짐에 따라 늘어난다.
		System.out.println("length = " + sb.length());

	}
}
