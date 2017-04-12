package aca.first.test;



/*Test Case 01
Title: Login Page-LinkedIn.com and register new user
Description: A registered new user should be able to sucessfully login on LinkedIn.com
Steps:
1. Navigate to LinkedIn.com
2. In the First and Last name fields write correct name;
3. In the email field write valid e-mail address;
4. In the password field write password that will be contain of 6 or more characters;
5. Click "Join now" button

Expected Result: Authorization new user should be able successful.

Test Case 02
Description: Create new user on www.linkedIn.com
Steps:
1. Navigate to www.linkedIn.com;
2. Enter Email address;
3. Enter password;
5. Click "Sign In" button 
6  After loading user home page immediately click "Sign out" button and close page.

Expected Result: Page should be able to open succesfull, displaying the linkedIn user`s home page.

Test Case 03
Description: 
*/


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MyFirstWebDriverTest {
	
	@Test()
	public void myFirstTest(){
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
			
	
	 /*@Test*/
			  driver.findElement(By.id("login-email")).sendKeys("karine.tadevosyan51@gmail.com");
			  driver.findElement(By.id("login-password")).sendKeys("pa$$word");
			  driver.findElement(By.id("login-submit")).click();
			  
			 driver.findElement(By.name("data-control-name=nav.settings_signout")).click();
			  
			  
			 
			    


				
				  
		 
		 
		 
		 driver.close();
		 driver.quit();
	}
}
		 