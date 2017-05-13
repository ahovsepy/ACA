package aca.first.test;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import aca.pages.LoginPage;
import aca.pages.UserCreatePage;
import junit.framework.Assert;


/*
TestCases
   Test Case 01 
   Description: A registered new user should be able to sucessfully login on LinkedIn.com 
   Steps:
   1. Navigate to LinkedIn.com 
   2. In the First and Last name fields write correct name; 
   3. In the email field write valid e-mail address;
   4. In the password field write password that will be contain of 6 or more characters; 
   5. Click "Join now" button and open Home Page 
   6. Click "Sign out" button 
   Expected Result: Authorization new user should be able successful.
   
   Test Case 02 
   Description: Login on www.linkedIn.com 
   Steps: 
   1. Navigate to www.linkedIn.com; 
   2. Enter correct Email address; 
   3. Enter correct password; 
   4. Click "Sign In" button and open Home Page 
   5. Click "Sign out" button
   Expected Result: Page should be able to open succesfull, displaying the linkedIn user`s home page.
   
   Test Case 03
   Description: Verifying messaging functionality. 
   Steps: 
   1. Navigate to www.linkedIn.com; 
   2. Enter correct Email address; 
   3. Enter correct password; 
   4. Click "Sign In" button and open Home Page 
   5. Click on Messaging button,click on compose message button; 
   6. Type name or multiple names in appropriate field; 
   7. Type message or attached file in message box field; 
   8. Click on "Send" button 
   9. Click "Sign out" button 
   Expected Result: Message should be send and recipient must be get a message.
   
   Test Case 04
   Description: Searching people in webpage and send invitation for connecting. 
   Steps: 
   1. Navigate to www.linkedIn.com; 
   2. Enter correct Email address; 
   3. Enter correct password; 
   4. Click "Sign In" button and open Home Page 
   5. Type people name/last name in Search field and click Enter;
   6. Found appropriate person and click Connect button after that click Send button; 
   7. Click "Sign out" button 
   Expected Result: Invitation should be send and recipient must be receive message in "My Network" field.
 	
   Test Case 05
   Description: Share posts. 
   Steps 
   1. Navigate to www.linkedIn.com; 
   2. Enter correct Email address; 
   3. Enter correct password; 
   4. Click "Sign In" button and open Home Page 
   5. Find first post, click on "Share button" 
   6. Open window with share information, click "Post" button; 
   7. Click "Sign out" button 
   Expected result: Share post must be show on your post list

   Test Case 06
   Description: Attach image to User Profile. 
   Steps: 
   1. Navigate to www.linkedIn.com; 
   2. Enter correct Email address; 
   3. Enter correct password; 
   4. Click "Sign In" button and open Home Page 
   5. Click on "Me" button and "View Profile"; 
   6. Click on Edit pen button and find from directory appropriete image; 
   7. Click on Apply button and save your attach; 
   8. Click "Sign out" button 
   Expected result: Image must be attach on User Profile.

   Test Case 07 
   Description: Edit and add User details (work experiance,education, etc). 
   Steps 1. Navigate to www.linkedIn.com; 
   2. Enter correct Email address; 
   3. Enter correct password; 
   4. Click "Sign In" button and open Home Page 
   5. Click on "Me" button and "View Profile"; 
   6. Navigate to "Add new profile section", click on appropriate field; 
   7. Complete fields and click "Save" button; 
   8. Click "Sign out" button 
   Expected result: All fill details should be show in User profile list.
 */


public class MyFirstWebDriverTest extends FunctionalTest {

	WebDriver driver;

	@BeforeMethod
	public void openLinkedin() {
		driver.get("https://www.linkedin.com");
		driver.manage().window().maximize();
	
	
		UserCreatePage userCreatePage = new UserCreatePage(driver);
		userCreatePage.enterName("User", "Name");
		userCreatePage.enterAddress("karine.tadevosyan51@gmail.com", "pa$$word");
		
		
		
		driver.close();
		driver.quit();
	}
	}

