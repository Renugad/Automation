package com.rightcomply.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LaunchPage extends Page{
	
	public LaunchPage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
	private final String addworkforce="/html/body/div[1]/div/div/a[1]/span";
	private final String addvendor="/html/body/div[1]/div/div/a[4]/span";
	private final String addclient="/html/body/div[1]/div/div/a[2]/span";
	private final String generatereports="/html/body/div[1]/div/div/a[3]/span";
	
	@FindBy(how=How.XPATH,using=addworkforce)
    private WebElement add_workforce;
	
	@FindBy(how=How.XPATH,using=addvendor)
    private WebElement add_vendor;
	
	@FindBy(how=How.XPATH,using=addclient)
    private WebElement add_client;
	
	@FindBy(how=How.XPATH,using=generatereports)
    private WebElement generate_reports;
	
	
	public WebElement getAddworkforce()
	{
		return add_workforce;
		}

	public WebElement getAddvendor() {
		return add_vendor;
	
	}
	public WebElement getAddclient() {
		return add_client;
	
	}
	public WebElement getGeneratereports() {
		return generate_reports;
	
	}
}
