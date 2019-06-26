package corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class List_interface 
{

	public static void main(String[] args) 
	{
		
			/*
			 * list:--> List store set of object inorder and accept duplicates
			 */
		
			List<String> list=new ArrayList<String>();
			list.add("IDE");
			list.add("RC");
			list.add("WD");
			list.add("GRID");
			list.add("APPIUM");
			list.add("BDD");
			list.add("WD");
			
			
			//Count list of objects
			int Count=list.size();
			System.out.println("Total object count is => "+Count);
			  
			
			//Get any single object from list of object.
			String toolname=list.get(2);
			System.out.println("toolname at 2nd position => "+toolname);
			
			
			//Using for loop iterate for list of object times
			for (int i = 0; i < list.size(); i++) 
			{
				String tool=list.get(i);
				System.out.println("=> "+tool);
			}
			
			
			System.out.println("\n");  //It create new line at console
			
			
			
			
			//Using foreach loop iterate list of object times
			for (String eachtool : list) 
			{
				System.out.println("=> "+eachtool);
			}
			  
	}

}
