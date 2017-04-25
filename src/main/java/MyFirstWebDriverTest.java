import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyFirstWebDriverTest {
	
	By firstnameLocator = By.id("reg-firstname");
    By lastnameLocator = By.id("reg-lastname");
    By emailLocator = By.id("reg-email");
    By passwordLocator = By.id("reg-password");
    By JoinnowButtonLocator = By.id("registration-submit");
    
    private final WebDriver driver;
    
    public MyFirstWebDriverTest(WebDriver driver) {
        this.driver = driver;

        if (!"Joinnow".equals(driver.getTitle())) {
            throw new IllegalStateException("This is not the registration page");
        }
    }

    public MyFirstWebDriverTest typefirstname(String firstname) {
        driver.findElement(firstnameLocator).sendKeys("User");
        return this;    
    }

    public MyFirstWebDriverTest typelastname(String lastname) {
        driver.findElement(lastnameLocator).sendKeys("Name");
        return this;    
    }
    
    public MyFirstWebDriverTest typeemail(String email) {
        driver.findElement(emailLocator).sendKeys("karine.tadevosyan51@gmail.com");
        return this;    
    }
    
    public MyFirstWebDriverTest typepassword(String password) {
        driver.findElement(passwordLocator).sendKeys("pa$$word");
        return this;    
    }
    
    public MyFirstWebDriverTest submitJoinnow() {
        driver.findElement(JoinnowButtonLocator).click();
        return new MyFirstWebDriverTest(driver);    
    }

    public MyFirstWebDriverTest clickMyFirstWebDriverTestExpectingFailure() {
        driver.findElement(JoinnowButtonLocator).click();
        return new MyFirstWebDriverTest(driver);   
    }

    public MyFirstWebDriverTest registrationAs(String firstname, String lastname, String email, String password) {
        typefirstname("User");
        typelastname("Name");
        typeemail("karinetadevosyan51@gmail.com");
        typepassword("pa$$word");
        return submitJoinnow();
    
       
    }

}
