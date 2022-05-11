package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	 public class Home {
		 
	 WebDriver driver;
	 @FindBy(name="email") WebElement Ids;
	 @FindBy(name="password") WebElement Passwords;
	 @FindBy(linkText="Forgot password?") WebElement Forgot;
	 
	 public Home(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 public void Email() {
		 Ids.sendKeys("John");
	 }
 		   
			 public void PasswordfieldsEnters() {
				 Passwords.sendKeys("Siver");
			 }
			 
			 public void Forgotlink() {
				 Forgot.click();
			 }
		    }
				 
	 
		 
	
    
    
    