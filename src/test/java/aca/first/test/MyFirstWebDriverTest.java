package aca.first.test;



/*Test Case 01

*/


import org.testng.annotations.Test;

import java.io.InputStream;
import java.util.Scanner;

import javax.swing.JTextField;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class MyFirstWebDriverTest {
	
	@Test()
	public void myFirstTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 	 
		 
			  driver.get("https://www.linkedin.com/");
			  driver.manage().window().maximize();
			  
			  driver.findElement(By.id("reg-firstname")).sendKeys("User");
			  driver.findElement(By.id("reg-lastname")).sendKeys("Name");
			  driver.findElement(By.id("reg-email")).sendKeys("karine.tadevosyan51@gmail.com");
			  driver.findElement(By.id("reg-password")).sendKeys("pa$$word");
			  driver.findElement(By.id("registration-submit")).click();
			 
			  	String my_linkedinpage=driver.getTitle();
				System.out.println("Title is" +my_linkedinpage);
				assert true;
				System.out.println("Test complited");
			
	 		  
			  driver.findElement(By.id("login-email")).sendKeys("karine.tadevosyan51@gmail.com");
			  driver.findElement(By.id("login-password")).sendKeys("pa$$word");
			  driver.findElement(By.id("login-submit")).click();
			  
			  	String HomePage=driver.getTitle();
				System.out.println("Title is" +HomePage);
				assert true;
				System.out.println("Test complited");
			  
				
				driver.findElement(By.id("profile-nav-item")).click();
				driver.findElement(By.xpath("//*[@id='nav-settings__dropdown-options']/li[1]")).click();
				driver.findElement(By.id("profile-nav-item")).click();
				driver.findElement(By.xpath("/html/body/nav/div/ul[1]/li[6]/div/ul/li[4]")).click();
				
				String Profile=driver.getTitle();
				System.out.println("Title is" +Profile);
				assert true;
				System.out.println("Test complited");
				
					 
		 
		 driver.close();
		 driver.quit();
		 
	}
}
		 