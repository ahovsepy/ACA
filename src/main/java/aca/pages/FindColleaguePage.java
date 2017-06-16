package aca.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindColleaguePage extends PageObject{
	
	@FindBy(how=How.XPATH, using="//input[@name='first']") 
	private WebElement searchfirstname;
	
	@FindBy(how=How.XPATH, using="//input[@name='last']")
	private WebElement searchlastname;
	
	@FindBy(how=How.XPATH, using="//input[@name='search']")
	private WebElement searchButton;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Viktorya Karamyan")
	private WebElement user;
	
	@FindBy(how=How.XPATH, using="//a[contains(@data-tracking-control-name, 'pp_reg_upsell_view_full')]")
	private WebElement viewfullprofile;
	
	@FindBy(how=How.XPATH, using="//a[@class='sign-in-link']")
	private WebElement signInButton;
	
	@FindBy(how=How.ID, using="session_key-login")
	private WebElement sessionlogin;
	
	@FindBy(how=How.ID, using="session_password-login")
	private WebElement sessionpassword;
	
	@FindBy(how=How.XPATH, using="//input[@name='signin']")
	private WebElement sessionsignIn;
	
	@FindBy(how=How.ID, using="profile-nav-item")
	private WebElement navMeButton;
	
	@FindBy(how=How.XPATH, using="//a[contains(@data-control-name,'signout')]")
	private WebElement signOutButton;

	
	public FindColleaguePage(WebDriver driver){
		super(driver);
	}
	
	public boolean isInitialized() {
		
		return sessionsignIn.isDisplayed();
	}
	
	
	public void enterSearchCredentails(String firstname, String lastname){
		this.searchfirstname.clear();
		this.searchfirstname.sendKeys(firstname);
		
		this.searchlastname.clear();
		this.searchlastname.sendKeys(lastname);
		
	}
	
	public void clickOnSearch(){
		searchButton.click();
	}
	
	public void clickOnUser(){
		user.click();
	}
	
	public void clickOnView(){
		viewfullprofile.click();
	}
	
	public void clickOnSign(){
		signInButton.click();
	}
	
	public void enterSessionCredentails(String email, String password){
		this.sessionlogin.clear();
		this.sessionlogin.sendKeys(email);
		
		this.sessionpassword.clear();
		this.sessionpassword.sendKeys(password);
		
	}
	
	public void clickOnSubmit(){
		sessionsignIn.click();
	}	
	
	public void clickOnNav(){
		navMeButton.click();
	}
	
	public void clickOnSignOut(){
		signOutButton.click();
	}
	
}

