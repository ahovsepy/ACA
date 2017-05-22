package loginmain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class otherPages {
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(.,'Salaries')]")
	private WebElement salary;
	@FindBy(xpath="//input[@name='title']")
	private WebElement salarytitle;
	@FindBy(xpath="//input[@placeholder='Enter a department']")
	private WebElement salaryDepartment;
	@FindBy(xpath="//input[@name='company']")
	private WebElement companyname;
	@FindBy(xpath="//i[@class='lnr lnr-magnifier']")
	private WebElement salarySearch;
	
	public otherPages(WebDriver driver){
		this.driver=driver;
	PageFactory.initElements(driver, this);
}

	
	public void salariesPage(){
		this.salary.click();
		this.salarytitle.clear();
		this.salarytitle.sendKeys("Account management");
		this.salaryDepartment.clear();
		this.salaryDepartment.sendKeys("Account management");
		this.companyname.clear();
		this.companyname.sendKeys("AOL");
		this.salarySearch.click();
	
	}
}
