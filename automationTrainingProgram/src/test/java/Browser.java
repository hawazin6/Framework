import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Browser {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement id=driver.findElement(By.className("email"));
	  id.sendKeys("yousif@yahoo.com");
	  WebElement password=driver.findElement(By.name("pass"));
	  password.sendKeys("Ben");
	  WebElement loginbutton=driver.findElement(By.name("login"));
	  loginbutton.click();
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\eclipse-workspace\\automationTrainingProgram\\Drivers\\geckodriver.exe");
	   driver =new FirefoxDriver();
	   driver.navigate().to("https://www.facebook.com");
	   driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	driver.close();
  }

}
