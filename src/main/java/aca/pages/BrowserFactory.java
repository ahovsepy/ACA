package aca.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName,String url){
		if (browserName.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
	
	else if (browserName.equalsIgnoreCase("IE")){
		driver = new InternetExplorerDriver();
		
	}
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(url);
	driver.manage().window().maximize();
	
	return driver;

}
}
