package aca.first.test;



/*Test Case 01

*/


import org.testng.annotations.Test;

import java.io.InputStream;
import java.util.Scanner;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class MyFirstWebDriverTest {
	
	@Test()
	public void myFirstTest() throws Throwable{
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
			  
			  	String HomePage=driver.getTitle();
				System.out.println("Title is" +HomePage);
				assert true;
				System.out.println("Test complited");
			  
     /*@Test*/
			 
			 // driver.findElement(By.id("jobs-tab-icon")).click();
			  //driver.findElement(By.xpath("//*/html/body/div[3]/div/div[1]/div/section/div/div/div[1]/div/div/input")).getText();
			 // driver.findElement(By.xpath("//*[@id='html/body/div[3]/div/div[1]'")).click();
			  //Scanner scan =new Scanner(System.in);
			 // String input = scan.nextLine();
			  //System.out.println("Quality Assurance");
			  
			  
			  
			  
			    


				
			//  driver.findElement(By.id("profile-nav-item")).click();
			  
			//  driver.findElement(By.xpath("//*[@id='nav-settings__dropdown-options']/li[1]")).click();
			  //URL url = getClass().getResource("image.jpeg");
			//  driver.findElement(By.xpath("//*//a[contains(@href, 'logout'")).click();	  
		 
			 // Thread.sleep(2000);	 
		 
		 //driver.close();
			  
			  
			  
		 //driver.quit();
	}
}
		 