package com.techelevator;

import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

public class LogMakerTest {

	@Test
	public void testlogEvent(){

		LogMaker testLog = new LogMaker();
		testLog.logEvent("TESTING");

		try (Scanner scanTestLog = new Scanner(testLog.getLogFile())){

			String testLogString = scanTestLog.nextLine();
			assertTrue(testLogString.contains("TESTING"));
			scanTestLog.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		}
	}
}
