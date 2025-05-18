package TestDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateString {

	public static void main(String[] args) {

		 /* HashSet<Character> s = new LinkedHashSet<>(n - 1);
	      // HashSet doesn't allow repetition of elements
	        for (char x : str)
	            s.add(x);
	 
	        // Print content of the set
	        for (char x : s)
	            System.out.print(x);
	        
	        char str[] = "geeksforgeeks".toCharArray();
	        int n = str.length;*/
	  String str1="geeksforgeeks ass";
	  char a[]= str1.toCharArray();
	  LinkedHashSet<Character> set = new LinkedHashSet<>();  
	  for(int i=0;i<a.length;i++)
		  set.add(a[i]);
	    System.out.print(set);  
	// for(Character ch : set)   
       //   System.out.print(ch);   
	 // System.out.print(a);
	  
	       // removeDuplicate(str, n);

	}

}
