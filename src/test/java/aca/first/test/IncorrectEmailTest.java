package aca.first.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import aca.pages.IncorrectEmailPage;

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
