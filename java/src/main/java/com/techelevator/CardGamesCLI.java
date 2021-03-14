package com.techelevator;

import java.util.Collections;

import com.techelevator.view.Menu;

public class CardGamesCLI {

//	instance vars
	private static final String MAIN_MENU_OPTION_DISPLAY_DECK = "Display Cards in Deck";
	private static final String MAIN_MENU_OPTION_PICK_GAME = "Pick a Game";
	private static final String Main_MEN_OPTION_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_DECK, MAIN_MENU_OPTION_PICK_GAME, Main_MEN_OPTION_EXIT };
	private Menu menu;
	private static final String PICK_GAME_MENU_GAME1 = "Game 1";
	private static final String PICK_GAME_MENU_WAR_GAME = "WAR";
	private static final String PICK_GAME_MENU_GAME3 = "Game 3";
	private static final String PICK_GAME_MENU_EXIT = "Exit";
	private static final String[] PICK_GAME_MENU_OPTIONS = { PICK_GAME_MENU_GAME1, PICK_GAME_MENU_WAR_GAME, PICK_GAME_MENU_GAME3, PICK_GAME_MENU_EXIT};
	
	// instance variable
	DeckBuilder deckBuilder = new DeckBuilder();
	
//	METHODS
	public CardGamesCLI(Menu menu) {
		this.menu = menu; 
	}

	public void run() {
		
		deckBuilder.buildListOfCards();
		deckBuilder.cardDeckCreator();
	
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
		
			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_DECK)) {
				
				// display cards
				deckBuilder.displayDeck(); 
				System.out.println("Here is the deck!");
			} 
			else if (choice.equals(MAIN_MENU_OPTION_PICK_GAME)) {
				System.out.println("pick a game???");
				
				// SHUFFLE DECK before splitting into 2 decks
				Collections.shuffle(deckBuilder.getDeck());
					
					while (true) {
						
						String subChoice = (String) menu.getChoiceFromOptions(PICK_GAME_MENU_OPTIONS); 
						
						if (subChoice.equals(PICK_GAME_MENU_GAME1)) {
								//					GAME 1 HERE
							System.out.println("game2!!!!!");
						}
						else if (subChoice.equals(PICK_GAME_MENU_WAR_GAME)) {
							
							WarGame warGame = new WarGame();
							
							warGame.makeTwoWarDecks(deckBuilder.getDeck());
							
							warGame.playCards();
							
//							warGame.showDeck(warGame.getPlayerDeck());
//							System.out.println("*************************************");
//							warGame.showDeck(warGame.getComputerDeck());
						//	while(warGame.getComputerDeck().size()>0 )
							
							
								//					  WAR GAME HERE
						//	System.out.println("WarGAME!!!!");
						} 
						else if (subChoice.equals(PICK_GAME_MENU_GAME3)) {
								//					  GAME 3 HERE
							System.out.println("game3!!!!!!");
						}
						else if (subChoice.equals(PICK_GAME_MENU_EXIT)) {
						break;
						}
						
					}
				}	
				
			else if (choice.equals(Main_MEN_OPTION_EXIT)) {
				System.out.println("I hope you enjoyed the WAR!");
				System.exit(1);
			}	
		}		
	}
	

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		CardGamesCLI cli = new CardGamesCLI(menu);
		cli.run();
	}
	
}
