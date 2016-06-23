package com.code.hard;

public class ShuffleDeckOfCards {

	public static void main(String[] args) {
	
		int[] cards = new int[52];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i+1;
		}
		System.out.println("Intial Deck of Cards");
		for (int i = 0; i < cards.length; i++) {
			System.out.print(cards[i]+"\t");
		}
		
		cards = shuffleCards(cards);
		
		System.out.println("\nShuffled Deck of Cards");
		for (int i = 0; i < cards.length; i++) {
			System.out.print(cards[i]+"\t");
		}
		
	}

	public static int[] shuffleCards(int[] cards)
	{
		for (int i = 0; i < cards.length; i++) {
			int random = randomNumber(0, i);
			int temp = cards[i];
			cards[i] = cards[random];
			cards[random] = temp;
		}
		return cards;
	}
	
	public static int randomNumber(int lower, int higher)
	{
		return (lower + (int)(Math.random()* (higher-lower+1)));
	}
}
