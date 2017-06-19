package aca.first.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import aca.pages.FindColleaguePage;


/*Test Case

Test Case 08
Title: Searching people from “Mainpage”
Description: Verifying search people from “Mainpage”. Find user and view profile searched user after logged in system. 
Steps:
1 Navigate to LinkedIn.com;
2. Type searched user name and surname in “Find a colleague” fields;
3. Click on “Search” button;
4. Click on appropriate user;
5. Click on "View User`s full profile";
6. Click on “Sign in” button;
7. Enter your valid login credentials;
8. Click on “Sign in” button;
9. Click on "Me" button, choose in list "Sign out" button and click on it.Expected result: System should be searching correct users with required request. After searching results, find needed user and view user profile.
 */

public class FindColleagueTest extends FunctionalTest{
	
	@Test
	public void ViewOTherUser ()throws InterruptedException{
		driver.get(url);
		
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
		findcolleaguePage.enterSessionCredentails(email, password);
		
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

