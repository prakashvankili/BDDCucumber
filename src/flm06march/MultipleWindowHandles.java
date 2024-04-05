package flm06march;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowHandles {
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		  driver =new ChromeDriver();
		  driver.manage().window().maximize();
	}
	@AfterMethod
	public void close() {
		//driver.quit();
	}
	@Test
	public void windowHandle() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		String handleid =driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		
		Thread.sleep(3000);
	Set<String>	 handles=driver.getWindowHandles();
	for(String str:handles) {
		
	if(!str.equalsIgnoreCase(handleid)) {
	 
	Thread.sleep(3000);
	driver.switchTo().window(str);
	Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Read all about it!']")).click();		
		Thread.sleep(2000);
		break;
		
	}
	}
	driver.switchTo().window(handleid);
	driver.findElement(By.xpath("//a[text()='Home']")).click();
	Thread.sleep(2000);
	
		 handles=driver.getWindowHandles();
	for(String str:handles) {
		
	if(driver.getTitle().equalsIgnoreCase("index")) {
	 
	Thread.sleep(3000);
	driver.switchTo().window(str);
	Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hey prakash Yadav How are you")	;	
		Thread.sleep(3000);
		break;
		
	}
	}
	driver.navigate().back();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//a[text()='Home']")).click();
	System.out.println("My work is done Bye............");
	
	
	
}}