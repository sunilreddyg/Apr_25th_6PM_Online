package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Read_Data_From_Specific_Row_And_Cell {

	public static void main(String[] args) 
	{
	
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		//Identify Markets link
		WebElement Markets_link=driver.findElement(By.xpath("//a[@href='https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx'][contains(.,'markets')]"));
		Markets_link.click();
		
		
		//Identify table
		WebElement table=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));
		
		//Read number of rows available under table.
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("List of rows under table is => "+rows.size());
		
		//Target 6 th row under table
		WebElement Selected_row=rows.get(9);
		
		//Using Selected row find list of cells
		List<WebElement> cells=Selected_row.findElements(By.tagName("td"));
		
		String CompanyName=cells.get(0).getText();
		String HighPrice=cells.get(3).getText();
		
		System.out.println(CompanyName+"   "+HighPrice);
	}

}
