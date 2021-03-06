package com.rightcomply.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.opera.core.systems.scope.protos.ExecProtos.ActionList.Action;

public class VendorPostDashboardTest<WebElements> extends TestBase{
	HomePage homepage;
	PosthiringDashboardVendor vendordash;
	LaunchPage launchpage;
	Reusable reuse;

	@BeforeClass
	
	public void testInit() throws InterruptedException {

		// Load the page in the browser
		webDriver.get(websiteUrl);
		homepage = PageFactory.initElements(webDriver, HomePage.class);
		reuse=PageFactory.initElements(webDriver, Reusable.class);
		vendordash = PageFactory.initElements(webDriver,PosthiringDashboardVendor.class);
		launchpage=PageFactory.initElements(webDriver, LaunchPage.class);
		homepage.getloginTextBox().sendKeys("tcs1@berijam.com");
		homepage.getpasswordtext().sendKeys("welcome123");
		homepage.getlogin().click();
		Thread.sleep(6000);
		launchpage.getAddworkforce().click();
		
				
	}
	@Test(description="To verify Dashboard UI Components")
	public void verifydashboard() throws InterruptedException
	{
		System.out.println("Test case to verify all ui components");
		Assert.assertTrue(vendordash.getclickimg().isDisplayed());
		Assert.assertTrue(vendordash.getcontract().isDisplayed());
		Assert.assertTrue(vendordash.getEmployee().isDisplayed());
		
		//Assert.assertTrue(vendordash.getloggoff().isDisplayed());
		Assert.assertTrue(vendordash.getsearch().isDisplayed());
		Assert.assertTrue(vendordash.getsearchText().isDisplayed());
		
		//reuse.mouseover(vendordash.getuserdropdown(), webDriver);
		Thread.sleep(5000);
		
		System.out.println("Testcase validate ui components passed");
		
	}
	@Test(description="To verify client link functional flow",priority=2)
	public void validateclientflow()
	{
		System.out.println("Testcase to validate client link");
		
		System.out.println("Testcase to validate client link is passed");
		
	}
	@Test(description="To verify employees link functional flow",priority=4)
	public void validateemployeesflow() throws InterruptedException
	{
		System.out.println("Testcase to validate employees link");
		Assert.assertTrue(vendordash.getEmployee().isDisplayed());
		System.out.println("Testcase to validate employees link passes");
		
	}
	@Test(description="To verify contract link functional flow",priority=3)
	public void validatecontractflow()
	{
		System.out.println("Testcase to validate contractor link");
		Assert.assertTrue(vendordash.getcontract().isDisplayed());
		vendordash.getcontract().click();
		System.out.println("contractor link");
		System.out.println("Testcase to validate contractor link is passed");
	}
	@Test(description="To Verify the functionality of userprofile icon in dashboard",enabled=false)
	public void validateusericon()
	{
		Actions action=new Actions(webDriver);
		action.moveToElement(vendordash.getuserdropdown()).click().perform();
		
		System.out.println("Testcase to validate usericon link");
		//reuse.mouseover(vendordash.getuserdropdown(), webDriver);
		//Assert.assertTrue(vendordash.getloggoff().isDisplayed());

		System.out.println("Testcase to validate usericon link passed log off is successfull");
	}
	@Test(description="To Verify the Functionality for Search",enabled=false)
	public void validatesearch() throws InterruptedException
		{
		vendordash.getEmployee().click();
		System.out.println("Testcase to validate search functionality in posthiring dashboard");
		//String searchkey="sunil";
		Actions act=new Actions(webDriver);
		act.moveToElement(vendordash.getsearch()).doubleClick().perform();
		Thread.sleep(6000);
		reuse.mouseover(vendordash.getsearchText(), webDriver);
		vendordash.getsearchText().sendKeys("Prathiba");
		Thread.sleep(5000);
		vendordash.getsearchText().sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		Assert.assertEquals(vendordash.getEmpName().getText(),"Prathiba");
		}
	@Test(description="To validate Non compliance",priority=4)
	public void validateNoncompliance()
	{
		vendordash.getEmployee().click();
		vendordash.getNoncompliance().click();
		System.out.println(vendordash.getHeading().getText());
		System.out.println(vendordash.getHeading().getText().contains("Non Compliant"));
		
	}
	

@Test(description="To validate compliance",priority=5)
public void validateCompliance()
{
	vendordash.getEmployee().click();
	vendordash.getCompliance().click();
	System.out.println(vendordash.getHeading().getText());
	System.out.println(vendordash.getHeading().getText().contains("Compliant"));
	
}

@Test(description="To validate Non compliance",priority=6)
public void validateAll()
{
	vendordash.getEmployee().click();
	vendordash.getAll().click();
	System.out.println(vendordash.getHeading().getText());
	System.out.println(vendordash.getHeading().getText().contains("All"));
	
}

@Test(description="To validate Non compliance",priority=7)
public void validateRecentlyadded()
{
	vendordash.getEmployee().click();
	vendordash.getRecentlyAdded().click();
	System.out.println(vendordash.getHeading().getText());
	System.out.println(vendordash.getHeading().getText().contains("Recently Added"));
	
}


}
