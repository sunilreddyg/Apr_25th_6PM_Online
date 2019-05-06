package selenium_webdriver;

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
		driver.get("http://seleniumhq.org");
		
		
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

	}

}
