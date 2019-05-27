package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Runtime_Pageurl 
{

	public static void main(String[] args) throws Exception
	{
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Brower initiation
		WebDriver driver=new ChromeDriver();
		//load webpage into browser window
		driver.get("https://www.seleniumhq.org");
		//maximize browser window
		driver.manage().window().maximize();
		
		
		//Identify download tab and click on it
		WebElement Download_Tab=driver.findElement(By.linkText("Download"));
		Download_Tab.click();
		
		//Capture runtime url of webpage
		String runtime_url=driver.getCurrentUrl();
		
		//Expected URl
		String Exp_url="download/";
		
		//Verify runtime url contains of partial expected url
		boolean flag=runtime_url.contains(Exp_url);
		System.out.println("page expected url status is => "+flag);
		
		
		/*writing decision statement to continue execution on 
			expected url presented at current window
		 */
		if(flag==true)
		{
			System.out.println("Url matching expected page displayed");
		}
		else
		{
			throw new Exception("Skipping test because of wrong url presented");
		}
		
		
		//Close browser window
		driver.close();
	}

}
