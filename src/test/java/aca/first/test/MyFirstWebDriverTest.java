package aca.first.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import loginmain.myLogIn;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\Geckodriver\\geckodriver.exe");
//WebDriver driver = new FirefoxDriver();

public class MyFirstWebDriverTest {
private WebDriver driver;

/*	public String baseUrl="http://georgene:ofelie@v2fairygod.startupix.com/";
	public WebDriver driver;
	
	@BeforeMethod
	public void basicUrl(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get(baseUrl);   
	} 
	
	@AfterMethod
    public void endSession(){ 
	driver.close();
    } */
	
/*	 @Test()
public void login() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://georgene:ofelie@v2fairygod.startupix.com/");
	  
	   myLogIn logIn=new myLogIn(driver);
	   logIn.clickLogInclick();
	   logIn.typeEmail();
	   logIn.typePassword();
	   logIn.clickLogIn();
	   driver.findElement(By.xpath("//a[contains(@class,'btn2 closePopup')]")).click();
	   Thread.sleep(3000);
	   String my_title=driver.getTitle();
       System.out.println("Actual title is "+my_title);
       String expected_title="Jobs and Employer Reviews for Women, By women | Fairygodboss";
       Assert.assertEquals(my_title, expected_title);
	   driver.close();
}  */

 /*   @Test()
	public void logInFail() throws InterruptedException{
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://georgene:ofelie@v2fairygod.startupix.com/");  
	  myLogIn logIn=new myLogIn(driver);
	   logIn.clickLogInclick();
	   Thread.sleep(3000);
	   boolean welcome=driver.findElement(By.xpath("//h1[contains(.,'Welcome Back!')]")).isDisplayed(); 
	  System.out.println(welcome);
	  logIn.failLogInEmail();
	  logIn.typePassword();
	  logIn.clickLogIn();
	  boolean popup=driver.findElement(By.xpath("//p[contains(.,'Invalid email and password combination.')]")).isDisplayed();
	  System.out.println(popup);
	  driver.close();   
    } */
    
/*	@Test 
    public void article() throws InterruptedException{
    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://georgene:ofelie@v2fairygod.startupix.com/");  
	  myLogIn logIn=new myLogIn(driver);
    logIn.articlePage();
	String article_title=driver.getTitle();
    System.out.println("My title is "+article_title);
    String real_title="Recent Articles from Fairygodboss | Fairygodboss";
 	Assert.assertEquals(article_title, real_title );
 	driver.findElement(By.xpath("//p[contains(.,'article bank tag')]")).click();
	  boolean single_art=driver.findElement(By.xpath("//h1[@class='capitalize p-b-25']")).isDisplayed();
	  System.out.println(single_art); 
	  driver.close();
    } */

 /*   @Test 
    public void salaries() throws InterruptedException{
		   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://georgene:ofelie@v2fairygod.startupix.com/"); 		
		   myLogIn logIn=new myLogIn(driver);
		   logIn.salariesPage();
		   String salary=driver.getTitle();
		   System.out.println("My salary title is "+salary);
		   String salary_title="Average salary, pay, bonus of female employees by title and company | Fairygodboss";
		   Assert.assertEquals(salary, salary_title); 	
    } */

/*	@Test()
public void topic() throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");//
			WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://georgene:ofelie@v2fairygod.startupix.com/");
       myLogIn logIn=new myLogIn(driver);
       logIn.articlePage();
       driver.findElement(By.xpath("//a[@href='/career-topics']")).click();
       String topic_title=driver.getTitle();
       System.out.println("Actual title is "+topic_title);
       String real_title="Career Topics and Career Advice Guides | Fairygodboss";
       Assert.assertEquals(topic_title, real_title);
       boolean topic=driver.findElement(By.xpath("//div[contains(@class,'text-info p-t-20 p-b-20')]")).isDisplayed();
       System.out.println(topic);
       Thread.sleep(3000);     
       try {
    	   	if (driver.findElement (By.xpath("//span[contains(.,'50 Great Career Resources for Women')]")).isDisplayed())
    	   	{
    	   		System.out.println("True");
    	   	} 
       		}catch (Exception e){
       		System.out.println("False"); 
       		}
       		finally{
       		System.out.println("Finally text");
       		}
		driver.close();
}

	@Test
public void workLifeBalance() throws InterruptedException{
	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://georgene:ofelie@v2fairygod.startupix.com/");
       driver.findElement(By.xpath("//a[contains(.,'WORK - LIFE BALANCE')]")).click();	      
       driver.findElement(By.xpath("//h2[contains(.,'Work-Life Balance Guide')]")).isDisplayed();
Select drpIndustry1=new Select(driver.findElement(By.name("industry")));
drpIndustry1.selectByVisibleText("Aerospace");
Thread.sleep(3000);
Select drpIndustry2=new Select(driver.findElement(By.name("industry")));
drpIndustry2.selectByValue("automotive: parts");
       driver.findElement(By.xpath("//input[@placeholder='Enter a company']")).sendKeys("Autoliv");
       driver.findElement(By.xpath("//input[@placeholder='Select']")).sendKeys("Remote Jobs");
       driver.findElement(By.xpath("//button[contains(.,'Search')]")).click();
       driver.findElement(By.xpath("//td[contains(.,'Automotive: Parts Manufacturing')]")).isDisplayed(); 
       driver.findElement(By.xpath("//a[contains(.,'Reset')]")).click();
     
      WebElement a=driver.findElement(By.xpath("//input[@placeholder='Enter a company']"));
      Actions builder=new Actions(driver);
      org.openqa.selenium.interactions.
      Action seriesOfActions=builder
    		  .moveToElement(a)
    		  .click()
    		  .keyDown(a, Keys.SHIFT)
    		  .sendKeys("Accenture")
    		  .keyUp(a, Keys.SHIFT)
    		  .doubleClick(a)
    		  .build();
      Thread.sleep(3000);
      seriesOfActions.perform();
      driver.close();
} */

