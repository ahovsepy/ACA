package aca.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class SearchPage extends PageObject{
	
	@FindBy(how=How.XPATH, using="//input[contains(@placeholder,'Search')]") 
	private WebElement searchpeople;
	
	@FindBy(how=How.XPATH, using="//div[contains(@class, 'type-ahead-theme-primary')]/ul/li")
	List <WebElement> allElements;
	
	@FindBy(how=How.XPATH, using="//button[@class='connect primary top-card-action ember-view']")
	private WebElement connectButton;
	
	@FindBy(how=How.XPATH, using="//button[@class='button-primary-large ml3']")
	private WebElement sendinventButton;
	
	@FindBy(how=How.ID, using="profile-nav-item")
	private WebElement navMeButton;
	
	@FindBy(how=How.XPATH, using="//a[contains(@data-control-name,'signout')]")
	private WebElement signOutButton;

	
	public SearchPage(WebDriver driver){
		super(driver);
	}
	
	public boolean isInitialized() {
		
		return searchpeople.isDisplayed();
	}
	
	public void searchName(String search){
		this.searchpeople.clear();
		this.searchpeople.sendKeys(search);
		
	}
	
	public void clickOnPeople(){
		allElements.get(0).click();

	}
	
	public void clickOnConnect(){
		connectButton.click();

	}
	
	public void clickOnSendInvent(){
		sendinventButton.click();

	}
	
	public void clickOnNav(){
		navMeButton.click();
	}
	
	public void clickOnSignOut(){
		signOutButton.click();
	}
	
	public ReceiptPage search(){
		searchpeople.click();
		return new ReceiptPage(driver);
		
	}
}

