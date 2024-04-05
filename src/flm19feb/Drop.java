package flm19feb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Drop {

	public static void main(String[] args) throws InterruptedException {


		
	//new ChromeDriver();
		WebDriver driver =new FirefoxDriver();
		driver.navigate().to("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("prakashvankili");
		driver.findElement(By.id("password")).sendKeys("0NU16V");
		driver.findElement(By.id("login")).click();
		WebElement  DOB = driver.findElement(By.id("location"));
		Select Birth = new Select(DOB);
		Birth.selectByIndex(1);
		Thread.sleep(3000);
		Birth.selectByVisibleText("New York");

	}

}
