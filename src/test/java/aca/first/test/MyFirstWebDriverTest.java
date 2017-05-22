package aca.first.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import loginmain.careerAdvice;
import loginmain.myLogIn;
import loginmain.otherPages;
import loginmain.userPage;

import java.awt.List;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\Geckodriver\\geckodriver.exe");
//WebDriver driver = new FirefoxDriver();

public class MyFirstWebDriverTest {
private WebDriver driver;

//	public String baseUrl="http://georgene:ofelie@v2fairygod.startupix.com/";
   public String baseUrl="https://dev:D3v$!te@dev.fairygodboss.com/";
	
	@BeforeMethod
	public void basicUrl(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get(baseUrl);   
	} 
	
	@AfterMethod
    public void endSession(){ 
	driver.close();
    } 
	

	
/*	 @Test()
public void login() throws InterruptedException{
	   myLogIn logIn=new myLogIn(driver); 
	   logIn.logintrue();
	   driver.findElement(By.xpath("//a[contains(@class,'btn2 closePopup')]")).click();
	   Thread.sleep(3000);
	   String my_title=driver.getTitle();
       System.out.println("Actual title is "+my_title);
       String expected_title="Employer Reviews and Jobs | Fairygodboss";
       Assert.assertEquals(my_title, expected_title);  
}   

    @Test()
public void logInFail() throws InterruptedException{
   	   myLogIn logIn=new myLogIn(driver);
	   logIn.clickLogInclick();
	   boolean welcome=driver.findElement(By.xpath("//h1[contains(.,'Welcome Back!')]")).isDisplayed(); 
		  System.out.println(welcome);
	   logIn.logInclick();
	   Thread.sleep(2000);
	   logIn.closePopUp();
	   Thread.sleep(2000);
	   logIn.LogInFail();
	   Thread.sleep(3000);
} */

