package com.rightcomply.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidateCountWorkforce extends TestBase {
	HomePage homepage;
	PosthiringDashboardVendor dashboard;
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
			dashboard=PageFactory.initElements(webDriver, PosthiringDashboardVendor.class);
			reuse=PageFactory.initElements(webDriver,Reusable.class);
			launch=PageFactory.initElements(webDriver, LaunchPage.class);
			homepage.email().sendKeys("tcs1@berijam.com");
			homepage.password().sendKeys("welcome123");
			homepage.getlogin().click();
			launch.getAddworkforce().click();
			Thread.sleep(7000);
		}
		
		@Test(description="totalcount")
		public void testCount() throws InterruptedException
		{
			dashboard.getNoncompliance().click();
			String noncompliant=dashboard.getHeading().getText();
			String[] nc=noncompliant.split(" ");
			int nc1=Integer.parseInt(nc[0]);
			Thread.sleep(5000);
			
			dashboard.getCompliance().click();
			String compliant=dashboard.getHeading().getText();
			String[] co=compliant.split(" ");
			
			int c1=Integer.parseInt(co[0]);
			dashboard.getCritical().click();
			String critical=dashboard.getCriticaltext().getText();
			String warn=dashboard.getWarningtext().getText();
			String notify=dashboard.getNotifytext().getText();
			int cr1=Integer.parseInt(critical)+Integer.parseInt(warn)+Integer.parseInt(notify);
			
			dashboard.getRecentlyAdded().click();
			String recentlyadded=dashboard.getHeading().getText();
			String[] ra=recentlyadded.split(" ");
			int ra1=Integer.parseInt(ra[0]);
			
			int total=nc1+c1+cr1+ra1;
			
			System.out.println("The total Number of workforce is:"+total);
			dashboard.getAll().click();
			String all=dashboard.getHeading().getText();
			String[] arrall=all.split(" ");
			int sum=Integer.parseInt(arrall[0]);
			Assert.assertEquals(sum, total);
			System.out.println("Testcase to validate the total number of count is passed");
							
		}
					
		}


