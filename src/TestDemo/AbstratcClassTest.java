package TestDemo;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class AbstratcClassTest {
	

	public static void main(String[] args) {
		int [] a={10001001};
		LinkedList sort = new LinkedList();
		for (int i=0;i<a.length;i++)
		sort.add(a[i]);
		for(int b :sort) 
	System.out.println(b);

		
}
}