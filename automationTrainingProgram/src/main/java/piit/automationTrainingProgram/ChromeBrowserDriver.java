package piit.automationTrainingProgram;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDriver {
	
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
   System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\automationTrainingProgram\\Drivers\\chromedriver.exe");
   driver =new ChromeDriver();
   driver.navigate().to("https://www.amazon.com");
   driver.manage().window().maximize();
   driver.navigate().back();
   Thread.sleep(6000);
   driver.navigate().forward();
   driver.navigate().refresh();
   String url=driver.getCurrentUrl();
   System.out.println(url);
   Set<String> windowhandle=driver.getWindowHandles();
   System.out.println(windowhandle);
   
	}
	
}