package TestDemo;

import java.util.HashMap;

public class EachOccurenceOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {4, 4, 5, 5, 6};
		 HashMap<Integer,Integer> eachCharCountMap = new HashMap<Integer,Integer>();
	     
		 for (int c : arr)
		    // Loop to store the frequency of
		    // elements of array
		 {
	            //if(eachCharCountMap.containsKey(c))
	        	if(eachCharCountMap.containsKey(c))
	            {
	                //If char is present in eachCharCountMap, increment count by 1
	 
	                eachCharCountMap.put(c, eachCharCountMap.get(c)+1);
	            }
	            else
	            {
	                //If char is not present in eachCharCountMap,
	                //Putting this char to eachCharCountMap with 1 as it's initial value
	 
	                eachCharCountMap.put(c, 1);
	            }
	        }
	        System.out.print(eachCharCountMap);
	}

}
