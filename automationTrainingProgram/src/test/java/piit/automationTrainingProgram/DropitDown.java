package piit.automationTrainingProgram;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.Iterators;


public class DropitDown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\automationTrainingProgram\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com");
		/*WebElement createAnAccount=driver.findElement(By.xpath("//*[text()='Create new account']"));
		createAnAccount.click();
		Thread.sleep(6000);
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(month);
		ob.selectByValue("8");
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select ob1=new Select(day);
		ob1.selectByValue("8");
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select ob2=new Select(year);
		ob2.selectByValue("1988");*/
		/*WebElement alert=driver.findElement(By.name("alert"));
		alert.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		WebElement prompting=driver.findElement(By.name("prompt"));
		prompting.click();
		WebElement confirmation= driver.findElement(By.className("Confirmation"));
		confirmation.click();
		driver.switchTo().alert().sendKeys("tested");
		driver.switchTo().alert().dismiss();*/
		/*Actions ob=new Actions(driver);
		WebElement hovers=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		ob.moveToElement(hovers).build().perform();*/
		/*WebElement droppable=driver.findElement(By.linkText("Droppable"));
		droppable.click();
		driver.switchTo().frame(0);
		WebElement Todrag=driver.findElement(By.id("draggable"));
		WebElement droptohere=driver.findElement(By.id("droppable"));
		Actions ob=new Actions(driver);
		ob.dragAndDrop(Todrag, droptohere).build().perform();
		driver.switchTo().parentFrame();
		WebElement Sortable=driver.findElement(By.linkText("Sortable"));
		Sortable.click();*/
		/*Thread.sleep(6000);
		WebElement picture=driver.findElement(By.xpath("//*[@style='cursor: pointer;']"));
		Actions ob=new Actions(driver);
		ob.contextClick(picture);*/
		/*WebElement serachtofield=driver.findElement(By.id("twotabsearchtextbox"));
		serachtofield.sendKeys("Puma shose9");
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(6000);
		ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		serachtofield.clear();
		Thread.sleep(6000);
		serachtofield.click();
		ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();*/
		/*WebElement departure=driver.findElement(By.id("d1-btn"));
		departure.click();
		WebElement departuredate=driver.findElement(By.xpath("//*[@aria-label='Departing May 20, 2022']"));
		departuredate.click();*/
			
		Actions ob=new Actions(driver);
		WebElement newreleaseslinks=driver.findElement(By.linkText("New Releases"));
		ob.keyDown(Keys.SHIFT).build().perform();
		newreleaseslinks.click();
		ob.keyUp(Keys.SHIFT).build().perform();
	    Set<String> windowhandles=driver.getWindowHandles();
	    Iterator<String> iterators=windowhandles.iterator();
	   String parent=iterators.next();
	    String secondwindow=iterators.next();
	    System.out.println("This is parent="+parent);
	    System.out.println("This is secondwindow="+secondwindow);
	    driver.switchTo().window(parent);
	    WebElement products=driver.findElement(By.linkText("Camera & Photo Products"));
	    Thread.sleep(6000);
	    products.click();
	    
	    
	  
	    
	    		
	
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	    
		
		


	
		

	}

}
