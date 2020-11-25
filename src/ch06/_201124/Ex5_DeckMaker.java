package ch06._201124;

// card1 객체 생성
// kind = Heart, number = 1로 초기화하기
// card1 출력
// card2 객체 생성
// kind = Spade, number = 1로 초기화
// card2 출력
// Card의 가로와 세로를 (50,80)으로 변경하기
// card1 출력하기
// card2 출력하기

class Card {
	String kind;
	int number;

	static int width;
	static int height;

	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + ", width=" + width + ", height=" + height + "]";
	}

}

public class Ex5_DeckMaker {
	public static void main(String[] args) {
		Card card1 = new Card();
		card1.kind = "Heart";
		card1.number = 1;
		System.out.println(card1);

		Card card2 = new Card();
		card2.kind = "Spade";
		card2.number = 1;
		System.out.println(card2);

		Card.width = 50;
		Card.height = 80;

		System.out.println(card1);
		System.out.println(card2);
	}
}
