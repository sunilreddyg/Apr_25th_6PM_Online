package datadriven_Framework.POI;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Data_From_Multiple_Rows 
{

	public static void main(String[] args) throws Exception 
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
		
		
		//Iterate for number of rows
		for (int i = 5; i <= Rcount; i++) 
		{
			String UID=sht.getRow(i).getCell(0).getStringCellValue();
			String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(UID+"    "+PWD);
			
		}
		
		
		
		//Count number of cell data available with in sheet
		int FCellCount=sht.getRow(5).getFirstCellNum();
		int LcellCount=sht.getRow(5).getLastCellNum();
		
		
		System.out.println("First Cell data started in selected row is => "+FCellCount);
		System.out.println("Last cell data ended in  selected is  => "+LcellCount);
		
		

	}

}
