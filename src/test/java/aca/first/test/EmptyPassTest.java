package aca.first.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import aca.pages.EmptyPassPage;

/*Test Case

Test Case 15
Title: Empty password address
Description: Verifying login, when password text box is empty, but email field is fill with valid credential.
Steps:
1. Enter valid email address in Email field;
2. Click on “Sign in” button.
Expected result: After click on “Sign in” button, system must not open user homepage.
*/


public class EmptyPassTest extends FunctionalTest{
	
	@Test
	public void EmptyPass ()throws InterruptedException{
		driver.get("https://www.linkedin.com");

		EmptyPassPage emptypassPage = new EmptyPassPage(driver);
		try
		{
			emptypassPage.enterCredentials("karine.tadevosyan51@gmail.com");
			emptypassPage.clickOnSignIn();
			if(emptypassPage.equals("Login was failed"))
			{
			System.out.println("Sucessful");
			}
			else
			{
			System.out.println("Login failure");
					}
						
			}
			catch(Throwable e)
			{
			    	System.out.println("Error field is blank. \n");
			System.out.println("Elementfound: "+e.getMessage() + "\n");
			 }
	}
	@AfterMethod
	public void cleanUp(){
		driver.close();
		driver.quit();
	}
}


