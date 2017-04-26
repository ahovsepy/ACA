package loginmain;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class myLogIn {
	WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement Email;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement Password;
	@FindBy(xpath = "//button[contains(.,'Login')]")
	private WebElement LoginButton;
	@FindBy(xpath = "//a[contains(@href,'/login')]")
	private WebElement LogInclick;
	@FindBy(xpath="//a[contains(.,'News & Career')]")
	private WebElement article;
	@FindBy(xpath="//a[contains(.,'Salaries')]")
	private WebElement salary;
	@FindBy(xpath="//input[@name='title']")
	private WebElement salarytitle;
	@FindBy(xpath="//input[@placeholder='Enter a department']")
	private WebElement salaryDepartment;
	@FindBy(xpath="//input[@name='company']")
	private WebElement companyname;
	@FindBy(xpath="//i[@class='lnr lnr-magnifier']")
	private WebElement salarySearch;
	@FindBy(xpath="//a[contains(.,'Next')]")
	private WebElement nextButton;
	@FindBy(xpath="//a[@id='closePopup']")
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
	
	
	
	public void browser (){
		   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://georgene:ofelie@v2fairygod.startupix.com/");
}
	public myLogIn(WebDriver driver){
		this.driver=driver;
	PageFactory.initElements(driver, this);
}
	public void clickLogInclick(){
		this.LogInclick.click();
} 
	public void typeEmail(){
		this.Email.sendKeys("test3003@mailinator.com");
}
	public void typePassword(){
		this.Password.sendKeys("123456");
}
	public void clickLogIn(){
		this.LoginButton.click();
}
	public void failLogInEmail(){
		this.Email.sendKeys("Failemail@mailinator.com");
}
	public void articlePage(){
		this.article.click();
}
	public void salariesPage(){
		this.salary.click();
		this.salarytitle.clear();
		this.salarytitle.sendKeys("Account management");
		this.salaryDepartment.clear();
		this.salaryDepartment.sendKeys("Account management");
		this.companyname.clear();
		this.companyname.sendKeys("AOL");
		this.salarySearch.click();
}	
	public void nextButtonicon(){
		this.nextButton.click();
}
 public void closePopUp(){
	 this.popUp.click();
 }
 public void emeilRegistered(){
	 this.username.clear();
	 this.username.sendKeys("test0303");
	 this.emailSignup.sendKeys("test3003@mailinator.com");
	 this.passwordSignUp.sendKeys("123456");
	 this.rePasswordSignup.sendKeys("123456");
	 this.submitSignUp.click();
	 this.popUp.click();
 }
 public void usernameRegistered() throws InterruptedException{
	 this.emailSignup.clear();
	 this.emailSignup.sendKeys("tmail26@mailinator.com");
	 this.submitSignUp.click();
	 Thread.sleep(3000);
	 this.popUp.click();
 }
}