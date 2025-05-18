package TestDemo;

public class MethodOverloading {

	/*static int add(int a, int b)
	{
		return a+b;
	}
	
	static int add(int x, int y,int z)
	{
		return x+y+z;
	}
	
	static double add(double p, double q,double r)
	{
   return p+q+r;
	}*/
	void add(int a,int b) {
		System.out.println(a+b)	;
	}
	
	void add(int x, int y, int z)
	{
		System.out.println(x+y+z)	;
	}
	
	public static void main(String[] args)
	{
	/*System.out.println(MethodOverloading.add(2, 4,7))	;
	System.out.println(MethodOverloading.add(12.3,22.3,2.5))	;*/
		MethodOverloading a = new MethodOverloading();
		a.add(2, 3);
		a.add(2, 3,5);
	}

}
