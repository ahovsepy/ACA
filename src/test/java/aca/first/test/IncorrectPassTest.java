package aca.first.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import aca.pages.IncorrectEmailPage;
import aca.pages.IncorrectPassPage;

public class IncorrectPassTest extends FunctionalTest {
	

	@Test
	public void WrongPassword ()throws InterruptedException{
		driver.get("https://www.linkedin.com");

		IncorrectPassPage incorrectpassPage = new IncorrectPassPage(driver);
		try{
			incorrectpassPage.enterCredentials("karine.tadevosyan51@gmail.com", "wrongpass");
			incorrectpassPage.clickOnSignIn();
			Thread.sleep(2000);
			 if(incorrectpassPage.equals("Incorrect Password"))
			 {
			 System.out.println("Succesful");
			 } 
			 else
			 {
			 System.out.println("Hmm, that's not the right password. Please try again or request a new one.");
						}
			  }
			 catch(Throwable e)
			 {
			   System.out.println("Error Password. \n");			  
			   System.out.println("Elementfound: "+e.getMessage() + "\n");
			  }

		}
	@AfterMethod
	public void cleanUp(){
		driver.close();
		driver.quit();

}
	
}		
