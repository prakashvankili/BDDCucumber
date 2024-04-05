package flm29feb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	      WebDriver driver =new  ChromeDriver();
	      driver.get("https://www.yupptv.com/");
	      driver.manage().window().maximize();
	    List<WebElement>  al= driver.findElements(By.tagName("a"));
	    System.out.println(al.size());
	    
	   for(WebElement abc :al) {
		   System.out.println(abc.getText());
		   
	   }
	    	
	    driver.quit();
	      
	    
	}

}
