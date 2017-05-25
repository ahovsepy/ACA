package aca.first.test;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import aca.first.test.FunctionalTest;
import aca.pages.LoginPage;
import aca.pages.ReceiptPage;

import org.openqa.selenium.support.pagefactory.*;

/*TestCase
Test Case 02
Description: Login on www.linkedIn.com
Steps:
1. Navigate to www.linkedIn.com;
2. Enter Email address;
3. Enter password;
4. Click "Sign In" button and open Home Page
5. Click "Sign out" button
Expected Result: Page should be able to open successfully, displaying the linkedIn user`s home page.
 */


public class LoginTest extends FunctionalTest {
	
		
	@Test
	public void LogIn()throws InterruptedException{
		driver.get("https://www.linkedin.com");
		
		
		LoginPage loginPage = new LoginPage(driver);
		assertTrue(loginPage.isInitialized());
		loginPage.enterCredentails("karine.tadevosyan51@gmail.com", "pa$$word");
		
		ReceiptPage receiptPage = loginPage.submit();
		assertTrue(receiptPage.isInitialized());
		
		loginPage.clickOnNav();
		loginPage.clickOnSignOut();
	
	
	}	

		
	
	@AfterMethod
	public void cleanUp(){
		driver.close();
		driver.quit();
	}
	}

