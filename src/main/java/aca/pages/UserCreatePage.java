package aca.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserCreatePage extends PageObject{
	WebDriver driver;
	public UserCreatePage(WebDriver driver){
		super(driver);
	}
	
	
	@FindBy(id="reg-firstname")
	WebElement firstname;
	@FindBy(id="reg-lastname")
	WebElement lastname;
	@FindBy(id="reg-email")
	WebElement email;
	@FindBy(id="reg-password")
	WebElement password;
	@FindBy(id="registration-submit")
	WebElement loginButton;
	
	
	public void enterName (String firstname, String lastname){
		this.firstname.clear();
		this.firstname.sendKeys(firstname);
		this.lastname.clear();
		this.lastname.sendKeys(lastname);
	}
	
	 		public UserCreatePage clicklogin() {
	        loginButton.click();
	        return new UserCreatePage(driver);
	    }

	public UserCreatePage enterAddress (String email, String password){
		this.email.clear();
		this.email.sendKeys(email);
		this.password.clear();
		this.password.sendKeys(password);
		return clicklogin();
		
	}
	
	}
	

