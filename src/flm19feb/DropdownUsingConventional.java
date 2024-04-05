package flm19feb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownUsingConventional {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		System.out.println(driver.getTitle());
		//driver.findElement(By.className("_9407 _5dba _9hk6 _8esg"));
		driver.findElement(By.name("month")).sendKeys("May");
		//driver.findElement(By.id("year")).sendKeys("2000");
		//Thread.sleep(3000);
		driver.quit();
		

	}

}
