package aca.first.test;

import static org.junit.Assert.assertTrue;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import aca.pages.SignUpPage;

/*Test Case

Test Case 01
Title: Registration new user
Description: A registered new user should be able to sucessfully login on LinkedIn.com
Steps:
1. Navigate to LinkedIn.com
2. In the First and Last name fields write correct name;
3. In the email field write valid e-mail address;
4. In the password field write password that will be contain of 6 or more characters;
5. Click "Join now" button and open Home Page
6. Click "Sign out" button
Expected Result: Authorization new user should be able successful.
 */

public class SignUpTest extends FunctionalTest{
	
	@Test
	public void Registration ()throws InterruptedException{
		driver.get("https://www.linkedin.com");
	
		SignUpPage signUpPage = new SignUpPage(driver);
		assertTrue(signUpPage.isInitialized());
		signUpPage.enterName1();
		signUpPage.enterName2();
		signUpPage.enterEmail();
		signUpPage.enterPass();
		Thread.sleep(2000);
		signUpPage.clickOnJoin();
		Thread.sleep(2000);
		signUpPage.clickonLogo();
		Thread.sleep(2000);
		signUpPage.clickOnNav();
		Thread.sleep(2000);
		signUpPage.clickOnSignOut();
		
	}
	
		@AfterMethod
		public void cleanUp(){
			driver.close();
			driver.quit();
		
	}
	

}
