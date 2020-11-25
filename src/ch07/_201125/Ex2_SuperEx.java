package ch07._201125;

class Parent {
	int x;

	Parent(int x) {
		this.x = x;
	}
}

class Child extends Parent {
	int y;

	// 부모 클래스는 해당 생성자가 없기 때문에 사용 불가
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
