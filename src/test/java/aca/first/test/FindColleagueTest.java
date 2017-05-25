package aca.first.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import aca.pages.FindColleaguePage;


/*Test Case
Test Case 09
Description: Searching people in webpage without login in 
Steps
1. Navigate to LinkedIn.com
2. Fill in “Find a colleague” fields where must be fill First and Last name;
3. Click on “Search” button;
4. Click on appropriate User name;
5. Click on "View User full profile";
6. Click on SignIn button;
7. Fill valid email and password;
8. Click on Signin
Expected result: Webpage should be searching result display, in particular user profile page.
 */

public class FindColleagueTest extends FunctionalTest{
	
	@Test
	public void ViewOTherUser ()throws InterruptedException{
		driver.get("https://www.linkedin.com");
		
		FindColleaguePage findcolleaguePage = new FindColleaguePage(driver);
		findcolleaguePage.enterSearchCredentails("Viktorya", "Karamyan");
		
		findcolleaguePage.clickOnSearch();
		
		Thread.sleep(2000);
		findcolleaguePage.clickOnUser();
		
		Thread.sleep(2000);
		findcolleaguePage.clickOnView();
		
		Thread.sleep(2000);
		findcolleaguePage.clickOnSign();
		
		Thread.sleep(2000);
		findcolleaguePage.enterSessionCredentails("karine.tadevosyan51@gmail.com", "pa$$word");
		
		findcolleaguePage.clickOnSubmit();
		
		Thread.sleep(2000);
		findcolleaguePage.clickOnNav();
		findcolleaguePage.clickOnSignOut();
	
	}
	@AfterMethod
	public void cleanUp(){
		driver.close();
		driver.quit();
	}
	}

