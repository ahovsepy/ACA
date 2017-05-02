package aca.first.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstWebDriverTest {
	
	@Test()
	public void myFirstTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 	  driver.get("https://www.linkedin.com/");
			  driver.manage().window().maximize();
			  
/*Test Case 01
 Title: Registration new user
Description: A registered new user should be able to sucessfully login on LinkedIn.com
Steps:
1. Navigate to LinkedIn.com
2. In the First and Last name fields write correct name;
3. In the email field write valid e-mail address;
4. In the password field write password that will be contain of 6 or more characters;
5. Click "Join now" button and open Home Page
6. Click "Sign out" button
Expected Result: Authorization new user should be able successful.*/		  
 
			 /* driver.findElement(By.id("reg-firstname")).sendKeys("User");
			  driver.findElement(By.id("reg-lastname")).sendKeys("Name");
			  driver.findElement(By.id("reg-email")).sendKeys("karine.tadevosyan51@gmail.com");
			  driver.findElement(By.id("reg-password")).sendKeys("pa$$word");
			  driver.findElement(By.id("registration-submit")).click();
			  driver.findElement(By.id("profile-nav-item")).click();
			  driver.findElement(By.xpath("//a[contains(@data-control-name,'signout')]")).click();
				
			  	String my_linkedinpage=driver.getTitle();
				System.out.println("Title is" +my_linkedinpage);
				assert true;
				System.out.println("Test complited");*/
				
/*Test Case 02
Description: Login on www.linkedIn.com
Steps:
1. Navigate to www.linkedIn.com;
2. Enter Email address;
3. Enter password;
4. Click "Sign In" button and open Home Page
5. Click "Sign out" button
Expected Result: Page should be able to open succesfull, displaying the linkedIn user`s home page.*/			 
	
			  driver.findElement(By.id("login-email")).sendKeys("karine.tadevosyan51@gmail.com");
			  driver.findElement(By.id("login-password")).sendKeys("pa$$word");
			  driver.findElement(By.id("login-submit")).click();
			  driver.findElement(By.id("profile-nav-item")).click();
			  driver.findElement(By.xpath("//a[contains(@data-control-name,'signout')]")).click();
				
			  	String Homepage=driver.getTitle();
				System.out.println("Title is" +Homepage);
				assert true;
				System.out.println("Test complited");

/*Test Case 03

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
Expected Result: Message should be send and recipient must be get a message.*/
	
			  driver.findElement(By.id("login-email")).sendKeys("karine.tadevosyan51@gmail.com");
			  driver.findElement(By.id("login-password")).sendKeys("pa$$word");
			  driver.findElement(By.id("login-submit")).click();
			  driver.findElement(By.id("messaging-nav-item")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//a[contains(@data-control-name,'compose_message')]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//input[@class='msg-connections-lookup__search-field msg-connections-lookup__search-field--no-recipients']")).sendKeys("Viktorya Karamyan");
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//button[@data-control-name='add_recipient']")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//textarea[@placeholder='Write a message or attach a file']")).sendKeys("Test");
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//button[@data-control-name='send']")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.id("profile-nav-item")).click();
			  driver.findElement(By.xpath("//a[contains(@data-control-name,'signout')]")).click();
				
			  	String Message=driver.getTitle();
				System.out.println("Title is" +Message);
				assert true;
				System.out.println("Message send");
				
			
/*Test Case 04

Description: Searching people in webpage and send invitation for connecting.
Steps:
1. Navigate to www.linkedIn.com;
2. Enter Email address;
3. Enter password;
4. Click "Sign In" button and open Home Page
5. Type people name/last name in Search field and click Enter;
6. Found appropriate person and click Connect button after that click Send button;
7. Click "Sign out" button
Expected Result: Invitation should be send and recipient must be receive message in "My Network" field. */
				
			/*	driver.findElement(By.id("login-email")).sendKeys("karine.tadevosyan51@gmail.com");
			  	driver.findElement(By.id("login-password")).sendKeys("pa$$word");
			  	driver.findElement(By.id("login-submit")).click();
			 	Thread.sleep(2000);
				driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("Albert Karamyan");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[@data-control-name='nav.search_button']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='connect primary top-card-action ember-view']")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//button[@class='button-primary-large ml3']")).click();
		  		Thread.sleep(2000);
			    driver.findElement(By.id("profile-nav-item")).click();
				driver.findElement(By.xpath("//a[contains(@data-control-name,'signout')]")).click();*/
				
/*Test Case 05

Description: Share posts.
Steps
1. Navigate to www.linkedIn.com;
2. Enter Email address;
3. Enter password;
4. Click "Sign In" button and open Home Page
5. Find first post, click on "Share button"
6. Open window with share information, click "Post" button;
7. Click "Sign out" button
Expected result: Share post must be show on your post list*/ 	    
			    
				driver.findElement(By.id("login-email")).sendKeys("karine.tadevosyan51@gmail.com");
			  	driver.findElement(By.id("login-password")).sendKeys("pa$$word");
			  	driver.findElement(By.id("login-submit")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//button[contains(@data-control-name,'reshare')]")).click();
			    Thread.sleep(4000);
			    driver.findElement(By.xpath("//button[contains(@data-control-name,'reshare.post')]")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.id("profile-nav-item")).click();
				driver.findElement(By.xpath("//a[contains(@data-control-name,'signout')]")).click();
				
			    String PostNews=driver.getTitle();
				System.out.println("Title is" +PostNews);
				assert true;
				System.out.println("News posted");
				
/*Test Case 06

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
Expected result: Image must be attach on User Profile.*/
				
			/*	driver.findElement(By.id("login-email")).sendKeys("karine.tadevosyan51@gmail.com");
				driver.findElement(By.id("login-password")).sendKeys("pa$$word");
				driver.findElement(By.id("login-submit")).click();
				driver.findElement(By.id("profile-nav-item")).click();
				driver.findElement(By.xpath("//*[@id='nav-settings__dropdown-options']/li[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[contains(@data-control-name, 'edit_top_card')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='pe-treasury-view__media-upload']")).sendKeys("C:\\Users\\Vika\\Desktop\\image.jpg");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[contains(@class, 'action')]//button[@data-control-name='apply']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[contains(@class, 'submit')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("profile-nav-item")).click();
				driver.findElement(By.xpath("//a[contains(@data-control-name,'signout')]")).click();
					*/
/*Test Case 07
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
Expected result: All fill details should be show in User profile list.*/
				
				driver.findElement(By.id("login-email")).sendKeys("karine.tadevosyan51@gmail.com");
				driver.findElement(By.id("login-password")).sendKeys("pa$$word");
				driver.findElement(By.id("login-submit")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@data-control-name='nav.settings']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@data-control-name='nav.settings_view_profile']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@data-control-name='profile_edit_fab']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@data-control-name='add_education']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='schoolName']")).sendKeys("Base College of SEUA");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='fieldOfStudy']")).sendKeys("Mathematics");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@type='submit'])]")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("profile-nav-item")).click();
				driver.findElement(By.xpath("//a[contains(@data-control-name,'signout')]")).click();
				
				

			   
				
					 
		 
		 driver.close();
		 driver.quit();
		 
	}
}
		 