package flm14march;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Checkboxes {
	WebDriver   driver;
	JavascriptExecutor js;
	@BeforeMethod
	public void setup(){
		
		  driver =new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		 js = (JavascriptExecutor)driver;
		
	}

	@Test
	 public void checkBoxes() throws InterruptedException {
		
//		WebElement  elem= driver.findElement(By.xpath("//input[@id='monday']"));
//	
//		WebDriverWait wait=  new  WebDriverWait(driver, Duration.ofSeconds(500));
//		js.executeScript("arguments[0].scrollIntoView(true);", elem);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='monday']")));
//		elem.click();
//		Thread.sleep(3000);
		
		
	WebElement   ele1=	driver.findElement(By.xpath("//label[@for='days']/parent::div"));
	List<WebElement> elmnts      = ele1.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	Iterator<WebElement> itrelements =elmnts.iterator();
	
	while(itrelements.hasNext()) {
		  WebElement str =itrelements.next();
		  str.click();
		  str.click();
		  
		
	}
		
		}
}