	@Test()
	public void signUpTest() throws InterruptedException{
	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://georgene:ofelie@v2fairygod.startupix.com/");
	   driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
	   driver.findElement(By.xpath("//input[@id='regCompanyName']")).sendKeys("Startupix 12");
       driver.findElement(By.className("checkboxNewStyle")).click();
	boolean next=driver.findElement(By.xpath("//a[contains(.,'Next')]")).isDisplayed(); 
       System.out.println(next);
       myLogIn logIn=new myLogIn(driver);
       logIn.nextButtonicon();
       logIn.closePopUp();
       Thread.sleep(3000);
       driver.findElement(By.xpath(".//*[@id='icr-2']/span[2]")).click(); 
       driver.findElement(By.xpath(".//*[@id='icr-6']/span[2]")).click();
       driver.findElement(By.xpath(".//*[@id='icr-8']/span[2]")).click();
       driver.findElement(By.xpath(".//*[@id='icr-15']/span[2]")).click();
       driver.findElement(By.xpath(".//*[@id='UserRegistrationForm']/div[2]/div[2]/div[2]/div[5]/div/div/div[2]/span[2]")).click();
       driver.findElement(By.xpath(".//*[@id='icr-19']/span[2]")).click();
       driver.findElement(By.xpath("//textarea[@id='survey-flexibility-comment']")).sendKeys("Startupix test flexibility comment");
       driver.findElement(By.xpath(".//*[@id='survey-comment']")).sendKeys("Startupix test, 10 words, answer to this question is required");
       driver.findElement(By.xpath(".//*[@id='icr-23']/span[2]")).click();
       driver.findElement(By.xpath(".//*[@id='icr-26']/span[1]")).click();
       driver.findElement(By.xpath("//input[@id='survey-maternity-paid']")).sendKeys("9");
       driver.findElement(By.xpath("//input[@id='survey-maternity-unpaid']")).sendKeys("19");
       driver.findElement(By.xpath(".//*[@id='icr-29']/span[2]")).click();
       driver.findElement(By.xpath(".//*[@id='icr-35']/span[2]")).click();
       driver.findElement(By.xpath("//input[contains(@placeholder,'Title')]")).sendKeys("Qa");
       driver.findElement(By.xpath("//select[@class='slctPlaceholder']")).click();
       driver.findElement(By.xpath("//option[@value='Academics']")).click();
       driver.findElement(By.xpath(".//*[@id='icr-41']/span[2]")).click();
       logIn.nextButtonicon();
       boolean survey=driver.findElement(By.xpath("//h1[contains(.,'anonymous survey')]")).isDisplayed(); 
       System.out.println(survey);
       driver.findElement(By.xpath("//button[@id='submitReg']")).click();
       logIn.closePopUp();
       logIn.emeilRegistered();
       logIn.usernameRegistered();
       
	}}
	/*    
 
          
          
       
    
         
          driver.findElement(By.xpath("//input[@name='User[email]']")).clear();
          driver.findElement(By.xpath("//input[@name='User[email]']")).sendKeys("testauto@mailinator.com"); 
          driver.findElement(By.xpath("//input[@id='user-username']")).clear();
          driver.findElement(By.xpath("//input[@id='user-username']")).sendKeys("test3003");
          driver.findElement(By.xpath("//button[@type='submit']")).click();
    boolean username=driver.findElement(By.xpath("//p[contains(.,'This username is already registered.')]")).isDisplayed();
    System.out.println(username);
          driver.findElement(By.xpath("//a[contains(.,'Continue')]")).click();
          driver.findElement(By.xpath("//input[@id='user-username']")).clear();
    Thread.sleep(5000);
          driver.findElement(By.xpath("//input[@id='user-username']")).sendKeys("test1username"); 
    Thread.sleep(5000);
          driver.findElement(By.xpath("//button[@type='submit']")).click();
    boolean not_match=driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div/p")).isDisplayed();
    System.out.println(not_match);
    Thread.sleep(5000);
          driver.findElement(By.xpath("//a[@id='closePopup']")).click();
          driver.findElement(By.xpath("//input[@id='user-re-password']")).clear();
          driver.findElement(By.xpath("//input[@id='user-re-password']")).sendKeys("123456");
          driver.findElement(By.xpath("//button[contains(.,'Enter')]")).click();
    boolean please_reg=driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div/p")).isDisplayed();
    System.out.println(please_reg);
	}  */
	 
  

