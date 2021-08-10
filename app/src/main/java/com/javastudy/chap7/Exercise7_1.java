package com.javastudy.chap7;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	// 생성자
	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);

			cards[i] = new SutdaCard(num, isKwang);
		}
	}

	// shuffle 배열 cards에 담긴 위치를 섞는다.
	public void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int j = (int) (Math.random() * cards.length);

			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}

	// 배열 cards에서 지정된 위치의 SutdaCard를 반환
	public SutdaCard pick(int index) {
		return cards[index];
	}

	// 배열 cards에서 임의의 위치의 SutdaCard를 반환
	public SutdaCard pick() {
		int ran_pick = (int) (Math.random() * cards.length);
		return cards[ran_pick];
	}
}

class SutdaCard {
	final int NUM;
	final boolean IS_KWANG;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int NUM, boolean isKwang) {
		this.NUM = NUM;
		this.IS_KWANG = isKwang;
	}

	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return NUM + (IS_KWANG ? "K" : "");
	}
}

class Exercise7_1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println();
		System.out.println(deck.pick(0));
	}
}
