package aca.pages;

import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage extends PageObject {
	
	Random randomGenerator = new Random();
	char randomLetter = (char) ('a' + Math.random() * ('z'-'a' + 1));
	

	@FindBy(id="reg-firstname")
	private WebElement firstName;
	
	@FindBy(id="reg-lastname")
	private WebElement lastName;

	@FindBy(id="reg-email")
	private WebElement regemail;

	@FindBy(id="reg-password")
	private WebElement password;
	
	@FindBy(how=How.ID, using="login-email") 
	private WebElement loginemail;
	
	@FindBy(how=How.ID, using="login-password")
	private WebElement loginpassword;
	
	@FindBy(how=How.ID, using="login-submit")
	private WebElement submitButton;
	
	@FindBy(how=How.ID, using="inbug-nav-item")
	private WebElement logoButton;
	
	@FindBy(how=How.ID, using="profile-nav-item")
	private WebElement navMeButton;
	
	@FindBy(how=How.XPATH, using="//a[contains(@data-control-name,'signout')]")
	private WebElement signOutButton;


	public SignUpPage(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		return firstName.isDisplayed();
	}
	
	
	public void enterName1(){
		this.firstName.clear();
		char randomLetter = (char) ('a' + Math.random() * ('z'-'a' + 1));
		firstName.sendKeys("User"+ randomLetter);
	}
		
		public void enterName2(){
		this.lastName.clear();
		char randomLetter = (char) ('a' + Math.random() * ('z'-'a' + 1));
		lastName.sendKeys("Name"+ randomLetter);
		
	}	
		
		public void enterEmail(){
			this.regemail.clear();  
			regemail.sendKeys("karine.tadevosyan51@gmail.com");
			
		}
		
		public void enterPass(){
			this.password.clear();
			char randomLetter = (char) ('a' + Math.random() * ('z'-'a' + 1));   
			password.sendKeys("pa$$word"+ randomLetter);
			
		}	
		
		public void enterCredentails(String email, String pass){
			this.loginemail.clear();
			this.loginemail.sendKeys(email);
			
			this.loginpassword.clear();
			this.loginpassword.sendKeys(pass);
			
		}
		
		public void submit(){
			submitButton.click();
		}
		
		public void clickonLogo(){
			logoButton.click();
		}
		
		public void clickOnNav(){
			navMeButton.click();
		}
		
		public void clickOnSignOut(){
			signOutButton.click();
		}
		
		
	
	/*public void enterName(String firstName, String lastName){
		this.firstName.clear();
		this.firstName.sendKeys(firstName);

		this.lastName.clear();
		this.lastName.sendKeys(lastName);
		
	}*/
	public ReceiptPage logo(){
		logoButton.click();
		return new ReceiptPage(driver);
	}



}


