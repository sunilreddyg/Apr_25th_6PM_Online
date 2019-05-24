package corejava.Variables;

public class String_Comparision {

	public static void main(String[] args) 
	{
		
		
		/*
		 * String:--> 
		 * 		=> String accept set of characters to store..
		 * 		=> String is not only  a datatype and also called as
		 * 			class.Because string contains set of behaviours to 
		 * 			to manipulate store characters..
		 */
		
		
		
		/*
		 * Equals:-->
		 * 		Method verify equal comparision between two strings and
		 * 		return boolean value true/false.
		 */
		String exp_result="Please Enter Username";
		String act_result="please enter username";
		
		boolean flag=exp_result.equals(act_result);
		System.out.println("Equal comparision is => "+flag);
		
		
		
		/*
		 * EqualIgnoreCase:-->
		 * 		Method verify equal comparision between two string by
		 * 		ignoring casesensitive and return true/false
		 */
		boolean flag1=exp_result.equalsIgnoreCase(act_result);
		System.out.println("Equalignore case comparision is => "+flag1);
		
		
		
		
		/*
		 * Contains:-->
		 * 		Method verify any sub sequent character sequences avaialble
		 * 		at expected String.
		 */
		String Status="Forgotten password?";
		boolean flag2=Status.contains("password?");
		System.out.println("Sub string available status is ==> "+flag2);
		
		
		
		
		/*
		 * SubString:-->
		 * 		Method get subSequenet characters from mainString.
		 */
		String Account_number="0000456712349876";
		
		//Example:--> Get last 4 digit account number
		String Last_digits=Account_number.substring(12);
		System.out.println("Last digit numbers are => "+Last_digits);
		
		//Example:--> Get any 4 digits from middle of the string
		String Middle_digits=Account_number.substring(4, 8);
		System.out.println("Middle digit number is => "+Middle_digits);
		
		
		
		
		/*
		 * length:--> Method return lenth of characters available 
		 * 			  in integer format.
		 */
		String mobile="9652680806";
		//Verify lenth of mobile number equal to 10
		int len=mobile.length();
		System.out.println("Mobile number length is => "+len);
		
		
		
		/*
		 * trim:--> Method extra spaces from left side and right side of
		 * 			string..
		 */
		String toolname="    WebDriver   ";
		System.out.println("Before trim toolname length is => "+toolname.length());
		//trim extra spaces at string
		String New_tool=toolname.trim();
		System.out.println("After trim toolname length is  => "+New_tool.length());
		
		
		
		
		/*
		 * IsEmpty:-->
		 * 		Method return String empty status in boolean format
		 */
		String data="";
		String data1="Selenium";
		
		System.out.println("String empty status for data is => "+data.isEmpty());
		System.out.println("String empty status for data1 is => "+data1.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
