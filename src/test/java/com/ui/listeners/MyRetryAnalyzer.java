package com.ui.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer {

	private static final int MAX_NUMBER_OF_ATTEMPTS = 3;
	private static int currentAttempts=1;
	
	@Override
	public boolean retry(ITestResult result) {
		if(currentAttempts<= MAX_NUMBER_OF_ATTEMPTS)
		{
			currentAttempts++;
			return true;
		}
		return false;
	}
	

}
