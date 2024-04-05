package flm05march;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropCalculator {
	WebDriver driver ;
	
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		
		
	}

	
	@Test
	public void DragAndDropTest() throws InterruptedException {
		
		//driver.findElement(By.xpath("//span[@style=\"left: 25%;\"][1]"));
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		actions.dragAndDropBy(driver.findElement(By.xpath("//span[@style='left: 25%;']")), 80, 0).perform();
		Thread.sleep(3000);
		actions.dragAndDropBy(driver.findElement(By.xpath("//span[@style='left: 26.6667%;']")), 170, 0).perform();
		Thread.sleep(2000);
		actions.dragAndDropBy(driver.findElement(By.xpath("//span[@style='left: 66.6667%;']")), -130,0).perform();
		Thread.sleep(2000);
		driver.quit();
	}
	
}
