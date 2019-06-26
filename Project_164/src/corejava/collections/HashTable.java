package corejava.collections;

import java.util.Hashtable;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) 
	{
		
		/*
		 *  Hash accept objects to store using key and value, Hashset
		 *  allow pair values to store.
		 *  
		 *  => Hashtable store data same as Set Interface And also doesn't
		 *     support duplicate values to store.
		 */
		
		
		Hashtable<Integer, String> hash = new Hashtable<Integer,String>();
		hash.put(1,"IDE"); 
		hash.put(2,"RC");
		hash.put(3,"WD");
		hash.put(4,"GRID");
		hash.put(5,"APPIUM");
		hash.put(6,"RC");
		
		//using keyname get keyvalue
		String tname=hash.get(2);
		System.out.println("Toolname is => "+tname);
		
		
		
		//Get All keyset values
		Set<Integer> set=hash.keySet();
        
		//Foreach loop to iterate number of keyset times
		for (Integer eachkey : set) 
		{
			 String kvalue=hash.get(eachkey);
			 System.out.println(kvalue);
		}
        
        
		

	}

}
