package aca.first.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;






public class MyFirstWebDriverTest {
	
	
	@Test
	public void myFirstTest() throws InterruptedException{
		      //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
		
    System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\Geckodriver\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
              //WebDriver driver=new ChromeDriver();
    driver.get("https://fairygodboss.com/");
    driver.manage().window().maximize();
	
    String URL = driver.getCurrentUrl();
	System.out.println("URL is "+ URL);
	Assert.assertEquals(URL, "https://fairygodboss.com/");
		
	driver.findElement(By.xpath("//a[contains(.,'News & Career')]")).click();
	Thread.sleep(5000);
    
	driver.findElement(By.xpath("//a[@href='/maternity-leave']")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//a[@href='/salary-database']")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[contains(@class,'filterByTitle formControl')]")).sendKeys("Account Manager");
	driver.findElement(By.xpath("//input[contains(@class,'filterByDepartment formControl')]")).sendKeys("Sales");
	
	driver.findElement(By.xpath("//input[contains(@class,'filterByTitle formControl')]")).clear();
	String URL1 = driver.getCurrentUrl();
	System.out.println("URL is "+ URL1);
	
	Assert.assertEquals(URL1, "https://fairygodboss.com/salary-database");
	System.out.println("SALARY URL "+ URL1);
	
	
	WebElement element = driver.findElement(By.xpath("//input[@placeholder='Enter a company']"));
	boolean status = element.isEnabled();
	if(status){
	    element.sendKeys("Dell");
	}
	
	driver.findElement(By.xpath("//a[contains(.,'WORK - LIFE BALANCE')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@placeholder='Select']")).sendKeys("Remote jobs");
	driver.findElement(By.xpath("//button[contains(.,'Search')]")).click();
	Thread.sleep(5000);
	//driver.findElement(By.name("industry")).click();
	//Thread.sleep(5000);
	//driver.findElement(By.xpath("//option[contains(.,'Automotive: Dealers')]")).click();
	
	Thread.sleep(5000);
	WebElement mySelectElm = driver.findElement(By.xpath("//select[@class='formValue companyEnterEvent SearchbyIndustrySelect']"));
	Select mySelect= new Select(mySelectElm);
	Thread.sleep(5000);
	mySelect.selectByValue("aerospace"); /* chi ashxatum, bayc BUILD SUCCESS-a linum */
	Thread.sleep(5000);
	
	
	String my_title=driver.getTitle();
	System.out.println("Actual title is "+my_title);
	String expected_title="Guide to Work from Home, Part-Time and Remote Jobs";
    Assert.assertEquals(my_title, expected_title);
    
    Thread.sleep(5000);
	driver.navigate().to("https://github.com/"); 
		     
              driver.close();
		     //driver.quit(); /* chi ashxatum */
		    
	}

	 
	  } 

