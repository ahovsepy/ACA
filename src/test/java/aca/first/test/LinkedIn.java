package aca.first.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*/*
 Test Case 01
 Description: Create new user on www.linkedIn.com
 Steps:
 1. Navigate to www.linkedIn.com;
 2. Registration new user;
 3. Enter First Name and Last Name Fields;
 4. Enter correct E-mail address and password (6 or more characters);
 5. Click "Join Now" button 
 
 Expected Result: Authorization should be able to succesfull, displaying the linkedIn user`s home page.
 */





public class LinkedIn {
	
	@Test
	 public static void main(String[] args){
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vika\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.linkedin.com/");
	  driver.manage().window().maximize();
	  /*driver.findElement(By.id("reg-firstname")).sendKeys("Vika");
	  driver.findElement(By.id("reg-lastname")).sendKeys("Karamyan");
	  driver.findElement(By.id("reg-email")).sendKeys("vika.karamyan@gmail.com");
	  driver.findElement(By.id("reg-password")).sendKeys("******** = 525252");
	  driver.findElement(By.id("registration-submit")).click();
	  */
	  
	  driver.findElement(By.id("login-email")).sendKeys("vika.karamyan@gmail.com");
	  driver.findElement(By.id("login-password")).sendKeys("525252");
	  driver.findElement(By.id("login-submit")).click();
	 
	  
	  
	  //driver.quit();
	  
	  
	 
	 }

	}