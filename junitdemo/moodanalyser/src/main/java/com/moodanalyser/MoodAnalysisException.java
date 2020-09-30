/**
 * MY OWN CUSTOM EXCEPTION
 */
package com.moodanalyser;

/**
 * @author prashant
 *
 */
public class MoodAnalysisException extends Exception {
	
	public MoodAnalysisException(String message) {
		super(message);
	}
	
	//for UC3TC2
	/*
	 enum ExceptionType{
		ENTERED_NULL,ENTERED_EMPTY
	}
	ExceptionType type;
	public MoodAnalysisException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}	 
	 */
	
}
