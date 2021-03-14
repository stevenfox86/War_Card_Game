package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WarGame {

	// instance variables
	List<Card> playerDeck;
	List<Card> computerDeck; 
	
	int playerScore = 0;
	int computerScore = 0;
	
//	constructor
	public WarGame() {
		this.playerDeck = new ArrayList<>();
		this.computerDeck = new ArrayList<>();
	} 
	
//	getters N setters
	public void setCardToPlayerDeck(Card cardToAdd) {
		this.playerDeck.add(cardToAdd);
	}
	
	
	public void setCardToComputerDeck(Card cardToAdd) {
		this.computerDeck.add(cardToAdd);
	}

	public List<Card> getPlayerDeck() {
		return playerDeck;
	}

	public List<Card> getComputerDeck() {
		return computerDeck;
	}
	
// CANT GET PLAYER SCORE OUT OF SCOPE	
	public int getPlayerScore() {
		return playerScore;
	}
	
	public int getComputerScore() {
		return computerScore;
	}


//	public void playCard() {
//		int playerTopCardValue = playerDeck.get(0).getRank();
//		int computerTopCardValue = computerDeck.get(0).getRank();
//		if (playerTopCardValue > computerTopCardValue) {
//			System.out.println("Player wins with " + playerDeck.get(0).getCardName());
//			System.out.println("Computer lost with " + computerDeck.get(0).getCardName());
//		} else if (computerTopCardValue > playerTopCardValue) {
//			System.out.println("Computer wins with " + computerDeck.get(0).getCardName());
//			System.out.println("Player lost with " + playerDeck.get(0).getCardName());
//		} else if (playerTopCardValue == computerTopCardValue) {
//			System.out.println("WAR!");
//		}
//	}
	
	LogMaker logger = new LogMaker();

	public void playCards() {
		
		
		logger.logEvent("New Game Started!");
		
		
		
		List<Card> playerSideDeck = new ArrayList<>();
		List<Card> computerSideDeck = new ArrayList<>();
		List<Card> warDeck = new ArrayList<>();
		Scanner hitReturn = new Scanner(System.in);
		
		for (int i=0; i<playerDeck.size(); i++) {
			int playerTopCardValue = playerDeck.get(i).getRank();
			int computerTopCardValue = computerDeck.get(i).getRank();
			System.out.println("Card:" + (i+1) );
			if (playerTopCardValue > computerTopCardValue) {
				
				logger.logEvent("Player wins with " + playerDeck.get(i).getCardName());
				logger.logEvent("Computer lost with " + computerDeck.get(i).getCardName());
				logger.logEvent("");
			
				System.out.println("Player wins with " + playerDeck.get(i).getCardName());
				System.out.println("Computer lost with " + computerDeck.get(i).getCardName());
				
				playerScore++;
				System.out.println("Player Score: " + playerScore);
				System.out.println("Computer Score: " + computerScore);
				
				hitReturn.nextLine();
				playerSideDeck.add(playerDeck.get(i));
				playerSideDeck.add(computerDeck.get(i));
				
			} else if (computerTopCardValue > playerTopCardValue) {
				
				logger.logEvent("Computer wins with " + computerDeck.get(i).getCardName());
				logger.logEvent("Player lost with " + playerDeck.get(i).getCardName());
				logger.logEvent("");
				
				System.out.println("Computer wins with " + computerDeck.get(i).getCardName());
				System.out.println("Player lost with " + playerDeck.get(i).getCardName());
				
				computerScore++;
				System.out.println("Player Score: " + playerScore);
				System.out.println("Computer Score: " + computerScore);
				
				hitReturn.nextLine();
				computerSideDeck.add(playerDeck.get(i));
				computerSideDeck.add(computerDeck.get(i));
				
				/// WAR Beginning
				
			} else if (playerTopCardValue == computerTopCardValue) {
				logger.logEvent("WAR!");
				logger.logEvent("Computer has " + computerDeck.get(i).getCardName());
				logger.logEvent("Player has " + playerDeck.get(i).getCardName() + "\n");
				
				
				System.out.println("WAR!");
				System.out.println("Computer has " + computerDeck.get(i).getCardName());
				System.out.println("Player has " + playerDeck.get(i).getCardName());
				System.out.println();
				
				// WAR with 5
				if (playerDeck.size()-i >= 5) {					
					
					warDeck.add(playerDeck.get(i));
					warDeck.add(computerDeck.get(i));
					warDeck.add(playerDeck.get(i+1));
					warDeck.add(computerDeck.get(i+1));
					warDeck.add(playerDeck.get(i+2));
					warDeck.add(computerDeck.get(i+2));
					warDeck.add(playerDeck.get(i+3));
					warDeck.add(computerDeck.get(i+3));
					warDeck.add(playerDeck.get(i+4));
					warDeck.add(computerDeck.get(i+4));
					
					
					System.out.println("Are you ready for the final card?");
					hitReturn.nextLine();
					
					if (playerDeck.get(i+4).getRank() > computerDeck.get(i+4).getRank()) {
						
						logger.logEvent("Player wins war with " + playerDeck.get(i+4).getCardName());
						logger.logEvent("Computer lost war with " + computerDeck.get(i+4).getCardName()+ "\n");
						
						logger.logEvent("Player kept the " + playerDeck.get(i+1).getCardName());
						logger.logEvent("Player kept the " + playerDeck.get(i+2).getCardName());
						logger.logEvent("Player kept the " + playerDeck.get(i+3).getCardName());
						
						logger.logEvent("Computer lost the " + computerDeck.get(i+1).getCardName());
						logger.logEvent("Computer lost the " + computerDeck.get(i+2).getCardName());
						logger.logEvent("Computer lost the " + computerDeck.get(i+3).getCardName());
						logger.logEvent("");
						
						System.out.println("Player wins war with " + playerDeck.get(i+4).getCardName());
						System.out.println("Computer lost war with " + computerDeck.get(i+4).getCardName());
						System.out.println();
						System.out.println("Player kept the " + playerDeck.get(i+1).getCardName());
						System.out.println("Player kept the " + playerDeck.get(i+2).getCardName());
						System.out.println("Player kept the " + playerDeck.get(i+3).getCardName());
						System.out.println();
						System.out.println("Computer lost the " + computerDeck.get(i+1).getCardName());
						System.out.println("Computer lost the " + computerDeck.get(i+2).getCardName());
						System.out.println("Computer lost the " + computerDeck.get(i+3).getCardName());
						
						playerScore+=5;
						System.out.println("Player Score: " + playerScore);
						System.out.println("Computer Score: " + computerScore);
						
						i += 4;

						for (Card warCard : warDeck) {
							playerSideDeck.add(warCard);
						}
						hitReturn.nextLine();
					}
					else {
						
						logger.logEvent("Computer wins war with " + computerDeck.get(i+4).getCardName());
						logger.logEvent("Player lost war with " + playerDeck.get(i+4).getCardName()+ "\n");
						
						logger.logEvent("Computer kept the " + computerDeck.get(i+1).getCardName());
						logger.logEvent("Computer kept the " + computerDeck.get(i+2).getCardName());
						logger.logEvent("Computer kept the " + computerDeck.get(i+3).getCardName());
						
						logger.logEvent("Player lost the " + playerDeck.get(i+1).getCardName());
						logger.logEvent("Player lost the " + playerDeck.get(i+2).getCardName());
						logger.logEvent("Player lost the " + playerDeck.get(i+3).getCardName());
						logger.logEvent("");
						
						System.out.println("Computer wins war with " + computerDeck.get(i+4).getCardName());
						System.out.println("Player lost war with " + playerDeck.get(i+4).getCardName());
						System.out.println();
						System.out.println("Computer kept the " + computerDeck.get(i+1).getCardName());
						System.out.println("Computer kept the " + computerDeck.get(i+2).getCardName());
						System.out.println("Computer kept the " + computerDeck.get(i+3).getCardName());
						System.out.println();
						System.out.println("Player lost the " + playerDeck.get(i+1).getCardName());
						System.out.println("Player lost the " + playerDeck.get(i+2).getCardName());
						System.out.println("Player lost the " + playerDeck.get(i+3).getCardName());

						computerScore+=5;
						System.out.println("Player Score: " + playerScore);
						System.out.println("Computer Score: " + computerScore);
						
						i += 4;
						
						for (Card warCard : warDeck) {
							computerSideDeck.add(warCard);
						}
						hitReturn.nextLine();
						
					}
					
					
					
				} 
				
				// WAR with 4
				
				else if (playerDeck.size()-i >= 4) {
					
					warDeck.add(playerDeck.get(i));
					warDeck.add(computerDeck.get(i));
					warDeck.add(playerDeck.get(i+1));
					warDeck.add(computerDeck.get(i+1));
					warDeck.add(playerDeck.get(i+2));
					warDeck.add(computerDeck.get(i+2));
					warDeck.add(playerDeck.get(i+3));
					warDeck.add(computerDeck.get(i+3));
					
					
					System.out.println("Are you ready for the final card?");
					hitReturn.nextLine();
					
					if (playerDeck.get(i+3).getRank() > computerDeck.get(i+3).getRank()) {
						
						logger.logEvent("Player wins war with " + playerDeck.get(i+3).getCardName());
						logger.logEvent("Computer lost war with " + computerDeck.get(i+3).getCardName()+ "\n");
						
						logger.logEvent("Player kept the " + playerDeck.get(i+1).getCardName());
						logger.logEvent("Player kept the " + playerDeck.get(i+2).getCardName());
						
						logger.logEvent("Computer lost the " + computerDeck.get(i+1).getCardName());
						logger.logEvent("Computer lost the " + computerDeck.get(i+2).getCardName());
						logger.logEvent("");
												
						System.out.println("Player wins war with " + playerDeck.get(i+3).getCardName());
						System.out.println("Computer lost war with " + computerDeck.get(i+3).getCardName());
						System.out.println();
						System.out.println("Player kept the " + playerDeck.get(i+1).getCardName());
						System.out.println("Player kept the " + playerDeck.get(i+2).getCardName());
						System.out.println();
						System.out.println("Computer lost the " + computerDeck.get(i+1).getCardName());
						System.out.println("Computer lost the " + computerDeck.get(i+2).getCardName());

						playerScore+=4;
						System.out.println("Player Score: " + playerScore);
						System.out.println("Computer Score: " + computerScore);
						
						i += 3;

						for (Card warCard : warDeck) {
							playerSideDeck.add(warCard);
						}
						hitReturn.nextLine();
					}
					else {
						
						logger.logEvent("Computer wins war with " + computerDeck.get(i+3).getCardName());
						logger.logEvent("Player lost war with " + playerDeck.get(i+3).getCardName()+ "\n");
						
						logger.logEvent("Computer kept the " + computerDeck.get(i+1).getCardName());
						logger.logEvent("Computer kept the " + computerDeck.get(i+2).getCardName());
												
						logger.logEvent("Player lost the " + playerDeck.get(i+1).getCardName());
						logger.logEvent("Player lost the " + playerDeck.get(i+2).getCardName());
						logger.logEvent("");
												
						System.out.println("Computer wins war with " + computerDeck.get(i+3).getCardName());
						System.out.println("Player lost war with " + playerDeck.get(i+3).getCardName());
						System.out.println();
						System.out.println("Computer kept the " + computerDeck.get(i+1).getCardName());
						System.out.println("Computer kept the " + computerDeck.get(i+2).getCardName());
						System.out.println();
						System.out.println("Player lost the " + playerDeck.get(i+1).getCardName());
						System.out.println("Player lost the " + playerDeck.get(i+2).getCardName());

						computerScore+=4;
						System.out.println("Player Score: " + playerScore);
						System.out.println("Computer Score: " + computerScore);
						
						i += 3;
						
						for (Card warCard : warDeck) {
							computerSideDeck.add(warCard);
						}
						hitReturn.nextLine();
						
					}
					
					
				}
				
				// WAR with 3
				else if (playerDeck.size()-i >= 3) {
					
					warDeck.add(playerDeck.get(i));
					warDeck.add(computerDeck.get(i));
					warDeck.add(playerDeck.get(i+1));
					warDeck.add(computerDeck.get(i+1));
					warDeck.add(playerDeck.get(i+2));
					warDeck.add(computerDeck.get(i+2));
					
					
					System.out.println("Are you ready for the final card?");
					hitReturn.nextLine();
					
					if (playerDeck.get(i+2).getRank() > computerDeck.get(i+2).getRank()) {
						
						logger.logEvent("Player wins war with " + playerDeck.get(i+2).getCardName());
						logger.logEvent("Computer lost war with " + computerDeck.get(i+2).getCardName()+ "\n");
						logger.logEvent("Player kept the " + playerDeck.get(i+1).getCardName());			
						logger.logEvent("Computer lost the " + computerDeck.get(i+1).getCardName());
						logger.logEvent("");
												
						
						System.out.println("Player wins war with " + playerDeck.get(i+2).getCardName());
						System.out.println("Computer lost war with " + computerDeck.get(i+2).getCardName());
						System.out.println();
						System.out.println("Player kept the " + playerDeck.get(i+1).getCardName());
						System.out.println();
						System.out.println("Computer lost the " + computerDeck.get(i+1).getCardName());
					
						playerScore+=3;
						System.out.println("Player Score: " + playerScore);
						System.out.println("Computer Score: " + computerScore);
						
						i += 2;

						for (Card warCard : warDeck) {
							playerSideDeck.add(warCard);
						}
						hitReturn.nextLine();
					}
					else {
						
						logger.logEvent("Computer wins war with " + computerDeck.get(i+2).getCardName());
						logger.logEvent("Player lost war with " + playerDeck.get(i+2).getCardName()+ "\n");
						logger.logEvent("Computer kept the " + computerDeck.get(i+1).getCardName());
						logger.logEvent("Player lost the " + playerDeck.get(i+1).getCardName());
						logger.logEvent("");
						
						
						System.out.println("Computer wins war with " + computerDeck.get(i+2).getCardName());
						System.out.println("Player lost war with " + playerDeck.get(i+2).getCardName());
						System.out.println();
						System.out.println("Computer kept the " + computerDeck.get(i+1).getCardName());
						System.out.println();
						System.out.println("Player lost the " + playerDeck.get(i+1).getCardName());
					
						computerScore+=3;
						System.out.println("Player Score: " + playerScore);
						System.out.println("Computer Score: " + computerScore);
						
						i += 2;
						
						for (Card warCard : warDeck) {
							computerSideDeck.add(warCard);
						}
						hitReturn.nextLine();
					}
					
				}
				// WAR with 2
				else if (playerDeck.size()-i >= 2) {
					
					warDeck.add(playerDeck.get(i));
					warDeck.add(computerDeck.get(i));
					warDeck.add(playerDeck.get(i+1));
					warDeck.add(computerDeck.get(i+1));
					
					
					System.out.println("Are you ready for the final card?");
					hitReturn.nextLine();
					
					if (playerDeck.get(i+1).getRank() > computerDeck.get(i+1).getRank()) {
						
						logger.logEvent("Player wins war with " + playerDeck.get(i+1).getCardName());
						logger.logEvent("Computer lost war with " + computerDeck.get(i+1).getCardName());
						logger.logEvent("");
						
						System.out.println("Player wins war with " + playerDeck.get(i+1).getCardName());
						System.out.println("Computer lost war with " + computerDeck.get(i+1).getCardName());

						playerScore+=2;
						System.out.println("Player Score: " + playerScore);
						System.out.println("Computer Score: " + computerScore);
						
						i +=1;

						for (Card warCard : warDeck) {
							playerSideDeck.add(warCard);
						}
						hitReturn.nextLine();
					}
					else {
						
						logger.logEvent("Computer wins war with " + computerDeck.get(i+1).getCardName());
						logger.logEvent("Player lost war with " + playerDeck.get(i+1).getCardName());
						logger.logEvent("");
						
						System.out.println("Computer wins war with " + computerDeck.get(i+1).getCardName());
						System.out.println("Player lost war with " + playerDeck.get(i+1).getCardName());
					
						computerScore+=2;
						System.out.println("Player Score: " + playerScore);
						System.out.println("Computer Score: " + computerScore);
						
						i +=1;

						for (Card warCard : warDeck) {
							computerSideDeck.add(warCard);
						}
						hitReturn.nextLine();
					}
					
				} 
				// last card of each deck is the war card
				else { 
					playerSideDeck.add(playerDeck.get(i));
					computerSideDeck.add(computerDeck.get(i));
				}
				
			}
		} 
		
		
		
		System.out.println("Player Score: " + playerScore);
		System.out.println("Computer Score: " + computerScore);
	}

	
	
	
	
	public void makeTwoWarDecks(List<Card> shuffledDeck) {
		playerDeck = new ArrayList<>();
		computerDeck = new ArrayList<>();
		int i=1;
		for (Card thiscard : shuffledDeck) {
			if (i % 2 == 0) {
				playerDeck.add(thiscard);
				i++;
			} else {
				computerDeck.add(thiscard);
				i++;
			}
		}
	} 



//	public void showDeck(List<Card> deckToShow) {
//		for (Card thisCard : playerDeck) {
//			System.out.println(thisCard.getName() + ", " + thisCard.getSuit() + " Quantity: " + thisCard.getQuantity());
//		}
//	}

}
