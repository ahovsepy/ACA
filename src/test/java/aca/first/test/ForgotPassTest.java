package aca.first.test;


import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import aca.pages.ForgotPassPage;

/*Test Case

Test Case 09
Title: New password creation for active user
Description: Verifying creation new password, when active user forgot password and re-created it again.
Steps:
1. Navigate to www.linkedin.com
2. Enter valid email address;
3. Click on link “Forgot password?”;
4. Enter your valid email address;
5. Click on “Submit” button, after that display “we just emailed you a link” message;
6. Open your email account page;
7. Enter email valid credentials;
8. Find need email, open this email message and click on “here” link;
9. Opens "www.linkedin.com" page in new tab, where must be fill new password;
10. Enter new password in both fields (new password and retype password);
11. Click on “Save” button, after that displayed “your password has been changed successfully”;
12. Click on “Go to homepage” button, should be display user “Homepage”;
13. Click on "Me" button, choose in list "Sign out" button and click on it.
14. Login with new password and sign out.
Expected result: System must be reset new password for user, sending informational message on user email and allowed login with new password after reset it.
 */

public class ForgotPassTest extends FunctionalTest{
	
	@Test
	public void ForgotPass()throws InterruptedException{
		driver.get(url);
	
		ForgotPassPage forgotpassPage = new ForgotPassPage(driver);
		assertTrue(forgotpassPage.isInitialized());
		forgotpassPage.enterEmail(email);
	
		
		forgotpassPage.forgotPass();
		Thread.sleep(2000);
		forgotpassPage.reenterEmail(email);
		Thread.sleep(2000);
		forgotpassPage.Submit();

		
		driver.get(url1);
		
		forgotpassPage.entergmailEmail(email);
		forgotpassPage.nextButton();
		Thread.sleep(2000);
		forgotpassPage.entergmailPass(password1);
		forgotpassPage.next1Button();
		Thread.sleep(2000);
		forgotpassPage.clickOnUnreadMessage();
		
		
		Thread.sleep(5000);
		forgotpassPage.clickOnHereLink();
		
		List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(browserTabs .get(1));
		
		
		Thread.sleep(2000);
		forgotpassPage.typenewPass(password);
		forgotpassPage.typeconfirmnewPass(password);
		forgotpassPage.clickOnSaveButton();
		Thread.sleep(2000);
		forgotpassPage.clickOnBackHomeButton();
		Thread.sleep(2000);
		forgotpassPage.clickOnNav();
		forgotpassPage.clickOnSignOut();
		Thread.sleep(2000);
		forgotpassPage.enterCredentails(email, password);
		forgotpassPage.submitButton1();
		Thread.sleep(2000);
		forgotpassPage.clickOnNav();
		forgotpassPage.clickOnSignOut();
	}
	
		
	@AfterMethod
	public void cleanUp(){
		driver.close();
		driver.quit();
	}
	
	}
