package corejava.Arrays;

public class Double_Dimensional_Array
{


	public static void main(String[] args) 
	{
		
		
		/*
		 * Note:--> Double dimensional array help to store date in tabular format.
		 * 			
		 * 			1. Static Array
		 * 			2. Dynamic Array
		 */
		
		
		
		//Static Array:-->
		
		String data[][]=new String[3][2];
		
		//1st row data
		data[0][0]="User1";
		data[0][1]="Pwd1";
		
		//2nd row data
		data[1][0]="User2";
		data[1][1]="Pwd3";
		
		//3rd row data
		data[2][0]="User3";
		data[2][1]="Pwd3";
		
		
		System.out.println("get Double dimensional object => "+data[1][0]);
		
		
		
		
		
		//Dynamic Array:-->
		
		String userdata[][]=
			{
					{"Arjun","9030248855"},
					{"Akash","9024567564"},
					{"Dhanush","8798789789"},
					{"Shyam","7987878783"},
				
			};
		
		
		System.out.println("Get Double dimension object using index number is => "+userdata[1][0]);
		
		
		 
		 //Get length of array
		 System.out.println("Object Count at Static array  is => "+data.length);
		 System.out.println("Object Count at runtime array is => "+userdata.length);
		 
		 
		 

	}

}
