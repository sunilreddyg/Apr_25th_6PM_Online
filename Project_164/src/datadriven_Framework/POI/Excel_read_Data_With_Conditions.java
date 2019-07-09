package datadriven_Framework.POI;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_read_Data_With_Conditions {

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
		XSSFSheet sht=book.getSheetAt(3);
		
		
		//FInd number of rows data available with in sheet.
		int Rcount=sht.getLastRowNum();
		System.out.println("Number of rows data available with in sheet is => "+Rcount);
		
		//Iterate for expected number of rows
		for (int i = 5; i <= Rcount; i++)
		{
			
			//get execution status from excel.
			String Exe_status=sht.getRow(i).getCell(2).getStringCellValue();
			
			//Writing decision to accept only execution status match to "y" in excel sheet
			if(Exe_status.equalsIgnoreCase("y"))
			{
				
				String UID=sht.getRow(i).getCell(0).getStringCellValue();
				String PWD=sht.getRow(i).getCell(1).getStringCellValue();
				

				
				//Get Scenario type from excel
				String Stype=sht.getRow(i).getCell(3).getStringCellValue();
				
				//Writing decision to accept w.r.t Scenariotype
				if(Stype.equalsIgnoreCase("text"))
				{
					System.out.println("text captured for => "+UID);
				}
				else if(Stype.equalsIgnoreCase("object"))
				{
					System.out.println("Object verified for => "+UID);
				}
				else if(Stype.equalsIgnoreCase("alert"))
				{
					System.out.println("Alert handled for => "+UID);
				}
				else
				{
					System.out.println("Scenario type mismatch at excel");
				}
			}
			
			
		}

	}

}
