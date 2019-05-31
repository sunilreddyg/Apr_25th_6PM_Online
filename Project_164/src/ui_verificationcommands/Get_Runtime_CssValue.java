package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Runtime_CssValue 
{
	public static void main(String[] args) throws Exception 
	{
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");				
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		//identify sensex tab
		WebElement Sensex_tab=driver.findElement(By.xpath("//a[contains(@id,'InvestRec')]"));
		Sensex_tab.click();
		Thread.sleep(4000);
		
		
		//Get Sensex tab background color
		String Runtime_Bg_color=Sensex_tab.getCssValue("background-color");
		System.out.println("Runtime background color is =>"+Runtime_Bg_color);
		
		
		String exp_bg_color="rgba(231, 120, 23, 1)";
		
		//Verify expected and actual background colors
		if(exp_bg_color.equals(Runtime_Bg_color))
		{
			System.out.println("As expected bg-color matching and sensex tab selected");
		}
		else
		{
			System.out.println("bg-color mismatch Sensex tab not highlighted with expected color");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
