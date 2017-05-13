package aca.first.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class FunctionalTest {
	
	protected WebDriver driver;

	@BeforeClass
		public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		}

	@AfterTest
		public void cleanUp() {
		driver.manage().deleteAllCookies();
	}

	@AfterClass
		public void tearDown() {
		driver.close();
	}

}
