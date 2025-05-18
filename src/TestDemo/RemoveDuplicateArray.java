package TestDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		
		//int a[] = {5,5,2,8};
		String[] a= {"a","c","a","b","f","f"};

		// LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		// TreeSet<Integer> set = new TreeSet<Integer>();
		TreeSet<String> set = new TreeSet<String>();
         for (int i = 0; i < a.length; i++)
         set.add(a[i]);

     
     System.out.print(set);
     

     System.out.print("123456");
     System.out.print("asdabghjgfeydgfcbhn");
     System.out.print("123456215454sfdff");
		

	}

}
