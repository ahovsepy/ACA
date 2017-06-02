package aca.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IncorrectLoginDataPage extends PageObject{
	
	@FindBy(how=How.ID, using="login-email") 
	private WebElement loginEmail;
	
	@FindBy(how=How.ID, using="login-password") 
	private WebElement loginPassword;
	
	@FindBy(how=How.ID, using="login-submit") 
	private WebElement loginButton;
	
	public IncorrectLoginDataPage(WebDriver driver){
		super(driver);
	}
	
	public boolean isInitialized() {
		
		return loginButton.isDisplayed();
	}

	public void enterCredentials (String email, String password){
		this.loginEmail.clear();
		this.loginEmail.sendKeys(email);
		
		this.loginPassword.clear();
		this.loginPassword.sendKeys(password);
		
	}
	
	public void clickOnSignIn(){
		loginButton.click();
		
	}
	
}
