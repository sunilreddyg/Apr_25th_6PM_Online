package datadriven_Framework.CSV;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class Write_Data_To_CSVfiles 
{

	public static void main(String[] args) throws IOException 
	{

		String filepath="src\\datadriven_Framework\\CSV\\Output.csv";
		//Create filewriter using above location
		FileWriter fw=new FileWriter(filepath);

		//Create object for csv writer
		CSVWriter writer=new CSVWriter(fw);
		
		//Using referral write data into csv files
		String line[]= {"Arun","9030248855"};
		writer.writeNext(line);
		
		String line1[]= {"Akash","9030848855"};
		writer.writeNext(line1);

		//Write and close data
		writer.flush();
		writer.close();
		
		
		
		
		
		
		
	}

}
