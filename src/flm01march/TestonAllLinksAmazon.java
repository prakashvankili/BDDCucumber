package flm01march;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestonAllLinksAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
			WebDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			
		driver.get("https://www.amazon.in/");
	   driver.manage().window().maximize();
	
	
	
	List<WebElement>  linkfocus=  driver.findElements(By.tagName("a"));
	                 
	                 
	                 System.out.println(linkfocus.size());
	          
	            for(int i=0;i<linkfocus.size();i++) {
	            	
	            	 WebElement   we = linkfocus.get(i);
	            	 Thread.sleep(2000);
	            	 we.click();
	            	 System.out.println(we.getText());
	            	
	            	 System.out.println(driver.getCurrentUrl());
	            	Thread.sleep(2000);
	            	
	            	
	            	
	            	
	            	driver.navigate().back();
	            	Thread.sleep(2000);
	            	linkfocus=  driver.findElements(By.tagName("a"));
	                       	
	            	 
	             }
	             driver.quit();
	  
	   
	}

}
