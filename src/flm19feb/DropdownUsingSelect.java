package flm19feb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownUsingSelect {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		
				
				System.out.println(driver.findElement(By.id("month")).isDisplayed());
				Thread.sleep(3000);
			 //new Select(driver.findElement(By.id("day"))).selectByVisibleText("5");
			// Thread.sleep(3000);
			// new Select(driver.findElement(By.id("year"))).selectByVisibleText("2000");
			 driver.quit();
			
	}

}
