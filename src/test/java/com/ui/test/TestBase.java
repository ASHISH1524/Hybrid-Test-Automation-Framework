package com.ui.test;

import static com.constants.Browser.CHROME;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.ui.pages.HomePage;
import com.utility.BrowserUtility;
import com.utility.LambdaTestUtility;
import com.utility.LoggerUtility;

public class TestBase {
	protected HomePage homePage;
	
	Logger logger = LoggerUtility.getLogger(this.getClass());
	
	private boolean isLambdaTest = true;
	private boolean isHeadless = true;
	
	@Parameters({"browser", "islambdaTest"})
	@BeforeMethod(description = "Load the Homepage of the website")
	public void setup(String browser, boolean isLambdaTest, ITestResult result) {
		WebDriver lambdaDriver;
		if(isLambdaTest)
		{
			lambdaDriver = LambdaTestUtility.initilizeLambdaTestSessions("chrome", result.getMethod().getMethodName());
			homePage = new HomePage(lambdaDriver);
		}
		else
		{
		logger.info("Load the HomePage of the website");
		homePage = new HomePage(CHROME, true);
		}

	}
	public BrowserUtility getInstance()
	{
		return homePage;
	}
	@AfterMethod(description = "Tear Down the browser")
	public void tearDown()
	{
		if(isLambdaTest)
		{
			LambdaTestUtility.quitSession();
		}
		else
		{
			homePage.quit();
		}
	}

}
