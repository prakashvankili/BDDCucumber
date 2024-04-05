package flm21feb;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchWithSwitch {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter the browser name that you want to use");
		Scanner sc = new Scanner(System.in);
		String Browser = sc.next();

		switch (Browser) {
		case "chrome":new ChromeDriver();
			           break;
		case "firefox":new FirefoxDriver();
			           break;
		case "microsoftedge":new EdgeDriver();
		               break;
		 default : System.out.println("Invalid :You have entered un existed browser in our laptop");

		}

	}

}
