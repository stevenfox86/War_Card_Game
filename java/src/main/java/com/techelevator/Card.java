package com.techelevator;

public abstract class Card {
	
//	private members/ instance vars
	private String suit;
	private int rank;
	private String name;
	private boolean faceUp;
	private final int QUANTITY;
	
//	getters
	
//	one more method which is abstract to play a "sound" for every suit 
	 
	public String getSuit() {
		return suit;
	}
	
	public int getRank() {
		return rank;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isFaceUp() {
		return faceUp;
	}
	
	public int getQuantity() {
		return QUANTITY;
	}
	
	public String getCardName() {
		String cardName = getName() + " of " + getSuit();
		return cardName;
	}
	
//	constructor
	public Card (int rank, String suit, String name) {
		this.suit = suit;
		this.rank = rank;
		this.name = name;
		this.faceUp = false;
		this.QUANTITY =1;
	}
	
	
}
