package aca.first.test;

import static org.junit.Assert.assertTrue;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import aca.pages.LoginPage;
import aca.pages.MessagePage;
import aca.pages.ReceiptPage;
import aca.pages.SearchPage;

/*Test Case

Test Case 04
Description: Searching people in webpage and send invitation for connecting.
Steps:
1. Navigate to www.linkedIn.com;
2. Enter Email address;
3. Enter password;
4. Click "Sign In" button and open Home Page
5. Type people name/last name in Search field and click Enter;
6. Found appropriate person and click Connect button after that click Send button;
7. Click "Sign out" button
Expected Result: Invitation should be send and recipient must be receive message in "My Network" field.
 */



public class SearchTest extends FunctionalTest{
	
	
	@Test
	public void ConnectUser ()throws InterruptedException{
		driver.get("https://www.linkedin.com");
		
		
		LoginPage loginPage = new LoginPage(driver);
		assertTrue(loginPage.isInitialized());
		loginPage.enterCredentails("karine.tadevosyan51@gmail.com", "pa$$word");
		
		ReceiptPage receiptPage = loginPage.submit();
		assertTrue(receiptPage.isInitialized());
		
		SearchPage searchPage = new SearchPage(driver);
		assertTrue(searchPage.isInitialized());
		searchPage.enterSearchPeople("Albert Karamyan");
		
		searchPage.clickOnSearch();
		Thread.sleep(2000);
		searchPage.clickOnPeople();
		Thread.sleep(2000);
		searchPage.clickOnConnect();
		searchPage.clickOnSendInvent();
		
		Thread.sleep(2000);
		searchPage.clickOnNav();
		Thread.sleep(2000);
		searchPage.clickOnSignOut();
	
	
	}	

		
	
	@AfterMethod
	public void cleanUp(){
		driver.close();
		driver.quit();
	}
	}

