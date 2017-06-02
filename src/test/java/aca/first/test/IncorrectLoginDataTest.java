package aca.first.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import aca.pages.IncorrectLoginDataPage;

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
