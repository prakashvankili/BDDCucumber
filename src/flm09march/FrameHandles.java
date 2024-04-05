package flm09march;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameHandles {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		  driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  
	}
	@Test
	public void frameHandling() throws InterruptedException {
		driver.get("https://demo.guru99.com/test/guru99home/");
		// code for swithcing frame
		driver.switchTo().frame("a077aa5e");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']/parent::a")).click();
		Thread.sleep(3000);
		
		// code for swithcing window
		
		     String defaultWindow     =driver.getWindowHandle();
		     Set<String>   handleid_s =driver.getWindowHandles();
		     
		    Iterator<String>    itr = handleid_s.iterator();
		    while(itr.hasNext()) {
		    	  String ele =itr.next();
		    	  if(!ele.equalsIgnoreCase(defaultWindow));
		    	  {
		    		  driver.switchTo().window(ele);
		    	  }
		    	  
		    }
		    Thread.sleep(3000);
		   List<WebElement>  elements  =driver.findElements(By.xpath("//span[@class='kt-blocks-info-box-title']"));
		
		System.out.println(elements.size());
		for(WebElement eles:elements) {
			System.out.println(eles.getText());
		}
		
	}

}
