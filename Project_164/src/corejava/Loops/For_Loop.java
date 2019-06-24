package corejava.Loops;

public class For_Loop 
{

	public static void main(String[] args)
	{
		
		
		//Example:--> print number 1 to 10
		
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(i);
		}
		
		
		
		//Example:--> Conduct sum between 1 to 100
		
		int sum=0;
		for (int i = 1; i <= 100; i++) 
		{
			sum=sum+i;
		}
		System.out.println("Total sum value is => "+sum);
		
		
		
		//Dynamic Array to Store Values:--->
		String browsers[]={"ie","chrome","firefox","safari","opera","edge"};
		//Get size of array
		int BCount=browsers.length;
		
		//For loop to iterate for expected number of browsers
		for (int i = 0; i < browsers.length; i++) 
		{
			System.out.println("=> "+browsers[i]);
		}
		

	}

}
