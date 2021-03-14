package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogMaker {

	private String logPath;
	private File logFile;
	private PrintWriter logWriter;
	
	private String pattern;
	private String filePattern;
	private SimpleDateFormat date;
	private SimpleDateFormat fileDate;
	
	public LogMaker () { 
		
		this.pattern = "MM/dd/yyyy hh:mm:ss a";
		this.filePattern = "MM-dd-yyyy hh-mm-ss a";
		
		this.date = new SimpleDateFormat(pattern);
		this.fileDate = new SimpleDateFormat(filePattern);
		
		String dateFileAsAString = fileDate.format(new Date());
		this.logPath = dateFileAsAString;
 
		
		this.logFile = new File(logPath + ".txt");
		
		try {
			this.logWriter = new PrintWriter(new FileOutputStream(logFile),true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public void logEvent(String gamePlay) {
		String dateAsAString = date.format(new Date());
		logWriter.println(dateAsAString + " " + gamePlay);
		
	}
	
	public File getLogFile() {
		return logFile;
	}
	
}
