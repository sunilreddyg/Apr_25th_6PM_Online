package browser_launch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browser {

	public static void main(String[] args)
	{
		
		/*
		 * To launch firefox browser we need support of geckodriver.exe.
		 * Download geckodriver:-->
		 * 
		 * 		=> https://github.com/mozilla/geckodriver/releases
		 * 		=> download latest release w.r.t firefox browser
		 * 		=> firefox 66 greater supports ==>  v0.24.0. [geckodriver version]
		 *      => Download w.r.t OS and Hotspot size
		 *      
		 */
		
		//Set Runtime environment variable before launch firefox browser.
		System.setProperty("webdriver.gecko.driver", "E:\\Apr_25th_6PM_2019\\Project_164\\drivers\\geckodriver.exe");
		//Launch firefox browser
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://seleniumhq.org");
		
		
	}

}
