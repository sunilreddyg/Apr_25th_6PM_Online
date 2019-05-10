package selenium_webdriver.link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_And_partialLInktext 
{

	public static void main(String[] args) 
	{
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Brower initiation
		WebDriver driver=new ChromeDriver();
		//load webpage into browser window
		driver.get("https://www.cleartrip.com/");
		//maximize browser window
		driver.manage().window().maximize();
		
		
		
		/*
		 * Identify link with original link name
		 * HtmlSource:-->
		 * 			<a href="/about" title="About Us" >About Us</a>
		 */
		driver.findElement(By.linkText("About Us")).click();
		
		
		
		/*
		 * Identify link with original link name
		 * htmlsource:-->
		 * 			<a href="/jobs">Jobs</a>
		 */
		driver.findElement(By.linkText("Jobs")).click();
		
		
		/*
		 * identify link with original link name
		 * Htmlsource:-->
		 * 			<a href="/jobs/openings">Job Openings</a>
		 */
		driver.findElement(By.linkText("Job Openings")).click();
		
		
		/*
		 * Identify link with partial link name
		 * htmlsource:-->
		 * 		<a href="https://www.cleartrip.com/jobs/openings/qa-lead-2/">
		 *			<strong>QA Lead</strong>
		 *			<span class="location">Bangalore</span>
		 *		</a>
		 */
		driver.findElement(By.partialLinkText("QA Lead")).click();

		
		/*
		 * Identify link with partial link name
		 * htmlsource:-->
		 * 			<a href="/jobs/openings">← Back to Job openings</a>
		 */
		driver.findElement(By.partialLinkText("Back to Job openings")).click();
		
		
		
		
		/*
		 * identify link with original link name
		 * Htmlsource:-->
		 * 			<a rel="bToolTip" title="Flights" href="/flights">
		 * 				<span class="productIcon flights">Flights</span>
		 *          </a>
		 */
		driver.findElement(By.linkText("Flights")).click();
		
		
		
		
	}

}
