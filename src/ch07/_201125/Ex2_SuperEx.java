package ch07._201125;

class Parent {
	int x;

	Parent(int x) {
		this.x = x;
	}
}

class Child extends Parent {
	int y;

	// �θ� Ŭ������ �ش� �����ڰ� ���� ������ ��� �Ұ�
//	Child(){
//	}
	
	Child() {
		super(10);
	}
}

public class Ex2_SuperEx {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.x);
	}
}
