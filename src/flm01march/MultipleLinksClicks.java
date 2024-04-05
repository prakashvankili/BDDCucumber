package flm01march;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinksClicks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
			WebDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_3lda0bxyzj_e&adgrpid=155259813513&hvpone=&hvptwo=&hvadid=674893540019&hvpos=&hvnetw=g&hvrand=17184302711036202583&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061746&hvtargid=kwd-365295376496&hydadcr=5620_2359471&gad_source=1");
	   driver.manage().window().maximize();
	 WebElement  focus = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]"));
	 
	
	 
	 System.out.println(focus.getSize());
	List<WebElement>  linkfocus=  focus.findElements(By.tagName("a"));
	                 
	                 
	                 System.out.println(linkfocus.size());
	          
	            for(int i=0;i<linkfocus.size();i++) {
	            	
	            	 WebElement   we = linkfocus.get(i);
	            	 System.out.println(we.getText());
	            	 System.out.println(driver.getCurrentUrl());
	            	 we.click();
	            	
	            	
	            	
	            	driver.navigate().back();
	            	Thread.sleep(2000);
	            	 focus = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]"));
	            	  linkfocus = focus.findElements(By.tagName("a"));	            	
	            	 
	             }
	             driver.quit();
	  
	   
	}

}
