package ch07;

// 포함관계 테스트

class Card {
	final static int KIND_MAX = 4;
	final static int NUM_MAX = 13;

	final static int CLOVER = 1;
	final static int HEART = 2;
	final static int DIAMOND = 3;
	final static int SPADE = 4;

	int kind;
	int number;

	Card() {
		this(SPADE, 1);
	}

	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() {
		String[] kinds = { "", "CLOVER", "HEART", "DIAMOND", "SPADE" };
		String numbers = "0123456789XJQK";

		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
	}
}

class Deck {
	final int CARD_NUM = 52;
	Card cardArr[] = new Card[CARD_NUM];

	Deck() {
		int i = 0;

		for (int k = Card.KIND_MAX; k > 0; k--) {
			for (int n = 0; n < Card.NUM_MAX; n++) {
				cardArr[i] = new Card(k, n + 1);
				i++;
			}
		}
	}

	Card pick() {
		int index = (int) (Math.random() * CARD_NUM);
		return pick(index);
	}

	Card pick(int index) {
		return cardArr[index];
	}

	void shuffle() {
		for (int i = 0; i < cardArr.length; i++) {
			int r = (int) (Math.random() * CARD_NUM);

			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Deck deck = new Deck();
		Card card = deck.pick(0);
		System.out.println(card);

		deck.shuffle();
		card = deck.pick(0);
		System.out.println(card);

	}
}
