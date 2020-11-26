package ch07._201126;

// SutdaCard 20������ �̷���� SutdaDeck Ŭ���� ����
// Sutdadeck
// ������� : ī�� 20���� ������ �迭
// ������ : ī�� 20�� �����Ͽ� �迭�� ����
// �޼��� void shuffle( ī�� ����
// SutdaCard pick(int index) index�� �ش��ϴ� ī�� ���� ��ȯ
// SutdaCard pick() : ������ �� ������ ��ȯ
// SutdaCard Ŭ����
// ������� : int nubmer, boolean isKwang
// ������ : this ������ ��� �ϱ� 
// (): number=1, isKwang=true
// (int, boolean) : ��������� �� ���� 
// �޼��� void info : number+isKwang?"K":"" ���� ���

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
