package flm14march;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver =new ChromeDriver();
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
		WebElement we=	driver.findElement(By.xpath("//table[@name='BookTable']"));
			
			//*[@id="HTML1"]/div[1]/table/tbody/tr
		int  rows=		we.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr")).size();
		int  cols=	driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[1]/th")).size();
		
		for(int i=2;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
				
			WebElement   wwww=	we.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+i+"]/td["+j+"]"));
	
			System.out.print(wwww.getText()+"--- ");
		}
		System.out.println();	
	}
		}

}
