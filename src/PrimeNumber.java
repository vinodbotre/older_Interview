import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter no");
		int num=sc.nextInt();
	    boolean primenum=false;
	    for(int i=2;i<=num/2;i++)
	    {
	    	if(num%2==0)
	    	{
	    	primenum=true;
	    	break;
	    	}
	    }
	    
	    if(!primenum)
	    {
	    	System.out.println(num+"Number is prime");
	    }else
	    {
	    	System.out.println(num+"Number is not prime");
	    }
	}
}
