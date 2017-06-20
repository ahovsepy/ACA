package aca.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MessagePage extends PageObject{
	
	@FindBy(how=How.ID, using="messaging-nav-item") 
	private WebElement messageButton;
	
	@FindBy(how=How.XPATH, using="//a[contains(@data-control-name,'compose_message')]")
	private WebElement composeMessage;
	
	@FindBy(how=How.XPATH, using="//input[@class='msg-connections-lookup__search-field msg-connections-lookup__search-field--no-recipients']")
	private WebElement searchRecepient;
	
	@FindBy(how=How.XPATH, using="//button[@data-control-name='add_recipient']")
	private WebElement addRecepient;
	
	@FindBy(how=How.XPATH, using="//textarea[@placeholder='Write a message or attach a file']")
	private WebElement typeText;
	
	@FindBy(how=How.XPATH, using="//button[@data-control-name='send']")
	private WebElement sendButton;
	
	@FindBy(how=How.ID, using="profile-nav-item")
	private WebElement navMeButton;
	
	@FindBy(how=How.XPATH, using="//a[contains(@data-control-name,'signout')]")
	private WebElement signOutButton;

	public MessagePage(WebDriver driver){
		super(driver);
	}
	
	public boolean isInitialized() {
		
		return messageButton.isDisplayed();
	}
	public void clickOnMessage(){
		messageButton.click();
	}
	
	public void clickOnCompose(){
		composeMessage.click();
	}
	
	public void enterName(String recepeint){
		this.searchRecepient.clear();
		this.searchRecepient.sendKeys(recepeint);
	}	
	public void	clickOnRecepeint(){
		addRecepient.click();
	}
	
	public void writeText(String text){	
		this.typeText.clear();
		this.typeText.sendKeys(text);
		
	}
	
	public void clickOnSend(){
		sendButton.click();
	}
	
	public void clickOnNav(){
		navMeButton.click();
	}
	
	public void clickOnSignOut(){
		signOutButton.click();
	}
	
	public ReceiptPage send(){
		sendButton.click();
		return new ReceiptPage(driver);
		
	}
}

