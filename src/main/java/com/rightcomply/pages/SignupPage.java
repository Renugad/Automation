package com.rightcomply.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignupPage extends Page{

	public SignupPage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
	private final String signupheading = "/html/body/div[1]/div/div/div/div/div/div[1]/h2";
	private final String firstname = "first_name";
	private final String lastname="last_name";
	private final String businessname="business_name";
	private final String emailid="email";
	private final String pwd="password";
	private final String confirmpassword = "confirm_password";
	private final String signupImage="/html/body/div[1]/div/div/div/div/img";
	private final String free="radio1";
	private final String paid="radio2";
	private final String makepayment="make_payment";
	
	 @FindBy(how=How.XPATH,using=signupheading)
	    private WebElement signup_heading;
	 
	 @FindBy(how=How.ID,using=firstname)
	    private WebElement Firstname;
	 
	 @FindBy(how=How.ID,using=lastname)
	    private WebElement Lastname;
	 
	 @FindBy(how=How.ID,using=businessname)
	    private WebElement Businessname;
	 
	 @FindBy(how=How.ID,using=emailid)
	    private WebElement email_id;
	 
	 @FindBy(how=How.ID,using=pwd)
	    private WebElement pass_word;
	 
	 @FindBy(how=How.ID,using=confirmpassword)
	    private WebElement confirm_password;
	 
	 @FindBy(how=How.ID,using=signupImage)
	    private WebElement signup_image;
	 
	 @FindBy(how=How.ID,using=free)
	    private WebElement free_plan;
	 
	 @FindBy(how=How.ID,using=paid)
	    private WebElement paid_plan;
	 
	 @FindBy(how=How.ID,using=makepayment)
	    private WebElement make_payment;
	
	public WebElement getfname() {
		return Firstname;
	
	}
	
	public WebElement getlname() {
		return Lastname;
	
	}
	
	public WebElement getEmail() {
		
		return email_id;
	
	}
	
	public WebElement getPassword() {
		return pass_word  ;
	
	}
	
	public WebElement getConfirmpassword() {
		return confirm_password ;
	
	}
	public WebElement getBusinessname()
	{
		return Businessname;
	}
	public WebElement getsigupImage() {
		return signup_image ;
	
	}
	public WebElement getFree()
	{
		return free_plan;
	}
	
	public WebElement getPaid()
	{
		return paid_plan;
	}
}
