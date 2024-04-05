package flm01march;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPrinting {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
	     driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
      WebElement dropdown  = driver.findElement(By.id("searchDropdownBox"));
      List<WebElement>  ele=   new Select(dropdown).getOptions();
     
     System.out.println(ele.get(0).getText());

     driver.quit();
	}

	
}
