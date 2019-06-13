package capturescreen;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screen_When_Alert_Presented {

	public static void main(String[] args) throws Exception
	{
		
		/*
		 * Scenario:-->
		 * 			Verify search job without enter selectcourse and keyword enter
		 * Steps:-->
		 * 		=> Given url https://www.firstnaukri.com/
		 * 		=> When click search button without enter Select course and Keyword Enter
		 * 		=> Then receive Alert with expected text.
		 */
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		//Identify Search button
		WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
		Search_btn.click();
		Thread.sleep(5000);
		
		
		/*
		 * Note:-->
		 * 		=> Selenium can't take screen when alert presented. INstead
		 * 			taking screen shot it throw exception called unhandled alert.
		 * 
		 * 	  => Using Robot [AWT] we can capture screen when alert presented..
		 */
		
		
		//Create object for Robot class
		Robot robot=new Robot();
		
		//Get default system dimension..
		Dimension ScreenSize=Toolkit.getDefaultToolkit().getScreenSize();
		//Create screen using robot class
		BufferedImage Image=robot.createScreenCapture(new Rectangle(ScreenSize));
		
		//Location where file need to dump..
		File path=new File("C:\\Users\\SUNIL\\git\\Apr_25th_6PM_Online\\Project_164\\screens\\image3.png");
		//Write Image into local utilities
		ImageIO.write(Image, "png", path);
		
		
		
		
		

	}

}
