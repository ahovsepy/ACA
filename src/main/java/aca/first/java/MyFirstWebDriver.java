package aca.first.java;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class MyFirstWebDriver {
	WebDriver driver;
	
	
	public class NewUserPage extends MyFirstWebDriver {
	
		@FindBy(id = "reg-firstname")
		private WebElement FirstName;
		@FindBy(id = "reg-lastname")
		private WebElement LastName;
		@FindBy(id = "reg-email")
		private WebElement Email;
		@FindBy(id = "reg-password")
		private WebElement Password;
		@FindBy(id = "registration-submit")
		private WebElement JoinNowButton;
		@FindBy(id = "profile-nav-item")
		private WebElement DropDown;
		@FindBy(xpath = "//a[contains(@data-control-name,'signout')]")
		private WebElement SignOutButton;

		
		public NewUserPage(WebDriver driver)  {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public void enterUserDetails(String Name, String LastName, String Email, String Password)  {
			this.FirstName.clear();
			this.FirstName.sendKeys(Name);
			this.LastName.clear();
			this.LastName.sendKeys(LastName);
			this.Email.clear();
			this.Email.sendKeys(Email);
			this.Password.clear();
			this.Password.sendKeys(Password);		
		}
		public class LoginPage{
			
		}
		public LoginPage login()  {
			JoinNowButton.click();
			return null;
		}
	
	public boolean IsNameElementPresent(WebDriver driver) {
		
	try {
	   driver.findElement(By.id("reg-firstname"));
	   System.out.println("FirstName" + FirstName);
	   
	   boolean present = true;
	  
	} catch (NoSuchElementException e) {
		boolean present = false;
	}
	  return false;
	}
	
	}
}

	/*
	public class LoginPage extends MyFirstWebDriver {
	
	@FindBy(id = "login-email")
	private WebElement LoginEmail;
	@FindBy(id = "login-password")
	private WebElement LoginPassword;
	@FindBy(id = "login-submit")
	private WebElement LogInButton;
	
	public LoginPage(WebDriver driver)  {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterUser(String LoginEmail, String LoginPassword)  {
		this.LoginEmail.clear();
		this.LoginEmail.sendKeys(LoginEmail);
		this.LoginPassword.clear();
		this.LoginPassword.sendKeys(LoginPassword);
			
	}
	public class HomePage{
		
	}
	public HomePage login()  {
		LogInButton.click();
		return new HomePage();
	}

public boolean IsNameElementPresent(WebDriver driver) {
	
try {
   driver.findElement(By.id("login-email"));
   
   boolean present = true;
  
} catch (NoSuchElementException e) {
	boolean present = false;
}
  return false;
}

	}
}

public class ComposeMessagePage extends MyFirstWebDriver {
	
	
	private WebElement LoginEmail;
	private WebElement LoginPassword;
	private WebElement LogInButton;
	@FindBy(id = "messaging-nav-item")
	private WebElement MessageOpen;
	@FindBy(id = "//a[contains(@data-control-name,'compose_message')]")
	private WebElement ComposeMessage;
	@FindBy(id = "//input[@class='msg-connections-lookup__search-field msg-connections-lookup__search-field--no-recipients']")
	private WebElement Recipent;
	@FindBy(id = "//button[@data-control-name='add_recipient']")
	private WebElement AddRecipient;
	@FindBy(id = "//textarea[@placeholder='Write a message or attach a file']")
	private WebElement TextMessage;
	@FindBy(id = "//button[@data-control-name='send']")
	private WebElement SendMessage;
	private WebElement SignOutButton;
	
	
	public ComposeMessagePage(WebDriver driver)  {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterUser(String MessageOpen, String ComposeMessage, String Recipent, String AddRecipent, String TextMessage, String SendMessage)  {
		this.MessageOpen.clear();;
		this.MessageOpen.click();
		this.ComposeMessage.clear();
		this.ComposeMessage.click();
		this.Recipent.clear();
		this.Recipent.sendKeys(Recipent);
		this.AddRecipient.clear();
		this.TextMessage.clear();
		this.TextMessage.sendKeys(TextMessage);
		this.SendMessage.clear();
		this.SendMessage.click();
				
	}
	public class MessagePage{
		
	}
	public MessagePage compose()  {
		SendButton.click();
		return new MessagePage();
	}

public boolean IsNameElementPresent(WebDriver driver) {
	
try {
   driver.findElement(By.id("//button[@data-control-name='send']"));
   
   boolean present = true;
  
} catch (NoSuchElementException e) {
	boolean present = false;
}
  return false;
}

	}*/
