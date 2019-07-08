package datadriven_Framework.POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_WebDriver_Read_Testcase_Data {

	public static void main(String[] args) throws IOException 
	{
		//Target File location
		String filepath="TestData\\InputData.xlsx";
		//Target File location using fileinput stream.
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("File located");
		
		//Access excel workbook using above file location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using book referral
		XSSFSheet sht=book.getSheetAt(1);
		
		//Target sheet at 6th row
		XSSFRow row=sht.getRow(6);
		
		//Get Cell Data from 6th Row
		String Outlook_url=row.getCell(0).getStringCellValue();
		String Location_Singin_btn=row.getCell(1).getStringCellValue();
		String Location_Email_EB=row.getCell(2).getStringCellValue();
		String Input_EmailEB=row.getCell(3).getStringCellValue();
		String Location_Email_Next_btn=row.getCell(4).getStringCellValue();

		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(Outlook_url);
		driver.manage().window().maximize();
		
		//Click Signin button to navigate login page
		driver.findElement(By.xpath(Location_Singin_btn)).click();
		
		//Identifying email editbox and type text init
		driver.findElement(By.xpath(Location_Email_EB)).clear();
		driver.findElement(By.xpath(Location_Email_EB)).sendKeys(Input_EmailEB);
		
		//Click Next button to finish email validation
		driver.findElement(By.xpath(Location_Email_Next_btn)).click();
		
	}

}
