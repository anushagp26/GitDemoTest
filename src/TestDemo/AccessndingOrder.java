package TestDemo;

import java.util.LinkedHashSet;

public class AccessndingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*int [] arr = new int [] {5, 2, 8, 7, 1};     
	        int temp = 0;    

		 for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] < arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;   
	                   
	               }  
	               System.out.print(arr[j]);  
	            }  
	           
	        }
		  
	}*/
		int a[] = {5,2,6,8,6,7,5,2,8};
		 LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
        
          for (int i = 0; i < a.length; i++)
         set.add(a[i]);

       System.out.print(set);

	}
		/*String string = "Dream big";    
        //Stores the reverse of given string    
        String reversedStr = "";    
            
        //Iterate through the string from last and add each character to variable reversedStr    
        for(int i = string.length()-1; i >= 0; i--){    
            reversedStr = reversedStr + string.charAt(i);    
        }    
            
        System.out.println("Original string: " + string);    
        //Displays the reverse of given string    
        System.out.println("Reverse of given string: " + reversedStr);  
*/

		
}
