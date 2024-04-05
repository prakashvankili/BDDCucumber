package flm01march;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testonlinks {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_3lda0bxyzj_e&adgrpid=155259813513&hvpone=&hvptwo=&hvadid=674893540019&hvpos=&hvnetw=g&hvrand=17184302711036202583&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061746&hvtargid=kwd-365295376496&hydadcr=5620_2359471&gad_source=1");
		
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]"));

		List<WebElement> allLinks=block.findElements(By.tagName("a"));
		
		System.out.println("No of Links in Module "+allLinks.size());
		
		for(int i=0;i<allLinks.size();i++)
		{
			WebElement link=allLinks.get(i);
			
			System.out.println(link.getText());
			
			System.out.println(link.getAttribute("href"));
			
			link.click();
			
			Thread.sleep(3000);
			
			System.out.println(driver.getTitle());
			
			System.out.println(driver.getCurrentUrl());
			
			driver.navigate().back();
			
			Thread.sleep(3000);
			
			block=driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]"));

			allLinks=block.findElements(By.tagName("a"));
			
			
		}
		
		
		driver.quit();
		
		
	}

}