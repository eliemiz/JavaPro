package ch07;

// ������
public class Polymorphism {

	public static void main(String[] args) {
		
		// ���� Ÿ������ �ʱ�ȭ
		Television tv = new Television();
		CaptionTv ct = new CaptionTv();
		
		// �θ� Ÿ���� ���������� �ڽ� �ν��Ͻ��� �����ϴ� ���� ����
		// �Ʒ��� ���� ������ ��� CaptionTv���� �������, �޼��带 ����� �� ����.
		Television tv0 = new CaptionTv();
		
		// ���� �ν��Ͻ��� Tv�� ��� �������� ct0�� ��� ������ ���� ������ ������ ����
		// CaptionTv ct0 = new Tv();
		
		// ���������� ����� �� �ִ� ���(�º�)�� ������ �ν��Ͻ��� ���(�캯) �������� ���ų� ����� �Ѵ�.
		// �� �θ� Ÿ���� ���������� �ڽ� Ÿ���� �ν��Ͻ��� ������ �� �ִ�.
		// �� �ڽ� Ÿ���� ���������� �θ� Ÿ���� �ν��Ͻ��� ������ �� ����.
		
		// �ڽ�Ÿ�� -> �θ�Ÿ��(up-casting) : ����ȯ ���� ����
		tv = ct;
		// �θ�Ÿ�� -> �ڽ�Ÿ��(down-casting) : ����ȯ ���� �Ұ�
		ct = (CaptionTv)tv;
		

	}

}

class Tv {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}

class CaptionTv extends Television {
	String text;

	void caption() {
		// foo...
	}
}