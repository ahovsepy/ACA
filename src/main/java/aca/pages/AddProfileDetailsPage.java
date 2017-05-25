package aca.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddProfileDetailsPage extends PageObject{
	
	@FindBy(how=How.XPATH, using="//button[@data-control-name='nav.settings']") 
	private WebElement navprofile;
	
	@FindBy(how=How.XPATH, using="//a[@data-control-name='nav.settings_view_profile']")
	private WebElement navprofilesettings;
	
	@FindBy(how=How.XPATH, using="//button[@data-control-name='profile_edit_fab']")
	private WebElement editprofile;
	
	@FindBy(how=How.XPATH, using="//a[@data-control-name='add_education']")
	private WebElement editeducation;
	
	@FindBy(how=How.XPATH, using="//input[@name='schoolName']")
	private WebElement schoolname;
	
	@FindBy(how=How.XPATH, using="//input[@name='fieldOfStudy']")
	private WebElement studyname;
	
	@FindBy(how=How.LINK_TEXT, using="Mathematics")
	private WebElement choosetext;
	
	@FindBy(how=How.XPATH, using="//button[@type='submit'])]")
	private WebElement saveButton;
	
	@FindBy(how=How.ID, using="profile-nav-item")
	private WebElement navMeButton;
	
	@FindBy(how=How.XPATH, using="//a[contains(@data-control-name,'signout')]")
	private WebElement signOutButton;

	
	public AddProfileDetailsPage(WebDriver driver){
		super(driver);
	}
	
	public boolean isInitialized() {
		
		return navprofile.isDisplayed();
	}
	
	public void clickOnProfileNav(){
		navprofile.click();
	}
	
	public void clickOnNavSettings(){
		navprofilesettings.click();
	}
	
	public void clickOnAddSection(){
		editprofile.click();
	}
	
	public void clickOnEducation(){
		editeducation.click();
	}
	
	
	public void fillEducationSection(String education, String study){
		this.schoolname.clear();
		this.schoolname.sendKeys(education);
		
		this.studyname.clear();
		this.studyname.sendKeys(study);
	}	
	
	public void clickOnText(){
		choosetext.click();
	}
		
	
	public void clickOnSave(){
		saveButton.click();
	}
	
	
	public void clickOnNav(){
		navMeButton.click();
	}
	
	public void clickOnSignOut(){
		signOutButton.click();
	}
	
	public ReceiptPage profile(){
		navprofile.click();
		return new ReceiptPage(driver);
		
	}

}

