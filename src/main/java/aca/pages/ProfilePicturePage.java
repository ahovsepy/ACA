package aca.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProfilePicturePage extends PageObject{
	
	@FindBy(how=How.ID, using="profile-nav-item") 
	private WebElement navviewprofile;
	
	@FindBy(how=How.XPATH, using="//*[@id='nav-settings__dropdown-options']/li[1]")
	private WebElement enterprofile;
	
	@FindBy(how=How.XPATH, using="//a[contains(@data-control-name, 'edit_top_card')]")
	private WebElement editprofilepic;
	
	@FindBy(how=How.ID, using="pe-treasury-view__media-upload")
	private WebElement addpic;
	
	@FindBy(how=How.XPATH, using="//div[contains(@class, 'action')]//button[@data-control-name='apply']")
	private WebElement applyButton;
	
	@FindBy(how=How.XPATH, using="(//button[contains(@class, 'submit')]")
	private WebElement submitButton;
	
	@FindBy(how=How.ID, using="profile-nav-item")
	private WebElement navMeButton;
	
	@FindBy(how=How.XPATH, using="//a[contains(@data-control-name,'signout')]")
	private WebElement signOutButton;

	
	public ProfilePicturePage(WebDriver driver){
		super(driver);
	}
	
	public boolean isInitialized() {
		
		return submitButton.isDisplayed();
	}
	
	public void clickOnViewProfile(){
		navviewprofile.click();
	}
	
	public void clickOnProfile(){
		enterprofile.click();
	}
	
	public void clickOnEditProfile(){
		editprofilepic.click();
	}
	
	public void enterAddProfilePic(String addprofpic){
		this.addpic.clear();
		this.addpic.sendKeys(addprofpic);
		
	}
	
	public void clickOnApply(){
		applyButton.click();
	}
	
	public void clickOnSubmit(){
		submitButton.click();

	}
	
	public void clickOnNav(){
		navMeButton.click();
	}
	
	public void clickOnSignOut(){
		signOutButton.click();
	}
	
	public ReceiptPage image(){
		editprofilepic.click();
		return new ReceiptPage(driver);
		
	}
}


