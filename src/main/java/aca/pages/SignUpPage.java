package aca.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends PageObject {

	@FindBy(id="reg-firstname")
	private WebElement firstName;
	
	@FindBy(id="reg-lastname")
	private WebElement lastName;

	@FindBy(id="reg-email")
	private WebElement address;

	@FindBy(id="reg-password")
	private WebElement password;
	
	@FindBy(id="registration-submit")
	private WebElement submitButton;

	public SignUpPage(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		return firstName.isDisplayed();
	}
	
	public void enterName(String firstName, String lastName){
		this.firstName.clear();
		this.firstName.sendKeys(firstName);

		this.lastName.clear();
		this.lastName.sendKeys(lastName);
		
	}
	public ReceiptPage submit(){
		submitButton.click();
		return new ReceiptPage(driver);
	}



}


