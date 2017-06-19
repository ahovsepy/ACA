package aca.first.test;

import static org.junit.Assert.assertTrue;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import aca.pages.LoginPage;
import aca.pages.ReceiptPage;
import aca.pages.SharePostPage;

/*Test Case
 
Test Case 05
Title: Share posts from user news feed
Description:  Verified posts sharing and displaying in user news feed list.
Steps:
1. Navigate to www.linkedin.com;
2. Enter valid email address in Email field;
3. Enter valid password in Password field;
4. Click "Sign In" button;
5. Find first post, click on "Share” button;
6. Window opens with news information, click "Post" button;
7. Click on "Me" button, choose in list "Sign out" button and click on it.
Expected result: After click on "Post" button showed “Post successful” message. News, which shared, must displayed in user news list.
 */


public class SharePostTest extends FunctionalTest {
	
	@Test
	public void Sharing ()throws InterruptedException{
		driver.get(url);
		
		
		LoginPage loginPage = new LoginPage(driver);
		assertTrue(loginPage.isInitialized());
		loginPage.enterCredentails(email, password);
		
		ReceiptPage receiptPage = loginPage.submit();
		assertTrue(receiptPage.isInitialized());
		
		SharePostPage sharepostPage = new SharePostPage(driver);
		assertTrue(sharepostPage.isInitialized());
		
		sharepostPage.clickOnShare();
		Thread.sleep(2000);
		sharepostPage.clickOnPost();
		
		Thread.sleep(2000);
		sharepostPage.clickOnNav();
		Thread.sleep(2000);
		sharepostPage.clickOnSignOut();
	
	
	}	

		
	
	@AfterMethod
	public void cleanUp(){
		driver.close();
		driver.quit();
	}
	}

