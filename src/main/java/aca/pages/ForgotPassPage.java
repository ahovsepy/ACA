package aca.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgotPassPage extends PageObject{
	
	@FindBy(how=How.ID, using="login-email")
	private WebElement email;
	
	@FindBy(how=How.XPATH, using="//a[contains(.,'Forgot password?')]")
	private WebElement forgotpass;
	
	@FindBy(how=How.ID, using="userName-requestPasswordReset")
	private WebElement enteremail;
	
	@FindBy(how=How.ID, using="btnSubmitResetRequest")
	private WebElement submitButton;
	
	@FindBy(how=How.LINK_TEXT, using="https://www.gmail.com")
	private WebElement opengmail;
	
	@FindBy(how=How.ID, using="identifierId")
	private WebElement entergmailaddress;
	
	@FindBy(how=How.XPATH, using="//span[contains(.,'Next')]")
	private WebElement enternextButton;
	
	@FindBy(how=How.XPATH, using="//input[@name='password']")
	private WebElement entergmailpass;
	
	@FindBy(how=How.ID, using="passwordNext")
	private WebElement enternext1Button;
	
	@FindBy(how=How.XPATH, using="//*[@class='yW']/span")
	List<WebElement> unreadmessage;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="here")
	private WebElement enterlink;
	
	@FindBy(how=How.LINK_TEXT, using="https://www.linkedin.com/uas/reset-password")
	private WebElement openlinkedin;
	
	@FindBy(how=How.ID, using="new_password-newPassword-passwordReset")
	private WebElement renamepass;
	
	@FindBy(how=How.ID, using="new_password_again-newPassword-passwordReset")
	private WebElement confirmpass;
	
	@FindBy(how=How.ID, using="reset")
	private WebElement saveButton;
	
	@FindBy(how=How.XPATH, using="//a[contains(@class,'btn-secondary-transparent')]")
	private WebElement backHomePage;
	
	@FindBy(how=How.ID, using="profile-nav-item")
	private WebElement navMeButton;
	
	@FindBy(how=How.XPATH, using="//a[contains(@data-control-name,'signout')]")
	private WebElement signOutButton;
	
	@FindBy(how=How.ID, using="login-email") 
	private WebElement loginemail1;
	
	@FindBy(how=How.ID, using="login-password")
	private WebElement loginpassword1;
	
	@FindBy(how=How.ID, using="login-submit")
	private WebElement submitButton1;
	
	
	public ForgotPassPage(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		return submitButton.isDisplayed();
	}
	
	
	public void enterEmail(String Email) {
		this.email.clear();
		this.email.sendKeys(Email);
	}
	
	public void forgotPass(){
		forgotpass.click();
	}
	public void reenterEmail(String reEmail) {
		this.enteremail.clear();
		this.enteremail.sendKeys(reEmail);
	}
	public void Submit(){
		submitButton.click();
	}
	
	public void openGmail(String openGmail) {
		this.opengmail.clear();
		this.opengmail.sendKeys(openGmail);
	}
	
	public void entergmailEmail(String gmailEmail) {
		this.entergmailaddress.clear();
		this.entergmailaddress.sendKeys(gmailEmail);
	}
	
	public void nextButton(){
		enternextButton.click();
	}
	
	
	public void entergmailPass(String gmailPass) {
		this.entergmailpass.clear();
		this.entergmailpass.sendKeys(gmailPass);
	}
	
	public void next1Button(){
		enternext1Button.click();
	}
	
	public void clickOnUnreadMessage(){
		
		for (int i = 0; i < unreadmessage.size(); i++) {
            System.out.println(unreadmessage.get(i).getText());
            if (unreadmessage.get(i).getText().equals("LinkedIn"))
                {                                           
            	unreadmessage.get(i).click();
        }
    }
}
	
	public void clickOnHereLink(){
		enterlink.click();
		
	}

	
	public void typenewPass(String renamePass) {
		this.renamepass.clear();
		this.renamepass.sendKeys(renamePass);
	}
	public void typeconfirmnewPass(String confirmPass) {
		this.confirmpass.clear();
		this.confirmpass.sendKeys(confirmPass);
	}
	
	public void clickOnSaveButton(){
		saveButton.click();
	}
	
	public void clickOnBackHomeButton(){
		backHomePage.click();
	}
	
	public void clickOnNav(){
		navMeButton.click();
	}
	
	public void clickOnSignOut(){
		signOutButton.click();
	}
	public void enterCredentails(String email, String pass){
		this.loginemail1.clear();
		this.loginemail1.sendKeys(email);
		
		this.loginpassword1.clear();
		this.loginpassword1.sendKeys(pass);
	}
	
	public void submitButton1(){
		submitButton1.click();

	}
	
	public ReceiptPage submit(){
		submitButton.click();
		return new ReceiptPage(driver);
}	

	
	
}