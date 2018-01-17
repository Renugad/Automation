package com.rightcomply.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddEmployeesAsBatch extends Page{

	public AddEmployeesAsBatch(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
	private final String add="/html/body/div[1]/div/div[1]/div/button";
	private final String addemployee="//a[@href='http://new.rightcomply.com/employee_new/create_singleemp']";
	private final String addmultipleemployee="//a[@href='http://new.rightcomply.com/employee_new/vendorEmpImportCsv']";
	private final String multiheading=".//*[@id='tab1']/div[1]/h1";
	private final String browse=".//*[@id='vendor_upload_employee']/div/p[3]";
	//private final String
	//private final String
	@FindBy(how=How.XPATH,using=add)
	private WebElement Add;
	
	public WebElement getAdd() {
		return Add;
	}
	@FindBy(how=How.XPATH,using=addemployee)
	private WebElement Addemployee;
	
	public WebElement getAddemp() {
		return Addemployee;
	}
	
	@FindBy(how=How.XPATH,using=addmultipleemployee)
	private WebElement Addmultipleemployee;
	
	public WebElement getAddMultipleemp() {
		return Addmultipleemployee;
	}
	
	@FindBy(how=How.XPATH,using=multiheading)
	private WebElement Multiheading;
	
	public WebElement getloginTextBox() {
		return Multiheading;
	}
	@FindBy(how=How.XPATH,using=browse)
	private WebElement Browse;
	
	public WebElement getBrowse() {
		return Browse;
	}
	
	
}
