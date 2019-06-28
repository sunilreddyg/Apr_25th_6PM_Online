package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Find_DynamicRow_Using_Referral_RecordName {

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
		
		
		//Itearate for number of rows
		for (int i = 1; i < rows.size(); i++) 
		{
			//Target Each row at table using for loop increment value
			WebElement DynamicRow=rows.get(i);
			
			//Capture text at each row
			String RowText=DynamicRow.getText();
			
			//Condition accept on expected record match..
			if(RowText.contains("HDFC"))
			{
				System.out.println("Record available at row => "+i);
				
				//Find list of cells under each dynamic row.
				List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
				
				String CompanyName=cells.get(0).getText();
				String HighPrice=cells.get(3).getText();
				
				System.out.println(CompanyName+"   "+HighPrice);
			}
			
		}

	}

}
