package flm14feb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatersUsage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	//new ChromeDriver();
		WebDriver driver =new FirefoxDriver();
		driver.navigate().to("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("prakashvankili");
		driver.findElement(By.id("password")).sendKeys("0NU16V");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("location")).sendKeys("New York");
		//Thread.sleep(5000);
		//driver.findElement(By.id("username")).clear();
		//driver.findElement(By.id("password")).clear();
				//login
		//System.out.println(driver.getTitle());
		
		//driver.navigate().to("https://www.facebook.com/");
		
		//driver.findElement(By.linkText("Forgot Password?")).click() ;
		//System.out.println(driver.getTitle());
		//driver.findElement(By.id("login")).click();
	//System.out.println(driver.findElement(By.id("username_span")).getText());
	//System.out.println(driver.findElement(By.id("password_span")).getText());
	
	//New User Register Here
	//driver.findElement(By.linkText("New User Register Here")).click();
	Thread.sleep(3000);
		//driver.navigate().back();
		//driver.navigate().forward();
		//Thread.sleep(3000);
		//driver.quit();
	}

}
