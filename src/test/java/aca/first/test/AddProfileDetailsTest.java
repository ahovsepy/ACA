package aca.first.test;

import static org.junit.Assert.assertTrue;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import aca.pages.AddProfileDetailsPage;
import aca.pages.LoginPage;
import aca.pages.ReceiptPage;

/*Test Case
 
Test Case 07
Title: Add user additional information.
Description: Add some additional personal information about user education.
Steps:
1. Navigate to www.linkedin.com;
2. Enter valid email address in Email field;
3. Enter valid password in Password field;
4. Click "Sign In" button;
5. Click on "Me" button and choose from list "View Profile" link;
6. Navigate to "Add new profile section", click on “Education” link;
7. Complete some fields and click "Save" button;
8. Click on "Me" button, choose in list "Sign out" button and click on it.
Expected result: After filling information, all new information should be show in User profile.
 */

public class AddProfileDetailsTest extends FunctionalTest{


	@Test
	public void AddEducation ()throws InterruptedException{
		
		SignIn(driver);
		
		AddProfileDetailsPage addprofiledetailsPage = new AddProfileDetailsPage(driver);
		assertTrue(addprofiledetailsPage.isInitialized());
		
		Thread.sleep(2000);
		addprofiledetailsPage.clickOnProfileNav();
		addprofiledetailsPage.clickOnNavSettings();
		
		Thread.sleep(2000);
		addprofiledetailsPage.clickOnAddSection();
		
		Thread.sleep(2000);
		addprofiledetailsPage.clickOnEducation();
		
		Thread.sleep(2000);
		addprofiledetailsPage.fillSchoolSection("Base College of SEUA");
		addprofiledetailsPage.fillStudySection("Mathematics");
		
		Thread.sleep(2000);
		addprofiledetailsPage.addelement();
		
		Thread.sleep(2000);
		addprofiledetailsPage.clickOnSave();
		
		Thread.sleep(2000);
		SignOut(driver);

	}	
	
	
	@AfterMethod
	public void cleanUp(){
		driver.close();
		driver.quit();
	}
	}

