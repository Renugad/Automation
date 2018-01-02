package com.rightcomply.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VendordashEmployee extends Page{

	public VendordashEmployee(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	private final String emptitle="//div[@class='pull-left page-title']";
	private final String filterby="//select[@name='users_list']";
	private final String bottomline="//*[@id='example_info']";
	private final String createempt="create";
	private final String bystatus="By Status";
	private final String comply="Compliant";
	private final String notcomply="Not Compliant";
	private final String expiring="Expiring Soon";
	private final String warn="Warning";
	private final String empdir=" Employee Directory ";
	private final String headingtext="h4";
	private final String dira="A";
	private final String dirb="B";
	private final String dirc="C";
	private final String dird="D";
	private final String dire="E";
	private final String dirf="F";
	private final String dirg="G";
	private final String dirh="H";
	private final String diri="I";
	private final String dirj="J";
	private final String dirk="K";
	private final String dirl="L";
	private final String dirm="M";
	private final String dirn="N";
	private final String diro="O";
	private final String dirp="P";
	private final String dirq="Q";
	private final String dirr="R";
	private final String dirs="S";
	private final String dirt="T";
	private final String diru="U";
	private final String dirv="V";
	private final String dirw="W";
	private final String dirx="X";
	private final String diry="Y";
	private final String dirz="Z";
	private final String dirall="All";
	private final String entries="//select[@name='example_length']";
	private final String search="//input[@type='search']";
	private final String tableemp="//table[@id='example']";
	private final String empeditfname="//*[@id='employeeViewUpdate']/div/div[2]/div[2]/div[2]/div[1]/div/div/div[1]";
    private final String create_emp="Create";
    private final String createhead="h2";
    private final String singleemp="Employee";
    private final String multiemp="Multiple Employees";
    private final String selectfilter="//*[@id='user_select_chosen']/a/div/b";
    private final String filtertext="//*[@id='user_select_chosen']/div/div/input";
    
    @FindBy(how=How.XPATH,using=selectfilter)
    private WebElement select_filter;
    
    @FindBy(how=How.XPATH,using=filtertext)
    private WebElement filter_text;
    
    @FindBy(how=How.LINK_TEXT,using=singleemp)
    private WebElement create_single;
    
    @FindBy(how=How.LINK_TEXT,using=multiemp)
    private WebElement create_multiemp;
    
    @FindBy(how=How.TAG_NAME,using=createhead)
    private WebElement create_heading;
    @FindBy(how=How.LINK_TEXT,using=create_emp)
    private WebElement createemp;
	@FindBy(how=How.XPATH,using=empeditfname)
	private WebElement firstname_edit;
	@FindBy(how=How.TAG_NAME,using=headingtext)
	private WebElement headingtitle;
	
	@FindBy(how=How.XPATH,using=tableemp)
	private WebElement empdata;
	
	@FindBy(how=How.LINK_TEXT,using=comply)
	private WebElement complaint;
	
	@FindBy(how=How.XPATH,using=bottomline)
	private WebElement bottomtext;
	
	@FindBy(how=How.LINK_TEXT,using=notcomply)
	private WebElement notcomplaint;
	
	@FindBy(how=How.LINK_TEXT,using=expiring)
	private WebElement expiringsoon;
	
	@FindBy(how=How.LINK_TEXT,using=warn)
	private WebElement warning;
	
	@FindBy(how=How.XPATH,using=emptitle)
	private WebElement employeetitle;
	
	@FindBy(how=How.LINK_TEXT,using=bystatus)
	private WebElement statuslink;
	
	@FindBy(how=How.XPATH,using=filterby)
	private WebElement filter;
	
	@FindBy(how=How.XPATH,using=search)
	private WebElement searchtext;
	@FindBy(how=How.LINK_TEXT,using=dira)
	private WebElement A;
	
	@FindBy(how=How.LINK_TEXT,using=dirb)
	private WebElement B;
	@FindBy(how=How.LINK_TEXT,using=dirc)
	private WebElement C;
	
	@FindBy(how=How.LINK_TEXT,using=dird)
	private WebElement D;
	
	@FindBy(how=How.LINK_TEXT,using=dire)
	private WebElement E;
	
	@FindBy(how=How.LINK_TEXT,using=dirf)
	private WebElement F;
	
	@FindBy(how=How.LINK_TEXT,using=dirg)
	private WebElement G;
	
	@FindBy(how=How.LINK_TEXT,using=dirh)
	private WebElement H;
	
	@FindBy(how=How.LINK_TEXT,using=diri)
	private WebElement I;
	
	@FindBy(how=How.LINK_TEXT,using=dirj)
	private WebElement J;
	
	@FindBy(how=How.LINK_TEXT,using=dirk)
	private WebElement K;
	
	@FindBy(how=How.LINK_TEXT,using=dirl)
	private WebElement L;
	
	@FindBy(how=How.LINK_TEXT,using=dirm)
	private WebElement M;
	
	@FindBy(how=How.LINK_TEXT,using=dirn)
	private WebElement N;
	
	@FindBy(how=How.LINK_TEXT,using=diro)
	private WebElement O;
	
	@FindBy(how=How.LINK_TEXT,using=dirp)
	private WebElement P;
	
	@FindBy(how=How.LINK_TEXT,using=dirq)
	private WebElement Q;
	
	@FindBy(how=How.LINK_TEXT,using=dirr)
	private WebElement R;
	
	@FindBy(how=How.LINK_TEXT,using=dirs)
	private WebElement S;
	
	@FindBy(how=How.LINK_TEXT,using=dirt)
	private WebElement T;
	
	@FindBy(how=How.LINK_TEXT,using=diru)
	private WebElement U;
	
	@FindBy(how=How.LINK_TEXT,using=dirv)
	private WebElement V;
	
	@FindBy(how=How.LINK_TEXT,using=dirw)
	private WebElement W;
	
	@FindBy(how=How.LINK_TEXT,using=dirx)
	private WebElement X;
	
	@FindBy(how=How.LINK_TEXT,using=diry)
	private WebElement Y;
	
	@FindBy(how=How.LINK_TEXT,using=dirz)
	private WebElement Z;
	
	@FindBy(how=How.LINK_TEXT,using=dirall)
	private WebElement All;
	
	@FindBy(how=How.LINK_TEXT,using=empdir)
	private WebElement empdirectory;
	@FindBy(how=How.XPATH,using=entries)
	private WebElement showdrop;
	public WebElement getcomplaint()
	{
		return complaint;
	}
	public WebElement getnotcomplaint()
	{
		return notcomplaint;
	}
	public WebElement getexpiring()
	{
		return expiringsoon;
	}
	public WebElement getwarning()
	{
		return warning;
	}
	
	public WebElement getEntries()
	{
		return showdrop;
	}
	public WebElement getall() {
		return All;
		}
	public WebElement getz() {
		return Z;
		}
	
	public WebElement gety() {
		return Y;
		}
	public WebElement getx() {
		return X;
		}
	public WebElement getw() {
		return W;
		}
	public WebElement getv() {
			return V;
		}
	public WebElement getu() {
		return U;
		}
	public WebElement gett() {
		return T;
		}
	public WebElement gets() {
		return S;
		}
	public WebElement getr() {
		return R;
		}
	public WebElement getq() {
		return Q;
		}
	public WebElement getp() {
		return P;
		}
	public WebElement geto() {
		return O;
		}
	public WebElement getn() {
		return N;
		}
	public WebElement getm() {
		return M;
		}
	public WebElement geta() {
		return A;
	
	}
	public WebElement getb() {
		return B;
		}
	public WebElement getc() {
		return C;
		}
	public WebElement getd() {
		return D;
		}
	public WebElement gete() {
		return E;
	
	}
	public WebElement getf() {
		return F;
		}
	public WebElement getg() {
		return G;
		}
	public WebElement geth() {
		return H;
		}
	public WebElement geti() {
		return I;
	
	}
	public WebElement getj() {
		return J;
	
	}
	public WebElement getk() {
		return K;
		}
	public WebElement getl() {
		return L;
	}
	
	
	public WebElement getbystatus()
	{
		return statuslink;
		
	}
	public WebElement getempdir()
	{
		return empdirectory;
		
	}
	
	public WebElement getBottomtext()
	{
		return bottomtext;
	}
	
	public WebElement getempTable()
	{
		return empdata;
	}
	public WebElement getSearch()
	{
		return searchtext;
	}
	public WebElement getFilter()
	{
		return filter;
	}
	public WebElement getHeadingtext()
	{
		return headingtitle;
	}
	public WebElement getempFirstname()
	{
		return firstname_edit;
	}
	public WebElement getCreate()
	{
		return createemp;
	}
	public WebElement getCreateSingle()
	{
		return create_single;
	}
	
	public WebElement getCreateHeading()
	{
		return create_heading;
	}
	public WebElement getSelectFilter()
	{
		return select_filter;
	}
	public WebElement getCreateMulti()
	{
		return create_multiemp;
	}
	public WebElement getFilterText()
	{
		return filter_text;
	}
}
