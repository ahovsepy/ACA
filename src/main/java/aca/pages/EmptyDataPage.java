package aca.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmptyDataPage extends PageObject{
	
	@FindBy(how=How.ID, using="login-submit") 
	private WebElement loginButton;

	@FindBy(how=How.CLASS_NAME, using="login-form") 
	private WebElement loginForm;
	
	public EmptyDataPage(WebDriver driver){
		super(driver);
	}
	
	public boolean isInitialized() {
		
		return loginButton.isDisplayed();
	}
	
	public void SignInBtn(){
		loginButton.click();
	
	}
	public void LoginForm()	{
		loginForm.click();
	}
		
}

