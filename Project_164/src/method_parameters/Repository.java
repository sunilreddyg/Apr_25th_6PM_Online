package method_parameters;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	
	
	

}
