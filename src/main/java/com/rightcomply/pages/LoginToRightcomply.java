package com.rightcomply.pages;

import java.sql.SQLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginToRightcomply extends TestBase{
HomePage homepage;
	
	//@Parameters({ "path" })
	@BeforeClass
	public void testInit() throws InterruptedException {

		// Load the page in the browser
		System.out.println("websiteUrl : " + websiteUrl);
		webDriver.get(websiteUrl);
		Thread.sleep(5000);
		homepage = PageFactory.initElements(webDriver, HomePage.class);
	}

	@Test(description="Check HomePage Title exists")
	public void testH1Existing() throws InterruptedException {
		System.out.println("The homepage tittle is:");
		System.out.println(homepage.getTitle());
		Assert.assertEquals(homepage.getTitle(), "Right Comply");
	}
	
	

	@Test(description="Check SignIn Option is displayed")
	public void testSignInOption()
	{
		homepage.email().sendKeys("tcs1@gmail.com");
		homepage.password().sendKeys("welcome123");
		System.out.println("Login successfull");
	}
	
	@AfterClass
	public void logout() throws InterruptedException, SQLException {
		//homepage.logout();
		webDriver.quit();
		System.out.println("Logout");
	}
	
}
