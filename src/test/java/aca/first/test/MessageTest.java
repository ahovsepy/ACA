package aca.first.test;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import aca.pages.LoginPage;
import aca.pages.MessagePage;
import aca.pages.ReceiptPage;

public class MessageTest extends FunctionalTest {
	
	@Test
	public void Messaging () throws InterruptedException{
		
		driver.get("https://www.linkedin.com");
		Thread.sleep(2000);
		LoginPage loginPage = new LoginPage(driver);
		assertTrue(loginPage.isInitialized());
		loginPage.enterCredentails("karine.tadevosyan51@gmail.com", "pa$$word");
		
		ReceiptPage receiptPage = loginPage.submit();
		assertTrue(receiptPage.isInitialized());
		
		
		
		Thread.sleep(2000);
		MessagePage messagePage = new MessagePage(driver);
		assertTrue(messagePage.isInitialized());
		messagePage.clickOnMessage();
		Thread.sleep(2000);
		messagePage.clickOnCompose();
	
		messagePage.enterName("Viktorya Karamyan");
		messagePage.clickOnRecepeint();
		Thread.sleep(2000);
		messagePage.writeText("Test");
		Thread.sleep(2000);
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
