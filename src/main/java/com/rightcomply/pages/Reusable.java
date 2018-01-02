package com.rightcomply.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Reusable{
	
	public void entertext(WebElement obj,String value)
	{
		obj.sendKeys(value);
	}
	public void clickonobject(WebElement obj,String value)
	{
		obj.click();
	}
	
	/* reusable function for searchig a keyword in a table
	 * Passing arguments are table object to search on.
	 * Search keyword.
	 * enter keys before calling this function
	 */
	public void search(WebElement obj,String searchkeyword)
	{
		boolean keypresent=false;
		List<WebElement> rows=obj.findElements(By.tagName("tr"));
		for (WebElement row : rows)
	      {
	       List<WebElement> cols=row.findElements(By.tagName("td"));
	    
	       for(int j=0;j<cols.size();j++)
	       {
	    	  if(cols.get(j).getText().contains(searchkeyword))
	    	  {
	    		  keypresent=true;
	    		  
	  	      }
	       }
	
	      }
		if(keypresent)
		{
			System.out.println("The table records contains the search keyword");
			System.out.println("Testcase to validate search functionality passed");
		}
		else
		{
			System.out.println("The table records doesnot contains the search keyword");
			System.out.println("Testcase to validate Search functionality failed");
		}
	}
	
	
	
		public void ascendingSort(WebElement obj1, boolean issort,String fieldname,WebElement obj2)
		{
			ArrayList A1=new ArrayList();
			List<WebElement> trows = obj1.findElements(By.tagName("tr"));
		      
		      for (WebElement row : trows)
		      {
		       List<WebElement> cols=row.findElements(By.tagName("td"));
		    for(int i=0;i<cols.size();i++)
		    {
		       A1.add(cols.get(0).getText());
		       break;
			}
		      }
			System.out.println(A1);
			Collections.sort(A1, String.CASE_INSENSITIVE_ORDER);
			//Collections.sort(companyname);
			System.out.println("After sorting by collections");
			System.out.println(A1);
			//vendorclient.getcompany().click();
			ArrayList A1aftersort=new ArrayList();
			List<WebElement> newrow = obj2.findElements(By.tagName("tr"));
		      // Get all rows   assertEquals(3, rows.size());
		      for (WebElement nrow : newrow)
		      {
		       List<WebElement> ncols=nrow.findElements(By.tagName("td"));
		       for(int j=0;j<ncols.size();j++)
		       {
		       A1aftersort.add(ncols.get(0).getText());
		       break;
		       }
			}
			System.out.println("company list after sorting");
			System.out.println(A1aftersort);
			if(A1.equals(A1aftersort))
			{
				System.out.println("The company name is same as companyname after sorting.");
			}
			else
			{
				System.out.println("The company name is not same as companyname after sorting");
			}
		}
		
		
		/*Reusable function to perform See pagination,according to the entries selected from select drop down
		 * Arguments are webelement object of dropdown,webelement of Bottom text,Matching text,Select index as number
		 */
		
		public void showEntry(WebElement objdrop,WebElement objbottom,String matchtext,int indexoption)
		{
			Select show=new Select(objdrop);
			show.selectByIndex(indexoption);
			if(objbottom.getText().contains(matchtext))
			{
			 System.out.println("The bottom text contains"+show.getFirstSelectedOption().getText());
			}
			else
			{
			System.out.println("The bottom text doesnot contains"+show.getFirstSelectedOption().getText());
			}
			
		}
		/*Reusable fuction to perform mouseover action
		 * Send the object of webelement perform actions
		 * Arguments are webelement on which mouse should perform action and driver
		 */
	public void mouseover(WebElement obj,WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.moveToElement(obj).build().perform();
		obj.click();
	}
	
	public void datepicker(WebElement objdatepicker,String day)
	{
		objdatepicker.findElement(By.tagName("table"));
		List<WebElement> rows = objdatepicker.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				if((cols.get(j).getText()).equals(day));
				{
					cols.get(j).click();
					break;
				}
								}
			}
		}
	
	
/*This method is to work on drop down with filter text box
 * send drop webelement,textbox webelement and text to enter	
 */
		
public void selectdrop(WebElement drop,String text)
{
	Select show1=new Select(drop);
	show1.selectByValue(text);;
	//drop.click();
	
	
}


public String[][] readSheet(String filepath,String sheetName) throws IOException
{
	//String filepath;
	//String sheetName;
	/*Step 1: Get the XL Path*/
	File xlFile = new File(filepath);

	/*Step2: Access the Xl File*/
	FileInputStream xlDoc = new FileInputStream(xlFile);

	/*Step3: Access the work book */
	HSSFWorkbook wb = new HSSFWorkbook(xlDoc);


	/*Step4: Access the Sheet */
	HSSFSheet sheet = wb.getSheet(sheetName);

	int iRowCount =  sheet.getLastRowNum()+1;
	int iColCount = sheet.getRow(1).getLastCellNum();//Row count starts from '0' in excel

	System.out.println("Total row = " + iRowCount + " total col = " + iColCount);

	String[][] xlData = new String[iRowCount-1][iColCount];

	for(int i = 0; i<iRowCount;i++){
		for(int j = 0; j <iColCount;j++){
			//xlData[i][j] = sheet.getRow(i).getCell(j).getStringCellValue().trim();
			Cell cell = sheet.getRow(i).getCell(j);
			switch(cell.getCellType()){
				case Cell.CELL_TYPE_STRING:
					xlData[i][j] = sheet.getRow(i).getCell(j).getStringCellValue().trim();
					break;
				case Cell.CELL_TYPE_NUMERIC:
					xlData[i][j] = new Double(sheet.getRow(i).getCell(j).getNumericCellValue()).toString() ;
					break;
					
			}
		}
	}
	//wb.close();
    //return xlData;
    
	return xlData;
}

public void uploadfile(WebElement uploadicon,String fpath) throws AWTException
{
	Robot robot=new Robot();
	uploadicon.click();
	robot.setAutoDelay(3000);
	StringSelection strselection=new StringSelection(fpath);
	System.out.println("The file path is"+fpath);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection,null);
	robot.setAutoDelay(3000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	
	robot.delay(3000);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
}
public void mouseover(Object click, WebDriver webDriver) {
	// TODO Auto-generated method stub
	Actions action=new Actions(webDriver);
	action.moveToElement(obj).build().click();
	Object.click();
}

 


}

	
	
	


