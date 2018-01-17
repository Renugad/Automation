package com.rightcomply.pages;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddMultipleEmpTest extends TestBase{
HomePage homepage;
AddEmployeesAsBatch addemp;
Reusable reuse;
LaunchPage launch;
	
	//@Parameters({ "path" })
	@BeforeClass
	public void testInit() throws InterruptedException {

		// Load the page in the browser
		System.out.println("websiteUrl : " + websiteUrl);
		webDriver.get(websiteUrl);
		Thread.sleep(5000);
		homepage = PageFactory.initElements(webDriver, HomePage.class);
		addemp=PageFactory.initElements(webDriver, AddEmployeesAsBatch.class);
		reuse=PageFactory.initElements(webDriver,Reusable.class);
		launch=PageFactory.initElements(webDriver, LaunchPage.class);
		homepage.email().sendKeys("tcs1@berijam.com");
		homepage.password().sendKeys("welcome123");
		homepage.getlogin().click();
		Thread.sleep(7000);
	}

	@Test(description="Validate Upload Employees as Batch")
	public void testH1Existing() throws InterruptedException, AWTException {
		System.out.println("The tittle is:");
		System.out.println(homepage.getTitle());
		launch.getAddworkforce().click();
		Thread.sleep(6000);
		addemp.getAdd().click();
		Thread.sleep(6000);
		addemp.getAddMultipleemp().click();
		Thread.sleep(6000);
		addemp.getBrowse().click();
		reuse.uploadfile(addemp.getBrowse(), "C:\\rightcomply\\Multipleemployees.csv");
	}

}
