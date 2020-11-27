package ch07._201127;

//[public static final] type constant
//[public abstract] type method();
//[public] default type method() {}
//[public] static type method() {}

interface Printerable {
	int INK = 100; // public static final 생략

	void print(); // public abstract 생략
}

interface Scannerable {
	void scan();
}

interface Faxable {
	String FAX_NO = "010-12345";

	void send(String tel);

	void recv(String tel);
}

// interface 간의 상속은 다중 상속 가능. extends로 상속
interface Complexerable extends Printerable, Scannerable, Faxable {

}

// 아래와 같이 바로 여러 인터페이스들을 구현할 수도 있다.
//class Complexer implements Printerable, Scannerable, Faxable{	
class Complexer implements Complexerable {

	int ink;

	Complexer() {
		ink = INK;
	}

	@Override
	public void print() {
		System.out.println("종이에 출력합니다. 남은 인크량 : " + --ink);
	}

	@Override
	public void scan() {
		System.out.println("이미지를 스캔합니다.");
	}

	@Override
	public void send(String tel) {
		System.out.println(FAX_NO + "에서 " + tel + " 번호로 FAX를 송신.");
	}

	@Override
	public void recv(String tel) {
		System.out.println(tel + "에서 " + FAX_NO + " 번호로 FAX를 수신.");
	}
}

public class Ex02_Interface {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		System.out.println("기본 잉크량 : " + Printerable.INK);
		System.out.println("FAX 번호 : " + Complexerable.FAX_NO);
		com.print();
		com.print();
		com.scan();
		com.recv("02-5678");
		com.send("02-5678");
	}
}
