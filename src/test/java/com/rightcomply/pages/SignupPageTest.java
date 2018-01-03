package com.rightcomply.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignupPageTest extends TestBase{
	//@Parameters({ "path" })
	
	HomePage homepage;
	SignupPage signup;
	Reusable reuse;
	

	@BeforeClass
	public void testInit() {
		// Load the page in the browser
		webDriver.get(websiteUrl);
		homepage = PageFactory.initElements(webDriver, HomePage.class);
		signup = PageFactory.initElements(webDriver,SignupPage.class);
		webDriver.manage().window().maximize();
		
		
		}
	
	@Test(description="Check Signuppage for UI",priority=1)
	public void testUI() throws InterruptedException {
		Assert.assertTrue(signup.getfname().isDisplayed());
		Assert.assertTrue(signup.getlname().isDisplayed());
		Assert.assertTrue(signup.getEmail().isDisplayed());
		Assert.assertTrue(signup.getBusinessname().isDisplayed());
		Assert.assertTrue(signup.getPassword().isDisplayed());
		Thread.sleep(5000);
		//Assert.assertTrue(signup.getFree().isDisplayed());
		//Assert.assertTrue(signup.getPaid().isDisplayed());
		Assert.assertTrue(signup.getRegister().isDisplayed());
	}
	
	@Test(description="Validate errors",priority=2)
	public void testCheckInlineErrors() throws InterruptedException
	{
		Assert.assertTrue(signup.getRegister().isDisplayed());
		signup.getRegister().click();
		Thread.sleep(5000);
		Assert.assertTrue(signup.getFirstnameerror().isDisplayed());
		Assert.assertTrue(signup.getLastnameerror().isDisplayed());
		Assert.assertTrue(signup.getemailerror().isDisplayed());
		Assert.assertTrue(signup.getBusinessnameError().isDisplayed());
		Assert.assertTrue(signup.getpasswordError().isDisplayed());
		Assert.assertTrue(signup.getconfirmpasswordError().isDisplayed());
	}
	
	@Test(description="Validate email error",priority=3)
	public void emailValidation() throws InterruptedException
	{
		signup.getEmail().sendKeys("gfdhh");
		signup.getRegister().click();
		Assert.assertTrue(signup.getemailerror().isDisplayed());
		String errormsg=signup.getemailerror().getText();
		Assert.assertEquals(errormsg, "Please enter a valid Email Id.");
	}
	@Test(description="Signup form",priority=4)
	public void comparePassword() throws InterruptedException
	{
	signup.getConfirmpassword().sendKeys("reksmk");
	signup.getPassword().sendKeys("kxckm");
	Thread.sleep(4000);
	signup.getRegister().click();
	Assert.assertEquals(signup.getconfirmpasswordError().getText(), "The Password field must be at least 6 characters in length.");
	}
	
	@Test(description="Signup form",priority=4)
	public void testSignupfunctionality() throws InterruptedException
	{
		signup.getfname().sendKeys("renu");
		signup.getlname().sendKeys("devi");
		signup.getEmail().sendKeys("jfndj@gmail.com");
		signup.getBusinessname().sendKeys("Hsnb");
		signup.getPassword().sendKeys("ghghg");
		signup.getConfirmpassword().sendKeys("gsgdhsdh");
		Thread.sleep(9000);
		System.out.println(signup.getFree().isSelected());
		Actions act=new Actions(webDriver);
		act.moveToElement(signup.getPaid()).click().build();
		Assert.assertTrue(signup.getRegister().isDisplayed());
	}

}
