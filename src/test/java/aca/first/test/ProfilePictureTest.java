package aca.first.test;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import aca.pages.LoginPage;
import aca.pages.ProfilePicturePage;
import aca.pages.ReceiptPage;


/*Test Case
 Test Case 06

Description: Attach image to User Profile.
Steps
1. Navigate to www.linkedIn.com;
2. Enter Email address;
3. Enter password;
4. Click "Sign In" button and open Home Page
5. Click on "Me" button and "View Profile";
6. Click on Edit pen button and find from  directory appropriate image;
7. Click on Apply button and save your attach;
8. Click "Sign out" button
Expected result: Image must be attach on User Profile.

 */

public class ProfilePictureTest extends FunctionalTest{
	
	
	@Test
	public void AddProfileImage ()throws InterruptedException{
		driver.get("https://www.linkedin.com");
		
		
		LoginPage loginPage = new LoginPage(driver);
		assertTrue(loginPage.isInitialized());
		loginPage.enterCredentails("karine.tadevosyan51@gmail.com", "pa$$word");
		
		ReceiptPage receiptPage = loginPage.submit();
		assertTrue(receiptPage.isInitialized());
		
		ProfilePicturePage profilepicturePage = new ProfilePicturePage(driver);
		//assertTrue(profilepicturePage.isInitialized());
		
		profilepicturePage.clickOnViewProfile();
		profilepicturePage.clickOnProfile();
		Thread.sleep(2000);
		profilepicturePage.clickOnEditProfile();
		
		Thread.sleep(2000);
		profilepicturePage.enterAddProfilePic("C:\\Users\\Vika\\Desktop\\image.jpg");
		
		Thread.sleep(5000);
		profilepicturePage.clickOnApply();
		
		Thread.sleep(5000);
		profilepicturePage.clickOnDone();
		
		Thread.sleep(2000);
		profilepicturePage.clickOnNav();
		Thread.sleep(2000);
		profilepicturePage.clickOnSignOut();

	}	
	
	
	@AfterMethod
	public void cleanUp(){
		driver.close();
		driver.quit();
	}
	}
