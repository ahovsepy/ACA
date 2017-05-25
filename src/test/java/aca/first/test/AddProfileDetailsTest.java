package aca.first.test;

import static org.junit.Assert.assertTrue;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import aca.pages.AddProfileDetailsPage;
import aca.pages.LoginPage;
import aca.pages.ReceiptPage;
import aca.pages.*;

/*Test Case
 Test Case 07

Description: Edit and add User details (work experiance, education, etc).
Steps
1. Navigate to www.linkedIn.com;
2. Enter Email address;
3. Enter password;
4. Click "Sign In" button and open Home Page
5. Click on "Me" button and "View Profile";
6. Navigate to "Add new profile section", click on appropriate field;
7. Complete fields and click "Save" button;
8. Click "Sign out" button
Expected result: All fill details should be show in User profile list.
 */

public class AddProfileDetailsTest extends FunctionalTest{
	
	


	@Test
	public void AddEducation ()throws InterruptedException{
		driver.get("https://www.linkedin.com");
		
		
		LoginPage loginPage = new LoginPage(driver);
		assertTrue(loginPage.isInitialized());
		loginPage.enterCredentails("karine.tadevosyan51@gmail.com", "pa$$word");
		
		ReceiptPage receiptPage = loginPage.submit();
		assertTrue(receiptPage.isInitialized());
		
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
		addprofiledetailsPage.fillEducationSection("Base College of SEUA", "Mathematics");
		addprofiledetailsPage.clickOnText();
		
		Thread.sleep(2000);
		addprofiledetailsPage.clickOnSave();
		
		
		Thread.sleep(2000);
		addprofiledetailsPage.clickOnNav();
		Thread.sleep(2000);
		addprofiledetailsPage.clickOnSignOut();

	}	
	
	
	@AfterMethod
	public void cleanUp(){
		driver.close();
		driver.quit();
	}
	}

