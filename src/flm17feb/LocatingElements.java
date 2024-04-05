package flm17feb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver =	new	ChromeDriver();
driver .get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("Prakash@2021");
driver.findElement(By.id("pass")).sendKeys("prakashvankili2021@gmail.com");
driver.findElement(By.name("login")).click();
String str = driver.findElement(By.partialLinkText("Find your ")).getText();
System.out.println(str);
driver.quit();
 //driver.findElement(By.name("password")).sendKeys("Prakash@2021");

 //driver.findElement(By.linkText("\r\n"
 	//	+ "								Login\r\n"
 	//	+ "							")).click();
 
//driver.findElement(By.linkText("My Courses")).click();

		

	}

}
