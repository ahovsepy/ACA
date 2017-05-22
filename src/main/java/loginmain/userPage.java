package loginmain;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class userPage {
	
	@FindBy(xpath="//i[contains(@class,'fa arrowOpen')]")
	private WebElement arrowopen;
	
	@FindBy(xpath="//a[contains(.,'Settings')]")
	private WebElement settings;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;

	@FindBy(xpath="//button[@name='change_username']")
	private WebElement changeusername;
	
	@FindBy(xpath="//button[@name='change_password']")
	private WebElement changepass;
	
	@FindBy(xpath="//input[@id='current-password']")
	private WebElement currentpass;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement newpass;
	
	@FindBy(xpath="//input[@id='rep-password']")
	private WebElement confirmnewpass;
	
	
	WebDriver driver;
	
public userPage(WebDriver driver){
		this.driver=driver;
	PageFactory.initElements(driver, this);
    }

public void arrowopen (){
	this.arrowopen.click();
}

public void settings(){
	this.settings.click();
}
public void usernamechange() throws InterruptedException{
	this.username.clear();
	this.username.sendKeys("startupixuser30");
	this.changeusername.click();
	myLogIn logIn=new myLogIn(driver);
	logIn.closePopUp();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy(0,250)", "");
	this.username.clear();
	String contain ="abcdefghijk";
	Random rnd=new Random();
	StringBuilder sb=new StringBuilder(4);
	for (int i=0; i<4; i++){
		sb.append(contain.charAt(rnd.nextInt(contain.length())));
	}
	String random=sb.toString();
	this.username.sendKeys(random);
	Thread.sleep(2000);
	this.changeusername.click();
	Thread.sleep(2000);
    }
	
public void passwordchange() throws InterruptedException{
	this.changepass.click();
	myLogIn pass=new myLogIn(driver);
	pass.closePopUp();
	Thread.sleep(1000);
	this.currentpass.sendKeys("123456789");
	this.changepass.click();
	pass.closePopUp();
	Thread.sleep(1000);
	this.newpass.sendKeys("123456789");
	this.changepass.click();
	pass.closePopUp();
	Thread.sleep(1000);
	this.confirmnewpass.sendKeys("123456");
	this.changepass.click();
	pass.closePopUp();
	Thread.sleep(1000);
	this.currentpass.clear();
	this.currentpass.sendKeys("123456");
	this.changepass.click();
	boolean passdonotmatch=driver.findElement(By.xpath("//p[contains(.,'Password does not match the confirm password.')]")).isDisplayed();
	System.out.println(passdonotmatch+" "+"Password does not match the confirm password");
	Thread.sleep(1000);
	pass.closePopUp();
	Thread.sleep(1000);
	this.newpass.clear();
	this.newpass.sendKeys("123456");
	this.changepass.click();
	boolean passwaschanged=driver.findElement(By.xpath("//p[contains(.,'Password has been successfully changed.')]")).isDisplayed();
	System.out.println(passwaschanged+" "+"Password has been successfully changed");
	Thread.sleep(1000);
	pass.closePopUp();
	Thread.sleep(2000);
	
}	
	
}
