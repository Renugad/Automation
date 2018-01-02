package com.rightcomply.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.rightcomply.util.*;



public class HomePage extends Page {
	

	

	private final String imageright="//img[@alt='Right Comply']";
	private final String signup = "//h1[@title='SIGN UP']";
	private final String firstname="first_name";
	private final String lastname="last_name";
	private final String emailtextid="login_email";
	private final String passwordtextid="login_password";
	private final String businessname="business_name";
	private final String email="email";
	private final String passsword="password";
	private final String confirmpassword="confirm_password";
	private final String freetrial="free_trial";
	private final String paymentplan="make_payment";
	private final String loginid="login_submit";
	private final String homepageImage=".//img[@alt='Right Compl']";
	private final String forgotpass="Forgot Password?";
	private final String loginemail="login_email";
	private final String loginpassword="login_password";
	private final String loginsubmit="login_submit";
	private final String forgotpassheading="/html/body/div[1]/div/h1";
	private final String forgotpassAcc="/html/body/div[1]/div/div/div/div/div/div/h2";
	private final String forgotpasssubmit=".//*[@id='create-account']/div[2]/input";
	private final String registerbutton="make_payment";

	
	//private final String errorinvalidlogin="/html/body/div[1]/div/div/div[1]/p";
	
	@FindBy(how=How.ID,using=registerbutton)
	private WebElement register_button;
	
	@FindBy(how=How.ID,using=firstname)
	private WebElement f_name;
	
	@FindBy(how=How.ID,using=lastname)
	private WebElement l_name;
	
	@FindBy(how=How.ID,using=email)
	private WebElement emailid;
	
	@FindBy(how=How.ID,using=businessname)
	private WebElement business_name;
	
	@FindBy(how=How.ID,using=passsword)
	private WebElement pass_word;
	
	@FindBy(how=How.ID,using=forgotpass)
	private WebElement forgotpass1;
	
	
	@FindBy(how=How.LINK_TEXT,using=forgotpass)
	private WebElement forgotpasslink;
	
	@FindBy(how=How.XPATH,using=homepageImage)
	private WebElement homepageImagev;
	
	
	@FindBy(how=How.ID,using=emailtextid)
	//@CacheLookup
	private WebElement textBoxElement;
	
	@FindBy(how=How.ID,using=passwordtextid)
	private WebElement passwordtext;
	@FindBy(how=How.ID,using=loginid)
	private WebElement login;
	@FindBy(how=How.XPATH,using=signup)
	private WebElement signupbutton;
	
	
	@FindBy(how=How.ID,using=freetrial)
	private WebElement freetrials;
	
	@FindBy(how=How.ID,using=paymentplan)
	private WebElement payment_plan;
	
	@FindBy(how=How.ID,using=confirmpassword)
	private WebElement confirm_password;
	
	
	@FindBy(how=How.ID,using=loginemail)
	private WebElement loginEmail;
	
	@FindBy(how=How.ID,using=loginpassword)
	private WebElement loginPassword;
	
	@FindBy(how=How.ID,using=loginsubmit)
	private WebElement loginSubmit;
	
	@FindBy(how=How.XPATH,using=forgotpassheading)
	private WebElement forgotpass_heading;
	
	@FindBy(how=How.XPATH,using=forgotpassAcc)
	private WebElement forgotpass_account;
	
	@FindBy(how=How.XPATH,using=forgotpasssubmit)
	private WebElement forgotpass_submit;
	
	
	
	public HomePage(WebDriver webDriver) {
		super(webDriver);
	}
	
	
	
	public WebElement getloginTextBox() {
		return textBoxElement;
	}
	
	public WebElement getFirstname() {
		return f_name;
	}
	public WebElement getLastname() {
		return l_name;
	}	
	public WebElement getEmail() {
		return emailid;
	}
	
	public WebElement getPassword() {
		return pass_word;
	}
	public WebElement getConfirmpassword() {
		return confirm_password;
	}
	public WebElement signup_button() {
		return signupbutton;
	}
	public WebElement getFree() {
		return freetrials;
	}
	
	public WebElement getPaymentplan() {
		return payment_plan;
	}
	public WebElement getpasswordtext() {
		return passwordtext;
	}
	
	public WebElement getlogin() {
		return login;
	}
	
	
	public WebElement forgotpass()
	{
		return forgotpasslink;
	}
	
	public WebElement email()
	{
		return loginEmail;
	}
	public WebElement password()
	{
		return loginPassword;
	}
	public WebElement submit()
	{
		return loginSubmit;
	}
	public WebElement forgotpassHeading()
	{
		return forgotpass_heading;
	}
	public WebElement forgotpassAccount()
	{
		return forgotpass_account;
	}
	public WebElement forgotSub() {
		return forgotpass_submit;
	}
	public WebElement getRegister()
	{
		return register_button;
	}
}
