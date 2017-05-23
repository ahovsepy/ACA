package aca.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage extends PageObject{
	
	@FindBy(how=How.XPATH, using="//input[contains(@placeholder,'Search')]") 
	private WebElement searchpeople;
	
	@FindBy(how=How.XPATH, using="//button[@data-control-name='nav.search_button']")
	private WebElement entersearch;
	
	@FindBy(how=How.XPATH, using="/html/body/div[5]/div[2]/div[2]/div/div[4]/div/div/div/div/ul/li[1]/div/div/div[2]/a/h3")
	private WebElement navpeople;
	
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
	
	public void enterSearchPeople(String search){
		this.searchpeople.clear();
		this.searchpeople.sendKeys(search);
		
	}
	
	public void clickOnSearch(){
		entersearch.click();
	}
	
	public void clickOnPeople(){
		navpeople.click();

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

