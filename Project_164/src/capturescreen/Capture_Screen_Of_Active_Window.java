package capturescreen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screen_Of_Active_Window 
{

	public static void main(String[] args) throws IOException 
	{
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		
		
		/*
		 * Note:-->
		 * 		Inorder to save any file or folder into local utilities, We
		 * 		need to configure below executable jar file to project....
		 * 
		 * 
		 * 		URL:--> https://commons.apache.org/proper/commons-io/download_io.cgi
		 * 				Download file under binaries commons-io-2.6-bin.zip[Windows]
		 * 				unzip the file and configure all executble jar files 
		 * 								to current project
		 */
		
		
		//capture screen and convert into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Access local utilites to dump screen
		FileUtils.copyFile(src, new File("screens\\image.png"));
		

	}

}
