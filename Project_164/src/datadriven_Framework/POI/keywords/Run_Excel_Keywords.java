package datadriven_Framework.POI.keywords;

public class Run_Excel_Keywords 
{

	public static void main(String[] args)
	{
		
		ExcelKeywords.getExcel_connection("InputData.xlsx", "Sheet3");

		//Iterate for number of rows
		for (int i = 5; i <= ExcelKeywords.sht.getLastRowNum(); i++) 
		{
			
			String UID=ExcelKeywords.getcelldata(i, 0);
			System.out.println(UID);
			
		}
	}

}
