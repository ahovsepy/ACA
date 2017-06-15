package aca.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmptyEmailPage extends PageObject{
	
	
	@FindBy(how=How.ID, using="login-password") 
	private WebElement loginPassword;
	
	@FindBy(how=How.ID, using="login-submit") 
	private WebElement loginButton;
	
	public EmptyEmailPage(WebDriver driver){
		super(driver);
	}
	
	public boolean isInitialized() {
		
		return loginButton.isDisplayed();
	}
	
	public void enterCredentials (String password){
		this.loginPassword.clear();
		this.loginPassword.sendKeys(password);
		
	}
	
	public void clickOnSignIn(){
		loginButton.click();
		
	}
	
}

