package com.moodanalyser;

public class MoodAnalyser {

	private String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public MoodAnalyser() {
		this.message = null;
	}

	public String analyseMood(String message) {
		if (message.contains("sad"))
			return "SAD";
		else
			return "HAPPY";
	}

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

}
