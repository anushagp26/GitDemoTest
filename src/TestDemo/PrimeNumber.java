package TestDemo;

public class PrimeNumber {

	public static void main(String[] args) {
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
