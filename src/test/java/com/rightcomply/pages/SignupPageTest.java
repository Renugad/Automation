package com.rightcomply.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class SignupPageTest extends TestBase{
	public SignupPageTest(WebDriver webDriver)
	{
		super();
		// TODO Auto-generated constructor stub
	}
	HomePage homepage;
	SignupPage signup;
	Reusable reuse;

	@BeforeClass
	public void testInit() {
		// Load the page in the browser
		webDriver.get(websiteUrl);
		homepage = PageFactory.initElements(webDriver, HomePage.class);
		signup = PageFactory.initElements(webDriver,SignupPage.class);
		homepage.getloginTextBox().sendKeys("tcs1@berijam.com");
		homepage.getpasswordtext().sendKeys("welcome123");
		homepage.getlogin().click();
		}
	
	
	

}
