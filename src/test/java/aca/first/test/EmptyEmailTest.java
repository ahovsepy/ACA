package aca.first.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import aca.pages.EmptyEmailPage;

/*Test Case

Test Case 14
Title: Empty email address
Description: Verifying login, when email text box is empty, but password field is fill with valid credential.
Steps:
1. Enter valid password in Password field;
2. Click on “Sign in” button.
Expected result: After click on “Sign in” button, system must not open user homepage.
 */


public class EmptyEmailTest extends FunctionalTest{
	
	@Test
	public void EmptyEmail ()throws InterruptedException{
		driver.get(url);

		EmptyEmailPage emptyemailPage = new EmptyEmailPage(driver);

		try
		{
			emptyemailPage.enterCredentials(password);
			emptyemailPage.clickOnSignIn();
			if(emptyemailPage.equals("Login was failed"))
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
