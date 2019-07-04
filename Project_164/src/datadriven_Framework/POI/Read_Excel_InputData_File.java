package datadriven_Framework.POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_InputData_File 
{

	public static void main(String[] args) throws IOException 
	{
		
		String filepath="TestData\\IP.xlsx";
		//Target file location
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Get Access workbook using file location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Using referral book target any sheet using sheetname.
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//Target first row using sheet referral
		XSSFRow row=sht.getRow(1);
		
		//Using row referral target cell
		XSSFCell cell=row.getCell(0);
		
		//Read text from Cell
		String Url=cell.getStringCellValue();
		System.out.println(Url);
		
		
		//Using row referral read first cell data
		String CustomerID=row.getCell(1).getStringCellValue();
		System.out.println(CustomerID);
		
		
	}

}
