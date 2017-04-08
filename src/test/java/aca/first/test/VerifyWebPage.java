package aca.first.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyWebPage {
	
	@Test
	public void verifyWebPageOpen(){
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");
		String my_linkedinpage=driver.getTitle();
		System.out.println("Title is" +my_linkedinpage);
		Assert.assertEquals(my_linkedinpage, null);
		System.out.println("Test complited");
		
				
				
		
		
		
		
	}
	

}
