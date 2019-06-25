package corejava.Loops;

public class Foreach_Loop {

	public static void main(String[] args)
	{
		
		
		/*
		 * Foreach:--> Loop specially design to iterate array next values.
		 * 
		 * 		Syntax:-->
		 * 
		 * 					for(Variable var: Array)
		 * 					{
		 * 						System.out.println(var)
		 * 					}
		 */
		
		
		//Store set of values into single dimensional array.
		String browsers[]={"chrome","firefox","ie"};
		
		//Apply foreach to read all next value of array
		for (String Eachbrowser : browsers) 
		{
			System.out.println(Eachbrowser);
		}
		
		
		
		
		

	}

}
