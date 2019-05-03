package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_browser 
{

	public static void main(String[] args) 
	{
		/*
		 * Download chromedriver.exe file:-->
		 * 		
		 */
		
		//Set runtime path before launch chrome browser
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		//launch chrome browser
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://google.com");   //Load webpage to browser window
	}

}
