package TestDemo;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] str= {"a","c","a"};
	    int[] str= {1,2,3,1};  
		boolean flag = false;
	for(int i=0;i<str.length;i++)
	{
	for(int j=i+1;j<str.length;j++)
	{
	if(str[i]==str[j])
	{
	System.out.println(str[i]);
	flag = true;
	}
	}
	}
	if(flag ==false)
	{
	    System.out.println("not");
	}
	    }
	


		
	}

