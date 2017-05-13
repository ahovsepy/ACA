package aca.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject{
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="poxps")
	WebElement login;
	//WebElement login = driver.findElement(By.xpat("poxos"))

	public void fillLogin(String param){
		login.sendKeys(param);;
	}
}
