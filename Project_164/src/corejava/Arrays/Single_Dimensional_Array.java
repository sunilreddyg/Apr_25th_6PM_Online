package corejava.Arrays;

public class Single_Dimensional_Array 
{


	public static void main(String[] args) 
	{
		
		
		/*
		 * Array:-->
		 * 			Array store set of similar events.It allow
		 * 			set of values to store in single variable.
		 * 
		 * 			1. Static Array
		 * 			2. Runtime array
		 */
		
		
		
		/*
		 * Static Array:-->
		 * 			=> During static array we need to tell how many events [Values/objects]
		 * 				to store.
		 * 			=> Array size was fixed during static array.
		 */
		 String tools[]=new String[4];
		 tools[0]="IDE";
		 tools[1]="RC";
		 tools[2]="GRID";
		 tools[3]="Appium";
		 
		 System.out.println("2nd index value is => "+tools[2]);
		 
		 
		 
		 /*
		  * DynamicArray:-->
		  * 		=> No need to tell how many objects you are storing.
		  * 		=> Varaible assignment can be enhanced during runtime..
		  */
		 
		 int num[]={100,200,300,400,500,600};
		 
		 System.out.println("2nd index value is => "+num[2]);
		 
		
		 
		 //Get length of array
		 System.out.println("Object Count at Static array  is => "+tools.length);
		 System.out.println("Object Count at runtime array is => "+num.length);
		 
		 
		 
		
	}

}
