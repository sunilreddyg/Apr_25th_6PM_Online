package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelection_Facebook {

	public static void main(String[] args) {
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Brower initiation
		WebDriver driver=new ChromeDriver();
		//load webpage into browser window
		driver.get("http://facebook.com");
		//maximize browser window
		driver.manage().window().maximize();
		
		
		
		//Select day dropdown option using visible text
		new Select(driver.findElement(By.id("day")))
		.selectByVisibleText("23");
		
		//Select month dropdown option using visible text
		new Select(driver.findElement(By.id("month")))
		.selectByVisibleText("May");
		

	}

}
