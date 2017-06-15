package aca.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmptyPassPage extends PageObject{
	
	@FindBy(how=How.ID, using="login-email") 
	private WebElement loginEmail;
	@FindBy(how=How.ID, using="login-submit") 
	private WebElement loginButton;
	
	public EmptyPassPage(WebDriver driver){
		super(driver);
	}

public boolean isInitialized() {
		
		return loginButton.isDisplayed();
	}

	public void enterCredentials (String email){
		this.loginEmail.clear();
		this.loginEmail.sendKeys(email);
	}
	
	public void clickOnSignIn(){
		loginButton.click();
		
	}
}
