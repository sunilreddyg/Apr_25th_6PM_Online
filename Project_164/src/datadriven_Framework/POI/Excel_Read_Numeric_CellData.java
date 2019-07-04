package datadriven_Framework.POI;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Numeric_CellData 
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
		Double Price=row.getCell(4).getNumericCellValue();
		System.out.println("Price in double format is => "+Price);
		
		
		//Using row referral target cell
		Double alternate_mobile=row.getCell(3).getNumericCellValue();
		System.out.println("Mobile number in double format => "+alternate_mobile);
		
		//Convert double format value into long format 
		long Int_alertnate_mobile=alternate_mobile.longValue();
		System.out.println("Mobile number in integer format is => "+Int_alertnate_mobile);
		
		
		
		
		
		
		
	}

}
