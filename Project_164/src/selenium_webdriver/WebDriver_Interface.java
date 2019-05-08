package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Interface 
{

	public static void main(String[] args)
	{
		
		//Set runtime path before launch chrome browser
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//launch chromebrowser
		WebDriver driver=new ChromeDriver();
		//load webpage to browser window
		driver.get("http://facebook.com");
		//maximize browser window
		driver.manage().window().maximize();
		
		
		
		/*
		 * WebDriver:-->
		 * 		Is a common interface class which can manipulate all browser
		 * 		instances supported by selenium..
		 * 
		 * 		=> WebDriver interface supply methods to automate all
		 * 			browser instances..
		 * 
		 * 		=> It supports cross browser automation..
		 */
		

		//Identify textbox location and type characters in textbox
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("qadarshan@gmail.com");
		
		
		//Identify password editbox and type password init
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("Hello12345");
		
		
		//Identify login button
		driver.findElement(By.id("u_0_2")).click();

	}

}
