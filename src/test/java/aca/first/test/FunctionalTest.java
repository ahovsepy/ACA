package aca.first.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;



public class FunctionalTest {
	
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected static String url = "https://www.linkedin.com";
	protected static String url1 = "https://www.gmail.com";
	protected static String email = "karine.tadevosyan51@gmail.com";
	protected static String password = "pa$$word";
	protected static String password1 = "mamaforever";

	@BeforeClass
		public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,20);
		}
		
	
	@AfterTest
		public void cleanUp() {
		driver.manage().deleteAllCookies();
	}

	
	
}
