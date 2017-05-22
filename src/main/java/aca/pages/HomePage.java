package aca.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
	
	
	

	public static WebElement lnk_MyAccount(WebDriver driver){
		
		
		WebElement element = driver.findElement(By.id("inbug-nav-item"));
		
		return element;
		
	}	
		public static WebElement lnk_LogOut(WebDriver driver){
	
		WebElement element=driver.findElement(By.xpath("//a[contains(@data-control-name,'signout')]"));
		
		return element;
	
		}
}
