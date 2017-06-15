package aca.first.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import aca.pages.IncorrectEmailPage;

/*Test Case

Test Case 11
Title: Login with incorrect email address
Description: Verifying login, when typing incorrect email address, but correct password.
Steps:
1. Enter incorrect email address in Email field;
2. Enter valid password in Password field;
3. Click on “Sign in” button.
Expected result: After click on “Sign in” button, system must be clear both of login credentials field.
 */


public class IncorrectEmailTest extends FunctionalTest{
	
	@Test
	public void WrongEmail ()throws InterruptedException{
		driver.get("https://www.linkedin.com");

		IncorrectEmailPage incorrectemailPage = new IncorrectEmailPage(driver);
		try{
			incorrectemailPage.enterCredentials("WrongEmailAddress", "pa$$word");
			incorrectemailPage.clickOnSignIn();
			Thread.sleep(2000);
			if(incorrectemailPage != null) 
			{
			System.out.println("Please enter a valid email address");
			} 
			else 
			{
			System.out.println("Error");
					}
			  } 
			 catch(Throwable e) 
			 {
				  
			  System.out.println("Error Email");
			  System.out.println("Elementfound: "+e.getMessage() + "\n");
			  }
			
		}
	@AfterMethod
	public void cleanUp(){
		driver.close();
		driver.quit();
	}
}
