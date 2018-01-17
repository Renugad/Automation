package com.rightcomply.pages;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UpdateDocumentsTest extends TestBase{
	HomePage homepage;
	Reusable reuse;
	PosthiringDashboardVendor dashboard;
	LaunchPage launch;
	//@Parameters({ "path" })
		@BeforeClass
		public void testInit() throws InterruptedException {

			// Load the page in the browser
			System.out.println("websiteUrl : " + websiteUrl);
			webDriver.get(websiteUrl);
			Thread.sleep(5000);
			homepage = PageFactory.initElements(webDriver, HomePage.class);
			reuse=PageFactory.initElements(webDriver, Reusable.class);
			dashboard=PageFactory.initElements(webDriver, PosthiringDashboardVendor.class);
			launch=PageFactory.initElements(webDriver, LaunchPage.class);
			homepage.email().sendKeys("tcs1@berijam.com");
			homepage.password().sendKeys("welcome123");
			homepage.getlogin().click();
		}

		@Test(description="Update employee information documents",priority=1)
		public void testH1Existing() throws InterruptedException, AWTException {
			System.out.println("The homepage tittle is:");
			System.out.println(homepage.getTitle());
			launch.getAddworkforce().click();
			dashboard.getUploadlink().click();
			Thread.sleep(6000);
			//Upload document
			if(dashboard.getUploadi9().isDisplayed() && dashboard.getUploadLca().isDisplayed() && dashboard.getUploadPhotoid().isDisplayed())
			{
			reuse.uploadfile(dashboard.getUploadi9(), "C:\\rightcomply\\i9.pdf");
			Thread.sleep(9000);
			dashboard.geti9expiry().sendKeys("05-12-2018");
			reuse.uploadfile(dashboard.getUploadLca(), "C:\\rightcomply\\EADCard.jpg");
			dashboard.getlcaexpiry().sendKeys("05-22-2018");
			Thread.sleep(9000);
			reuse.uploadfile(dashboard.getUploadPhotoid(), "C:\\rightcomply\\EADCard.jpg");
			dashboard.getPhotoidissue().sendKeys("6-7-2016");
			dashboard.getPhotoidexpiry().sendKeys("6-7-2018");
			dashboard.getUpdateDocuments().click();
			}
			else if(dashboard.getUploadi9().isDisplayed())
			{
				reuse.uploadfile(dashboard.getUploadi9(), "C:\\rightcomply\\i9.pdf");
				Thread.sleep(9000);
				dashboard.geti9expiry().sendKeys("05-12-2018");
				dashboard.getUpdateDocuments().click();
			}
			else if(dashboard.getUploadLca().isDisplayed())
			{
				reuse.uploadfile(dashboard.getUploadLca(), "C:\\rightcomply\\EADCard.jpg");
				dashboard.getlcaexpiry().sendKeys("05-22-2018");
				dashboard.getUpdateDocuments().click();
			}
			else if(dashboard.getUploadPhotoid().isDisplayed())
			{
				reuse.uploadfile(dashboard.getUploadPhotoid(), "C:\\rightcomply\\EADCard.jpg");
				dashboard.getPhotoidissue().sendKeys("6-7-2016");
				dashboard.getPhotoidexpiry().sendKeys("6-7-2018");
				dashboard.getUpdateDocuments().click();
			}
		}
		
		@Test(description="Verify updated information",priority=2)
		public void testVerifyUpdatedDocuments()
		{
			
		}

}
