package flm03marcch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	
	@BeforeMethod
	
	public void enter()
	{

		 System.out.println("Method executing stated");

	}
	@AfterMethod
	public void exit()
	{
		System.out.println("Method END");
	}

	@Test(priority = 1)
	public void loginToApp()
	{
		  WebDriver driver=  new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("prakashvankili");
			driver.findElement(By.id("password")).sendKeys("0NU16V");
			driver.findElement(By.id("login")).click();
			driver.findElement(By.id("Submit"));
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
		driver.quit();
	}
	@Test(priority = 2)
	public void BookHotelPage()
	{

		WebDriver driver=  new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("prakashvankili");
		driver.findElement(By.id("password")).sendKeys("0NU16V");
		driver.findElement(By.id("login")).click();
		System.out.println(driver.getTitle());
		System.out.println("Booking Has Done");
		driver.quit();
	}

}
