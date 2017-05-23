package aca.first.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import aca.first.test.*;



public class FunctionalTest {
	
	protected static WebDriver driver;

	@BeforeClass
		public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
/*
	@AfterTest
		public void cleanUp() {
		driver.manage().deleteAllCookies();
	}

	@AfterClass
	public static void tearDown(){
		driver.close();
	}
	*/
	
}
