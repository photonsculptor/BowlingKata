package com.pillar.app;

import java.util.stream.Stream;

public class App 
{
	public int score (String scoreCard) {
		
		return scoreCard.chars().map(score -> Math.max(Character.getNumericValue(score), 0)).sum();
	}
    
}
