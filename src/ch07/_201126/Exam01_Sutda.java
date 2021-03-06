package ch07._201126;

// SutdaCard 20장으로 이루어진 SutdaDeck 클래스 구현
// Sutdadeck
// 멤버변수 : 카드 20장을 저장한 배열
// 생성자 : 카드 20장 생성하여 배열에 저장
// 메서드 void shuffle( 카드 섞기
// SutdaCard pick(int index) index에 해당하는 카드 한장 반환
// SutdaCard pick() : 임의의 칻 ㅡ한장 반환
// SutdaCard 클래스
// 멤버변수 : int nubmer, boolean isKwang
// 생성자 : this 생성자 사용 하기 
// (): number=1, isKwang=true
// (int, boolean) : 멤버변수에 값 저장 
// 메서드 void info : number+isKwang?"K":"" 정보 출력

class SutdaCard {
	int number;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int n, boolean k) {
		number = n;
		isKwang = k;
	}

	@Override
	public String toString() {
		return number + (isKwang ? "K" : "");
	}

	void info() {
		System.out.println(this);
	}

}

class SutdaDeck {
	SutdaCard[] cards;

	SutdaDeck() {
		cards = new SutdaCard[20];
		for (int i = 0; i < 10; i++) {
			cards[2 * i] = new SutdaCard(i + 1, (i + 1 == 1 || i + 1 == 3 || i + 1 == 8) ? true : false);
			cards[2 * i + 1] = new SutdaCard(i + 1, false);
		}
	}

	void Shuffle() {
		for (int i = 0; i < 1000; i++) {
			int p = (int) (Math.random() * 20);
			int n = (int) (Math.random() * 20);

			SutdaCard c = cards[p];
			cards[p] = cards[n];
			cards[n] = c;
		}
	}

	SutdaCard pick(int index) {
		return cards[index];
	}

	SutdaCard pick() {
		return cards[(int) (Math.random() * 20)];
	}

	@Override
	public String toString() {
		String str = "";
		for (SutdaCard c : cards) {
			str += c + "\t";

		}

		return str;
	}

	void info() {
		System.out.println(this);
	}

}

public class Exam01_Sutda {
	public static void main(String[] args) {
		SutdaDeck sd = new SutdaDeck();
		System.out.println(sd);

		sd.Shuffle();
		System.out.println(sd);

		System.out.println(sd.pick());
		System.out.println(sd.pick(10));

	}
}
