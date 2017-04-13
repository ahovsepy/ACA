package aca.first.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class MyFirstWebDriverTest {
	/*@Test()
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
    driver.findElement(By.xpath("//label[@for='survey-rate-2']")).click(); 

	} */
			 
	@Test()
	public void logIn() throws InterruptedException{
		   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://georgene:ofelie@v2fairygod.startupix.com/");
	   driver.findElement(By.xpath("//a[contains(.,'Log In')]")).click();
	   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test3003@mailinator.com");
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   driver.findElement(By.xpath("//a[contains(@class,'btn2 closePopup')]")).click();
	   String my_title=driver.getTitle();
       System.out.println("Actual title is "+my_title);
       String expected_title="Jobs and Employer Reviews for Women, By women | Fairygodboss";
       Assert.assertEquals(my_title, expected_title);
	} 
       
       @Test()
   	public void logInFail() throws InterruptedException{
   		   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
   		   WebDriver driver=new ChromeDriver();
   		   driver.manage().window().maximize();
   		   driver.get("http://georgene:ofelie@v2fairygod.startupix.com/");  
   		   driver.findElement(By.xpath("//a[contains(.,'Log In')]")).click();
 	       driver.findElement(By.xpath("//input[@id='email']")).sendKeys("failtest@mailinator.com");
 	       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
 	       driver.findElement(By.xpath("//button[@type='submit']")).click();
 	     //  driver.findElements( By.xpath("//p[contains(.,'Invalid email and password combination.')]") ).size();
 	       driver.findElement(By.xpath("//button[@type='button']")).click();
 	      // WebElement name=driver.findElement(By.xpath("//h1[contains(.,'Welcome Back!')]"));
 	     //  System.out.println("Actual name is "+name);
 	      // WebElement expected_name=driver.findElement(By.xpath("//h1[contains(.,'Welcome Back!')]"));
 	     //  Assert.assertEquals(name, expected_name);
 	     boolean welcome=driver.findElement(By.xpath("//h1[contains(.,'Welcome Back!')]")).isDisplayed(); 
 	     System.out.println(welcome);
       } 
	   
       @Test()
       public void article() throws InterruptedException{
   		   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
   		   WebDriver driver=new ChromeDriver();
   		   driver.manage().window().maximize();
   		   driver.get("http://georgene:ofelie@v2fairygod.startupix.com/"); 
   		   driver.findElement(By.xpath("//a[contains(.,'News & Career')]")).click();
   		   String article_title=driver.getTitle();
   		   System.out.println("My title is "+article_title);
   		   String real_title="Recent Articles from Fairygodboss | Fairygodboss";
   		   Assert.assertEquals(article_title, real_title );
	       driver.findElement(By.xpath("//p[contains(.,'startupix  TITLE')]")).click();
	       boolean single_art=driver.findElement(By.xpath("//h1[contains(.,'startupix  TITLE')]")).isDisplayed();
	       System.out.println(single_art);
	
       } 
	
	@Test()
	public void salaries() throws InterruptedException{
		   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://georgene:ofelie@v2fairygod.startupix.com/"); 
	driver.findElement(By.xpath("//a[contains(.,'Salaries')]")).click();
	String salary=driver.getTitle();
	System.out.println("My salary title is "+salary);
	String salary_title="Average salary, pay, bonus of female employees by title and company | Fairygodboss";
	Assert.assertEquals(salary, salary_title);
	driver.findElement(By.xpath("//input[@placeholder='Enter a title']")).sendKeys("Account management");
	driver.findElement(By.xpath("//input[@placeholder='Enter a department']")).sendKeys("Account management");
	driver.findElement(By.xpath("//input[@placeholder='Enter a company']")).sendKeys("AOL");
	driver.findElement(By.xpath("//span[@class='btnSearch']")).click();
	boolean AOL=driver.findElement(By.xpath("//td[contains(.,'AOL')]")).isDisplayed();
    System.out.println(AOL);
	} 
	
	
	
	//	@Test()
//	public void myFirstTest() throws InterruptedException{
//		      //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
//		
//    System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\Geckodriver\\geckodriver.exe");
//    WebDriver driver = new FirefoxDriver();
//              //WebDriver driver=new ChromeDriver();
//    driver.get("https://fairygodboss.com/");
//    driver.manage().window().maximize();
//	
//    String URL = driver.getCurrentUrl();
//	System.out.println("URL is "+ URL);
//	Assert.assertEquals(URL, "https://fairygodboss.com/");
//	

//	
//	driver.findElement(By.xpath("//input[contains(@class,'filterByTitle formControl')]")).clear();
//	String URL1 = driver.getCurrentUrl();
//	System.out.println("URL is "+ URL1);
//	
//	Assert.assertEquals(URL1, "https://fairygodboss.com/salary-database");
//	System.out.println("SALARY URL "+ URL1);
//	
//	
//	WebElement element = driver.findElement(By.xpath("//input[@placeholder='Enter a company']"));
//	boolean status = element.isEnabled();
//	if(status){
//	    element.sendKeys("Dell");
//	}

//	
//	Thread.sleep(5000);
//	WebElement mySelectElm = driver.findElement(By.xpath("//select[@class='formValue companyEnterEvent SearchbyIndustrySelect']"));
//	Select mySelect= new Select(mySelectElm);
//	Thread.sleep(5000);
//	mySelect.selectByValue("aerospace"); /* chi ashxatum, bayc BUILD SUCCESS-a linum */
//	Thread.sleep(5000);
//	//Assert.assertEquals(driver.findElement(By.xpath("//select[contains(@name,'industry')]")).getText(),"Aerospace");
//    
//    
//	driver.navigate().to("https://github.com/"); 
//		     
//              driver.close();
//		     //driver.quit(); 
//		    
//	}

	 
/*	@Test()
	public void authentificationTest() throws InterruptedException{
		
		// System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\Geckodriver\\geckodriver.exe");
	     System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
	 //   WebDriver driver = new FirefoxDriver();
	              WebDriver driver=new ChromeDriver();
	    driver.get("http://georgene:ofelie@v2fairygod.startupix.com/");
	    driver.manage().window().maximize();
	  //  driver.Navigate().GoToUrl("http://georgene:ofelie@Example.‌​com")
	 //   WebDriverWait wait = new WebDriverWait(driver, 30);
	  //  Alert alertPopUp = wait.until(ExpectedConditions.alertIsPresent()); 
	  //  Thread.sleep(10000);
	   // alertPopUp.authenticateUsing(new UserAndPassword("georgene", "ofelie"));
	   // Thread.sleep(10000);
//	    String URL = driver.getCurrentUrl();
//		System.out.println("URL is "+ URL);
//		Assert.assertEquals(URL, "http://v2fairygod.startupix.com/");
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.switchTo().alert();
//		
//		driver.findElement(By.id("Username")).sendKeys("");
//		driver.findElement(By.xpath("//*[@text()='User Name:']/../input")).sendKeys("");
//	    driver.findElement(By.id("Password")).sendKeys("");
//	    driver.switchTo().alert().accept();
//	    driver.switchTo().defaultContent();
	
		
	} */
	  } 

