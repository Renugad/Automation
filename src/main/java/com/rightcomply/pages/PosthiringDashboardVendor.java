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


/*	
private final String notification="/html/body/nav/div/ul/li[1]/a/i";
private final String warning="/html/body/nav/div/ul/li[1]/ul/li[2]/a";
private final String notitask="/html/body/nav/div/ul/li[1]/ul/li[2]/a";
private final String expiringsoon="/html/body/nav/div/ul/li[1]/ul/li[1]/a";
private final String myprofile="//a[@href='http://pre.rightcomply.com/vendor/Myprofile']";
private final String clientinvite="//a[@class='clt-invite']";
private final String clientlisting="//a[@href='http://pre.rightcomply.com/client/clientinviteListings']";

private final String employees="Employees";
private final String contractors="Contractors";
private final String task="Tasks";
private final String firstname="//*[@id='example']/thead/tr/th[1]";
private final String lastname="//*[@id='example']/thead/tr/th[2]";
private final String employeeorcontractor="//*[@id='example']/thead/tr/th[3]";
private final String assignedclient="//*[@id='example']/thead/tr/th[4]";
private final String startdate="//*[@id='example']/thead/tr/th[5]";
private final String city="//*[@id='example']/thead/tr/th[6]";
private final String compliancestatus="//*[@id='example']/thead/tr/th[7]";
private final String action="//*[@id='example']/thead/tr/th[8]]";

private final String entrylength="//*[@id='example_length']/label/select";
private final String usericon="dropdownMenu1";
private final String datatable="example";
private final String bottomline="//div[@id='example_info']";
private final String taskdropdown="//*[@id='directory-n2']";
private final String warningdropdown="//*[@id='directory-n1']";
private final String expiringdropdown="//*[@id='directory-n']";

   @FindBy(how=How.XPATH,using=expiringdropdown)
   private WebElement expiring_drop;

   @FindBy(how=How.XPATH,using=warningdropdown)
   private WebElement warning_drop;*/

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
	private WebElement tasklink;
	
	@FindBy(how=How.XPATH,using=search)
	private WebElement Searchicon;
	
	@FindBy(how=How.XPATH,using=searchtext)
	private WebElement Searchtext;
	
	@FindBy(how=How.XPATH,using=addsingle_employee)
	private WebElement singleemployee;
	
	@FindBy(how=How.XPATH,using=addmulti_employee)
	private WebElement multiemployee;
	
	/*@FindBy(how=How.XPATH,using=startdate)
	private WebElement startingdate;
	
	@FindBy(how=How.XPATH,using=city)
	private WebElement location;
	
	@FindBy(how=How.XPATH,using=compliancestatus)
	private WebElement compstatus;
	
	@FindBy(how=How.XPATH,using=action)
	private WebElement actionbutton;
	
	@FindBy(how=How.XPATH,using=searchtext)
	private WebElement search_text;
	
	@FindBy(how=How.XPATH,using=entrylength)
	private WebElement showentrynum;
	
	
	
	public WebElement getbottomtext()
	{
		return bottomtext;
	}
	
	public WebElement getprofile() {
		return meprofile;
	}
	public WebElement getclientinvite() {
		return client_invite;
	}
	public WebElement getclientlist() {
		return clientlist;
	}*/
	public WebElement getloggoff() {
		return logout;
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
}

