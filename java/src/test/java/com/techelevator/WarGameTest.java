package com.techelevator;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WarGameTest {

	WarGame warGameTest = new WarGame();
	DeckBuilder deckBuilderTest = new DeckBuilder();
	
	private  ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	private  PrintStream originalOut = System.out;
	
	
	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outputStream));
	}

	@After
	public void restoreStreams() {
		System.setOut(originalOut);
	}
 
	
	@Test
	public void test_01_playCards_player_Wins() {
				
		Clubs q = new Clubs(9, "Clubs", "9");
		Hearts h = new Hearts(2, "Hearts", "2");
		
		warGameTest.setCardToPlayerDeck(q);
		warGameTest.setCardToComputerDeck(h);;
		
		warGameTest.playCards();
		
		Assert.assertEquals(warGameTest.getPlayerScore(), 1);
		
	}
	
	
	@Test
	public void test_02_playCards_computer_wins() {
				
		Clubs q = new Clubs(9, "Clubs", "9");
		Hearts h = new Hearts(2, "Hearts", "2");
		 
		warGameTest.setCardToPlayerDeck(h);
		warGameTest.setCardToComputerDeck(q);;
		
		warGameTest.playCards();
		
		Assert.assertEquals(warGameTest.getComputerScore(), 1);
		
	}
	
	
	@Test
	public void test_03_playCards_computer_wins_war_with_5() {
				
		Clubs a = new Clubs(9, "Clubs", "9");
		Clubs b = new Clubs(7, "Clubs", "7");
		Clubs c = new Clubs(5, "Clubs", "5");
		Clubs d = new Clubs(3, "Clubs", "3");
		Clubs e = new Clubs(2, "Clubs", "2");
		Hearts f = new Hearts(9, "Hearts", "9");
		Hearts g = new Hearts(8, "Hearts", "8");
		Hearts h = new Hearts(6, "Hearts", "6");
		Hearts i = new Hearts(4, "Hearts", "4");
		Hearts j = new Hearts(7, "Hearts", "7");
		
		warGameTest.setCardToPlayerDeck(a);
		warGameTest.setCardToPlayerDeck(b);
		warGameTest.setCardToPlayerDeck(c);
		warGameTest.setCardToPlayerDeck(d);
		warGameTest.setCardToPlayerDeck(e);
		
		warGameTest.setCardToComputerDeck(f);
		warGameTest.setCardToComputerDeck(g);
		warGameTest.setCardToComputerDeck(h);
		warGameTest.setCardToComputerDeck(i);
		warGameTest.setCardToComputerDeck(j);
		
		warGameTest.playCards();
		
		Assert.assertEquals(warGameTest.getComputerScore(), 5);
		
	}
	 
	
	@Test
	public void test_04_playCards_player_wins_war_with_5() {
				
		Clubs a = new Clubs(9, "Clubs", "9");
		Clubs b = new Clubs(7, "Clubs", "7");
		Clubs c = new Clubs(5, "Clubs", "5");
		Clubs d = new Clubs(3, "Clubs", "3");
		Clubs e = new Clubs(6, "Clubs", "6");
		Hearts f = new Hearts(9, "Hearts", "9");
		Hearts g = new Hearts(8, "Hearts", "8");
		Hearts h = new Hearts(6, "Hearts", "6");
		Hearts i = new Hearts(4, "Hearts", "4");
		Hearts j = new Hearts(2, "Hearts", "2");
		
		warGameTest.setCardToPlayerDeck(a);
		warGameTest.setCardToPlayerDeck(b);
		warGameTest.setCardToPlayerDeck(c);
		warGameTest.setCardToPlayerDeck(d);
		warGameTest.setCardToPlayerDeck(e);
		
		warGameTest.setCardToComputerDeck(f);
		warGameTest.setCardToComputerDeck(g);
		warGameTest.setCardToComputerDeck(h);
		warGameTest.setCardToComputerDeck(i);
		warGameTest.setCardToComputerDeck(j);
		
		warGameTest.playCards();
		
		Assert.assertEquals(warGameTest.getPlayerScore(), 5);
		
	}
	
	
	@Test
	public void test_05_playCards_computer_wins_war_with_4() {
				
		Clubs a = new Clubs(9, "Clubs", "9");
		Clubs b = new Clubs(7, "Clubs", "7");
		Clubs c = new Clubs(5, "Clubs", "5");
		Clubs d = new Clubs(3, "Clubs", "3");
		Hearts f = new Hearts(9, "Hearts", "9");
		Hearts g = new Hearts(8, "Hearts", "8");
		Hearts h = new Hearts(6, "Hearts", "6");
		Hearts i = new Hearts(5, "Hearts", "5");
				
		warGameTest.setCardToPlayerDeck(a);
		warGameTest.setCardToPlayerDeck(b);
		warGameTest.setCardToPlayerDeck(c);
		warGameTest.setCardToPlayerDeck(d);
		
		warGameTest.setCardToComputerDeck(f);
		warGameTest.setCardToComputerDeck(g);
		warGameTest.setCardToComputerDeck(h);
		warGameTest.setCardToComputerDeck(i);
		
		warGameTest.playCards();
		
		Assert.assertEquals(warGameTest.getComputerScore(), 4);
		
	}
	
	
	@Test
	public void test_06_playCards_player_wins_war_with_4() {
				
		Clubs a = new Clubs(9, "Clubs", "9");
		Clubs b = new Clubs(7, "Clubs", "7");
		Clubs c = new Clubs(5, "Clubs", "5");
		Clubs d = new Clubs(3, "Clubs", "3");
		Hearts f = new Hearts(9, "Hearts", "9");
		Hearts g = new Hearts(8, "Hearts", "8");
		Hearts h = new Hearts(6, "Hearts", "6");
		Hearts i = new Hearts(2, "Hearts", "2");
				
		warGameTest.setCardToPlayerDeck(a);
		warGameTest.setCardToPlayerDeck(b);
		warGameTest.setCardToPlayerDeck(c);
		warGameTest.setCardToPlayerDeck(d);
		
		warGameTest.setCardToComputerDeck(f);
		warGameTest.setCardToComputerDeck(g);
		warGameTest.setCardToComputerDeck(h);
		warGameTest.setCardToComputerDeck(i);
		
		warGameTest.playCards();
		
		Assert.assertEquals(warGameTest.getPlayerScore(), 4);
		
	}
	
	@Test
	public void test_07_playCards_computer_wins_war_with_3() {
				
		Clubs a = new Clubs(9, "Clubs", "9");
		Clubs b = new Clubs(7, "Clubs", "7");
		Clubs c = new Clubs(5, "Clubs", "5");
		Hearts f = new Hearts(9, "Hearts", "9");
		Hearts g = new Hearts(8, "Hearts", "8");
		Hearts h = new Hearts(6, "Hearts", "6");
				
		warGameTest.setCardToPlayerDeck(a);
		warGameTest.setCardToPlayerDeck(b);
		warGameTest.setCardToPlayerDeck(c);
		
		warGameTest.setCardToComputerDeck(f);
		warGameTest.setCardToComputerDeck(g);
		warGameTest.setCardToComputerDeck(h);
		
		warGameTest.playCards();
		
		Assert.assertEquals(warGameTest.getComputerScore(), 3);
		
	}
	
	
	@Test
	public void test_08_playCards_player_wins_war_with_3() {
				
		Clubs a = new Clubs(9, "Clubs", "9");
		Clubs b = new Clubs(7, "Clubs", "7");
		Clubs c = new Clubs(6, "Clubs", "6");
		Hearts f = new Hearts(9, "Hearts", "9");
		Hearts g = new Hearts(8, "Hearts", "8");
		Hearts h = new Hearts(5, "Hearts", "5");
				
		warGameTest.setCardToPlayerDeck(a);
		warGameTest.setCardToPlayerDeck(b);
		warGameTest.setCardToPlayerDeck(c);
		
		warGameTest.setCardToComputerDeck(f);
		warGameTest.setCardToComputerDeck(g);
		warGameTest.setCardToComputerDeck(h);
		
		warGameTest.playCards();
		
		Assert.assertEquals(warGameTest.getPlayerScore(), 3);
		
	}
	
	
	@Test
	public void test_09_playCards_computer_wins_war_with_2() {
				
		Clubs a = new Clubs(9, "Clubs", "9");
		Clubs b = new Clubs(11, "Clubs", "Jack");
		Hearts f = new Hearts(9, "Hearts", "9");
		Hearts g = new Hearts(13, "Hearts", "King");
				
		warGameTest.setCardToPlayerDeck(a);
		warGameTest.setCardToPlayerDeck(b);
		
		warGameTest.setCardToComputerDeck(f);
		warGameTest.setCardToComputerDeck(g);
		
		warGameTest.playCards();
		
		Assert.assertEquals(warGameTest.getComputerScore(), 2);
		
	}
	
	
	@Test
	public void test_10_playCards_player_wins_war_with_2() {
				
		Clubs a = new Clubs(9, "Clubs", "9");
		Clubs b = new Clubs(14, "Clubs", "Ace");
		Hearts f = new Hearts(9, "Hearts", "9");
		Hearts g = new Hearts(13, "Hearts", "King");
				
		warGameTest.setCardToPlayerDeck(a);
		warGameTest.setCardToPlayerDeck(b);
		
		warGameTest.setCardToComputerDeck(f);
		warGameTest.setCardToComputerDeck(g);
		
		warGameTest.playCards();
		
		Assert.assertEquals(warGameTest.getPlayerScore(), 2);
		
	}
	
	@Test
	public void test_11_make_two_decks() {

	
		deckBuilderTest.buildListOfCards();
		deckBuilderTest.cardDeckCreator();
		warGameTest.makeTwoWarDecks(deckBuilderTest.getDeck());
		
		List<Card> fullDeck = deckBuilderTest.getDeck();
		List<Card> playerDeck = warGameTest.getPlayerDeck();
		List<Card> computerDeck = warGameTest.getComputerDeck();
		
		
		
		assertEquals(fullDeck.size()/2, playerDeck.size());
		assertEquals(fullDeck.size()/2, computerDeck.size());
	}
	
}
