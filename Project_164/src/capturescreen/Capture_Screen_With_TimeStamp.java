package capturescreen;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screen_With_TimeStamp {

	public static void main(String[] args) throws Exception {
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		
		
		//Get system default time..
		Date d=new Date();    // import java.util;
		//Simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//Convert system default time using simple date formatter
		String time=sdf.format(d);
		
		//capture screen and convert into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Access local utilites to dump screen
		FileUtils.copyFile(src, new File("screens\\"+time+"image.png"));
			


	}

}
