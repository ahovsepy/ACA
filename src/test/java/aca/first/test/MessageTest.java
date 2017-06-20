package aca.first.test;

import static org.junit.Assert.assertTrue;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import aca.pages.MessagePage;


/*Test Case
Test Case 03
Title: Messaging
Description: Verifying message functionality.
Steps:
1. Navigate to www.linkedin.com;
2. Enter valid email address in Email field;
3. Enter valid password in Password field;
4. Click "Sign In" button;
5. Click on “Messaging” button on icons panel;
6. Click on compose message button;
7. Type recipient name in appropriate field;
8. Type message text in message text box;
9. Click on "Send" button;
10. Click on "Me" button, choose in list "Sign out" button and click on it.
Expected result:  After click on send button, in message sending window should be displaying text, which user sent to recipient. 
*/


public class MessageTest extends FunctionalTest {
	
	@Test
	public void Messaging () throws InterruptedException{
		
		SignIn(driver);
		
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
		SignOut(driver);
	}	
	
	@AfterMethod
	public void cleanUp(){
		driver.close();
		driver.quit();
	}

}
