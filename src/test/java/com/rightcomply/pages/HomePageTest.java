package com.rightcomply.pages;

import java.sql.SQLException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

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
	
	@Test(description="Check the form have all fields",priority=2)
	public void testallUI()
	{
		System.out.println("Verify all ui components");
		Assert.assertTrue(homepage.getFirstname().isDisplayed());
		Assert.assertTrue(homepage.getLastname().isDisplayed());
		Assert.assertTrue(homepage.getEmail().isDisplayed());
		Assert.assertTrue(homepage.getPassword().isDisplayed());
		Assert.assertTrue(homepage.getConfirmpassword().isDisplayed());
		Assert.assertTrue(homepage.getPaymentplan().isDisplayed());
		//Assert.assertTrue(homepage.getFree().isDisplayed()); element not found.
		System.out.println("All ui componets present");
	}
	
	@Test(description="Check Two banners displayed with radio button")
	public void testTwoBanners()
	{
		Assert.assertTrue(homepage.getFree().isDisplayed());
		Assert.assertTrue(homepage.getPaymentplan().isDisplayed());
	}
	
	@Test(description="Check Registration Button is displayed")
	public void testRegistrationButton()
	{
		
	}
	
	
	
	@Test(description="Check option is selected before the form is submitted for registration")
	public void testOptionsRegistrationButton()
	{
		Assert.assertTrue(homepage.getRegister().isDisplayed());
		
	}
	
	@Test(description="validate the email in homepage")
	public void ValidateEmail() throws InterruptedException
	{
		homepage.getEmail().sendKeys("hfb");
		homepage.submit().click();
		Thread.sleep(7000);
		String error=homepage.getLoginEmailErr().getText();
		Assert.assertEquals(error, "Please enter a valid email address.");
		System.out.println("Test case to validate email in forgot passwordlink is Sucessful");
	}
	
	@Test(description="Check SignIn Option is displayed")
	public void testSignInOption()
	{
		homepage.email().sendKeys("tcs1@gmail.com");
		homepage.password().sendKeys("welcome123");
	}
	
	
	
	
	@AfterClass
	public void logout() throws InterruptedException, SQLException {
		//homepage.logout();
		webDriver.quit();
	}
	
}
