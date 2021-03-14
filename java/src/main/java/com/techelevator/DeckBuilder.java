package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeckBuilder {

	//instance vars
	List <String []> listOfCards = new ArrayList<>(); 
	List <Card> deck = new ArrayList<>();

	String filePath = "cardDeck.csv";
	File cardDeckFile = new File (filePath);

	// Getter Setters
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public void setCardDeckFile(File cardDeckFile) {
		this.cardDeckFile = cardDeckFile; 
	}
	
	// Methods
	 
	public List<Card> getDeck() {
		return deck;
	}

	// reads CSV
	public List <String []> buildListOfCards() {
		try(Scanner FileScanner = new Scanner(cardDeckFile))
		{
			while (FileScanner.hasNextLine()) {
				String line = FileScanner.nextLine();
				String [] cards = line.split("\\|");
				//('2', 'clubs')
				listOfCards.add(cards);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return listOfCards;
	}

	// instantiates Card objects from String Array List 
	public List <Card> cardDeckCreator(){
		for (String[] listElement : listOfCards) {
			//			STRING [] = ('2', 'hearts')

			if (listElement[1].equalsIgnoreCase("Hearts")){

				if (listElement[0].equalsIgnoreCase("Jack")) {
					Hearts thisHeart = new Hearts(11, listElement[1], "Jack" );
					deck.add(thisHeart);
				}

				else if (listElement[0].equalsIgnoreCase("Queen")) {
					Hearts thisHeart = new Hearts(12, listElement[1], "Queen");
					deck.add(thisHeart);
				}

				else if (listElement[0].equalsIgnoreCase("King")) {
					Hearts thisHeart = new Hearts(13, listElement[1], "King");
					deck.add(thisHeart);
				}

				else if (listElement[0].equalsIgnoreCase("Ace")) {
					Hearts thisHeart = new Hearts(14, listElement[1], "Ace");
					deck.add(thisHeart);
				} 

				else {
					Hearts thisHeart = new Hearts(Integer.parseInt(listElement[0]), listElement[1], listElement[0]);
					//				myHeart = (2, 'heart', '2')
					deck.add(thisHeart);
				}

			}
			if (listElement[1].equalsIgnoreCase("Clubs")){

				if (listElement[0].equalsIgnoreCase("Jack")) {
					Clubs thisClub = new Clubs (11, listElement[1], "Jack");
					deck.add(thisClub);
				}

				else if (listElement[0].equalsIgnoreCase("Queen")) {
					Clubs thisClub = new Clubs (12, listElement[1], "Queen");
					deck.add(thisClub);
				}

				else if (listElement[0].equalsIgnoreCase("King")) {
					Clubs thisClub = new Clubs (13, listElement[1], "King");
					deck.add(thisClub);
				}

				else if (listElement[0].equalsIgnoreCase("Ace")) {
					Clubs thisClub = new Clubs (14, listElement[1], "Ace");
					deck.add(thisClub);
				} 

				else { 
					Clubs thisClub = new Clubs (Integer.parseInt(listElement[0]), listElement[1], listElement[0]);
					deck.add(thisClub);
				}
			}
			if (listElement[1].equalsIgnoreCase("Diamonds")){


				if (listElement[0].equalsIgnoreCase("Jack")) {
					Diamonds thisDiamond = new Diamonds (11, listElement[1], "Jack");
					deck.add(thisDiamond);
				}

				else if (listElement[0].equalsIgnoreCase("Queen")) {
					Diamonds thisDiamond = new Diamonds (12, listElement[1], "Queen");
					deck.add(thisDiamond);
				}

				else if (listElement[0].equalsIgnoreCase("King")) {
					Diamonds thisDiamond = new Diamonds (13, listElement[1], "King");
					deck.add(thisDiamond);
				}

				else if (listElement[0].equalsIgnoreCase("Ace")) {
					Diamonds thisDiamond = new Diamonds (14, listElement[1], "Ace");
					deck.add(thisDiamond);
				} 

				else {
					Diamonds thisDiamond = new Diamonds (Integer.parseInt(listElement[0]), listElement[1], listElement[0]);
					deck.add(thisDiamond);
				}
			}
			if (listElement[1].equalsIgnoreCase("Spades")){


				if (listElement[0].equalsIgnoreCase("Jack")) {
					Spades thisSpade = new Spades (11, listElement[1], "Jack"); 
					deck.add(thisSpade);
				}

				else if (listElement[0].equalsIgnoreCase("Queen")) {
					Spades thisSpade = new Spades (12, listElement[1], "Queen");
					deck.add(thisSpade);
				}

				else if (listElement[0].equalsIgnoreCase("King")) {
					Spades thisSpade = new Spades (13, listElement[1], "King");
					deck.add(thisSpade);
				}

				else if (listElement[0].equalsIgnoreCase("Ace")) {
					Spades thisSpade = new Spades (14, listElement[1], "Ace");
					deck.add(thisSpade);
				} 

				else {
					Spades thisSpade = new Spades (Integer.parseInt(listElement[0]), listElement[1], listElement[0]);
					deck.add(thisSpade);
				}
			}
		}
		return deck;
	}
	
	public void displayDeck() {
		for (Card thisCard : deck) {
			System.out.println(thisCard.getName() + ", " + thisCard.getSuit() + " Quantity: " + thisCard.getQuantity());
		}	
	}


	// OLD METHODS
//	public void displayListOfCardsAsStringArrays() {
//	for (String[] card : listOfCards) {
//		System.out.println(Arrays.toString(card));
//		//			System.out.println(card.toString()); - prints memory location
//	}
//} 
	
//	public void shuffleDeck() {
//	Collections.shuffle(deck);
//}
	
	
	
}