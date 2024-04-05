package flm05march;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindingElements {

	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Actions action= new Actions(driver);
		Thread.sleep(2000);
	action.moveToElement(driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']")))
	.pause(3000)
	      .click(driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']"))).perform();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='content']"));
	Thread.sleep(2000);
	List<WebElement>  ele =driver.findElements(By.xpath("//img[@class='img-fluid']"));
	
	Thread.sleep(2000);
	System.out.println(ele.size());
	
	driver.quit();
		
	}

}
