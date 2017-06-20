package aca.first.test;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import aca.pages.LoginPage;
import aca.pages.ReceiptPage;



public class FunctionalTest {
	
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected static String url = "https://www.linkedin.com";
	protected static String url_gmail = "https://www.gmail.com";
	protected static String email = "karine.tadevosyan51@gmail.com";
	protected static String password = "pa$$word";
	protected static String password_gmail = "mamaforever";

	
	
	@BeforeClass
		public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,20);
		}
		
	public static void SignIn(WebDriver driver){
		  driver.get(url);
		  
		  LoginPage loginPage = new LoginPage(driver);
		  assertTrue(loginPage.isInitialized());

		  loginPage.enterCredentails(email, password);

		  ReceiptPage receiptPage = loginPage.submit();
		  assertTrue(receiptPage.isInitialized());
		 }
	public static void SignOut(WebDriver driver){
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickOnNav();
		loginPage.clickOnSignOut();
	}
	
	@AfterTest
		public void cleanUp() {
		driver.manage().deleteAllCookies();
		
	}


	
}
