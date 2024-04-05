package flm18feb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingTextAttributes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
 System.out.println(driver.findElement(By.name("login")).getText());
 System.out.println(driver.findElement(By.name("login")).getAttribute("id"));
 System.out.println(driver.findElement(By.name("login")).getCssValue("background-color"));
 System.out.println(driver.findElement(By.id("email")).getRect().getHeight());
 System.out.println(driver.findElement(By.id("email")).getRect().getX());
 System.out.println(driver.findElement(By.id("email")).getRect().getY());
 //System.out.println(driver.findElement(By.id("email")).getRect().getWidth());    
 //driver.findElement(By.id("email")).submit();
 Thread.sleep(5000);
driver.quit();

	}

}
