package aca.first.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MyFirstWebDriverTest {
	/* 1) bacel kayq@ 2) gnal "News and Career"  */
	@Test()
	public void myFirstTest(){
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\Geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		 //driver.get("http://aca.am");
		 driver.get("https://fairygodboss.com/");
		 String URL = driver.getCurrentUrl();
		 Assert.assertEquals(URL, "https://fairygodboss.com/");
		 driver.findElement(By.xpath("//a[@href='/salary-database']")).click();
		 driver.close();
		 driver.quit();
	}

}
