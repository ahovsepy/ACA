package aca.first.test;

import static org.junit.Assert.assertTrue;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import aca.first.test.FunctionalTest;
import aca.pages.LoginPage;
import aca.pages.ReceiptPage;

/*TestCase

Test Case 02
Title:  Login with entering valid credentials (email and password).
Description: Verification to login with entering valid user credentials.
Steps:
1. Navigate to www.linkedin.com;
2. Enter valid email address in Email field;
3. Enter valid password in Password field;
4. Click "Sign In" button and open “Homepage”;
5. Click on "Me" button, choose in list "Sign out" button and click on it.
Expected result: System verifies user email and password if both are valid, then user should be logged successfully. In addition user must see "Mainpage” after sign out.
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

