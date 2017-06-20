package aca.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SharePostPage extends PageObject{
	
	@FindBy(how=How.XPATH, using="//button[contains(@data-control-name,'reshare')]") 
	private WebElement entershare;
	
	@FindBy(how=How.XPATH, using="//button[contains(@data-control-name,'reshare.post')]")
	private WebElement enterpost;
	
	@FindBy(how=How.ID, using="profile-nav-item")
	private WebElement navMeButton;
	
	@FindBy(how=How.XPATH, using="//a[contains(@data-control-name,'signout')]")
	private WebElement signOutButton;

	
	public SharePostPage(WebDriver driver){
		super(driver);
	}
	
	public boolean isInitialized() {
		
		return entershare.isDisplayed();
	}
	
	
	
	public void clickOnShare(){
		entershare.click();
	}
	
	public void clickOnPost(){
		enterpost.click();

	}
	
	public void clickOnNav(){
		navMeButton.click();
	}
	
	public void clickOnSignOut(){
		signOutButton.click();
	}
	
	public ReceiptPage share(){
		entershare.click();
		return new ReceiptPage(driver);
		
	}
}
