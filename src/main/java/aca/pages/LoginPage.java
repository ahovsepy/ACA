package aca.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage extends PageObject{
	
	
	@FindBy(how=How.ID, using="login-email") 
	private WebElement loginemail;
	
	@FindBy(how=How.ID, using="login-password")
	private WebElement loginpassword;
	
	@FindBy(how=How.ID, using="login-submit")
	private WebElement submitButton;
	
	public LoginPage(WebDriver driver){
		super(driver);
	}
	
	public boolean isInitialized() {
		
		return loginemail.isDisplayed();
	}
	
	
	public void enterCredentails(String email, String pass){
		this.loginemail.clear();
		this.loginemail.sendKeys(email);
		
		this.loginpassword.clear();
		this.loginpassword.sendKeys(pass);
		
	}
	public ReceiptPage submit(){
		submitButton.click();
		return new ReceiptPage(driver);
		
	}
}
