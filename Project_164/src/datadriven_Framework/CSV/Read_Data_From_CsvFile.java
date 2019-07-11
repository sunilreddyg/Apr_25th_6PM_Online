package datadriven_Framework.CSV;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class Read_Data_From_CsvFile 
{

	public static void main(String[] args) throws IOException 
	{
		
		String filepath="src\\datadriven_Framework\\CSV\\Input.csv";
		//Target file locatio nusing file reader.
		FileReader fr=new FileReader(filepath);
		System.out.println("file located");
		

		//Create object for csv reader
		CSVReader reader=new CSVReader(fr);
		
		String header[]=reader.readNext();
		System.out.println(header[0]+"    "+header[1]);
		
		String line1[]=reader.readNext();
		System.out.println(line1[0]+"     "+line1[1]);
		
		
		//Using conditional loop iterate for number of records
		String line[];
		while((line=reader.readNext())!=null)
		{
			System.out.println(line[0]+"    "+line[1]);
		}
		
		
	}

}
