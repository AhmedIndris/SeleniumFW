package locators;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousLocators {
	
	
	WebDriver driver;
	
	@Before
	public void LaunchBrowser() {
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  
	    driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("http://objectspy.space/");
	 
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

}
	@Test
	public void intersectwithWebElement() {
		//name locator
				driver.findElement(By.name("firstname")).sendKeys("Abdu");
				
				//ID locator
				driver.findElement(By.id("sex-0")).click();
				
				//driver.findElement(By.className("input-file")).click();
				 
				//PartialLink Text locator
				 driver.findElement(By.partialLinkText("TF-API")).click();
				 
				 //CSS Selector locator
				 driver.findElement(By.cssSelector("input#exp-2")).click();
				 
				 driver.findElement(By.cssSelector("input.input-file")).click();
				 
				 driver.findElement(By.cssSelector("input[value='Automation Tester']")).click();
				 driver.findElement(By.cssSelector("input[value='Manual Tester']")).click();
				 
				 //xpath locator
				
				 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("I love selenium");
				 //driver.findElement(By.xpath("//strong[text(),'Link Test : Page Change')]")).click();
				 
				 driver.findElement(By.xpath("//strong[contains(text(),'Link Test : New Page')]")).click();
		
	
	}
	
	
	
	
}
