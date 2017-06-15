package aca.first.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import aca.pages.EmptyDataPage;

/*Test Case

Test Case 10
Title: Empty fields for login
Description: Verifying login, when login credentials is empty (email and password).
Steps:
1. Not fill both of fields for login (email and password);
2. Click on “Sign in” button;
Expected result: “Sign in” button must be inactive.
 */


public class EmptyDataTest extends FunctionalTest {

	@Test
	public void EmptyData ()throws InterruptedException{
		driver.get("https://www.linkedin.com");
	
		
		EmptyDataPage emptydataPage = new EmptyDataPage(driver);
		try{
			emptydataPage.SignInBtn();
			emptydataPage.LoginForm();
			if(emptydataPage.equals("Error"))
			{
			   System.out.println("Login Fail");
			}
			else
			{
				System.out.println("Successful");
					}
					
			}
			catch(Throwable e)
			{
					System.out.println("Error Email and Password fields are blank. \n");
			System.out.println("Elementfound: "+e.getMessage() + "\n");
			  }

		}
	
@AfterMethod
	public void cleanUp(){
		driver.close();
		driver.quit();
	}
	}


