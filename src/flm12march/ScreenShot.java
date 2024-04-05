package flm12march;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.operator.OutputAEADEncryptor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
	
		
		WebDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Date  date = new Date();
		//System.out.println(date);
		String pattern = "yyyy-MM-dd HH:mm:ss";
			SimpleDateFormat smpl=   new SimpleDateFormat(pattern);
			 String date1=smpl.format(date);
		System.out.println(date1);

		    String  date2=date1.replace(":","-");
		System.out.println(date2);
		
	File srcfile   =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(srcfile, new File(System.getProperty("user.dir")+"\\prakash"+date2+".png"));

	}

}
