package com.rightcomply.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidateForgotpassword extends TestBase{
	HomePage homepage;
	
	

	@BeforeClass
	public void testInit() {

		// Load the page in the browser
		webDriver.get(websiteUrl);
		homepage = PageFactory.initElements(webDriver, HomePage.class);
		
	}
	
	@Test(description="To Validate Forgot password link on homepage and click",priority=1)
	public void forgotpass() throws InterruptedException
	{
	homepage.forgotpass().isDisplayed();
	homepage.forgotpass().click();
	Thread.sleep(8000);
	Assert.assertEquals(homepage.forgotpassHeading().getText(),"Forgot Password");
	System.out.println("Forgot password testcase Sucessfull");
	Assert.assertTrue(homepage.forgotpassAccount().isDisplayed());
	Assert.assertTrue(homepage.getEmail().isDisplayed());
	Assert.assertTrue(homepage.getEmail().isEnabled());
	Assert.assertTrue(homepage.forgotSub().isDisplayed());
	System.out.println("Testcase to verify forgot passwordlink is sucessfull");
	
	}
	
	@Test(description="To Validate email format",priority=2)
	public void emailvalidation() throws InterruptedException
	{
		homepage.getEmail().sendKeys("hfb");
		homepage.submit().click();
		Thread.sleep(7000);
		String error=homepage.getEmailerr().getText();
		Assert.assertEquals(error, "Please enter a valid email address.");
		System.out.println("Test case to validate email in forgot passwordlink is Sucessful");
	}
	
}
