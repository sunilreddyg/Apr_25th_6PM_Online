package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_browser 
{

	public static void main(String[] args) 
	{
		/*
		 * Download chromedriver.exe file:-->
		 * 
		 * 	=>url:--> http://chromedriver.chromium.org/downloads
		 * 	=>Downlaod any chromedriver version w.r.t chrome browser.
		 *  =>After download unzip file location to backup folder.
		 *  =>After unzip we receive chromedriver.exe file. Then set 
		 *  		chromedriver.exe file at environment variable
		 *  		using  "webdriver.chrome.driver"
		 * 		
		 */
		
		//Set runtime path before launch chrome browser
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		//launch chrome browser
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://google.com");
	}

}
