package com.rightcomply.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateEmployee extends Page{

	public CreateEmployee(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
	private final String fname="//input[@id='first_name']";
	private final String lname="last_name";
	private final String phnumber="number";
	private final String email="email";
	private final String dateofbirth="dob";
	private final String countryofbirth="cob";
	private final String attorney="attorney";
	
	
	//workautorization
	private final String workauthorization="cc_id2";
	private final String workpermit_expirydate="permit_expiry";
	private final String workpermitdocupload="wpupload";
	
	//photoid
	private final String photoid_issuedate="photoissue";
	private final String photoid_expirydate="photoexpiry";
	private final String photoidupload="photoupload";
	
	//projectdetails
	private final String projectname="projectname";
	private final String jobtitle="job_title";
	private final String client=".//*[@id='carousel-example-generic3']/div/div/div[1]/div/div[1]/div/div[3]/div[2]/span/div/button";
	private final String jobcity="city";
	private final String startdate="example6";
	private final String endate="end_date";
	private final String notes="textarea";
	
	//documents
	private final String i9expiry="i9expiry";
	private final String i9="ifileupload";
	private final String lca="lcaupload";
	private final String lcaexpiry="lcaexpiry";
	private final String w4expiry="w4expiry";
	private final String w4upload="w4upload";
	private final String docexpiry="docexpiry";
	private final String docupload="empdocupload";
	
	//timesheet
	private final String bulktimesheet=".//*[@id='carousel-example-generic3']/div/div/div[2]/div/div/div/div/div/div[2]/div/input";
	
	
	
	
	
	private final String cancel="Cancel";
	private final String save=".//*[@id='create_emp']";
	private final String fname_err="//*[@id='create_new_employe']/div/div/div[1]/div/div/div";
	private final String lname_err="//*[@id='create_new_employe']/div/div/div[2]/div/div/div";
	private final String email_err="//*[@id='fields']/div/div";
	private final String phone_err="//*[@id='create_new_employe']/div/div/div[5]/div[2]";
	private final String jobtitle_err="//*[@id='create_new_employe']/div/div/div[8]/div/div/div";
	private final String jobstate_err="//*[@id='create_new_employe']/div/div/div[11]/div[2]";
	private final String jobcity_err="//*[@id='create_new_employe']/div/div/div[12]/div/div[2]";
	private final String startdate_err="//*[@id='create_new_employe']/div/div/div[13]/div/div[1]/div/div";
	private final String multipledoc="/html/body/div[3]/div[2]/div/form/div[1]/div[1]/div/div[1]";
	private final String invaliddocerr="//*[@id='userfileerr']";
	private final String successmsg="//div[@class='alert alert-success']";
	private final String upload="//*[@id='usrfile']";
	
	
	@FindBy(how=How.XPATH,using=upload)
	private WebElement uploaddoc;
	
	@FindBy(how=How.XPATH,using=successmsg)
	private WebElement msg_success;
	
	@FindBy(how=How.XPATH,using=invaliddocerr)
	private WebElement csverr;
	
	@FindBy(how=How.XPATH,using=multipledoc)
	private WebElement multiple_doc;
	@FindBy(how=How.XPATH,using=email_err)
	private WebElement emailerr;
	@FindBy(how=How.XPATH,using=fname_err)
	private WebElement firstnameerr;
	@FindBy(how=How.XPATH,using=lname_err)
	private WebElement lastnameerr;
	@FindBy(how=How.XPATH,using=phone_err)
	private WebElement pherr;
	@FindBy(how=How.XPATH,using=jobtitle_err)
	private WebElement job_titleerr;
	@FindBy(how=How.XPATH,using=jobstate_err)
	private WebElement job_stateerr;
	@FindBy(how=How.XPATH,using=jobcity_err)
	private WebElement job_cityerr;
	@FindBy(how=How.XPATH,using=startdate_err)
	private WebElement startdateerr;
	@FindBy(how=How.XPATH,using=client)
	private WebElement clientdrop;
	
	@FindBy(how=How.ID,using=email)
	private WebElement emailid;
	
	@FindBy(how=How.ID,using=phnumber)
	private WebElement phonenumber;
	
	@FindBy(how=How.ID,using=jobtitle)
	private WebElement job_title;
	
	@FindBy(how=How.ID,using=dateofbirth)
	private WebElement dob;

	
	@FindBy(how=How.ID,using=jobcity)
	private WebElement job_city;
	
	@FindBy(how=How.ID,using=countryofbirth)
	private WebElement country_of_birth;
	
	@FindBy(how=How.ID,using=workpermitdocupload)
	private WebElement workpermitupload;
	
	
	@FindBy(how=How.XPATH,using=i9)
	private WebElement i_9;
	
	@FindBy(how=How.ID,using=i9expiry)
	private WebElement i9_expiry;
	
	@FindBy(how=How.XPATH,using=photoid_issuedate)
	private WebElement photo_id_issuedate;
	
	@FindBy(how=How.XPATH,using=photoid_expirydate)
	private WebElement photo_id_expirydate;
	
	@FindBy(how=How.ID,using=workauthorization)
	private WebElement workpermit_doc;
	
	@FindBy(how=How.NAME,using=workpermit_expirydate)
	private WebElement work_permit_expirydate;
	
	@FindBy(how=How.XPATH,using=lca)
	private WebElement lcadoc;
	@FindBy(how=How.ID,using=lcaexpiry)
	private WebElement lca_expiry;
	
	
	@FindBy(how=How.XPATH,using=w4upload)
	private WebElement w4_upload;
	
			
	@FindBy(how=How.ID,using=notes)
	private WebElement note;
	@FindBy(how=How.TAG_NAME,using=cancel)
	private WebElement cancel_button;
	
	@FindBy(how=How.XPATH,using=save)
	private WebElement save_button;
	@FindBy(how=How.XPATH,using=startdate)
	private WebElement job_startdate;
	
	
	@FindBy(how=How.XPATH,using=fname)
	private WebElement firstname;
	@FindBy(how=How.ID,using=lname)
	private WebElement lastname;
	
	
	
	public WebElement getfname()
	{
		return firstname;
		
	}
	public WebElement getlname()
	{
		return lastname;
	}
	public WebElement getemail()
	{
		return emailid;
	}
	
	public WebElement getphno()
	{
		return phonenumber;
	}
	
	public WebElement getclientname()
	{
		return clientdrop;
	}
	public WebElement getjobtitle()
	{
		return job_title;
	}
	public WebElement getdob()
	{
		return dob;
	}
	public WebElement getcounty()
	{
		return country_of_birth;
	}
	public WebElement getworkpermitUpload()
	{
		return workpermitupload;
	}
	public WebElement getjobcity()
	{
		return job_city;
	}
	public WebElement getstartdate()
	{
		return job_startdate;
	}
	
	public WebElement geti9()
	{
		return i_9;
	}
	public WebElement getei9expiry()
	{
		return i9_expiry;
	}
	public WebElement getphotoid()
	{
		return photo_id_issuedate;
	}
	
	public WebElement getworkpermitDoc()
	{
		return workpermit_doc;
	}
	public WebElement getworkpermit_expiry()
	{
		return work_permit_expirydate;
	}
	public WebElement getlca()
	{
		return lcadoc;
	}
	public WebElement getLcaExpiry()
	{
		return lca_expiry;
	}
	
	public WebElement getStartdateerr()
	{
		return startdateerr;
	}
	public WebElement getJobcityerr()
	{
		return job_cityerr;
	}
	public WebElement getJobstateerr()
	{
		return job_stateerr;
	}
	public WebElement getJobtitleerr()
	{
		return job_titleerr;
	}
	public WebElement getPherr()
	{
		return pherr;
	}
	public WebElement getEmailerr()
	{
		return emailerr;
	}
	public WebElement getFnameerr()
	{
		return firstnameerr;
	}
	public WebElement getLnameerr()
	{
		return lastnameerr;
	}
	public WebElement getSave()
	{
		return save_button;
	}
	public WebElement getMultipledoc()
	{
		return multiple_doc;
	}
	
	public WebElement getCountryofbirth()
	{
		return country_of_birth;
	}
	
	public WebElement getPhotoidissuedate()
	{
		return photo_id_issuedate;
	}
	public WebElement getPhotoidExpiry()
	{
		return photo_id_expirydate;
	}
	public WebElement getSuccessmsg()
	{
		return msg_success;
	}
	public WebElement getCsverr()
	{
		return csverr;
	}
	public WebElement getUploadDoc()
	{
		return uploaddoc;
	}
	public WebElement getW4()
	{
		return w4_upload;
	}
}
