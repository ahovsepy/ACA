package aca.first.test;


import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import aca.pages.ForgotPassPage;


public class ForgotPassTest extends FunctionalTest{
	
	@Test
	public void ForgotPass()throws InterruptedException{
		driver.get("https://www.linkedin.com");
	
		ForgotPassPage forgotpassPage = new ForgotPassPage(driver);
		//assertTrue(forgotpassPage.isInitialized());
		forgotpassPage.enterEmail("karine.tadevosyan51@gmail.com");
		
		/*ReceiptPage receiptPage = forgotpassPage.submit();
		assertTrue(receiptPage.isInitialized());*/
	
		
		forgotpassPage.forgotPass();
		Thread.sleep(2000);
		forgotpassPage.reenterEmail("karine.tadevosyan51@gmail.com");
		Thread.sleep(2000);
		forgotpassPage.Submit();

		
		driver.get("https://www.gmail.com");
		
		forgotpassPage.entergmailEmail("karine.tadevosyan51@gmail.com");
		forgotpassPage.nextButton();
		Thread.sleep(2000);
		forgotpassPage.entergmailPass("mamaforever");
		forgotpassPage.next1Button();
		Thread.sleep(2000);
		forgotpassPage.clickOnUnreadMessage();
		
		
		Thread.sleep(5000);
		forgotpassPage.clickOnHereLink();
		
		List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(browserTabs .get(1));
		
		
		Thread.sleep(2000);
		forgotpassPage.typenewPass("pa$$word");
		forgotpassPage.typeconfirmnewPass("pa$$word");
		forgotpassPage.clickOnSaveButton();
		Thread.sleep(2000);
		forgotpassPage.clickOnBackHomeButton();
		Thread.sleep(2000);
		forgotpassPage.clickOnNav();
		forgotpassPage.clickOnSignOut();
		Thread.sleep(2000);
		forgotpassPage.enterCredentails("karine.tadevosyan51@gmail.com", "pa$$word");
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
