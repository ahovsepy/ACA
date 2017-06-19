package aca.first.test;

import static org.junit.Assert.assertTrue;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import aca.pages.LoginPage;
import aca.pages.ReceiptPage;
import aca.pages.SearchPage;

/*Test Case
Test Case 04
Title: Sending connect invitation to user
Description: Looking for people in “Search” box, find user and send invitation to found user for connect.
Steps:
1. Navigate to www.linkedin.com;
2. Enter valid email address in Email field;
3. Enter valid password in Password field;
4. Click "Sign In" button;
5. Type people name/surname in “Search” box on icons panel and click enter;
6. Found appropriate person and click “Connect” button, after that click Send button;
7. Click on "Me" button, choose in list "Sign out" button and click on it.
Expected result: Invitation should be send, as a result displayed message “Your invitation was sent”.
 */



public class SearchTest extends FunctionalTest{
	
	
	@Test
	public void ConnectUser ()throws InterruptedException{
		driver.get(url);
		
		
		LoginPage loginPage = new LoginPage(driver);
		assertTrue(loginPage.isInitialized());
		loginPage.enterCredentails(email, password);
		
		ReceiptPage receiptPage = loginPage.submit();
		assertTrue(receiptPage.isInitialized());
		
		SearchPage searchPage = new SearchPage(driver);
		assertTrue(searchPage.isInitialized());
		
		searchPage.searchName("Simple Tester");
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

