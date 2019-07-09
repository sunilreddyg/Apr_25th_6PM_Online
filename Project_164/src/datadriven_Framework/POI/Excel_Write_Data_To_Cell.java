package datadriven_Framework.POI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_Data_To_Cell 
{

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
		XSSFSheet sht=book.getSheetAt(0);
		
		
		//write data  to existing row and cell
		sht.getRow(1).getCell(3).setCellValue("MyNewPWD");
		
		//Write data to existing row and new cell
		sht.getRow(1).createCell(5).setCellValue("TestPass");

		//Write Data to NewRow and NewCell
		sht.createRow(2).createCell(0).setCellValue("http://sampledomain.com");
		
		
		//Creating ouput file under project.
		FileOutputStream fo=new FileOutputStream("TestData\\Ouput.xlsx");
		//Write data to OutputFile
		book.write(fo);
		//Save workbook data
		book.close();
		
	}

}
