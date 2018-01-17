package com.rightcomply.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PosthiringDashboardVendor {

private final String clickimg="//img[@alt='Right Comply']";
private final String workforce="My Workforce"; 
private final String userdropdown="//*[@id='dropdownMenu1']";
private final String client="Clients";
private final String setting="Settings";
private final String logoff="//a[@href='http://new.rightcomply.com/login_new/logout']";
private final String add="/html/body/div[1]/div/div[1]/div/button";
private final String addsingle_employee="/html/body/div[1]/div/div[1]/div/ul/li[1]/a";
private final String addmulti_employee="/html/body/div[1]/div/div[1]/div/ul/li[2]/a";
private final String employees=".//*[@id='myTab']/li[1]/a";
private final String contractors=".//*[@id='myTab']/li[2]/a";
private final String noncompliant=".//*[@id='myTab_ss']/li[1]/a";
private final String critical=".//*[@id='myTab_ss']/li[2]/a";
private final String compliant=".//*[@id='myTab_ss']/li[3]/a";
private final String recentlyadded=".//*[@id='myTab_ss']/li[4]/a";
private final String all=".//*[@id='myTab_ss']/li[5]/a";
private final String search=".//*[@id='search-form']/div/div[1]/i";
private final String searchtext=".//*[@id='tab1']/div/div[2]";
private final String empname="//p[@class='name']";
private final String uploaddocumentlink="//p[@class='upload_model_click blue-txt']";
private final String uploadi9=".//*[@id='upifileimg']";
private final String uploadlca=".//*[@id='uplcaimg']";
private final String uploadphotoid=".//*[@id='upphotoimg']";
private final String i9expiry=".//*[@id='i9expiry_date']";
private final String lcaexpiry=".//*[@id='lcaexpiry_date']";
private final String photoidissue=".//*[@id='photoissue_date']";
private final String photoidexpiry=".//*[@id='photoexpiry_date']";
private final String updatedocuments=".//*[@id='all_form_submit']";
private final String heading="//h2[@class='counts text-left pull-left']";



	@FindBy(how=How.XPATH,using=heading)
	private WebElement Heading;
	@FindBy(how=How.XPATH,using=uploaddocumentlink)
	private WebElement upload_link;

	@FindBy(how=How.XPATH,using=empname)
	private WebElement employeename;

	@FindBy(how=How.XPATH,using=logoff)
	private WebElement logout;

	@FindBy(how=How.XPATH,using=clickimg)
	private WebElement clickableimg;
	
	@FindBy(how=How.LINK_TEXT,using=workforce)
	private WebElement myworkforce;
	
	@FindBy(how=How.XPATH,using=userdropdown)
	private WebElement user_drop;
	
	@FindBy(how=How.LINK_TEXT,using=client)
	private WebElement Clients;

	@FindBy(how=How.LINK_TEXT,using=setting)
	private WebElement Settings;
	
	@FindBy(how=How.XPATH,using=add)
	private WebElement Add;
	
	@FindBy(how=How.XPATH,using=employees)
	private WebElement Employees;
	
	@FindBy(how=How.XPATH,using=contractors)
	private WebElement Contractor;
	
	@FindBy(how=How.ID,using=userdropdown)
	private WebElement userdropdownlist;
	
	@FindBy(how=How.XPATH,using=noncompliant)
	private WebElement Noncompliant;
	
	@FindBy(how=How.XPATH,using=critical)
	private WebElement Critical;
	
	@FindBy(how=How.XPATH,using=compliant)
	private WebElement Compliant;
	
	@FindBy(how=How.XPATH,using=recentlyadded)
	private WebElement Recentlyadded;
	
	@FindBy(how=How.XPATH,using=all)
	private WebElement All;
	
	@FindBy(how=How.XPATH,using=search)
	private WebElement Searchicon;
	
	@FindBy(how=How.XPATH,using=searchtext)
	private WebElement Searchtext;
	
	@FindBy(how=How.XPATH,using=addsingle_employee)
	private WebElement singleemployee;
	
	@FindBy(how=How.XPATH,using=addmulti_employee)
	private WebElement multiemployee;
	
	@FindBy(how=How.XPATH,using=uploadi9)
	private WebElement upload_i9;
	
	@FindBy(how=How.XPATH,using=uploadlca)
	private WebElement upload_lca;
	
	@FindBy(how=How.XPATH,using=uploadphotoid)
	private WebElement upload_photoid;
	
	@FindBy(how=How.XPATH,using=i9expiry)
	private WebElement i9_expiry;
	
	@FindBy(how=How.XPATH,using=lcaexpiry)
	private WebElement lca_expiry;
	
	@FindBy(how=How.XPATH,using=photoidissue)
	private WebElement photoid_issue;
	
	@FindBy(how=How.XPATH,using=photoidexpiry)
	private WebElement photoid_expiry;
	
	@FindBy(how=How.XPATH,using=updatedocuments)
	private WebElement update_documents;
	
	
	
	public WebElement getUploadi9()
	{
		return upload_i9;
	}
	
	public WebElement getUploadLca() {
		return upload_lca;
	}
	public WebElement getUploadPhotoid() {
		return upload_photoid;
	}
	public WebElement geti9expiry() {
		return i9_expiry;
	}
	public WebElement getlcaexpiry() {
		return lca_expiry;
	}
	
	public WebElement getPhotoidissue()
	{
		return photoid_issue;
	}
	
	public WebElement getPhotoidexpiry()
	{
		return photoid_expiry;
	}
	
	public WebElement getUploadlink() {
		return upload_link;
	}
	
	
	public WebElement getcontract() {
		return Contractor;
	}
	
	
	public WebElement getEmployee() {
		return Employees;
	}
	
	public WebElement getuserdropdown() {
		return user_drop;
	}
	
	
	public WebElement getsearch()
	{
		return Searchicon;
	}
	public WebElement getsearchText()
	{
		return Searchtext;
	}
		public WebElement getclickimg()
	{
		return clickableimg;
	}
	public WebElement getSingle()
	{
		return singleemployee;
	}
	public WebElement getMulitple()
	{
		return multiemployee;
	}
	public WebElement getAdd()
	{
		return Add;
	}

	public WebElement getEmpName() {
		// TODO Auto-generated method stub
		return employeename;
	}
	public WebElement getUpdateDocuments()
	{
		return update_documents;
	}
	public WebElement getNoncompliance()
	{
		return Noncompliant;
	}
	public WebElement getCritical()
	{
		return Critical;
	}
	public WebElement getCompliance()
	{
		return Compliant;
	}
	public WebElement getRecentlyAdded()
	{
		return Recentlyadded;
	}
	public WebElement getAll()
	{
		return All;
	}
	public WebElement getHeading()
	{
		return Heading;
	}
}

