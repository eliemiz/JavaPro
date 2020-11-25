package ch06._201124;

// card1 ��ü ����
// kind = Heart, number = 1�� �ʱ�ȭ�ϱ�
// card1 ���
// card2 ��ü ����
// kind = Spade, number = 1�� �ʱ�ȭ
// card2 ���
// Card�� ���ο� ���θ� (50,80)���� �����ϱ�
// card1 ����ϱ�
// card2 ����ϱ�

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
