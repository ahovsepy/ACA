package aca.first.test;

import static org.junit.Assert.assertTrue;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import aca.pages.LoginPage;
import aca.pages.MessagePage;
import aca.pages.ReceiptPage;

/*Test Case
Test Case 03
Description: Verifying messaging functions.
Steps:
1. Navigate to www.linkedIn.com;
2. Enter Email address;
3. Enter password;
4. Click "Sign In" button and open Home Page
5. Click on Messaging button, click on compose message button;
6. Type name or multiple names in appropriate field;
7. Type message or attached file in message box field;
8. Click on "Send" button
9. Click "Sign out" button
Expected Result: Message should be send and recipient must be get a message.*/


public class MessageTest extends FunctionalTest {
	
	@Test
	public void Messaging () throws InterruptedException{
		
		driver.get("https://www.linkedin.com");
		
		LoginPage loginPage = new LoginPage(driver);
		assertTrue(loginPage.isInitialized());
		loginPage.enterCredentails("karine.tadevosyan51@gmail.com", "pa$$word");
		
		ReceiptPage receiptPage = loginPage.submit();
		assertTrue(receiptPage.isInitialized());
		
		MessagePage messagePage = new MessagePage(driver);
		assertTrue(messagePage.isInitialized());
		messagePage.clickOnMessage();
		Thread.sleep(2000);
		messagePage.clickOnCompose();
	
		messagePage.enterName("Viktorya Karamyan");
		messagePage.clickOnRecepeint();
		
		Thread.sleep(2000);
		messagePage.writeText("Test");
		
		messagePage.clickOnSend();
		
		Thread.sleep(2000);
		messagePage.clickOnNav();
		
		Thread.sleep(2000);
		messagePage.clickOnSignOut();
		
		
		/*
		ReceiptPage receiptPage = messagePage.send();
		assertTrue(receiptPage.isInitialized());*/
		
		
	}	
	
	@AfterMethod
	public void cleanUp(){
		driver.close();
		driver.quit();
	}

}
