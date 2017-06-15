package aca.first.test;

import static org.junit.Assert.assertTrue;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import aca.pages.SignUpPage;

/*Test Case

Test Case 01
Title: Registration new user
Description: New user, should filling in all registration request fields (valid data) after that should opened user registered home page.
Steps:
1. Navigate to www.linkedin.com;
2. Enter valid name in First Name field;
3. Enter valid surname in Last Name field;
4. Enter valid email address in Email field;
5. Enter correct password in password field. Password must be contain of 6 or more characters;
6. Click "Join now" button and opened user registered “Homepage”;
7. Click on "Me" button, choose in list "Sign out" button and click on it.
Expected result: Authorization new user should be able successful. New user after sign up must see registered account "Homepage”, in addition user must see "Mainpage" after sign out.
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
		signUpPage.enterCredentails("karine.tadevosyan51@gmail.com", "pa$$word");
		signUpPage.submit();
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
