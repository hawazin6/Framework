package piit.automationTrainingProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.B
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\automationTrainingProgram\\Drivers\\chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.navigate().to("https://www.amazon.com");
		   driver.manage().window().maximize();
		   driver.findElement(By.id("nav-search-submit-button"));
		WebElement searchicon =(WebElement) driver.findElements(By.id("nav-search-submit-button"));
        searchicon.click();
       WebElement searchfieldtxt;
				// WebElement searchfieldtxt= driver.findElement(By.className("field-keyword));"
        		// searchfieldtxt.sendKeys("computer");//
    WebElement CreateAnAccount=driver.findElement(By.xpath("//*([text()=' create new Account']"));
    		//createAnAccount.click();
    		Thread.sleep(6000);
    		WebElement month=driver.findElement(By.name("birthday_month"));
    		Select ob=new select(month);
    		ob.deselectByValue("3");
    		WebElement day=driver.findElement(By.name("birth_day"));
    		Select ob1=new select(day);
    		ob1.selectByVisibleText(null);
    		
    		
       
	}

}
