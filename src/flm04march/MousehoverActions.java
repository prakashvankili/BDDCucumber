package flm04march;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MousehoverActions {

	@Test
	public void hoverActions() throws InterruptedException {
		
		
	WebDriver driver =	new ChromeDriver();
	   Actions act=    new Actions(driver);
	driver.get("https://www.orangehrm.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	act.moveToElement(driver.findElement(By.xpath("//a[text()='Solutions']")))
	
	    .moveToElement(driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[1]/div/div/div/div/ul/li[4]"))).click().perform();
	Thread.sleep(3000);
		
	}

	}


