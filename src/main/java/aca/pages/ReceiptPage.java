package aca.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ReceiptPage extends PageObject {
	
	@FindBy(how=How.ID, using="inbug-nav-item")
	private WebElement navBarIcon;
	
	
		public ReceiptPage(WebDriver driver) {
			super(driver);
			
		}
		
		public boolean isInitialized() {
			
			return navBarIcon.isDisplayed();
		}

		
			
	}
