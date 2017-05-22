package loginmain;


import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class myLogIn {
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(.,'Sign Up')]")
	private WebElement signUp;
	
	@FindBy(id = "email")
	private WebElement Email;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement Password;
	
	@FindBy(xpath = "//button[contains(.,'Login')]")
	private WebElement LoginButton;
	
	@FindBy(xpath = "//a[contains(@href,'/login')]")
	private WebElement LogInclick;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath="//a[@id='nextStep']")
	private WebElement nextButton;
	
	@FindBy(xpath="//a[@class='btn2 closePopup']")
	private WebElement popUp;
	
	@FindBy(id="user-username")
	private WebElement username;
	
	@FindBy(id="user-email")
	private WebElement emailSignup;
	
	@FindBy(id="user-password")
	private WebElement passwordSignUp;
	
	@FindBy(id="user-re-password")
	private WebElement rePasswordSignup;
	
	@FindBy(xpath="//button[@id='submitReg']")
	private WebElement submitSignUp;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement changePassword;
	
	@FindBy(xpath="//input[@id='current-password']")
	private WebElement currentPassword;
	
    @FindBy(xpath="//input[@id='password']")
    private WebElement newpassword;
	
    @FindBy(xpath="//input[@name='rep_password']")
    private WebElement confirmNewPass;
    
    @FindBy(xpath="//a[contains(.,'Continue')]")
    private WebElement continueresetpass;
    
    
	public void browser (){
		   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://georgene:ofelie@v2fairygod.startupix.com/");
}
	public myLogIn(WebDriver driver){
		this.driver=driver;
	PageFactory.initElements(driver, this);
}
/*	public void changepassword() throws InterruptedException{
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
	       jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
 	    this.changePassword.click();
 	    this.popUp.click();
		this.currentPassword.sendKeys("123456");
		Thread.sleep(2000);
		 jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		this.changePassword.click();
		
		Thread.sleep(1000); 
} */
	
	public void logintrue(){
		this.LogInclick.click();
		this.Email.sendKeys("test3003@mailinator.com");
		this.Password.sendKeys("123456");
		this.LoginButton.click();
	}
	
	public void LogInFail(){
		String contain ="abcdefghijk";
		Random rnd=new Random();
		StringBuilder sb=new StringBuilder(4);
		for (int i=0; i<4; i++){
			sb.append(contain.charAt(rnd.nextInt(contain.length())));
		}
		String random=sb.toString();
		this.Email.sendKeys(random+"@mailinator.com");
		this.Password.sendKeys(random);
		this.LoginButton.click();
		this.popUp.click();
		this.Email.sendKeys("test3003@mailinator.com");
		this.LoginButton.click();
		this.popUp.click();
		this.Email.sendKeys("test3003@mailinator.com");
		this.Password.sendKeys("123456");
		this.LoginButton.click();
	}
	
	
	public void continueResetRass(){
		this.continueresetpass.click();
	}
	
	public void typeEmail(){
		this.Email.clear();
		this.Email.sendKeys("test3003@mailinator.com");
	}
	public void clickLogInclick(){
		this.LogInclick.click();
}
	public void submitbutton(){
		this.submit.click();
	}
    public void logInclick(){
        this.LoginButton.click();
}
	public void nextButtonicon(){
		this.nextButton.click();
}
	public void closePopUp(){
	    this.popUp.click();
}
	public void signUpbutton(){
		this.signUp.click();
}
	public void signUp () throws InterruptedException{
		this.username.sendKeys("test0303");
		this.emailSignup.sendKeys("testemail26@mailinator.com");
		this.passwordSignUp.sendKeys("123456");
		this.rePasswordSignup.sendKeys("123");
		this.submitSignUp.click();
		this.popUp.click();
		String contain ="abcdefghijk";
		Random rnd=new Random();
		StringBuilder sb=new StringBuilder(4);
		for (int i=0; i<4; i++){
			sb.append(contain.charAt(rnd.nextInt(contain.length())));
		}
		String random=sb.toString();
		 this.username.clear();
		 Thread.sleep(2000);
		 this.username.sendKeys(random);
		 Thread.sleep(2000);
		 this.submitSignUp.click();
		 Thread.sleep(2000);
		 this.popUp.click();
		 this.emailSignup.clear();
		 Thread.sleep(2000);
		 this.emailSignup.sendKeys(random+"@mailinator.com");
		 Thread.sleep(3000);
		 this.submitSignUp.click();
		 Thread.sleep(2000);
		 this.popUp.click();
		 this.rePasswordSignup.clear();
		 this.rePasswordSignup.sendKeys("123456");
		 this.submitSignUp.click();
		 String signup_title=driver.getTitle();
		    Thread.sleep(2000);
		    System.out.println("My title is "+signup_title);
			 Thread.sleep(2000);
		    String real_title="Thank You for Registering | Fairygodboss";
			 Thread.sleep(2000);
		 	Assert.assertEquals(signup_title, real_title );
		 	Thread.sleep(3000);
		 	driver.findElement(By.xpath("//a[@id='closePopup']")).click();
		 	Thread.sleep(1000);
			}
	
	
	public void randomlogin (){
		String contain ="abcdefghijk";
		Random rnd=new Random();
		StringBuilder sb=new StringBuilder(4);
		for (int i=0; i<4; i++){
			sb.append(contain.charAt(rnd.nextInt(contain.length())));
		}
		String random=sb.toString();
		 this.Email.sendKeys(random+"@mailinator.com");
		 
}
	
	}
