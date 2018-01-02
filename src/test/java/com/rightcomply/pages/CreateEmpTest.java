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

		vendordash = PageFactory.initElements(webDriver,PosthiringDashboardVendor.class);
		vendoremp= PageFactory.initElements(webDriver, VendordashEmployee.class);
		createemp=PageFactory.initElements(webDriver, CreateEmployee.class);
		homepage.getloginTextBox().sendKeys("rcvendor@berijam.com");
		homepage.getpasswordtext().sendKeys("welcome123");
		homepage.getlogin().click();
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
		createemp.getCountryofbirth().sendKeys(dataa.get(5).toString());
		createemp.getdob().sendKeys(dataa.get(4).toString());
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
        reuse.mouseover(createemp.getSave(),webDriver);
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
