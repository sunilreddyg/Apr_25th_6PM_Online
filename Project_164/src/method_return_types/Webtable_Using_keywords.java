package method_return_types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Webtable_Using_keywords extends Repository
{
	
	public static void main(String args[])
	{
		
		//Create object for repository
		Repository obj=new Repository();
		obj.Launch_Browser("chrome");
		String url="https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx";
		obj.Load_Webpage(url);
		obj.Set_timeout(30);
		
		//click market links
		By Markets_Link=By.xpath("(//a[contains(.,'markets')])[1]");
		obj.Click_Element(Markets_Link);
		
		//Using table keyword read data from static table..
		String Table_Xpath="//div[@id='pnl_Bse']/table";
		WebElement Cell=obj.Get_Static_Webtable_Cell(Table_Xpath, 4, 3);
		String Highprice=Cell.getText();
		System.out.println(Highprice);
		
		
		//Using dynamic table keyword target location using refferal record name
		WebElement Required_Cell=obj.Get_Dynaic_Webtable_Cell(Table_Xpath, "RELIND", 7);
		Required_Cell.findElement(By.tagName("a")).click();
		
		
		
		
	}

}
