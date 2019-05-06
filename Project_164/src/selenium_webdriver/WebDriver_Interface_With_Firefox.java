package selenium_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Interface_With_Firefox {

	public static void main(String[] args) {
		
		//Set Runtime environment variable before launch firefox browser.
		System.setProperty("webdriver.gecko.driver", "E:\\Apr_25th_6PM_2019\\Project_164\\drivers\\geckodriver.exe");
		//launch firefox instance
		WebDriver driver=new FirefoxDriver();
		//load webpage to browser window
		driver.get("http://google.com");
		//Maximize browser window
		driver.manage().window().maximize();
		
		
		
	}

}
