package aca.first.test;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import aca.pages.LoginPage;
import aca.pages.ReceiptPage;
import aca.pages.SearchPage;
import aca.pages.SharePostPage;

/*Test Case

Test Case 05
Description: Share posts.
Steps
1. Navigate to www.linkedIn.com;
2. Enter Email address;
3. Enter password;
4. Click "Sign In" button and open Home Page
5. Find first post, click on "Share button"
6. Open window with share information, click "Post" button;
7. Click "Sign out" button
Expected result: Share post must be show on your post list

 */


public class SharePostTest extends FunctionalTest {
	
	@Test
	public void Sharing ()throws InterruptedException{
		driver.get("https://www.linkedin.com");
		
		
		LoginPage loginPage = new LoginPage(driver);
		assertTrue(loginPage.isInitialized());
		loginPage.enterCredentails("karine.tadevosyan51@gmail.com", "pa$$word");
		
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