    @Test()
public void salaries() throws InterruptedException{
		   otherPages salaries=new otherPages(driver);
		   salaries.salariesPage();
		   String salary=driver.getTitle();
		   System.out.println("My salary title is "+salary);
		   Thread.sleep(1000);
		   String salary_title="Salary, pay, bonus of female employees  | Fairygodboss";
		   Thread.sleep(1000);
		   Assert.assertEquals(salary, salary_title); 
		   System.out.println("The test passed");
} 

/*	@Test()
public void articles() throws InterruptedException{
	   careerAdvice article=new careerAdvice(driver);
	   article.careerAdvicePage();
       boolean article1=driver.findElement(By.xpath("//span[contains(.,'BY Natalia Marulanda')]")).isDisplayed();
       System.out.println(article1);
       
       JavascriptExecutor jse = ((JavascriptExecutor) driver);
       jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
       
       driver.findElement(By.xpath("//span[contains(.,'BY Natalia Marulanda')]")).click();
       String singlearticle_url=driver.getCurrentUrl();
       System.out.println("Actual URL is "+singlearticle_url);
       Thread.sleep(2000);
       boolean username=driver.findElement(By.xpath("//span[contains(.,'BY Natalia Marulanda')]")).isDisplayed();
       System.out.println(username);
       System.out.println("You are in single article page");
} 
	
    @Test()
public void topics () throws InterruptedException{
		careerAdvice topic=new careerAdvice(driver);
		topic.careerAdvicePage();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Career Topics')])[2]")).click();
		 String topic_title=driver.getTitle();
	       System.out.println("Actual title is "+topic_title);
	       String real_title="Career Topics and Career Advice Guides | Fairygodboss";
	       Assert.assertEquals(topic_title, real_title);
	       boolean exittopic=driver.findElement(By.xpath("//div[contains(@class,'text-info p-t-20 p-b-20')]")).isDisplayed();
	       System.out.println(exittopic);
	       Thread.sleep(3000);     
	       try {
	    	   	if (driver.findElement (By.xpath("//span[contains(.,'50 Great Career Resources for Women')]")).isDisplayed())
	    	   	{
	    	   		JavascriptExecutor jse = ((JavascriptExecutor) driver);
	    	        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    	   		driver.findElement(By.xpath("//span[contains(.,'50 Great Career Resources for Women')]")).click();
	    	   		Thread.sleep(2000);
	    	   		System.out.println("True topic");
	    	   	} 
	       		}catch (Exception e){
	       		System.out.println("False topic"); 
	       		}
	       		finally{
	       		System.out.println("Finally text");
	       		}
			
} 
	
	@Test
public void workLifeBalance() throws InterruptedException{
       driver.findElement(By.xpath("//a[contains(.,'WORK - LIFE BALANCE')]")).click();	      
       driver.findElement(By.xpath("//h2[contains(.,'Work-Life Balance Guide')]")).isDisplayed();
Select drpIndustry1=new Select(driver.findElement(By.name("industry")));
drpIndustry1.selectByVisibleText("Aerospace");
Thread.sleep(3000);
Select drpIndustry2=new Select(driver.findElement(By.name("industry")));
drpIndustry2.selectByValue("automotive: parts");
       driver.findElement(By.xpath("//input[@placeholder='Enter a company']")).sendKeys("Autoliv");
       driver.findElement(By.xpath("//input[@placeholder='Select']")).sendKeys("Remote Jobs");
       JavascriptExecutor jse = (JavascriptExecutor)driver;
       jse.executeScript("window.scrollBy(0,250)", "");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[contains(.,'Search')]")).click();
       driver.findElement(By.xpath("//td[contains(.,'Automotive: Parts Manufacturing')]")).isDisplayed(); 
       System.out.println("Your search is displayed");
       jse.executeScript("window.scrollBy(0,250)", "");
       driver.findElement(By.xpath("//a[contains(.,'Reset')]")).click();
       Thread.sleep(1000);
     
   //    WebElement a=driver.findElement(By.xpath("//input[@placeholder='Enter a company']"));
   //   Actions builder=new Actions(driver);
   //   org.openqa.selenium.interactions.
   //   Action seriesOfActions=builder
   // 		  .moveToElement(a)
   // 		  .click()
   // 		  .keyDown(a, Keys.SHIFT)
    //		  .sendKeys("Accenture")
    //		  .keyUp(a, Keys.SHIFT)
    //		  .doubleClick(a)
    //		  .build();
    //  Thread.sleep(3000);
    //  seriesOfActions.perform(); 
      
      } 


	 @Test()
	public void usernamechange() throws InterruptedException{
		myLogIn settings=new myLogIn(driver);
		userPage userexistes=new userPage(driver);
		settings.logintrue();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='btn2 closePopup']")).click();
		Thread.sleep(2000);
		boolean user=driver.findElement(By.xpath("//span[@class='align-middle']")).isDisplayed();
		System.out.println(user+" "+"User is shown in the page");
		userexistes.arrowopen();
		Thread.sleep(1000);
		userexistes.settings();
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,250)", "");
	    Thread.sleep(1000);
		userexistes.usernamechange();
		Thread.sleep(2000);
	} 
	
     @Test()
     public void passwordchange() throws InterruptedException{
    	 myLogIn passchange=new myLogIn(driver);
    	 passchange.logintrue();
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("//a[@class='btn2 closePopup']")).click();
    	 Thread.sleep(2000);
    	 userPage settingpage=new userPage(driver);
    	 settingpage.arrowopen();
    	 Thread.sleep(2000);
    	 settingpage.settings();
    	 Thread.sleep(2000);
    	 JavascriptExecutor jse = (JavascriptExecutor)driver;
 	    jse.executeScript("window.scrollBy(0,500)", "");
    	// settingpage.passwordchange();
 	   driver.findElement(By.xpath("//input[@id='current-password']")).sendKeys("123456");
 	  driver.findElement(By.xpath("//button[contains(.,'Change Password')]")).click();
 	 driver.findElement(By.xpath("//a[contains(.,'Continue')]")).click();
 	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123");
 	driver.findElement(By.xpath("//button[contains(.,'Change Password')]")).click();
	 driver.findElement(By.xpath("//a[contains(.,'Continue')]")).click();
	 driver.findElement(By.xpath("//input[@id='rep-password']")).sendKeys("123456");
	 driver.findElement(By.xpath("//button[contains(.,'Change Password')]")).click();
	 driver.findElement(By.xpath("//a[contains(.,'Continue')]")).click();
	 driver.findElement(By.xpath("//input[@id='password']")).clear();
	 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
	 driver.findElement(By.xpath("//button[contains(.,'Change Password')]")).click();
	 driver.findElement(By.xpath("//a[@class='btn2 closePopup']")).click();
	 Thread.sleep(2000);
	 
 	    
     } 
	

	
	@Test()
	public void resetpass() throws InterruptedException{
		myLogIn reset=new myLogIn(driver);
		reset.clickLogInclick();
		driver.findElement(By.xpath("//a[contains(.,'Forgot Your Password?')]")).click();
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,250)", "");
		reset.submitbutton();
		Thread.sleep(2000);
		reset.continueResetRass();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kolakola0303@gmail.com");
	    jse.executeScript("window.scrollBy(0,250)", "");
		reset.submitbutton();
		Thread.sleep(1000);
		reset.continueResetRass();
		driver.get("http://gmail.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("kolakola0303@gmail.com");
		Thread.sleep(2000);
		WebElement next=driver.findElement(By.xpath("//span[contains(.,'Next')]"));
		next.click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("06152016");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
	    Thread.sleep(5000);	
	    
	    driver.findElement(By.xpath("//div[contains(@id,':2k')]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//b[contains(.,'Reset your Fairygodboss password')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[contains(.,'here')]")).click();
	    Thread.sleep(2000);
	    
	    ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(windowHandles.get(1));
		Thread.sleep(2000);
	    
	    jse.executeScript("window.scrollBy(0,250)", "");
	    Thread.sleep(1000);
	    
	    reset.submitbutton();
	    Thread.sleep(1000);
	    reset.continueResetRass();
	    Thread.sleep(2000);
	    
	    WebElement newpassword=driver.findElement(By.xpath("//input[@placeholder='New Password']"));
	    newpassword.sendKeys("123456789");
	    jse.executeScript("window.scrollBy(0,250)", "");
	    reset.submitbutton();
	    Thread.sleep(1000);
	    reset.continueResetRass();
	    Thread.sleep(1000);
	    WebElement confirmpass=driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
	    confirmpass.sendKeys("123456");
	    jse.executeScript("window.scrollBy(0,250)", "");
	    Thread.sleep(1000);
	    reset.submitbutton();
	    Thread.sleep(1000);
	    reset.continueResetRass();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//input[@placeholder='New Password']")).clear();
	    driver.findElement(By.xpath("//input[@placeholder='New Password']")).sendKeys("123456");
	 //   newpassword.clear();
	 //   newpassword.sendKeys("123456");
	    jse.executeScript("window.scrollBy(0,250)", "");
	    reset.submitbutton();
	    Thread.sleep(1000);
	    System.out.println("//p[contains(.,'Your password has been reset. Please log-in with your new password.')]");
	    Thread.sleep(1000);	
	} 
	
	@Test()
	public void signup() throws InterruptedException{
		myLogIn signup=new myLogIn(driver);
		signup.signUpbutton();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='regCompanyName']")).sendKeys("Startupix 12");
		   
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//label[@class='clearAfter']/p")));
		   boolean signUpForm=driver.findElement(By.xpath("//p[contains(.,'2. What is your overall level of job satisfaction? (1-5) *')]")).isDisplayed();
		   System.out.println(signUpForm+" "+"Sign up form is open");
		   Thread.sleep(1000);
		   
		   JavascriptExecutor jse = ((JavascriptExecutor) driver);
	       jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	       signup.nextButtonicon();
	       Thread.sleep(1000);
	       signup.closePopUp();
	       jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//p[contains(.,'2. What is your overall level of job satisfaction? (1-5) *')]")));
	       
		    Thread.sleep(2000);
		    js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//label[@class='disInBlock m-r-85 align-top']/input[@value='3']")));
		   Thread.sleep(2000);
		
		   jse.executeScript("window.scrollBy(0,250)", "");
		   Thread.sleep(2000);
		   js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[@class='disInBlock m-r-40']/input[@id='survey-attitude-yes']")));
		   Thread.sleep(2000);
		   js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[@class='disInBlock']/input[@id='survey-attitude-no']")));
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//p[contains(.,'Maybe (please explain)')]")).click();
		   Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='SurveyRecommendComment']")).sendKeys("SurveyRecommendComment for testing by STARTUPIX");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[contains(.,'Improve work-life balance and policies (e.g. flex-time, limit face time)')]")).click();
		Thread.sleep(1000);
		
		jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//p[contains(.,'Hours (e.g. I can adjust my work hours to drop/off pick up kids)')]")));
		driver.findElement(By.xpath("//p[contains(.,'Hours (e.g. I can adjust my work hours to drop/off pick up kids)')]")).click();
		driver.findElement(By.xpath("//p[contains(.,'Culture (e.g. management respects time-off for family)')]")).click();
		driver.findElement(By.xpath("//p[contains(.,'Policies (e.g. great parental leave)')]")).click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[@class='disInBlock m-r-60 align-top']/input[@value='5']")));
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//textarea[@name='Survey[flexibility_comment]']")).sendKeys("Flexibility comment test by STRTUPIX");
		   driver.findElement(By.xpath("//textarea[@id='survey-comment']")).sendKeys("10 words comment for testimg by STARTUPIX, Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.THE END");
	Thread.sleep(1000);
	js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[@class='m-r-30 disInBlock']/input[@value='not sure']")));
	Thread.sleep(1000);
	driver.findElement(By.xpath("//textarea[@name='Survey[nominate_emails]']")).sendKeys("startupixtest@mailinator.com");
	Thread.sleep(1000);
	
	
	jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//p[contains(.,'Num. paid weeks  Num. unpaid weeks ')]")));
	js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//p[contains(.,'Num. paid weeks  Num. unpaid weeks ')]")));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='Survey[maternity_paid]']")).sendKeys("3");
	driver.findElement(By.xpath("//input[@id='survey-maternity-unpaid']")).sendKeys("5");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//textarea[@name='Survey[maternity_comment]']")).sendKeys("maternity and paternity LeVE COMMENT BY startupix ");
	driver.findElement(By.xpath("//p[contains(.,'$50k-$80k')]")).click();
	Thread.sleep(1000);
	jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//p[contains(.,'13. What is your most recent bonus at this employer?')]")));
	Thread.sleep(1000);
	driver.findElement(By.xpath("//p[contains(.,'$20k-$50k')]")).click();
	Thread.sleep(1000);
	Select department=new Select(driver.findElement(By.xpath("//select[@id='survey-department']")));
	department.selectByValue("IT");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='survey-position']")).sendKeys("QE");
	driver.findElement(By.xpath("//p[contains(.,'PLEASE CHECK THIS BOX IF YOU DO NOT WANT THIS INFO DISPLAYED WITH YOUR REVIEW (e.g. you are the only woman with your title/in your dept)')]")).click();
	js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[@class='disBlock m-t-5']/input[@value='Hispanic']")));
	jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	Thread.sleep(1000);
	signup.nextButtonicon();
    Thread.sleep(1000);
    signup.closePopUp();
    Thread.sleep(1000);
    jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//p[contains(.,'3. I believe women and men are treated equally at this employer: *')]")));
    driver.findElement(By.xpath("//p[contains(.,'Hiring')]")).click();
    Thread.sleep(1000);
    jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//p[contains(.,'7. How much flexibility do you think exists at this employer? (1-5) *')]")));
	driver.findElement(By.xpath("//label[@class='disInBlock m-r-60 align-top']/input[@value='5']"));
	Thread.sleep(1000);
	 jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
     signup.nextButtonicon();
     Thread.sleep(2000);
     jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//p[contains(.,'16. Please choose an anonymous username to associate with your review and provide an email address (which we will never spam or share) so we can confirm your account. *')]")));
	signup.signUp();
	Thread.sleep(2000);
	} */
	
