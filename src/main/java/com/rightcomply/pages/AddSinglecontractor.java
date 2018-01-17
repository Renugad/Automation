package com.rightcomply.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddSinglecontractor extends Page{

	public AddSinglecontractor(WebDriver webDriver) 
	{
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
	private final String firstname="first_name";
	private final String lastname="last_name";
	private final String email="email";
	private final String mobileno="number";
	private final String dateofbirth="dob";
	private final String countryofbirth="cob";
	private final String employee="employee";
	private final String workpermitdrop=".//*[@id='cc_id2_chosen']/a/div/b";
	private final String workpermittext=".//*[@id='cc_id2_chosen']/div/div/input";
	private final String permitexpiry="permit_expiry";
	private final String workpermitupload="wpupload";
	private final String photoissue="photoissue";
	private final String photoexpiry="photoexpiry";
	private final String photoupload="phototupload";
	private final String projectname="projectname";
	private final String jobtitle="job_title";
	private final String client="//button[@title='None selected']";
	private final String location="city";
	private final String startdate="start_date";
	private final String enddate="end_date";
	private final String note="textarea";
	private final String i9upload="ifileupload";
	private final String i9expiry="i9expiry";
	private final String w4expiry="w4_expiry";
	private final String w4upload="w4upload";
	private final String docexpiry="docexpiry";
	private final String docupload="condocupload";
	
	@FindBy(how=How.ID,using=firstname)
    private WebElement Firstname;
	
	@FindBy(how=How.ID,using=lastname)
    private WebElement Lastname;
	
	@FindBy(how=How.ID,using=email)
    private WebElement e_mail;
	
	@FindBy(how=How.ID,using=mobileno)
    private WebElement mobile_number;
	
	@FindBy(how=How.ID,using=dateofbirth)
    private WebElement Date_of_birth;
	
	@FindBy(how=How.ID,using=countryofbirth)
    private WebElement country_of_birth;
	
	@FindBy(how=How.ID,using=employee)
    private WebElement Employee;
	
	@FindBy(how=How.ID,using=workpermitdrop)
    private WebElement workpermit_drop;
	
	@FindBy(how=How.ID,using=workpermittext)
    private WebElement workpermit_text;
	
	@FindBy(how=How.ID,using=permitexpiry)
    private WebElement permit_expiry;
	
	@FindBy(how=How.ID,using=workpermitupload)
    private WebElement workpermit_upload;
	
	@FindBy(how=How.ID,using=photoissue)
    private WebElement photo_issue;
	
	@FindBy(how=How.ID,using=photoexpiry)
    private WebElement photo_expiry;
	
	@FindBy(how=How.ID,using=photoupload)
    private WebElement photo_upload;
	
	@FindBy(how=How.ID,using=projectname)
    private WebElement project_name;
	
	@FindBy(how=How.ID,using=jobtitle)
    private WebElement job_title;
	
	@FindBy(how=How.ID,using=client)
    private WebElement Client;
	
	@FindBy(how=How.ID,using=location)
    private WebElement Location;
	
	@FindBy(how=How.ID,using=startdate)
    private WebElement start_date;
	
	@FindBy(how=How.ID,using=enddate)
    private WebElement end_date;
		
	@FindBy(how=How.ID,using=note)
    private WebElement Note;
	
	@FindBy(how=How.ID,using=i9upload)
    private WebElement i9_upload;
	
	@FindBy(how=How.ID,using=i9expiry)
    private WebElement i9_expiry;
	
	@FindBy(how=How.ID,using=w4expiry)
    private WebElement w4_expiry;
	
	@FindBy(how=How.ID,using=docexpiry)
    private WebElement doc_expiry;
	
	@FindBy(how=How.ID,using=docupload)
    private WebElement doc_upload;
	
		
	public WebElement getfname()
	{
	return Firstname;
	}
	public WebElement getlname()
	{
	return Lastname;
	}
	public WebElement getEmail()
	{
	return e_mail;
	}
	public WebElement getNumber()
	{
	return mobile_number;
	}
	public WebElement getDOB()
	{
	return Date_of_birth;
	}
	public WebElement getcountryofbirth()
	{
	return country_of_birth;
	}
	public WebElement getEmployee()
	{
	return Employee;
	}
	public WebElement getWorkpermitdrop()
	{
	return workpermit_drop;
	}
	public WebElement getWorkpermittext()
	{
	return workpermit_text;
	}
	public WebElement getPermitexpiry()
	{
	return permit_expiry;
	}
	public WebElement getWorkpermit_upload()
	{
	return workpermit_upload;
	}
	public WebElement getPhotoissue()
	{
	return photo_issue;
	}
	public WebElement getPhotoexpiry()
	{
	return photo_expiry;
	}
	public WebElement getPhotoupload()
	{
	return photo_upload;
	}
	public WebElement getProjectname()
	{
	return project_name;
	}
	public WebElement getjobTitle()
	{
	return job_title;
	}
	public WebElement getClient()
	{
	return Client;
	}
	public WebElement getLocation()
	{
	return Location;
	}
	public WebElement getStartdate()
	{
	return start_date;
	}
	public WebElement getEnddate()
	{
	return end_date;
	}
	public WebElement getNote()
	{
	return Note;
	}
	public WebElement geti9upload()
	{
	return i9_upload;
	}
	public WebElement geti9expiry()
	{
	return i9_expiry;
	}
	public WebElement getW4expiry()
	{
	return w4_expiry;
	}
	public WebElement getDoc()
	{
	return doc_expiry;
	}
	public WebElement getDocupload()
	{
	return doc_upload;
	}
	
}
