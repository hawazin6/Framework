package M.common;

import org.junit.BeforeClass;
import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Utility {
public WebDriver driver;
  @parameter ({"browsers"})
  @BeforeClass
  public void Browsers(String window) {
	  String windows=System.getProperty("user.dir");
	  System.out.println("windows");
		if(window.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\automationTrainingProgram\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to("https://www.facebook.com");
		 driver.manage().window().maximize();
		 
	   }else if(window.equalsIgnoreCase("Edge")) {
		   System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\eclipse-workspace\\automationTrainingProgram\\Drivers\\msedgedriver.exe");
		   driver =new EdgeDriver();
		   driver.navigate().to("https://www.facebook.com");
		   driver.manage().window().maximize();
		   
	   } else if (window.equalsIgnoreCase("Firefox")) {
		   System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\eclipse-workspace\\automationTrainingProgram\\Drivers\\geckodriver.exe");
		   driver=new FirefoxDriver();
		   driver.navigate().to("https://www.facebook.com");
		   driver.manage().window().maximize();
  
}

}
}
