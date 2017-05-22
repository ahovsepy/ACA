package loginmain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class careerAdvice {
	WebDriver driver;
	@FindBy(xpath="//a[contains(.,'Career advice')]")
	private WebElement CareerAdvice;
	
	
	public careerAdvice(WebDriver driver){
		this.driver=driver;
	PageFactory.initElements(driver, this);
}
	public void careerAdvicePage(){
		this.CareerAdvice.click();
		
	}
	}

