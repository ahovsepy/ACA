package aca.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

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
	private WebElement select;

	@FindBy(how=How.XPATH, using="//button[@type='submit']")
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
	
	
	public void fillSchoolSection(String education){
		this.schoolname.clear();
		this.schoolname.sendKeys(education);
		
	}
	
	public void fillStudySection(String study){	
		this.studyname.clear();
		this.studyname.sendKeys(study);
		
	}
	public void selection(){
		Select dropdown = new Select(driver.findElement(By.linkText("Mathematics")));
		dropdown.selectByVisibleText("Mathematics");
		
	}
	/*public void selection(){
		;
		oSelect.selectByVisibleText("Mathematics");
		select.click();
	}*/
	
	
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

