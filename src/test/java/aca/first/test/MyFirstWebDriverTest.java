package aca.first.test;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import aca.pages.BrowserFactory;
import aca.pages.HomePage;
import aca.pages.LoginPage;
import aca.pages.ReceiptPage;
import aca.pages.SignUpPage;
import aca.first.test.FunctionalTest;
import org.openqa.selenium.support.pagefactory.*;

/*TestCases

Test Case 01
Title: Registration new user
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
2. Enter Email address;
3. Enter password;
4. Click "Sign In" button and open Home Page
5. Click "Sign out" button
Expected Result: Page should be able to open successfully, displaying the linkedIn user`s home page.


Test Case 03

Description: Verifying messaging functions.
Steps:
1. Navigate to www.linkedIn.com;
2. Enter Email address;
3. Enter password;
4. Click "Sign In" button and open Home Page
5. Click on Messaging button, click on compose message button;
6. Type name or multiple names in appropriate field;
7. Type message or attached file in message box field;
8. Click on "Send" button
9. Click "Sign out" button
Expected Result: Message should be send and recipient must be get a message.

Test Case 04

Description: Searching people in webpage and send invitation for connecting.
Steps:
1. Navigate to www.linkedIn.com;
2. Enter Email address;
3. Enter password;
4. Click "Sign In" button and open Home Page
5. Type people name/last name in Search field and click Enter;
6. Found appropriate person and click Connect button after that click Send button;
7. Click "Sign out" button
Expected Result: Invitation should be send and recipient must be receive message in "My Network" field.

Test Case 05

Description: Share posts.
Steps
1. Navigate to www.linkedIn.com;
2. Enter Email address;
3. Enter password;
4. Click "Sign In" button and open Home Page
5. Find first post, click on "Share button"
6. Open window with share information, click "Post" button;
7. Click "Sign out" button
Expected result: Share post must be show on your post list

Test Case 06

Description: Attach image to User Profile.
Steps
1. Navigate to www.linkedIn.com;
2. Enter Email address;
3. Enter password;
4. Click "Sign In" button and open Home Page
5. Click on "Me" button and "View Profile";
6. Click on Edit pen button and find from  directory appropriete image;
7. Click on Apply button and save your attach;
8. Click "Sign out" button
Expected result: Image must be attach on User Profile.

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
 	
Test Case 08

Description: Fill in registration field incorrect password(less than 6 characters).
Steps
1. Navigate to LinkedIn.com
2. In the First and Last name fields write correct name;
3. In the email field write valid e-mail address;
4. In the password field write incorrect password that will be contain less than 6 characters;
5. Click "Join now" button
Expected result: After click �Join now� button programme must be show message �Password must be 6 characters or more� and registration must be failed.

Test Case 09

Description: Searching people in webpage without login.
Steps
1. Navigate to LinkedIn.com
2. Fill in �Find a colleague� fields where must be fill searching User`s First and Last name;
3. Click on �Search� button
Expected result: Webpage should be display all user`s, which first and last name appropriated search detail.

Test Case 10

Description: Sending new email by user, when user forgot valid password.
Steps
1. Navigate to LinkedIn.com
2. Fill valid email address;
3. Click on link �Forgot password?�
4. Enter your correct email address again;
5. Click on �Submit� button
Expected result: Program should be display �We just email you a link� message.

 */


public class MyFirstWebDriverTest extends FunctionalTest {
	
		
	@Test
	public void LogIn()throws InterruptedException{
		driver.get("https://www.linkedin.com");
		
		Thread.sleep(2000);
		LoginPage loginPage = new LoginPage(driver);
		assertTrue(loginPage.isInitialized());
		loginPage.enterCredentails("karine.tadevosyan51@gmail.com", "pa$$word");
		
		ReceiptPage receiptPage = loginPage.submit();
		assertTrue(receiptPage.isInitialized());
	}	


	@AfterMethod
	public void cleanUp(){
		driver.close();
		driver.quit();
	}
	}

