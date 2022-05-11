package piit.automationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import java.nio.channels.SelectionKey;
public class chromeDriver {

	/*private static final WebElement ElementToDragable = null;
	private static final WebElement DroptoHere = null;
	private static final WebElement searchtofield = null;*/

	//private static final String Urm = null;
	//private static WebElement searchtoclick;

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\automationTrainingProgram\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.homedepot.com");
		WebElement myaccount=driver.findElement(By.xpath("//*[@title='My Account']"));
		myaccount.click();
		WebElement register=driver.findElement(By.xpath("//*[@Register='']"));
		register.click();
		/*WebElement departure=driver.findElement(By.id("d1-btn"));
		departure.click();
		WebElement departuretodate=driver.findElement(By.xpath("//*[@aria-label='May 17, 2022 ']"));
		departuretodate.click();
		Thread.sleep(6000);
		WebElement clickondonbutton=driver.findElement(By.xpath("//*[@type='button']"));
		clickondonbutton.click();*/
		
		
		
		
		
		
		/*WebElement searchtofield2=driver.findElement(By.xpath("//input[@type='email']"));
		Thread.sleep(6000);
		searchtofield2.sendKeys("Ben");
		WebElement searchtofield1=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form//div/div/input"));
		Thread.sleep(6000);
		searchtofield1.sendKeys("computer");*/
		/*WebElement CreateAnAccount=driver.findElement(By.xpath("//*[text()='Create new account']"));
		CreateAnAccount.click();
		Thread.sleep(6000);*/
	    
		
		
		
		
		
		
		
		
		
		
		
     
  
   /* WebElement serarchtoclick=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/from/div/div/span"));
    //searchtoclick.click();
	//WebElement searchtofield=driver.findElement(By.xpath("//input[@aria-label='Search']"));
	//searchtofield.sendKeys("laptops");
	//WebElement serarchtoclick=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
	//Thread.sleep(6000);
    searchtoclick.click();*/
    
    //WebElement CreateAnAccount=driver.findElement(By.xpath("//*[text()=Create new account"));
   // CreateAnAccount.click();
   // Thread.sleep(6000);
   // WebElement month=driver.findElement(By.name("birthday_month"));
   // Select ob=new Select (month);
   // ob.selectByValue("6");
   // WebElement day=driver.findElement(By.className("birthday_day"));
    //Select ob6=new Select (day);
   // ob6.selectByVisibleText("6");
    
   // WebElement Alert=driver.findElement(By.name("Alert"));
   // Alert.click();
    //Thread.sleep(6000);
    //driver.switchTo().alert().sendKeys("tested");
    
    //driver.switchTo().alert().dismiss();
	  	/*WebElement hovers=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	Actions ob=new Actions(driver);
	 ob.moveToElement(hovers).build().perform();*/
	 
	 
	//WebElement hovers=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	//Actions ob=new Actions(driver);
	//ob.moveToElement(hovers).build().perform();
	 
	// WebElement dropable=driver.findElement(By.linkText("Droppable"));
	// dropable.click();
	 
	// driver.switchTo().frame(0);
	// WebElement ElementToDrag=driver.findElement(By.id("draggable"));
	// WebElement DropToHere=driver.findElement(By.id("droppable"));
	// Actions ob=new Actions(driver);
	// ob.dragAndDrop(ElementToDrag,DropToHere).build().perform();
	 
	// driver.switchTo().parentFrame();
	 //WebElement Sorting=driver.findElement(By.linkText("Sortable"));
	 //Sorting.click();
	 //Thread.sleep(6000);
	/* Element Picture=(Element) driver.findElement(By.xpath("//*@style='cursor: pointer']"));
	 Actions ob=new Actions(driver);
	 ob.contextClick();*/
	
	/*WebElement searchtofield=driver.findElement(By.id("twotabsearchtextbox"));
	searchtofield.sendKeys("computer");
	Actions ob=new Actions(driver);
	ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	Thread.sleep(6000);
	ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	 searchtofield.clear();
	 
	 searchtofield.click();
	 ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();*/
		   
	/* WebElement departure=driver.findElement(By.id("d1-btn"));
	 departure.click();
	 WebElement Departuretodate= driver.findElement(By.xpath("//*[@data-name='May 4,2022']"));
	 Departuretodate.click();*/
	
	}
    
    
    
    
	
	
	
	


}
		
		


