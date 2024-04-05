import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public interface flm13march {

	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pepperfry.com/");
		driver.manage().window().maximize();

		WebElement elemain = driver.findElement(By.xpath("//div[@class='footer-col'][3]"));

		List<WebElement> elements = elemain.findElements(By.tagName("a"));

		System.out.println(elements.size());
		Thread.sleep(3000);
		String homeWindow = driver.getWindowHandle();
		
		for (int i = 0; i < elements.size(); i++) {

			JavascriptExecutor jsectr = (JavascriptExecutor) driver;
			jsectr.executeScript("arguments[0].click()", elements.get(i));
			Set<String> handles = driver.getWindowHandles();
			Thread.sleep(3000);

			for (String j : handles) {

				if (!j.equalsIgnoreCase(homeWindow))
				{
					driver.switchTo().window(j);
					Thread.sleep(3000);
					System.out.println(driver.getTitle());
					System.out.println(driver.getCurrentUrl());
					Thread.sleep(3000);
					driver.close();
					driver.switchTo().window(homeWindow);
					Thread.sleep(3000);
					
				}
				
			}

		}}

	}


