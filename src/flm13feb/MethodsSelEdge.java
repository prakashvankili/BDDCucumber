package flm13feb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class MethodsSelEdge {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new EdgeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize() ;
		//findElementByCssSelector("/https://adactinhotelapp.com/img/main-image-hotel-app.png");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
