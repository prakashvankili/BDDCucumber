package flm14march;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExplisitWait1 {

	public static void main(String[] args) {
	
		
		
	WebDriver	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.amazon.in/");
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(9000));

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Cookware & dining']")));
	 WebElement e =driver.findElement(By.xpath("//img[@alt='Cookware & dining']"));
	JavascriptExecutor   jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", e);
	

	}

}
