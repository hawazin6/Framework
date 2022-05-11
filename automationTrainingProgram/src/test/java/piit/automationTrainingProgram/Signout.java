package piit.automationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.ForgotPasswordPage;
import PageObjectModel.Home;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.database.Database;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class Signout {
	private static final RemoteWebDriver TakesScreenshot = null;
	WebDriver driver;
  @Test(priority=1)
  public void f() throws InterruptedException, IOException {
	  Home ob=new Home(driver);
	  ob.Email();
	  Pictures();
	  ob.PasswordfieldsEnters();
	  Pictures();
	  Thread.sleep(6000);
	  ob.Forgotlink();
	  ForgotPasswordPage id=new ForgotPasswordPage(driver);
	  id.IdsSendKeys();
	  id.SearchbuttonClick();
	  Thread.sleep(6000);
	  Pictures();
	  
  }
  @Test(priority=2 , dependsOnMethods="f")
  public void TestVerificationMethod() throws InterruptedException{
	  driver.navigate().back();
	  Thread.sleep(6000);
	  ForgotPasswordPage id=new ForgotPasswordPage(driver);
	 String Questions= id.QuestionOfText();
	 SoftAssert softit=new SoftAssert();
	  softit.assertEquals("Please enter your email ", Questions);
	  System.out.println("this is after assertion");
	  softit.assertAll();
  }
  @BeforeClass
  public void beforeClass(){
	 
	  Browsers("Firefox");
  }
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\automationTrainingProgram\\Drivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
	 // System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\eclipse-workspace\\automationTrainingProgram\\Drivers\\msedgedriver.exe");
	 /* System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\eclipse-workspace\\automationTrainingProgram\\Drivers\\geckodriver.exe");
	 driver = new FirefoxDriver();
	   driver.navigate().to("https://www.facebook.com");
	   driver.manage().window().maximize();*/
 

  @AfterClass
  public void afterClass() {
	 // driver.close();
  }
public void Browsers(String window) {
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
	
	public void Pictures() throws IOException {
		Date dt=new Date(0);
		 String sk=dt.toString().replace(" ", "_").replace(":", "_");
		 System.out.println(sk);
		System.out.println(dt);
		File screenshots=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(screenshots, new File ("C:\\Users\\dell\\eclipse-workspace\\automationTrainingProgram\\Pictures\\"+sk+"ShotOfPage.jpg"));
}
}




