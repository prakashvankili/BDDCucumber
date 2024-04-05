package flm11march;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandles {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void alertHandling() throws InterruptedException {
		driver.get("https://demo.guru99.com/v4/");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr266311");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678@");
	
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"DeleteCustomerInput.php\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345678");
		//input[@name='AccSubmit']
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
		//For switching to alert
	Alert alr=	driver.switchTo().alert();
	Assert.assertEquals(alr.getText(), "Do you really want to delete this Customer?");
	System.out.println(alr.getText());
	alr.accept();
	Thread.sleep(3000);
	
	Assert.assertEquals(alr.getText(), "Customer does not exis!!");
	System.out.println(alr.getText());
	Thread.sleep(3000);
	alr.accept();
	

	}
}
