package TestDemo;

import java.util.HashMap;
import java.util.Map;

public class EachWordOccarence {

	public static void main(String[] args) {
		String str = "anusha";
		 //int[] charArray = {4, 4, 5, 5, 6};
		HashMap<Character, Integer> eachCharCountMap = new HashMap<Character, Integer>();
		 
        //Converting inputString to char array
 
      char[] charArray = str.toCharArray();
 
        //traversal of each Character of charArray
 
        for (char c : charArray)
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
      //System.out.print(eachCharCountMap);
       for (Map.Entry entry : eachCharCountMap.entrySet()) {
           System.out.println("key = " + entry.getKey() + " value =" + entry.getValue());
	}

}
}