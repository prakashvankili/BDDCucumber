package flm29feb;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingSublinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub WebDriver driver =new  ChromeDriver();
		WebDriver driver =new  ChromeDriver();
	      driver.get("https://www.yupptv.com/");
	      driver.manage().window().maximize();
	  WebElement links=    driver.findElement(By.xpath("//*[@id=\"accordion\"]/div/div[3]"));
	  List<WebElement> sublinks = links.findElements(By.tagName("a"));
	 System.out.println( sublinks.size());
	 
	 
	    Iterator<WebElement> itr= sublinks.iterator();
      
	 while(itr.hasNext()) {
		 
		System.out.println(( itr.next()).getText()); 
	 }
		
	
	 driver.quit();
	    
	}

}
