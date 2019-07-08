package datadriven_Framework.POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Read_MultipleRows_Data {

	public static void main(String[] args) throws IOException, Exception 
	{
		//Target File location
		String filepath="TestData\\InputData.xlsx";
		//Target File location using fileinput stream.
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("File located");
		
		//Access excel workbook using above file location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using book referral
		XSSFSheet sht=book.getSheetAt(2);
		
		
		//FInd number of rows data available with in sheet.
		int Rcount=sht.getLastRowNum();
		System.out.println("Number of rows data available with in sheet is => "+Rcount);
		
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		
		
		//Iterate for number of rows
		for (int i = 5; i <= Rcount; i++) 
		{
			
			//Read Static row Data from excel
			String page_url=sht.getRow(0).getCell(1).getStringCellValue();
			String Loc_email=sht.getRow(1).getCell(1).getStringCellValue();
			String Loc_password=sht.getRow(2).getCell(1).getStringCellValue();
			String Loc_login_btn=sht.getRow(3).getCell(1).getStringCellValue();
			
			//Read dynamic row data
			String UID=sht.getRow(i).getCell(0).getStringCellValue();
			String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(UID+"    "+PWD);
			
			
			//Load a webpage as precondition..
			driver.get(page_url);
			
			//Enter username and password 
			driver.findElement(By.xpath(Loc_email)).clear();
			driver.findElement(By.xpath(Loc_email)).sendKeys(UID);
			
			//Enter password
			driver.findElement(By.xpath(Loc_password)).clear();
			driver.findElement(By.xpath(Loc_password)).sendKeys(PWD);
			
			//click Signin button
			driver.findElement(By.xpath(Loc_login_btn)).click();
			Thread.sleep(2000);
			
			//Note:--> manage post condition..
			
		}

		

	}

}
