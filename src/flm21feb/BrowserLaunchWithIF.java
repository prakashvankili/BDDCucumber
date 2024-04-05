package flm21feb;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchWithIF {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Enter the browser name that you want to use");
		Scanner sc = new Scanner(System.in);
		String Browser = sc.next();

		if (Browser.equals("chrome")) {

			WebDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			System.out.println(driver.getCurrentUrl());
			driver.quit();

		} else if (Browser.equals("firefox")) {
			new FirefoxDriver();

		} else if (Browser.equals("microsoftedge")) {
			new EdgeDriver();
		} else {
			System.out.println("Invalid :You have entered un existed browser in our laptop");
		}

	}

}
