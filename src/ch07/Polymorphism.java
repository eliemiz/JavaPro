package ch07;

// 다형성
public class Polymorphism {

	public static void main(String[] args) {
		
		// 같은 타입으로 초기화
		Television tv = new Television();
		CaptionTv ct = new CaptionTv();
		
		// 부모 타입의 참조변수로 자식 인스턴스를 참조하는 것이 가능
		// 아래와 같이 참조할 경우 CaptionTv만의 멤버변수, 메서드를 사용할 수 없다.
		Television tv0 = new CaptionTv();
		
		// 실제 인스턴스인 Tv의 멤버 개수보다 ct0의 멤버 개수가 많기 때문에 컴파일 에러
		// CaptionTv ct0 = new Tv();
		
		// 참조변수가 사용할 수 있는 멤버(좌변)의 개수는 인스턴스의 멤버(우변) 개수보다 같거나 적어야 한다.
		// ★ 부모 타입의 참조변수로 자식 타입의 인스턴스를 참조할 수 있다.
		// ★ 자식 타입의 참조변수로 부모 타입의 인스턴스를 참조할 수 없다.
		
		// 자식타입 -> 부모타입(up-casting) : 형변환 생략 가능
		tv = ct;
		// 부모타입 -> 자식타입(down-casting) : 형변환 생략 불가
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