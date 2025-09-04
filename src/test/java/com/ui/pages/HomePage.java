package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import static com.constants.Env.*;
import com.utility.BrowserUtility;
import com.utility.JSONUtility;

import static com.utility.PropertiesUtil.*;

public final class HomePage extends BrowserUtility{
	
	private static final By SIGN_IN_LINK_LOCATOR = By.xpath("//a[contains(text(),\"Sign in\")]"); 

	public HomePage(Browser browserName, boolean isHeadless) {
		super(browserName,isHeadless); // To Call the Parent Class Constructor from child constructor
		//goToWebsite(readProperty(QA, "URL"));
		goToWebsite(JSONUtility.readJson(QA));
	}
	

	public HomePage(WebDriver lambdaDriver) {
		// TODO Auto-generated constructor stub
		super(lambdaDriver);
	}




	public LoginPage goToLoginPage()
	{
		clickOn(SIGN_IN_LINK_LOCATOR);
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}


	public void quit() {
		// TODO Auto-generated method stub
		
		
	}

}
