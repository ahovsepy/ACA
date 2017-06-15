package aca.first.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import aca.pages.IncorrectLoginDataPage;

/*Test Case

Test Case 13
Title: Invalid credentials for login (email and password)
Description: Verifying login, when both of credentials entering wrong.
Steps:
1. Enter invalid email address in Email field;
2. Enter invalid password in Password field;
3. Click on “Sign in” button.
Expected result: After click on “Sign in” button, system must be clear both of login credentials field.
 */

public class IncorrectLoginDataTest extends FunctionalTest{
	
	@Test
	public void IncorrectData ()throws InterruptedException{
		driver.get("https://www.linkedin.com");
		
		IncorrectLoginDataPage incorrectlogindataPage = new IncorrectLoginDataPage(driver);
		try{
			incorrectlogindataPage.enterCredentials("Test@test.com", "12345");
			incorrectlogindataPage.clickOnSignIn();
			Thread.sleep(2000);
			if(incorrectlogindataPage.equals("Incorrect Email and Password"))
			 {
			 System.out.println("Sucessful");
			 }
			 else
			 {
			 System.out.println("------------Not Login in Profile------------");
					 }
					 
			  }
			catch(Throwable e)
			{
				
				  System.out.println("Errororrect Email and Password. \n");		  
			  System.out.println("Elementfound: "+e.getMessage() + "\n");
			}
		
	}
		@AfterMethod
		public void cleanUp(){
			driver.close();
			driver.quit();
		
	
	}
		
}
