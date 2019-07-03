package method_return_types;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repository 
{
	
	 public WebDriver driver;
	 public WebDriverWait wait;
	
	/*
	 * Keywordname:-->  Launch diff browser [firefox, chrome, ie]
	 * Author:--> Sunil reddy
	 * Created Date:--> 28-06-2019
	 * ReviewedBy:-->
	 * Parameter Used:-->
	 * Last Updated Date:-->
	 */
	public void Launch_Browser(String browsername)
	{
		switch (browsername) 
		{
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;

		default: System.out.println("browser mismatch");
			break;
		}
		
	}
	
	
	
	/*
	 * Keywordname:-->  load diff pages [http://domainname.com]
	 * Author:--> Sunil reddy
	 * Created Date:--> 28-06-2019
	 * ReviewedBy:-->
	 * Parameter Used:-->
	 * Last Updated Date:-->
	 */
	public void Load_Webpage(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	
	
	
	/*
	 * Keywordname:-->  Implicit and Explicit waits
	 * Author:--> Sunil reddy
	 * Created Date:--> 28-06-2019
	 * ReviewedBy:-->
	 * Parameter Used:-->
	 * Last Updated Date:-->
	 */
	public void Set_timeout(int time_in_sec)
	{
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(time_in_sec,TimeUnit.SECONDS);
		
		//Explicit wait command
		wait=new WebDriverWait(driver, time_in_sec);
	}
	
	
	
	/*
	 * Keywordname:-->  Enter text into editbox  [Using xpath]
	 * Author:--> Sunil reddy
	 * Created Date:--> 28-06-2019
	 * ReviewedBy:-->
	 * Parameter Used:-->
	 * Last Updated Date:-->
	 */
	
	public void Enter_text(String Element_Xpath, String InputData)
	{
		WebElement Editbox=driver.findElement(By.xpath(Element_Xpath));
		Editbox.clear();
		Editbox.sendKeys(InputData);
	}
	
	
	
	/*
	 * Keywordname:-->  Enter text into editbox  [Using Any locator]
	 * Author:--> Sunil reddy
	 * Created Date:--> 28-06-2019
	 * ReviewedBy:-->
	 * Parameter Used:-->
	 * Last Updated Date:-->
	 */
	
	public void Enter_text(By locator,String InputData)
	{
		WebElement Editbox=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		Editbox.clear();
		Editbox.sendKeys(InputData);
	}
	
	

	/*
	 * Keywordname:-->  Enter text into editbox  [POM Keywords]
	 * Author:--> Sunil reddy
	 * Created Date:--> 28-06-2019
	 * ReviewedBy:-->
	 * Parameter Used:-->
	 * Last Updated Date:-->
	 */
	
	public void Enter_text(WebElement Element,String InputData)
	{
		WebElement Editbox=wait.until(ExpectedConditions.visibilityOf(Element));
		Editbox.clear();
		Editbox.sendKeys(InputData);
	}
	
	
	/*
	 * Keywordname:-->  Select Dropdown using locator class
	 * Author:--> Sunil reddy
	 * Created Date:--> 28-06-2019
	 * ReviewedBy:-->
	 * Parameter Used:-->
	 * Last Updated Date:-->
	 */
	
	public void Select_Dropdown(By locator, String OptinName)
	{
		WebElement Dropdown=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		new Select(Dropdown).selectByVisibleText(OptinName);
	}
	
	
	/*
	 * Keywordname:-->  Select Dropdown using [POM keyword]
	 * Author:--> Sunil reddy
	 * Created Date:--> 28-06-2019
	 * ReviewedBy:-->
	 * Parameter Used:-->
	 * Last Updated Date:-->
	 */
	
	public void Select_Dropdown(WebElement Element, String OptinName)
	{
		WebElement Dropdown=wait.until(ExpectedConditions.visibilityOf(Element));
		new Select(Dropdown).selectByVisibleText(OptinName);
	}
	
	
	
	

	/*
	 * Keywordname:-->  Click Element using locator class
	 * Author:--> Sunil reddy
	 * Created Date:--> 02-07-2019
	 * ReviewedBy:-->
	 * Parameter Used:-->
	 * Last Updated Date:-->
	 */
	public void Click_Element(By locator)
	{
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	
	
	
	/*
	 * Keywordname:-->  Click Element  [POM Keyword]
	 * Author:--> Sunil reddy
	 * Created Date:--> 02-07-2019
	 * ReviewedBy:-->
	 * Parameter Used:-->
	 * Last Updated Date:-->
	 */
	public void Click_Element(WebElement Element)
	{
		wait.until(ExpectedConditions.elementToBeClickable(Element)).click();
	}
	
	
	
	/*
	 * Keywordname:-->  MouseHover action
	 * Author:--> Sunil reddy
	 * Created Date:--> 02-07-2019
	 * ReviewedBy:-->
	 * Parameter Used:-->
	 * Last Updated Date:-->
	 */
	public void Mouse_hover(By locator)
	{
		WebElement Element=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		new Actions(driver).moveToElement(Element).build().perform();
	}
	
	
	
	/*
	 * Keywordname:-->  Context Click on element
	 * Author:--> Sunil reddy
	 * Created Date:--> 02-07-2019
	 * ReviewedBy:-->
	 * Parameter Used:-->
	 * Last Updated Date:-->
	 */
	public void Right_Click(By locator)
	{
		WebElement Element=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		new Actions(driver).contextClick(Element).perform();
	}
	
	
	
	/*
	 * Keywordname:-->  Switch to window  using page tilte..
	 * Author:--> Sunil reddy
	 * Created Date:--> 02-07-2019
	 * ReviewedBy:-->
	 * Parameter Used:-->
	 * Last Updated Date:-->
	 */
	public void SwitchTo_Window(String exp_title)
	{
		
		//Get All WIndow Dynamic ID's
		Set<String> All_WindowsIDS=driver.getWindowHandles();
		
		//Iterate for number of windows
		for (String EachWindow : All_WindowsIDS) 
		{
			//Switching to each dynamic window
			driver.switchTo().window(EachWindow);
			//Capturing each window title at runtime
			String Runtime_title=driver.getTitle();
			
			//Decision to accept on expected title match
			if(Runtime_title.contains(exp_title))
			{
				break;  //IT stop iteration and keep window control on what window title matches.
			}
			
		}
		
	}
	
	
	
	/*
	 * Keywordname:-->  Capture Screen shot of webpage
	 * Author:--> Sunil reddy
	 * Created Date:--> 02-07-2019
	 * ReviewedBy:-->
	 * Parameter Used:-->
	 * Last Updated Date:-->
	 */
	 public void CaptureScreen(String imagename)
	 {
		//Get system default time..
		Date d=new Date();    // import java.util;
		//Simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//Convert system default time using simple date formatter
		String time=sdf.format(d);
		
		try {
			
			//capture screen and convert into file format
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//Access local utilites to dump screen
			FileUtils.copyFile(src, new File("screens\\"+time+imagename+".png"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	 }
	
	
	 
	 
	 //===================USerDefine Keywords===========
	 
	 
	 
	 /*
	 * Keywordname:-->  Verify title presented at webpage
	 * Author:--> Sunil reddy
	 * Created Date:--> 03-07-2019
	 * ReviewedBy:-->
	 * Parameter Used:-->
	 * Last Updated Date:-->
	 */
	 public boolean isTitle_Presented(String exp_title)
	 {
		 try {
			 wait.until(ExpectedConditions.titleContains(exp_title));
			 return true;
			 
		} catch (TimeoutException e) {
			return false;
		}
		
	 }
 
 
	 
	 
	 

		/*
		 * MethodName:--> Verify url presented at webpage
		 * Author:-->
		 * CreatedON:-->
		 * ReviewedBy:-->
		 * Parametersused:-->
		 * Lasupdated Date:--->
		*/
		public boolean isUrl_Presented(String Exp_Url)
		{
			try {
				
				boolean flag=wait.until(ExpectedConditions.urlContains(Exp_Url));
				return flag;
				
			} catch (TimeoutException e) {
				return false;
			}
		}
	 
	 
	 
	 
		/*
		 * MethodName:--> Method verify text visible at webpage
		 * Author:-->
		 * CreatedON:-->
		 * ReviewedBy:-->
		 * Parametersused:-->
		 * Lasupdated Date:--->
		*/
		
		public boolean isText_visibleAt_Webpage(String Exp_text)
		{
			//Identify page
			WebElement page=driver.findElement(By.tagName("body"));
			//Capture page visible text
			String page_visibleText=page.getText();
			//Verify expected text visible at webpage
			boolean flag=page_visibleText.contains(Exp_text);
			return flag;
		}
		
		
		/*
		 * MethodName:--> Method verify Alert presented at webpage and return boolean value
		 * Author:-->
		 * CreatedON:-->
		 * ReviewedBy:-->
		 * Parametersused:-->
		 * Lasupdated Date:--->
		*/
		public boolean isAlert_presented()
		{
			try {
				
				driver.switchTo().alert();
				return true;
				
			} catch (NoAlertPresentException e) {
				e.printStackTrace();
				return false;
			}
		}
	 
	 
	 

		/*
		 * MethodName:--> Accept or dismiss alert window
		 * Author:-->
		 * CreatedON:-->
		 * ReviewedBy:-->
		 * Parametersused:-->
		 * Lasupdated Date:--->
		*/
		public void CloseAlert()
		{
			if(isAlert_presented())
			{
				driver.switchTo().alert().accept();
			}
		}
		
		
		/*
		 * MethodName:--> Method return selected row and cell value [From static table]
		 * Author:-->
		 * CreatedON:-->
		 * ReviewedBy:-->
		 * Parametersused:-->
		 * Lasupdated Date:--->
		*/
		public WebElement Get_Static_Webtable_Cell(String TableXpath,int Row, int Cell)
		{
			//Identify Webtable
			WebElement table=driver.findElement(By.xpath(TableXpath));
			
			//Find number of rows available at webtable
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			
			//Target Required row
			WebElement SelectedRow=rows.get(Row);
			
			//using selected row find list of cells
			List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
			
			//Target Required Cell
			WebElement Webtable_cell=cells.get(Cell);
			
			return Webtable_cell;
			
		}
		
		
		/*
		 * MethodName:--> Method return selected Record referal cell [From Dynamic table]
		 * Author:-->
		 * CreatedON:-->
		 * ReviewedBy:-->
		 * Parametersused:-->
		 * Lasupdated Date:--->
		*/
		
		public WebElement Get_Dynaic_Webtable_Cell(String TableXpath, String Recordname,int Cell)
		{
			//Identify Webtable
			WebElement table=driver.findElement(By.xpath(TableXpath));
			
			//Find number of rows available at webtable
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			
			boolean flag=false;
			WebElement Webtable_Cell = null;
			//Iterate for number of rows
			for (int i = 1; i < rows.size(); i++) 
			{
				
				//target Each Dynamic row at table
				WebElement DynamicRow=rows.get(i);
				
				//Capture text on Each Row
				String RowText=DynamicRow.getText();
				
				//Accept Condition where any record match in dynamic row
				if(RowText.contains(Recordname))
				{
					flag=true;
					System.out.println("Row Number is => "+i);
					
					//using Dynamic row find List of Cells
					List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
					
					//Target Required Cell
					Webtable_Cell=cells.get(Cell);
					break;  //stop Iteration
					
				}
			}//for
			
			 System.out.println("Record avaiable status is => "+flag);
			 return Webtable_Cell;
			
		}//Method

}
