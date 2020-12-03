package ch09._201202;

// StringBuffer�� ���ͷ� ���� �Ұ�
// �޼ҵ� append()�� �߰��ؾ� ��
// append()�� ������ ������ �ٲ��� ����

public class Ex15_StringBuffer {
	public static void main(String[] args) {

//		StringBuffer sb = "123";	// ���ͷ� ���� �Ұ�
		StringBuffer sb = new StringBuffer("012");
		StringBuffer sb2 = sb.append(34); // sb�� sb2�� �����ּ�
		sb.append(56).append(78);
		sb2.append(9.0);

		System.out.println("sb = " + sb);
		System.out.println("sb2 = " + sb2);

		System.out.println("sb.deleteCharAt = " + sb.deleteCharAt(10));
		System.out.println("sb.delete = " + sb.delete(3, 6)); // start(����)���� end(������)���� ����
		System.out.println("sb.insert = " + sb.insert(3, "abc")); // index��°�� ���ڿ� ����
		System.out.println("sb.replace = " + sb.replace(6, sb.length(), "END")); // start(����)���� end(������)������ ���忭 ��ü
		System.out.println("capacity = " + sb.capacity()); // ���� �뷮. �⺻������ �ʱ� ���ڿ� ���� + 16byte. ���ڿ��� ������� ���� �þ��.
		System.out.println("length = " + sb.length());

	}
}
