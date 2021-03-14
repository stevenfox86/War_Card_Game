package com.techelevator;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeckBuilderTest {

	DeckBuilder testDeckBuild = new DeckBuilder();
	
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
	public void test_01_buildListOfCards(){
		
		List<String []> testList = new ArrayList<>();
		String [] firstArray = {"2","Clubs"};
		
		testList = testDeckBuild.buildListOfCards();
		
		Assert.assertArrayEquals(testList.get(0), firstArray);
	} 
	
	@Test
	public void test_02_displayDeck() {
		
		testDeckBuild.buildListOfCards();
		testDeckBuild.cardDeckCreator();
		testDeckBuild.displayDeck();
		
		Assert.assertEquals("2, Clubs Quantity: 1\r\n" + 
				"3, Clubs Quantity: 1\r\n" + 
				"4, Clubs Quantity: 1\r\n" + 
				"5, Clubs Quantity: 1\r\n" + 
				"6, Clubs Quantity: 1\r\n" + 
				"7, Clubs Quantity: 1\r\n" + 
				"8, Clubs Quantity: 1\r\n" + 
				"9, Clubs Quantity: 1\r\n" + 
				"10, Clubs Quantity: 1\r\n" + 
				"Jack, Clubs Quantity: 1\r\n" + 
				"Queen, Clubs Quantity: 1\r\n" + 
				"King, Clubs Quantity: 1\r\n" + 
				"Ace, Clubs Quantity: 1\r\n" + 
				"2, Hearts Quantity: 1\r\n" + 
				"3, Hearts Quantity: 1\r\n" + 
				"4, Hearts Quantity: 1\r\n" + 
				"5, Hearts Quantity: 1\r\n" + 
				"6, Hearts Quantity: 1\r\n" + 
				"7, Hearts Quantity: 1\r\n" + 
				"8, Hearts Quantity: 1\r\n" + 
				"9, Hearts Quantity: 1\r\n" + 
				"10, Hearts Quantity: 1\r\n" + 
				"Jack, Hearts Quantity: 1\r\n" + 
				"Queen, Hearts Quantity: 1\r\n" + 
				"King, Hearts Quantity: 1\r\n" + 
				"Ace, Hearts Quantity: 1\r\n" + 
				"2, Diamonds Quantity: 1\r\n" + 
				"3, Diamonds Quantity: 1\r\n" + 
				"4, Diamonds Quantity: 1\r\n" + 
				"5, Diamonds Quantity: 1\r\n" + 
				"6, Diamonds Quantity: 1\r\n" + 
				"7, Diamonds Quantity: 1\r\n" + 
				"8, Diamonds Quantity: 1\r\n" + 
				"9, Diamonds Quantity: 1\r\n" + 
				"10, Diamonds Quantity: 1\r\n" + 
				"Jack, Diamonds Quantity: 1\r\n" + 
				"Queen, Diamonds Quantity: 1\r\n" + 
				"King, Diamonds Quantity: 1\r\n" + 
				"Ace, Diamonds Quantity: 1\r\n" + 
				"2, Spades Quantity: 1\r\n" + 
				"3, Spades Quantity: 1\r\n" + 
				"4, Spades Quantity: 1\r\n" + 
				"5, Spades Quantity: 1\r\n" + 
				"6, Spades Quantity: 1\r\n" + 
				"7, Spades Quantity: 1\r\n" + 
				"8, Spades Quantity: 1\r\n" + 
				"9, Spades Quantity: 1\r\n" + 
				"10, Spades Quantity: 1\r\n" + 
				"Jack, Spades Quantity: 1\r\n" + 
				"Queen, Spades Quantity: 1\r\n" + 
				"King, Spades Quantity: 1\r\n" + 
				"Ace, Spades Quantity: 1\r\n", outputStream.toString());
	}
	
	@Test
	public void test_03_cardDeckCreator() {
		
		testDeckBuild.buildListOfCards();
		testDeckBuild.cardDeckCreator();
		
		Assert.assertEquals(52, testDeckBuild.getDeck().size());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test(expected = FileNotFoundException.class)
//	public void test_02_ReadFile() throws IOException {
//		
//		String testFilePath = "test.txt";
//		File testFile = new File (testFilePath);
//		
//		testDeckBuild.setCardDeckFile(testFile);
//		
//		testDeckBuild.buildListOfCards();
//		
//	}
}
