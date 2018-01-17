package com.rightcomply.pages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateEmpTest extends TestBase{
	HomePage homepage;
	Reusable reuse;
	PosthiringDashboardVendor vendordash;
    LaunchPage launchpage;
	CreateEmployee createemp;
	VendordashEmployee vendoremp;
	static FileInputStream fi;
	private static Sheet s;
	private static int row;
	private static int col;
	public Actions action;

	@BeforeClass
	public void testInit() throws InterruptedException {

		// Load the page in the browser
		webDriver.get(websiteUrl);

		homepage = PageFactory.initElements(webDriver, HomePage.class);
		reuse= PageFactory.initElements(webDriver, Reusable.class);
		launchpage=PageFactory.initElements(webDriver, LaunchPage.class);
		vendordash = PageFactory.initElements(webDriver,PosthiringDashboardVendor.class);
		vendoremp= PageFactory.initElements(webDriver, VendordashEmployee.class);
		createemp=PageFactory.initElements(webDriver, CreateEmployee.class);
		homepage.getloginTextBox().sendKeys("tcs1@berijam.com");
		homepage.getpasswordtext().sendKeys("welcome123");
		homepage.getlogin().click();
		Thread.sleep(6000);
		launchpage.getAddworkforce().click();
		action=new Actions(webDriver);
		action.moveToElement(vendordash.getAdd()).build().perform();
		vendordash.getAdd().click();
		Thread.sleep(8000);
		vendordash.getSingle().click();
	}

	@DataProvider(name="worksheet")

	public static Object[][] fetchSheetBase() throws Exception {

		fi = new FileInputStream("c:/rightcomply/CreateEmployee.xls");
		Workbook w = Workbook.getWorkbook(fi);
		s = w.getSheet("Sheet1");
		row = s.getRows();
		col = s.getColumns();
		ArrayList arlList = null;
		Object[][] data = null;

		data = new Object[row - 1][1];
		int x = 0;

		for (int i = 1; i <= row - 1; i++) {

			arlList = null;
			arlList = new ArrayList();
			String fname = s.getCell(0, i).getContents();
			String lname = s.getCell(1, i).getContents();
			String email = s.getCell(2, i).getContents();
			String mobileno=s.getCell(3,i).getContents();
			String birthdate=s.getCell(4, i).getContents();
			String countryofbirth=s.getCell(5,i).getContents();
			String attorney=s.getCell(6, i).getContents();
			String workpermit=s.getCell(7,i).getContents();
			String workpermitexpiry=s.getCell(8, i).getContents();
			String workpermitfile=s.getCell(9, i).getContents();
			String photoidissuedate=s.getCell(10,i).getContents();
			String photoidexpireson=s.getCell(11,i).getContents();
			String photoidfile=s.getCell(12,i).getContents();
			String projectname=s.getCell(13,i).getContents();
			String jobtitle=s.getCell(14,i).getContents();
			String location=s.getCell(15,i).getContents();
			String startdate=s.getCell(16,i).getContents();
			String enddate=s.getCell(17,i).getContents();
			String note=s.getCell(18,i).getContents();
			String i9=s.getCell(19,i).getContents();
			String expireson=s.getCell(20,i).getContents();
			String lca=s.getCell(21,i).getContents();
			String lcaexpires=s.getCell(22,i).getContents();
			String w4=s.getCell(23,i).getContents();
			String w4expires=s.getCell(24,i).getContents();
			String otherdocuments=s.getCell(25,i).getContents();
			String otherdocexpires=s.getCell(26,i).getContents();
			arlList.add(fname);
			arlList.add(lname);
			arlList.add(email);
			arlList.add(mobileno);
			arlList.add(birthdate);
			arlList.add(countryofbirth);
			arlList.add(attorney);
			arlList.add(workpermit);
			arlList.add(workpermitexpiry);
			arlList.add(workpermitfile);
			arlList.add(photoidissuedate);
			arlList.add(photoidexpireson);
			arlList.add(photoidfile);
			arlList.add(projectname);
			arlList.add(jobtitle);
			arlList.add(location);
			arlList.add(startdate);
			arlList.add(enddate);
			arlList.add(note);
			arlList.add(i9);
			arlList.add(expireson);
			arlList.add(lca);
			arlList.add(lcaexpires);
			arlList.add(w4);
			arlList.add(w4expires);
			arlList.add(otherdocuments);
			arlList.add(otherdocexpires);
			System.out.println(arlList);
			data[x][0] = arlList;
			x++;

		}

		return data;

		
	}




	@Test(description="Create task using parametirized testing",dataProvider="worksheet")
	
	public void creatTask(ArrayList dataa) throws InterruptedException, AWTException
	{
		
		//createemp.getEmpfrm().click();
		Thread.sleep(6000); 
		createemp.getfname().sendKeys(dataa.get(0).toString());
		Thread.sleep(8000);
		System.out.println(dataa.get(0).toString());
		createemp.getlname().sendKeys(dataa.get(1).toString());
		System.out.println(dataa.get(1).toString());
		Thread.sleep(4000);
		createemp.getemail().sendKeys(dataa.get(2).toString());
		System.out.println(dataa.get(2).toString());
		Thread.sleep(4000);
		System.out.println(dataa.get(3).toString());
		createemp.getphno().sendKeys( dataa.get(3).toString());
		Thread.sleep(4000);
		System.out.println(dataa.get(4).toString());
		createemp.getdob().sendKeys(dataa.get(4).toString());
		createemp.getCountryofbirth().sendKeys(dataa.get(5).toString());
		//createemp.getdob().sendKeys(dataa.get(4).toString());
		Thread.sleep(4000);
		System.out.println(dataa.get(5).toString());
		Thread.sleep(4000);
		createemp.getworkpermitDoc().click();
		reuse.selectdrop(createemp.getworkpermitDoc(),dataa.get(7).toString());
		Thread.sleep(4000);
		createemp.getworkpermit_expiry().sendKeys(dataa.get(8).toString());
		Thread.sleep(4000);
		reuse.uploadfile(createemp.getworkpermitUpload(),dataa.get(9).toString());
		Thread.sleep(9000);
		createemp.getPhotoidissuedate().sendKeys(dataa.get(10).toString());
		createemp.getPhotoidExpiry().sendKeys(dataa.get(11).toString());
		Thread.sleep(6000);
		reuse.uploadfile(createemp.getphotoid(), dataa.get(12).toString());
		createemp.getProjectName().sendKeys(dataa.get(13).toString());
		Thread.sleep(2000);
		createemp.getjobtitle().sendKeys(dataa.get(14).toString());
		Thread.sleep(2000);
		createemp.getjobcity().sendKeys(dataa.get(15).toString());
		Thread.sleep(2000);
		createemp.getstartdate().sendKeys(dataa.get(16).toString());
		Thread.sleep(2000);
		createemp.getEndDate().sendKeys(dataa.get(17).toString());
		Thread.sleep(2000);
		createemp.getNote().sendKeys(dataa.get(18).toString());
		Thread.sleep(2000);
		createemp.geti9expiry().sendKeys(dataa.get(19).toString());
		Thread.sleep(2000);
		createemp.geti9().sendKeys(dataa.get(20).toString());
		Thread.sleep(2000);
		createemp.getlca().sendKeys(dataa.get(21).toString());
		Thread.sleep(2000);
		createemp.getLcaExpiry().sendKeys(dataa.get(22).toString());
		Thread.sleep(2000);
		createemp.getW4().sendKeys(dataa.get(23).toString());
		Thread.sleep(2000);
	/*	createemp.getW4expiry().sendKeys(dataa.get(24).toString());
		Thread.sleep(2000);
		createemp.getUploadDoc().sendKeys(dataa.get(25).toString());
		Thread.sleep(2000);
		createemp.getDocexpiry().sendKeys(dataa.get(26).toString());
        reuse.mouseover(createemp.getSave(),webDriver);*/
	}

	/*@Test(description="Check the functionality of creating Multiple employee",priority=2)
public void multipleEmployeeCreating() throws AWTException, InterruptedException
{
	//vendoremp.getCreate().click();
	vendoremp.getCreateMulti().click();

	reuse.uploadfile(createemp.getUploadDoc(), "c:/rightcomply/Multipleclient.csv");
	Thread.sleep(8000);
	createemp.getSave().click();
	System.out.println(createemp.getSuccessmsg().getText());
}*/
	
}