	/*	@Test()
	public void resetPassword () throws InterruptedException{
			myLogIn logIn=new myLogIn(driver);
			logIn.clickLogInclick();
			driver.findElement(By.xpath("//a[contains(.,'Forgot Your Password?')]")).click();
			
			logIn.submitbutton();
			logIn.closePopUp();
			logIn.randomlogin();
			logIn.submitbutton();
			logIn.closePopUp();
	    	driver.findElement(By.xpath("//input[@id='email']")).clear();
	    	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kolakola0303@gmail.com");
	    	logIn.submitbutton();
	    	Thread.sleep(2000);
	    	boolean check=driver.findElement(By.xpath("//p[contains(.,'Please check your email for instructions on how to reset your password.')]")).isDisplayed(); 
			System.out.println(check);
			logIn.closePopUp();	
			driver.get("http://gmail.com/");

		try {
			if ( driver.findElements( By.xpath("//input[@aria-label='Email or phone']")).size() != 0 && ) 
				System.out.println("dooooooo");
			else System.out.println("aaaaaaaaaaao");
	  	   /*	if (driver.findElement (By.xpath("//input[@aria-label='Email or phone']")).isDisplayed() )	   	
	    	   	{
	      			driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("kolakola0303@gmail.com");
	      			driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
	     		    Thread.sleep(2000);
	      			driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("06152016");
	     			Thread.sleep(4000);
	     			driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
	    		System.out.println("try gmail login"); 
	    	   	} 
	    	   	
			}
		catch (Exception e){  
				 driver.findElement (By.xpath("//input[@placeholder='Email or phone']")).isDisplayed();
				 driver.findElement(By.xpath("//input[@placeholder='Email or phone']")).sendKeys("kolakola0303@gmail.com");
	 	   		driver.findElement(By.xpath("//input[@value='Next']")).click();
	 	   		Thread.sleep(2000);
		   		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("06152016");
		   		driver.findElement(By.xpath("//input[@id='signIn']")).click();
	 	   		System.out.println("catch gmail login");
	       		
	   		}  
		
	} */
	
	
}
      
	
	
	
	
	
		
	   

          
          
       
    
         
         