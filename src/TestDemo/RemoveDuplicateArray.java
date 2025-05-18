package TestDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		
		//int a[] = {5,5,2,8};
		String[] a= {"a","c","a"};

		// LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		// TreeSet<Integer> set = new TreeSet<Integer>();
		TreeSet<String> set = new TreeSet<String>();
         for (int i = 0; i < a.length; i++)
         set.add(a[i]);

     
     System.out.print(set);
     
 	int n= 10;
	
	 for(int j=2;j<=n;j++){
       int counter=0;
        for(int i=1;i<=j;i++){
           if(j%i==0){
              counter++;
           }
        }
        if(counter==2)
        System.out.print(j+" ");
     }// TODO Auto-generated method stub


	}

}
