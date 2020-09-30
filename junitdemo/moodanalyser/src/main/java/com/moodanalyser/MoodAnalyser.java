package com.moodanalyser;

public class MoodAnalyser {

	private String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public MoodAnalyser() {
		this.message = null;
	}

	//Used for UC2
	/*
	public String analyseMood(String message) {
		
		if (message.contains("sad"))
			return "SAD";
		else
			return "HAPPY";
	}

	*/
	/*
	public String analyseMood() {
		try {
			if(message.contains("sad"))
			return "SAD";
			else return "HAPPY";
		}
		catch(NullPointerException e) {
			return "HAPPY";
		}
	}
	*/
	
	
	
	//for UC3TC1 custom exception is being used to throw exception
	
	public String analyseMood(String message) throws MoodAnalysisException {
		this.message = message;
		return analyseMood();
	}
	
	public String analyseMood() throws MoodAnalysisException {
		try {
			if(message.contains("sad")) 
			return "SAD";
			else return "HAPPY";
		}
		catch(NullPointerException e) {
			throw new MoodAnalysisException("Please Enter Some Message !");
		}
	} 
	//for UC3TC2
	/*
	 public String analyseMood() throws MoodAnalysisException {
		try {
			if(message.length()==0)
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Please Enter Some Message !");
			if(message.contains("sad")) 
			return "SAD";
			else return "HAPPY";
		}
		catch(NullPointerException e) {
			throw new MoodAnalysisException("Please Enter Some Message !");
		}
	}
	 */
}
