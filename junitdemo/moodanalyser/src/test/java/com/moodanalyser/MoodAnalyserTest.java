/**
 * 
 */
package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author prashant
 *
 */
public class MoodAnalyserTest {
		
	
	//UC1.TC1.1
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("This is a sad message");
		Assert.assertEquals("SAD",mood);
	}
	
	//UC1.TC1.2
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("This is a happy message");
		Assert.assertEquals("HAPPY",mood);
	}
	
	//UC2 TC2.1
	@Test
	public void givenNullMood_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
		 
}
