package flm14march;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implisitwait {

	public static void main(String[] args) {
	
		
		   WebDriver  driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   driver.get("https://www.facebook.com/");
		   driver.findElement(By.xpath("(//a[@href='#' and @role='button'])[2]")).click();
		   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Prakash Yadav");
		   driver.quit();
	}

}
