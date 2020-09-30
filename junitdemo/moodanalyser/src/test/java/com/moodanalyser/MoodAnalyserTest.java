/**
 * 
 */
package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author prashant
 *
 */
public class MoodAnalyserTest {
		
	
	//UC1.TC1.1
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("This is a sad message");
		Assert.assertEquals("SAD",mood);
	}
	
	//UC1.TC1.2
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("This is a happy message");
		Assert.assertEquals("HAPPY",mood);
	}
	
	//UC2 TC2.1
	@Test
	public void givenNullMood_ShouldThrowException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = null;
		try {
			ExpectedException exceptionRule = ExpectedException.none(); //doubt
			exceptionRule.expect(MoodAnalysisException.class); 
			mood = moodAnalyser.analyseMood();
			//Assert.assertEquals("HAPPY", mood);
			//exceptionRule is taking care of the above line so we can ignore and therefore we can remove local variables as well
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}
	
	//UC3 TC2
	/*
	public void givenNullMood_ShouldThrowException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = null;
		try {
			ExpectedException exceptionRule = ExpectedException.none(); //doubt
			exceptionRule.expect(MoodAnalysisException.class); 
			mood = moodAnalyser.analyseMood();
			//Assert.assertEquals("HAPPY", mood);
			//exceptionRule is taking care of the above line so we can ignore and therefore we can remove local variables as well
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,e.type)
		}
	}
	*/
	
		 
}
